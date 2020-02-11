import java.time.*;
import java.time. format.*;
class Cliente 
{

	private String id;
	private String nombre;
	private LocalDate fechaNacimiento;
	private double sueldo;
	private boolean vip;
	
	public Cliente () {}
	
	public Cliente (String id, String nombre, LocalDate fechaNacimiento, boolean vip)
	{
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.vip = vip;
		
		
		
		
		
	}
	
	public Cliente (String id, String nombre, LocalDate fechaNacimiento, double sueldo, boolean vip)
	{
		
		
		this(id,nombre,fechaNacimiento,vip);
		this.sueldo=sueldo;
		
	}
	
	public String toString()
	{
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-mm-yyyy");
		String esvip="";
		if(vip)
			esvip="\nEs vip";
		else
			esvip="\nNo es vip";
		String msj = "El cliente de ID "+id+", de nombre "+nombre+" y fecha de nacimiento el "+fechaNacimiento.format(formatoFecha)+", tiene un sueldo de "+sueldo+"€ y "+esvip;
		
		return msj;
		
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	
	
	
	
	
	
	
}
