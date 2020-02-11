
public class Persona 
{
	public String colorPelo;
	public int altura;
	//float peso;
	public double peso;
	public String nombre;
	public boolean barba;
	public int calzado;
	
	public static void main(String[] args) 
	{
		Persona luisa=new Persona();
		Persona paco=new Persona();
		paco.altura=169;
		paco.barba=true;
		paco.calzado=42;
		paco.colorPelo="moreno";
		paco.peso=78;
		paco.nombre="Paco";
		paco.andar(10);
		
	
		
		
		luisa.altura=178;
		luisa.colorPelo="moreno";
		luisa.peso=68;
		luisa.barba=false;
		luisa.nombre="Luisa";
		luisa.andar(15);
		luisa.enseñaPropiedades();
		paco.enseñaPropiedades();
	}
	public void andar(int km) 
	{
		System.out.println(nombre+" Ha andando "+km);
		System.out.println();
		
	}
	public int peso(int kilos)
	{
		int totalKilos;
		totalKilos=kilos+15;
		return totalKilos;
	}
	
	public boolean fichado()
	{
		return true;
	}
	public void enseñaPropiedades()
	{
		System.out.println("La altura de "+nombre+" es de "+altura+"cm");
		
	}



}
