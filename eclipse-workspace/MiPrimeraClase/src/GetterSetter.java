
public class GetterSetter 
{

		private String nombre;
		private double sueldo;
		private short edad;
	
	public GetterSetter(String n,double s,short e)
	{
		nombre=n;
		sueldo=s;
		edad=e;
	}
	
	public static void main(String[] args) 
	{

				GetterSetter Pepe=new GetterSetter("Pepe",1200.40, (short) 24);
		
		
		

	}
	public void setNombre(String n)
	{
		
		nombre=n;
		
	}
	public void setSueldo(double s)
	{
		sueldo=s;
	}
	public void setEdad(short e)
	{
		edad=e;
	}
	public String getNombre()
	{
		return nombre;
	}
	public double getSueldo()
	{
		return sueldo;
	}
	public short getEdad()
	{
		return edad;
	}
	public String toString()
	{
		String mensaje="El nombre es"+nombre+", el sueldo es "+sueldo+" y la edad es de "+edad+" años";
		return mensaje;
	}
	
	
	
}
