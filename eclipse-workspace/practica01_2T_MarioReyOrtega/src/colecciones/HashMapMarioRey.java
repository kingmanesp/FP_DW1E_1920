package colecciones;

import java.util.HashMap;

public class HashMapMarioRey extends Arboles{

	public HashMapMarioRey(String nombre, double altura, int a�osEdad, String lugarOrigen, boolean hojaCaduca) {
		super(nombre,altura,a�osEdad,lugarOrigen,hojaCaduca);
		
	}

	public static void main(String[] args) {
		
		//2
		HashMap<Integer, String> HsMR = new HashMap<Integer, String>();
		
		HsMR.put(1, "Maria Salomea Sklodowsk ");
		HsMR.put(2, "Santiago Ram�n y Cajal ");
		HsMR.put(3, "T�ano de Crotona ");
		HsMR.put(4, "Mariano Barbacid ");
		HsMR.put(5, "Ada Byron ");
		
		//3
		System.out.println("");
		System.out.println("El tama�o del HashMap es: "+HsMR.size());
		
		//4
		System.out.println("");
		System.out.println("");
		System.out.println(1+" Su nacinalidad de "+HsMR.get(1)+"es Polaca");
		System.out.println(2+" Su nacinalidad de "+HsMR.get(2)+"es Espa�ola");
		System.out.println(3+" Su nacinalidad de "+HsMR.get(3)+"es Griega");
		
	
		//5
		HsMR.replace(4, "Mariano Barbacid ", "Margarita Salas Falgueras");
	
		//6
		System.out.println("");
		System.out.println("");
		System.out.println("Se muestra el HashMap :");
		System.out.println("Posicion: "+1+" Nombre: "+HsMR.get(1));
		System.out.println("Posicion: "+2+" Nombre: "+HsMR.get(2));
		System.out.println("Posicion: "+3+" Nombre: "+HsMR.get(3));
		System.out.println("Posicion: "+4+" Nombre: "+HsMR.get(4));
		System.out.println("Posicion: "+5+" Nombre: "+HsMR.get(5));
	}

}
