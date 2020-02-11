

/**
 * 
 * <h1> Esta clase es para parcticar JavaDoc</h1>
 * 	<style>
 * 		p{color : red}
 * 		span {color: blue; font-size: 2em}
 * 		p.especial {color: #0f0}
 * 	</style>
 * <p>Un breve programa para practicar sobre <span>JavaDoc</span></p>
 * @author Mario Rey Ortega
 * @version 1.0
 */


package primerJavadoc;

import java.util.*;



public class PracticaJavaDoc 
{
	
	/**
	 *  Variable String privada, referente al nombre introducido.
	 */
	private String nombre;
	/**
	 * 	Variable int privada, referente a la edad introducida.
	 */
	private int edad;
	
	/**
	 *  Variable double privada, referente a el sueldo introducido.
	 */
	private double sueldo;

	
	/**
	 * Constructor de la clase PracticaJavaDoc en el que se actualizan los parametros:
	 * @param nombre
	 * @param edad
	 * @param sueldo
	 */
	public  PracticaJavaDoc(String nombre, int edad, double sueldo)
	{
		this.nombre=nombre;
		this.edad=edad;
		this.sueldo=sueldo;
	}
	
	
	/**
	 * Metodo main en el que se realizan los procesos principales.
	 * 
	 */
	
	
	
	
	

	
	public static void main(String[] args) 
	{
		
		/**
		 * Objeto tipo Scanner para la introduccion de datos por teclado
		 * @param args
		 */
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca el nombre: ");
		
		/**
		 * String nombre en el que se introducen los datos por teclado para posteriormente llevarlos al objeto que contendra
		 * @param args
		 */
		
		String nombre = teclado.next();
		
		System.out.println("Introduzca la edad: ");
		
		
		/**int edad en el que se introducen los datos por teclado para posteriormente llevarlos al objeto que contendra
		 * @param args
		 */
		
		
		int edad = teclado.nextInt();
		
		System.out.println("Introduzca el sueldo: ");
		
		/**double sueldo en el que se introducen los datos por teclado para posteriormente llevarlos al objeto que contendra
		 * @param args
		 */
		
		double sueldo = teclado.nextDouble();
		
		/**objeto de tipo PracticaJavaDoc
		 * @param args
		 */
		
		PracticaJavaDoc obj = new PracticaJavaDoc(nombre, edad, sueldo);
		
		System.out.println(obj.toString());
		
		
		
		
		
		
		
		
	}
	
		
	
	@Override
	public String toString() {
		return "Los datos introducidos son: \nnombre=" + nombre + ", \nedad=" + edad + ", \nsueldo=" + sueldo + "";
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
}
