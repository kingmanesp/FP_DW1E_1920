//dos numeros por teclado un numero va a ser uno el dividendo y otro el divisior y voy a controlar el error 
//que me pueda dar en la division entre 0 y ademas voy a controlar que si el divisor es negativo
import java.util.*;
import java.io.*;
public class TryCatchPractica 
{

	public static void main(String[] args)
	{
		
		try( Scanner teclado=new Scanner(System.in))
		{
			System.out.println("Introduzca dos numeros por teclado (A/B");
			int a;
			int b;
			System.out.println("Dividendo: ");
			a=teclado.nextInt();
			System.out.println("Divisor: ");
			b=teclado.nextInt();
			
			int resultado = a/b;
			
			
			
			
			
			
			
			if (b<0)
			{
				throw new Throwable ("El divisor es negativo");
				
			}
			else System.out.println(resultado);
		}
		//catch(ArithmeticException a)
		//{
		//	 System.out.println(a.getMessage());
			 
		//}
		catch(Throwable e)
		{
			 System.out.println(e.getMessage());
			 
		}
		
		
		
		
		
		

	}

}
