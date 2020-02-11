//dos numeros  el primero numero y el segundo porcentaje
//calcular el porciento del primero con el segundo
//si reultado 0-100 ver resultado
//si resultado 101-1000 sobrecoste
//en otro caso >1000   excesivo
//
//
//
//
//
import java.util.*;
import java.io.*;
public class TryCatchPractica2 
{

	public static void main(String[] args) 
	{
		
		try( Scanner teclado=new Scanner(System.in))
		{
			System.out.println("Introduzca dos numeros por teclado (A/B");
			int a;
			int b;
			System.out.println("Numero: ");
			a=teclado.nextInt();
			System.out.println("Porcentaje: ");
			b=teclado.nextInt();
			
			double resultado = a%b;
			
			
			
			
			
			
			
			if (resultado<=1000 || resultado>=101)
			{
				throw new Exception("Sobrecoste");
				
			}
			if (resultado>1000)
			{
				throw new Throwable("Excesivo");
				
			}
			
			else System.out.println("El resultado es "+resultado);
		
		
		
		}
		catch (Exception s)
		{
			
			System.out.println(s.getMessage());
		}
		catch (Throwable e)
		{
			System.out.println(e.getMessage());
		}
	}

}
