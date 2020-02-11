package herencia;

abstract class Abstracta 
{
	private String nombre;
	private double sueldo;
	
	public Abstracta () {}
	public Abstracta (String nombre,double sueldo)
	{
		this.nombre=nombre;
		this.sueldo=sueldo;
		
	}
	public  String mostrar() 
	{
		return nombre;
	
		
	}
	public  double mostrarSueldo() 
	{
		return sueldo;
	
		
	}
	 

}