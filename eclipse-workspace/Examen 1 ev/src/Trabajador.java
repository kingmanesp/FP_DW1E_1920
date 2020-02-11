
import java.time.*;


class Trabajador 
{

	private String nombre;
	private LocalDate fechaNacimiento;
	private LocalDate fechaAlta;
	private String ciudad;
	private String pais;
	double sueldoBruto;
	double porcientoIrpf;
	double porcientoSSocial;
	
	public Trabajador () {}
	
	public Trabajador (String nombre, LocalDate fechaNacimiento,LocalDate fechaAlta, String ciudad, String pais, double sueldoBruto, double porcientoIrpf, double porcientoSSocial)
	{
		this.nombre=nombre;
		this.fechaNacimiento=fechaNacimiento;
		this.fechaAlta=fechaAlta;
		this.ciudad=ciudad;
		this.pais=pais;
		this.sueldoBruto=sueldoBruto;
		this.porcientoIrpf=porcientoIrpf;
		this.porcientoSSocial=porcientoSSocial;
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

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
}
