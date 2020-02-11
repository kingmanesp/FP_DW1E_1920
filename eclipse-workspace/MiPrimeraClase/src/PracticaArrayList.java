import java.util.*;
public class PracticaArrayList {

	public static void main(String[] args) 
	{
		//1
		ArrayList<Integer> miAL = new ArrayList<>();
		
		for(int i=0;i<=20;i++)
		{
			
			miAL.add(i);
			
		}
		//2
		
		//Object[] objects = arrayL.toArray(); 
		Integer[] arr = new Integer[miAL.size()]; 
		arr = miAL.toArray(arr);
		
		//3 miAL.removeRange(8,12);             en esta version de java no funciona
		//miAL.removeIf(i -> (i % 8 == 12));	
		for(int i=0;i<miAL.size();i++)
		{
			//metodo con valores
			if(miAL.removeIf(n -> n >= 8 && n <=12));     
		}
		//miAL.subList(8, 13).clear();    metodo sacado de internet con indices
		System.out.println(miAL);
		
		
		//4
		System.out.println(miAL.get(7));
		
		//5
		System.out.println(miAL.indexOf(18));
		
		//6
		
		if(miAL.isEmpty())
			System.out.println("El array esta vacio");
		else
			System.out.println(miAL.size());
		
		
		//7
		
		miAL.trimToSize(); 
		
		//8
		boolean ans = miAL.contains(45);
		System.out.println(ans);
	}
	
	
	

}








//crear ArrayList miAL tipo Integer        Insertar 0-20 elementos con bucle for o for each
//crear array desde miAL
//borramos los elementos desde el 8 al 12 con el remove en miAL
//imprimimos el elemento 7 de miAL
//preguntamos en que indice esta el numero 18 en miAL
//preguntamos si miAL esta vacia, si esta vacia que lo ponga, sino visualizar la longitud de miAL
//eliminar los espacios no ocupados en miAL con trimToSize
//preguntar si existe el elemento 45 en miAL