
//CREAR UNA PROGRESSION ARITMETICA PIDIENDO AL USUARIO EL PRIMERO SEGUNDO Y TERCER TERMINO
//EJEMPLO 20/5/3  -> 20,23,26,29,32
//LOS DATOS LOS AÑADIMOS EN EL FICHERO JUNTO CON LA FECHA Y LA HORA
import java.util.*;
import java.util.stream.*;
import java.time.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.io.*;

public class ProgresionAritmeticaEnFichero
{

	public static void main(String[] args)
	{
		int primerNum,numeroTer,diferencia;
		
		FileSystem ficheros = FileSystems.getDefault();     //por medio de esto se sabe si trabaja con windows mac o el sistema de ficheros que sea
		
		//Path ruta = ficheros.getPath("H:/IES_CA_MADRID/IES Actual/ies ClaraDelRey2019_2020/Programacion_DW1E/PruebasJava/EjemplosClase/src/misCosas/FicheroProgresion");
		//Path rutaConFichero = ficheros.getPath("H:/IES_CA_MADRID/IES Actual/ies ClaraDelRey2019_2020/Programacion_DW1E/PruebasJava/EjemplosClase/src/misCosas/FicheroProgresion/datos.txt");
		
		
		Path ruta = ficheros.getPath("./src/progresion");     //El directorio raiz es el proyecto
		Path rutaConFichero = ficheros.getPath("./src/progresion/progresion.txt");	
		try(Scanner teclado = new Scanner(System.in))
		{
			System.out.print("Introduzca el primer número entero de la progresión:");
			primerNum = teclado.nextInt();
			
			System.out.print("Introduzca el número de términos de la progresión:");
			numeroTer = teclado.nextInt();
			
			System.out.print("Introduzca la diferencia de la progresión:");
			diferencia = teclado.nextInt();
			
			String cadena = calculo(primerNum, numeroTer, diferencia);
			
			// Creo el directorio y el fichero si no existen
			
			if(!Files.exists(ruta))
				Files.createDirectory(ruta);
			
			if(!Files.exists(rutaConFichero))
				Files.createFile(rutaConFichero);
			
			// Creo el buffer de escritura para poder escribir en el fichero
			
			try(BufferedWriter bw = Files.newBufferedWriter(rutaConFichero, Charset.forName("UTF-8"), StandardOpenOption.APPEND))
			{
				bw.write(cadena);
				bw.newLine();
			}//Fin try BufferedWriter
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
			// Creo el Stream para leer el fichero e imprimir por consola el contenido
			
			try(Stream<String> flujo = Files.lines(rutaConFichero, Charset.forName("UTF-8")))
			{
				flujo.forEach(s -> System.out.println(s));
			}//Fin try Stream de flujo
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}//Fin try Scanner
		catch(InputMismatchException i)
		{
			System.out.println("Dato introducido "+i.getMessage());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		
		
		
	}//Fin de Main
	
	public static String calculo(int n1, int nt, int dif)
	{
		LocalDate fecha = LocalDate.now();   //fecha de ahora
		LocalTime hora = LocalTime.now();    //hora actual
		
		int j=0,ter=n1; //j es el número de términos y ter es el calculo del termino
		String resul=""; //resul es la cadena donde se acumula la progresion
		
		while (j<nt)
		{
			resul=resul+Integer.toString(ter)+",";       
			ter+=dif;
			j++;
		}
		
		return resul+" ** "+fecha+" - "+hora; //La progresión más la fecha y la hora actual
		
	}//fin de calculo

}//Fin de clase					
																								
					
		
			
	
		
