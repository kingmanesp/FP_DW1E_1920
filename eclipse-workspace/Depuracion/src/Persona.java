
public class Persona 
{
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean casado;
	private String numDNI;
	
	
	

	public static void main(String[] args) 
	{
		
		 Persona obj1=new Persona();
		
		obj1.setNombre("Maria");
		obj1.setApellidos("Gascon");
		obj1.setEdad(19);
		obj1.setCasado(true);
		obj1.setNumDNI("027689671W");
		
		System.out.println("Nombre: "+obj1.getNombre());
		System.out.println("Apellido: "+obj1.getApellidos());
		System.out.println("Edad: "+obj1.getEdad());
		System.out.println("Esta casado/a?: "+obj1.isCasado());
		System.out.println("Su DNI es: "+obj1.getNumDNI());

	}



	public String getNombre() {
		return nombre;
	}


	public  void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean isCasado() {
		return casado;
	}


	public void setCasado(boolean casado) 
	{
		this.casado = casado;
	}


	public String getNumDNI() {
		return numDNI;
	}


	public void setNumDNI(String numDNI) 
	{
		this.numDNI = numDNI;
	}

}
