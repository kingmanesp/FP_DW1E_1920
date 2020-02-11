package Paquete2;
import Paquete1.*;
public class Felinos extends Utilidad
{
	
	public Felinos (String nombre, String habitat, boolean extincion)
	{
		super(nombre,habitat,extincion);
	}
	public Felinos (String nombre, String habitat, String alimentacion, boolean extincion, int patas, String especie, boolean sexo)
	{
		super(nombre,habitat,alimentacion,extincion,patas,especie,sexo);
	}
	public Felinos () {super();}
	
	public static void main(String[] args) 
	{
		
		Felinos gato=new Felinos("Meneos","Montaña",false);
		Felinos tigre=new Felinos("Mufasa","Savana","Carnivoro",false ,4,"Felidae",false);
		Felinos puma=new Felinos();
		
		puma.setNombre("Bagheera");
		puma.setHabitat("Savana");
		puma.setAlimentacion("Carnivoro");
		puma.setExtincion(false);
		puma.setPatas(4);
		puma.setEspecie("Felidae");
		puma.setSexo(false);
		
		
		System.out.println("El nombre del gato es: "+gato.getNombre());
		System.out.println("El nombre del tigre es: "+tigre.getNombre());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		

	}

}
