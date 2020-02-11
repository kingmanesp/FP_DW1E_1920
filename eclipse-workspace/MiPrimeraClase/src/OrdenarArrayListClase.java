import java.util.*;
public class OrdenarArrayListClase {

	public static void main(String[] args) 
	{

		ArrayList <Integer> miAL = new ArrayList <Integer>();
		ArrayList <String> miALS = new ArrayList <String>();
		
		ArrayList <Coche> miALCoche = new ArrayList <Coche>();
		
		
		miAL.add(9);
		miAL.add(2);
		miAL.add(9);
		miAL.add(8);
		miAL.add(5);
		miAL.add(3);
		
		Collections.sort(miAL);
		
		System.out.println(miAL);
		
		//Ordenacion ascendente
		miALS.add("Ruba");
		miALS.add("Ana");
		miALS.add("Maria");
		miALS.add("Juan");
		
		Collections.sort(miALS);
		//Ordenacion descendente
		System.out.println("Ordenacion Descendente");
		Comparator <Integer> comp= Collections.reverseOrder();
		Collections.sort(miAL,comp); //de mayor a manor usando el reverseOrder pero por defecto es de mayor a menor
		
		System.out.println();
		
		//Trabajo ArrayList coches Ordenar Precio
		
		miALCoche.add(new Coche("Mercedes" ,70000.40, "Rojo"));
		miALCoche.add(new Coche("Mercedes" ,70000.40, "Azul"));
		miALCoche.add(new Coche("Mercedes" ,70000.40, "Azul"));
		miALCoche.add(new Coche("Moustang" ,70000.40, "Amarillo"));
		miALCoche.add(new Coche("Tesla" ,70000.40, "Negro"));
		miALCoche.add(new Coche("BMW" ,45000.40, "Negro Mate"));
	}

}

class Coche implements Comparable
{
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	private String marca;
	private Double precio;
	private String color;
	
	public Coche(String marca, double precio, String color)
	{
		this.marca=marca;
		this.color=color;
		this.precio=precio;
	
		
	}

	public int compareTo(Coche c) 
	{
		
		return precio.compareTo(c.getPrecio());
	}
	
	
	
	
	
	
	
}