package colecciones;

import java.util.*;

public class HashSetMarioRey extends Arboles {
	
	public HashSetMarioRey(String nombre, double altura, int añosEdad, String lugarOrigen, boolean hojaCaduca) {
		super(nombre, altura, añosEdad, lugarOrigen, hojaCaduca);
	}

	public static void main(String[] args) {
		
		//2
		HashSet<HashSetMarioRey> arbolesHS = new HashSet<>();
		
		arbolesHS.add(new HashSetMarioRey("Roble", 12.5, 80, "Canada", true));
		arbolesHS.add(new HashSetMarioRey("Encina", 5.25, 90, "España", false));
		arbolesHS.add(new HashSetMarioRey("Pino Laricio", 22.5, 80, "Italia", false));
		arbolesHS.add(new HashSetMarioRey("Roble",  5.5, 15, "Canada", true));
		arbolesHS.add(new HashSetMarioRey("Manzano", 3.5, 60, "India", false));
		
		
		//3
		System.out.println();
		System.out.println("El tamaño del HashSet es de "+arbolesHS.size());
		System.out.println();
		//4
		
		arbolesHS.toArray();
	
		
		//5
		System.out.println();
		System.out.println("Mostrando el array:");
		System.out.println(arbolesHS);
	}

}
