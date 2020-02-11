package ficheroybackup;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.stream.Stream;

public class FicherosProveedoresClientesCobros {

	public static void main(String[] args) {
		//Obtengo fecha y hora para las copias de los ficheros temporales
		LocalDate hoy = LocalDate.now();
		LocalTime ahora = LocalTime.now();
		String ahoraS = ahora.toString();
		ahoraS = ahoraS.replace(":", "-");
		ahoraS =(String) ahoraS.subSequence(0, 8);
		
		//Obtenfo el Sistema de archivos
		
		FileSystem ficherosWindows = FileSystems.getDefault();
		Path rutaTmpClientes = ficherosWindows.getPath("./src/ficheroybackup/tmpclientes.txt");
		Path rutaTmpProveedores = ficherosWindows.getPath("./src/ficheroybackup/tmpproveedores.txt");
		Path rutaTmpCobros = ficherosWindows.getPath("./src/ficheroybackup/tmpcobros.txt");
		Path rutaMaster = ficherosWindows.getPath("./src/ficheroybackup/FicheroMaestro");
		Path rutaMasterClientes = ficherosWindows.getPath("./src/ficheroybackup/FicheroMaestro/clientes.txt");
		Path rutaMasterProveedores = ficherosWindows.getPath("./src/ficheroybackup/FicheroMaestro/proveedores.txt");
		Path rutaMasterCobros = ficherosWindows.getPath("./src/ficheroybackup/FicheroMaestro/cobros.txt");
		Path rutaBackup = ficherosWindows.getPath("./src/ficheroybackup/Backup");
		Path rutaBackupClientes = ficherosWindows.getPath("./src/ficheroybackup/Backup/tmpclientes.txt");
		Path rutaBackupProveedores = ficherosWindows.getPath("./src/ficheroybackup/Backup/tmpproveedores.txt");
		Path rutaBackupCobros = ficherosWindows.getPath("./src/ficheroybackup/Backup/tmpcobros.txt");
		
		//Pregunto si existen ficheros temporales. Si no existen acaba el programa
		if(Files.notExists(rutaTmpClientes) || Files.notExists(rutaTmpProveedores) || Files.notExists(rutaTmpCobros))
		{
			System.out.println("Faltan los ficheros con los datos. Incorporelos y vuelva a ejecutar el progama");
		}
		else 
		{
			//compruebo si existen el directorio y los ficheros master. La primera vez los crea
			if (Files.notExists(rutaMaster))
			{
				
				try 
				{
					Files.createDirectory(rutaMaster);
					Files.createFile(rutaMasterClientes);
					Files.createFile(rutaMasterProveedores);
					Files.createFile(rutaMasterCobros);
					
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
			
			//Leer y grabar ficheros clientes
			try(Stream<String> flujoClientes = Files.lines(rutaTmpClientes, Charset.defaultCharset()))
			{
				try(BufferedWriter bwClientes = Files.newBufferedWriter(rutaMasterClientes, Charset.defaultCharset(), StandardOpenOption.APPEND))
				{
					flujoClientes.forEach(s ->
					{
						try
						{
							bwClientes.write(s);
							bwClientes.newLine();
						}
						catch(IOException e)
						{
							System.out.println(e.getMessage());
						}
						
						
					});
					
					
					
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
				
				
			}
				
				
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
	}

}
