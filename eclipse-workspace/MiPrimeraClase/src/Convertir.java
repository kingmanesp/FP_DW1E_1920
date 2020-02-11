import java.util.Scanner;
public class Convertir 
{

	public static void main(String[] args) 
	{
		int num;
		String binario="";
		System.out.println("Escriba un numero para la conversion");
		Scanner Leer = new Scanner(System.in);
		num=Leer.nextInt();
		if (num>0)
		{
			while (num>0)
			{
				if (num % 2 == 0)
				{
					binario = "0" + binario;
				}
				else 
				{
					
					binario = "1" + binario;
					
				}
				
					
			}
				
		}
		else if (num == 0)
		{
			binario = "0";
		}
	else
	{
		System.out.println("El numero introducido no es positivo");
	}
		
	
	
	
	System.out.println("El numero binario es: "+binario);
}

}		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

