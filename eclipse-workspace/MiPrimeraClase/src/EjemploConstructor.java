import java.util.Scanner; //importamos java.util.Scanner para poder introducir datos por teclado
public class EjemploConstructor {

	public static void main(String[] args) 
	{
		
		
		
		Scanner entrada=new Scanner(System.in); //creamos una entrada de teclado (system.in) es el archivo donde esta la informacion de que el metodo de entrada es el teclado.
		System.out.println("Introduzca un nombre");
		String teclado=entrada.nextLine(); // hay que decirle despues de que hay que escribir con este comando (se usa nextLine por que es texto
		
		
		System.out.println("Introduzca un numero con decimal");
		double numeroDoble=entrada.nextDouble(); // se usa nextDouble para indicar que es con decimales
		System.out.println(teclado+" "+numeroDoble);
		entrada.close(); //cuando dejamos de usar el teclado con el comando scanner lo cerramos

		Alumno al1=new Alumno(1200); // este es un constructor con una sola variable
		
		Alumno al2=new Alumno(); // este es un constructor con vacio al que le metemos las propiedades
		al2.nombre="Pedro";
		al2.carrera="pastor";
		al2.pais="Andorra";
		
		Alumno al3=new Alumno("Marina","Francia","Informatica"); // este es un constructor con 3 variables al que directamente le metes los datos2
		
		System.out.println("Primero: "+al1.nombre+", Segundo: "+al2.nombre+", Tercero: "+al3.nombre);
		
	}

}

class Alumno //creas la clase pro no puede ser ni publica ni main por que ya esta en el otro
{
	
	String nombre;
	String pais;
	String carrera;
	
	public Alumno() {}   //constructor vacio
	public Alumno(String nombre,String pais,String carrera) //creamos otro constructor con 3 atributos
		{
		this.nombre=nombre;
		this.pais=pais;				//ponemos this.nombredelatributo=nombredelavariable; para cada uno de las variables
		this.carrera=carrera;
		}
	public Alumno(int valor)
		{
		System.out.println(valor);
		}
	public String getNombre()
		{
		return nombre;
		}
	public String getPais()
		{
		return pais;
		}
	public String getCarrera()
		{
		return carrera;
		}
}
