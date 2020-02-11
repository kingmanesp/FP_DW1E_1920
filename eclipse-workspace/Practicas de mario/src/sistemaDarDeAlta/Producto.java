package sistemaDarDeAlta;

import java.util.Scanner;



public class Producto 
{
	String nombre;
	double precio;
	int cantidad;
	int id;
	

	public static void main(String[] args) 
	{
		
		System.out.println("Escriba el id del productio");
		Scanner sc = new Scanner(System.in);
	     String id = sc.nextLine();
		
		System.out.println(id);
		
		
	}
	public Producto(String nombre , double precio , int cantidad , int id)
	{ 
		
		
		
		
		this.nombre=nombre;
		this.precio=precio;
		this.cantidad=cantidad;
		this.id=id;
		
		
	}
	
}
