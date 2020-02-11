package colecciones;



import java.util.*;

public class ArrayListMarioRey extends Arboles
{
	
	public ArrayListMarioRey (String nombre, double altura, int añosEdad, String lugarOrigen, boolean hojaCaduca) 
	{
		super(nombre, altura, añosEdad, lugarOrigen, hojaCaduca);
	}

	
	
	

	public static void main(String[] args) 
	{
		
		
		//2
		ArrayList<Arboles> arbolesAL = new ArrayList<>();
		
		arbolesAL.add(new ArrayListMarioRey("Roble", 12.5, 80, "Canada", true));
		arbolesAL.add(new ArrayListMarioRey("Encina", 5.25, 90, "España", false));
		arbolesAL.add(new ArrayListMarioRey("Pino Laricio", 22.5, 80, "Italia", false));
		arbolesAL.add(new ArrayListMarioRey("Roble",  5.5, 15, "Canada", true));
		arbolesAL.add(new ArrayListMarioRey("Manzano", 3.5, 60, "India", false));
		System.out.println("Arraylist de "+arbolesAL.size() + " posiciones ha sido creado");
		
		
		//3
		if(arbolesAL.isEmpty()==true) 
		{
			System.out.println("El array list está vacio");
		}
		else 
		{
			arbolesAL.toArray();       //pasar de arrayList a array
			
		}
		
		
		//4
		System.out.println("");
		
		
		for (int a=0; a<arbolesAL.size(); a++) 
		{  //bucle para recorrer el array
			
			
			boolean interruptorNoPeral=false;
			if(arbolesAL.get(a).getNombre() == "Peral"  && arbolesAL.get(a).getLugarOrigen() == "Canada" ) 
			{
				interruptorNoPeral=true;
				System.out.println("Se ha encontrado un arbol de tipo Peral en la region de Canada, su posición es "+a);
				
				
			}
			else if( arbolesAL.get(a).getNombre() != "Peral"  && arbolesAL.get(a).getLugarOrigen() != "Canada" ) 
			{
				//por cada uno que no encuentre no queremos que escriba nada asi que no ponemos nada
			}
			else if( interruptorNoPeral=false ) 
			{
				System.out.println("No se ha encontrado ningun arbol de tipo Peral en la region de Canada");
			}
		}
		
		
		//5
		System.out.println("");
		System.out.println("Arbol de altura 3.5");
		
		for (int i=0; i<arbolesAL.size(); i++) 
		{  
			
			boolean arbolAltoInterruptor=false;				//bucle recorrer el array
			
			if(arbolesAL.get(i).getAltura() == 3.5 )
			{
				
				//si encuentra
				arbolAltoInterruptor=true; 
				System.out.println("Se ha encontrado un arbol de altura 3.5 , su posición es "+i);
				
			}
			else if(arbolesAL.get(i).getAltura() != 3.5) 
			{  //si es distinto a 3,5 no hace nada
				
			}
			else if(arbolAltoInterruptor==false) 
			{ //si no encuentra
				
				System.out.println("No se ha encontrado ningun arbol de altura 3.5");
			}
		}
		
		
		//6
		System.out.println("");
		for (int i=0; i<arbolesAL.size(); i++) 
		{  //bucle recorrer el array
			
			if(arbolesAL.get(i).getNombre() == "Encina" ) 
			{
				
				arbolesAL.get(i).setAñosEdad(95);
				
				System.out.println("Se ha encontrado un arbol tipo encina de 90 años, se actualizará la edad a 95");
				System.out.println("Edad actualizada");
			}
		}
		
		
		//7
		System.out.println("");
		for (int i=0; i<arbolesAL.size(); i++) 
		{  //bucle recorrer array
			
			if(arbolesAL.get(i).getNombre() == "Roble" && arbolesAL.get(i).isHojaCaduca()==true ) 
			{
				
				arbolesAL.remove(i);
				System.out.println("Se ha eliminado el elemento Roble de Hoja caduca de la posicion " +i+" del Arraylist");
			}
			
		
		//8
		System.out.println();
		arbolesAL.trimToSize();
		System.out.println("El tamaño del ArrayList ha sido ajustado");
		
		
		//9
		//ArrayList<Arboles> misArbolesALReverso = new ArrayList<>();
	    arbolesAL.get(i);
	    Comparator <Arboles> comparator = new Comparator<Arboles>() {

			@Override
			public int compare(Arboles o1, Arboles o2) {
				
				
				return new Integer (o2.getAñosEdad()).compareTo(new Integer(o1.getAñosEdad()));
				
				
			}
		    };
		Collections.sort(arbolesAL,comparator);
	    
		//10
		System.out.println("");
		System.out.println("Se muestra el contenido del Array List:");
		System.out.println(arbolesAL);
		
		}//FIN FOR
		
	}//fin del main

}//fin Clase


	
