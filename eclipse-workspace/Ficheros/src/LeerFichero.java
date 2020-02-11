

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.stream.*;
import java.util.*;

public class LeerFichero
{

	public static void main(String[] args)
	{
		//Abro y leo el fichero
		
		FileSystem ficheros = FileSystems.getDefault();
		Path camino = ficheros.getPath("H:\\IES_CA_MADRID\\IES Actual\\ies ClaraDelRey2019_2020\\Programacion_DW1E\\PruebasJava\\EjemplosClase\\src\\misCosas\\ficheros\\texto.txt");
		
		try(Stream<String> flujo = Files.lines(camino, Charset.forName("UTF-8")))
		{
			flujo.forEach((String s) -> System.out.println(s));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		//Inserto dos líneas
		
		String texto[] = new String[] {"Inserto esta primera línea","Inserto esta segunda línea"};
		
		try(BufferedWriter br = Files.newBufferedWriter(camino, Charset.forName("UTF-8"), StandardOpenOption.APPEND))
		{
			Arrays.stream(texto).forEach(s ->
			{
				try
				{
					br.newLine();
					br.write(s);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
			});
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		//Leo después de la inserción
		
		try(Stream<String> flujo = Files.lines(camino, Charset.forName("UTF-8")))
		{
			flujo.forEach((String s) -> System.out.println(s));;
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}