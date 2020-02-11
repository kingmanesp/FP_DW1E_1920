import java.util.*;

public class numAleatorio 
{

	public static void main(String[] args) 
		{
		
			int v;
			Random numAleatorio=new Random(System.currentTimeMillis());
			
			
			//v=15+numAleatorio.nextInt(120-15); es 106 para que pueda salir el 120 por que por defecto nextInt es bounded y no mete dentro el ultimo numero
			
			
			do
			{
				v=15+numAleatorio.nextInt(106);
				System.out.println(v);
			}while (v!=32);
			System.out.println("Lo ultimo fue: "+v);
		
		

		}

	
	
	
	
	
}
