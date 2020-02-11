package herencia;
import java.util.*;

public class EjercicioArrayList_HashSet 
{

	public static void main(String[] args) 
	{
		// 1.-Trabajo con ArrayList CREO ARRAY TIPO STRING Y METO STRINGS
		ArrayList<String> miAL =new ArrayList<String>();
		
		miAL.add("Pepe");
		miAL.add("Juan");
		miAL.add("Luis");
		miAL.add("Maria");
		miAL.add("Fernando");
		
		System.out.println(miAL);
		
		//2.- /*borrar de los strings si la 3º letra es 'r' o 'a'  (la escuacion de dentro del parentesis se llama expresion lambda)*/
		miAL.removeIf(variable -> variable.charAt(2) == 'a' || variable.charAt(2) == 'r'); 

		System.out.println(miAL);
		
		//Trabajo con HashSet
		//1.-
		
		HashSet<Equipo> miHS =new HashSet <Equipo> ();
		
		miHS.add(new Equipo ("Tuerce", 21));
		miHS.add(new Equipo ("Rayo", 18));
		miHS.add(new Equipo ("Clara", 31));
		
		System.out.println(miHS);
		
		//2.-
		
		miHS.removeIf(nC -> (nC.getNumComponentes()<19));
		
		System.out.println(miHS);
		
		//Trabajo con HashMap
		//1.-
		HashMap <Integer, Integer> miHM = new HashMap <Integer,Integer>();
		
		miHM.put(0, 100);
		miHM.put(1, 1000);
		miHM.put(2, 10000);
		miHM.put(3, 100000);
		
		System.out.println(miHM);
		
		//2.-
		
		Integer valor = miHM.remove(3);
		
		System.out.println(valor);
	}

}

class Equipo
{
	private String nombre;
	private int numComponentes;
	public Equipo (String n, int nC)
	{
		nombre=n;
		numComponentes=nC;
		
	}
	
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public int getNumComponentes() 
	{
		return numComponentes;
	}

	public void setNumComponentes(int numComponentes) 
	{
		this.numComponentes = numComponentes;
	}

	public String toString()
	{
		
		String msj = "El nombre del equipo es "+nombre+" y tiene "+numComponentes+" componentes\n";
		return msj;
	}
	
	
	
}