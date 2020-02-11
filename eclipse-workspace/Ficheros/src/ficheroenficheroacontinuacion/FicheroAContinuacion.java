package ficheroenficheroacontinuacion;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class FicheroAContinuacion {

	
	public static void main(String[] args) 
	{
		
		FileSystem ficheros = FileSystems.getDefault();
		
		Path ruta = ficheros.getPath("./src/ficheroenficheroacontinuacion");     //El directorio raiz es el proyecto
		Path rutaConFicheroEntrada = ficheros.getPath("./src/ficheroenficheroacontinuacion/temporal.txt");
		Path rutaConFicheroSalida = ficheros.getPath("./src/ficheroenficheroacontinuacion/maestro.txt");
		
		if(!Files.exists(ruta))
			try 
			{
				Files.createDirectory(ruta);
				System.out.println("El Directorio ha sido creado");
			} 
			catch (IOException e) 
			{
				
				System.out.println("No se ha podido crear el directorio");
			}
		
		if(!Files.exists(rutaConFicheroSalida))
			try 
			{
				Files.createFile(rutaConFicheroSalida);
				System.out.println("El archivo maestro.txt ha sido creado");
			} 
			catch (IOException e) 
			{
				
				System.out.println("No se ha podido crear el archivo maestro");
			}
		
		try(BufferedWriter bw = Files.newBufferedWriter(rutaConFicheroSalida, Charset.forName("UTF-8"), StandardOpenOption.APPEND))
		{
			
			try(Stream<String> flujo = Files.lines(rutaConFicheroEntrada, Charset.forName("UTF-8")))
			{
				flujo.forEach(s -> {
					try 
					{
						bw.write(s);
						bw.newLine();
					} 
					catch (IOException e) 
					{
						
						System.out.println("No se ha podido escribir en el archivo maestro");
					}
									});
				System.out.println("Se ha añadido el contenido del fichero temporal.txt al fichero maestro.txt");
				
			}//Fin try Stream de flujo
			catch(IOException e)
			{
				System.out.println("No se ha podido crear el flujo de datos por que no existe el fichero de entrada");
			}
			
			
			
			
			
		}//Fin try BufferedWriter
		catch(IOException e)
		{
			System.out.println("No se ha podido crear el buffer");
		}
		try 
		{
			if(Files.deleteIfExists(rutaConFicheroEntrada)) 
			{
				System.out.println("El fichero ha sido borrado despues de la ejecucion");
			}
		} 
		catch (IOException e1) 
		{
			
			System.out.println("El fichero no se ha podido borrar por que no existe");
		}
		try(Stream<String> flujo1 = Files.lines(rutaConFicheroSalida, Charset.forName("UTF-8")))
		{
			System.out.println("");
			System.out.println("El contenido del fichero maestro se mostrara a continuacion: ");
			System.out.println("");
			
			flujo1.forEach(s -> System.out.println(s));
			
			
		}//Fin try Stream de flujo
		catch(IOException e)
		{
			System.out.println("No se ha podido mostrar el contenido de maestro.txt");
		}
		
		

	}
	
}

