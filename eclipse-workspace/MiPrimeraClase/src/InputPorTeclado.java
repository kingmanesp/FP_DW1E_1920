import java.util.*;
public class InputPorTeclado 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("edad");
		
		int edad = teclado.nextInt();
		System.out.println("nombre");
		
		String nombre = teclado.nextLine();
		System.out.println("apellido");
		
		String apellido = teclado.nextLine();
		System.out.println(edad+""+nombre+""+apellido);
		
		
		
		
		
	}

}
