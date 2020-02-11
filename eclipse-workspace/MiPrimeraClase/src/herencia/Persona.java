package herencia;

public class Persona 
{

	 private String nombre;
	 private String apellido;
	 private String calle;
	 private String telefono;
	 private int edad;
	
	protected double edadAmpliada()
	{
		
		return 10.9*edad;
	}
	private void texto()
	{
		
		System.out.println("Hola");
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
