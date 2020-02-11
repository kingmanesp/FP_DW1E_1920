import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.*;
import java.io.IOException;


public class MarioReyOrtega1Eva extends Trabajador implements CalculadorNominaInterface 
{
	private String funcion;
	private String especialidad;
	

	public static void main(String[] args) throws IOException
	{
		
		
		
		
		
		Scanner teclado= new Scanner (System.in);
		System.out.println("¿Cuantos trabajadores quiere dar de alta?");
		int numTrabajadores =teclado.nextInt();
		MarioReyOrtega1Eva contenedor[]=new MarioReyOrtega1Eva[numTrabajadores];
		ArrayList <MarioReyOrtega1Eva> listaE =new ArrayList <MarioReyOrtega1Eva>();
		ArrayList <MarioReyOrtega1Eva> listaD =new ArrayList <MarioReyOrtega1Eva>();
		
		ArrayList <MarioReyOrtega1Eva> listaM =new ArrayList <MarioReyOrtega1Eva>();
		
		for (int i=0; i<numTrabajadores; i++)
		{
			
			
			System.out.println("");
			System.out.println("ALTAS DE MEDIC@S, ENFERMER@S y OTR@S");
			System.out.println("=====================================");
			System.out.println();
			System.out.println("Introduzca los datos del profesional:" +(i+1));
			System.out.print("Nombre: ");
			String nombre=teclado.next();
			System.out.print("Fecha Nacimiento <yyyy-mm-dd>: ");
			String fechaNacimient=teclado.next();
			LocalDate fechaNacimiento=null;
			try 
			{
				fechaNacimiento=LocalDate.parse(fechaNacimient);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.print("Fecha Alta en la empresa <yyyy-mm-dd>: ");
			String fechaAlt=teclado.next();
			LocalDate fechaAlta=null;
			try 
			{
				fechaAlta=LocalDate.parse(fechaAlt);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.print("Pais: ");
			String pais=teclado.next();
			System.out.print("Ciudad: ");
			String ciudad=teclado.next();
			System.out.print("Sueldo Bruto: ");
			double sueldoBruto= teclado.nextDouble();
			System.out.print("Porcentaje de IRPF: ");
			double porcientoIrpf=teclado.nextDouble();
			System.out.print("Porcentaje Seguridad Social: ");
			double porcientoSSocial=teclado.nextDouble();
			System.out.print("Funcion <Teclee M (Medico/a) , E (Enfermero/a) o D (Otro)>");
			String funcion=teclado.next();
			System.out.print("Teclee la especialidad <Medicina: (Oftalmologo, UVI, Internista, Traumatologo, Cirugia)> , <Enfermeria: (Quirofano, UVI, Urgencias, Planta)> , Otra: ");
			String especialidad=teclado.next();
			MarioReyOrtega1Eva medicoEnfermero = new MarioReyOrtega1Eva (funcion, especialidad, nombre, fechaNacimiento, fechaAlta, ciudad, pais, sueldoBruto, porcientoIrpf, porcientoSSocial);
			
			funcion.toLowerCase();
			if(funcion.equals("m"))
			{
				for(MarioReyOrtega1Eva t
						:contenedor)
				{
					t=medicoEnfermero;
					listaM.add(t);
				}
				
				
			}
			
			if(funcion.equals("e"))
			{
				
				
				for(MarioReyOrtega1Eva t:contenedor)
				{	t=medicoEnfermero;
					listaE.add(t);
				}
				
				
			}
			
			else
			{
				
				for(MarioReyOrtega1Eva t:contenedor)
				{	t=medicoEnfermero;
					listaD.add(t);
				}
			}
			
			
			
			
			
		}
		teclado.close();
		System.out.println("");
		System.out.println("Informacion del personal Medico");
		System.out.println("===============================");
		System.out.println();
		for(MarioReyOrtega1Eva t:listaM)
		{
			System.out.println(t.toString());
		}
		System.out.println("");
		System.out.println("Informacion del personal de Enfermeria");
		System.out.println("===============================");
		System.out.println();
		for(MarioReyOrtega1Eva t:listaE)
		{
			System.out.println(t.toString());
		}
		System.out.println("");
		System.out.println("Informacion del personal de Enfermeria");
		System.out.println("===============================");
		System.out.println();
		for(MarioReyOrtega1Eva t:listaD)
		{
			System.out.println(t.toString());
		}
		
		
	}
	public MarioReyOrtega1Eva (String funcion, String especialidad, String nombre, LocalDate fechaNacimiento, LocalDate fechaAlta, String ciudad, String pais, double sueldoBruto, double porcientoIrpf, double porcientoSSocial)
	{
		super(nombre, fechaNacimiento, fechaAlta, ciudad, pais, sueldoBruto, porcientoIrpf, porcientoSSocial);
		this.funcion=funcion;
		this.especialidad=especialidad;
		
		
	}
	
	public double calculoIRPF() 
	{
		double	cIRPF=sueldoBruto*porcientoIrpf/100;
		return cIRPF;
		
	}
	
	public double calculoSSocial() 
	{
		double  cSS=sueldoBruto*porcientoSSocial/100;
		return cSS;
		
	}

	public double calculoSueldoNeto() 
	{
		double cSN=sueldoBruto-(sueldoBruto*porcientoSSocial/100)-(sueldoBruto*porcientoIrpf/100);
		return cSN;
	}
	public String toString()
	{
		DateTimeFormatter formatoFecha=DateTimeFormatter.ofPattern("dd-mm-yyyy");
		
		
		String msj="El/La profesional "+this.getNombre()+". Su funcion es "+this.funcion+"/nSu especialidad es: "+this.especialidad+"/nFecha de alta: "
		+this.getFechaAlta().format(formatoFecha)+" Fecha de Nacimiento: "+this.getFechaNacimiento().format(formatoFecha)+
		"/nTiene un sueldo bruto de: "+sueldoBruto+" €"+"/nDescuentos: "+"/nPor IRPF "+"("+porcientoIrpf+"):"
		+this.calculoIRPF()+"/nPor Seguridad Social ("+porcientoSSocial+"): "+this.calculoSSocial()+"/nTotal sueldo NETO: "+this.calculoSueldoNeto();
		return msj;
		
	}
}
