package practica02_2T_MarioReyOrtega;

import java.util.*;
public class marioReyOrtegaP02_Errores 
{
	
	public static void main(String[] args)  
	{
		String tratamiento;
		double numero;

	try(Scanner teclado =new Scanner (System.in))
	{
		
		System.out.println("Introduzca tratamiento(Sr/Sra):");
		System.out.println("");
		tratamiento=teclado.nextLine();
		System.out.println("Introduzca numero");
		System.out.println("");
		numero=teclado.nextDouble();
		
		try
		{
			if(tratamiento.equalsIgnoreCase("Sr") || tratamiento.equalsIgnoreCase("Sra"))
			{
				if(tratamiento.equalsIgnoreCase("Sr"))
					tratamiento="Sr";
				if(tratamiento.equalsIgnoreCase("Sra"))
					tratamiento="Sra";
			
			}
			else 
			{
				throw new TratamientoException("El tratamiento "+tratamiento+" no es correcto");
			}
		
		}
		
		catch(TratamientoException e)
		{
				System.out.println(e.getMessage());
		}
		
		try
		{
			if(numero < 0) 
			{
				throw new NegativoException("El numero introducido es negativo");
			
			
			}
		}
		catch(NegativoException e)
		{
				System.out.println(e.getMessage());
		}
		
		try 
		{
			if(numero==0)
			{
				throw new CeroException("El numero introducido es 0 y no es posible");
			}
		}
		catch(CeroException e)
		{
				System.out.println(e.getMessage());
		}
		try
		{
		marioReyOrtegaP02_Errores.FueraDeRango(numero);
		}
		catch(FueraDeRangoException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(tratamiento+"."+"***"+numero);
	} 
	catch (Throwable e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	}
	public static void FueraDeRango(double numero) throws FueraDeRangoException
	{
		

			if(numero<1000 && numero>1000000)
			{
				throw new FueraDeRangoException("El numero introducido esta fuera del rango admitido(1000-1000000)");
			}
		
	}

}
