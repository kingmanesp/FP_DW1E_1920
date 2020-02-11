
public class Animal 
{
	public String dieta;
	public String habitat;
	public String especie;
	public double velocidad;
	public int patas;
	public String nombre;
	public String pronombre;
	public String bebe;
	public String duerme;
	public int salta;
	
	
	
	
	public static void main(String[] args) 
	{
		

		Animal elefante=new Animal();
		Animal elefante1=new Animal();
		Animal boa=new Animal();
		elefante.dieta="hierba";
		elefante.habitat="la savana";
		elefante.velocidad=10;
		elefante.patas=4;
		elefante.especie="Elephantidae";
		elefante.nombre="elefante";
		elefante.pronombre="El";
		elefante.bebe="Agua";
		elefante.duerme="bien";
		elefante.salta=3;
		
		elefante1.bebe="Agua";
		elefante1.dieta="hierba";
		elefante1.habitat="la savana";
		elefante1.velocidad=9;
		elefante1.patas=4;
		elefante1.especie="Elephantidae";
		elefante1.nombre="elefante1";
		elefante1.pronombre="El";
		elefante1.duerme="bien";
		elefante1.salta=3;
		
		boa.bebe="Agua";
		boa.dieta="carne";
		boa.habitat="la selva";
		boa.velocidad=4;
		boa.patas=0;
		boa.especie="Boidae";
		boa.nombre="boa";
		boa.pronombre="La";
		boa.duerme="bien";
		boa.salta=0;
	
		elefante1.comer();
		elefante.comer();
		boa.comer();
		elefante1.dormir();
		elefante.dormir();
		boa.dormir();
		elefante1.saltar();
		elefante.saltar();
		boa.saltar();
		elefante1.beber();
		elefante.beber();
		boa.beber();
		elefante1.enseñaPropiedades();
		elefante.enseñaPropiedades();
		boa.enseñaPropiedades();
		
		
		
		
		
		
		
		
	}
		
		
		
	public void comer()
	{ 
		
		
		System.out.println(pronombre+" "+nombre+" come "+dieta);
		
	}
	
	
	
	
	public void beber()
	
	{
		
		System.out.println(pronombre+" "+nombre+" bebe "+bebe);
	}
	
	
	public void dormir()
	{
		
		System.out.println(pronombre+" "+nombre+" duerme "+duerme);
		
		
	}
	
	
	
	
	public void saltar()
	{
		
		
		System.out.println(pronombre+" "+nombre+" salta "+salta+" cm");
		
	}
	
	
	public void enseñaPropiedades()
	{
		System.out.println(pronombre+" "+nombre+" vive en "+habitat+", alcanza los "+velocidad+"Km/h, tiene "+patas+" y es de la familia de los "+especie);
	
	}
	
	
	
}
