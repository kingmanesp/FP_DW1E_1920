package colecciones;


class Arboles  implements Comparable<Arboles>
{
	String nombre;
	double altura;
	int a�osEdad;
	String lugarOrigen;
	boolean hojaCaduca;
	public Arboles() {}
	public Arboles(String nombre, double altura, int a�osEdad, String lugarOrigen, boolean hojaCaduca) {
		
		this.nombre = nombre;
		this.altura = altura;
		this.a�osEdad = a�osEdad;
		this.lugarOrigen = lugarOrigen;
		this.hojaCaduca = hojaCaduca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getA�osEdad() {
		return a�osEdad;
	}
	public void setA�osEdad(int a�osEdad) {
		this.a�osEdad = a�osEdad;
	}
	public String getLugarOrigen() {
		return lugarOrigen;
	}
	public void setLugarOrigen(String lugarOrigen) {
		this.lugarOrigen = lugarOrigen;
	}
	public boolean isHojaCaduca() {
		return hojaCaduca;
	}
	public void setHojaCaduca(boolean hojaCaduca) {
		this.hojaCaduca = hojaCaduca;
	}
	@Override
	public int compareTo(Arboles arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
}
