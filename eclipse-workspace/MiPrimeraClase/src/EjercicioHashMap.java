import java.util.*;
import java.util.Scanner;
public class EjercicioHashMap 
{
	
	public static void main(String[] args) 
	{
		

		
		
		
		HashMap <String , String > diccionario = new HashMap <String , String > ();
		
		diccionario.put("mesa", "table");
		diccionario.put("puerta", "door");
		diccionario.put("hombre", "man");
		diccionario.put("mujer", "woman");
		Scanner teclado=new Scanner(System.in);
	  
		
		String interruptor;
		do
		{
			
			System.out.println("Escriba 1 para introducir palabra, 2 para listar o pulse 9 para finalizar");
			interruptor = teclado.next();
	
			
			
			int result = Integer.valueOf(interruptor);
			
		switch(result)
		{
		
		case 1 :
			System.out.println("Introduzca una palabra en español:");
			String palabra = teclado.next();
			if (diccionario.containsKey(palabra))
			{
				System.out.println("El diccionario ya contiene la palbra");
				
				
			}
			else
			{
				System.out.println("¿Desea añadir la palabra al diccionario? (Y/N)");
				String siono =teclado.next();
				switch(siono)
				{
				case "Y" :
					String word;
					
					System.out.println("Escriba la palabra en ingles");
					word = teclado.next();
					diccionario.put(palabra, word);
					System.out.println("La palabra en español es: "+palabra+" y la palabra en ingles es:"+word);
					
				case "N" :
					
					System.out.println("Finalizando");
				
				
				}
				
			}
		break;	
		case 2 :
			
			
			diccionario.forEach((k,v) -> System.out.println("Español: " + k + ": Ingles: " + v));
		
			
		break;	
			
		case 9 :
		 System.out.println("Finalizando");
		break;
		}
		
		
		
		}
		while (!(interruptor.equals("9")));
		
		
	}

	
	
	
	
}
