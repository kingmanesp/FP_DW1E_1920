package herencia;

import java.util.*;



public class AnimalCasero implements Comparable<AnimalCasero>
{
        private String nombre;
        private double peso;
        private String especie;
        
        public AnimalCasero(String nombre, double peso, String especie) {
          	
          	this.nombre = nombre;
          	this.peso = peso;
          	this.especie = especie;
    	  }
        
        
	public static void main(String[] args) 
	{
		
		
		ArrayList<AnimalCasero> animalesL = new ArrayList<>();
        HashSet<AnimalCasero> animalesH = new HashSet<>();
		
		
		animalesL.add(new AnimalCasero("Mario", 120, "Mamut"));
		animalesL.add(new AnimalCasero("Lolo", 30, "Gacela"));
		animalesL.add(new AnimalCasero("Lena", 100, "Leona"));
		animalesL.add(new AnimalCasero("Socu", 5.0, "Sapo"));
		animalesL.add(new AnimalCasero("Gaston", 10, "Anguila"));
		animalesL.add(new AnimalCasero("Rere", 20, "Serpiente"));
		
		

		animalesH.add(new AnimalCasero("Mario", 120, "Mamut"));
		animalesH.add(new AnimalCasero("Lolo", 30, "Gacela"));
		animalesH.add(new AnimalCasero("Lena", 100, "Leona"));
		animalesH.add(new AnimalCasero("Socu", 5.0, "Sapo"));
		animalesH.add(new AnimalCasero("Gaston", 10, "Anguila"));
		animalesH.add(new AnimalCasero("Rere", 20, "Serpiente"));
		
		for(AnimalCasero acAL:animalesL)
		System.out.println(acAL);
		
		System.out.println();
		
		for(AnimalCasero acAL:animalesH)
			System.out.println(acAL);
		
		
	}


	@Override
	public String toString() {
		return "AnimalCasero [nombre=" + nombre + ", peso=" + peso + ", especie=" + especie + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((especie == null) ? 0 : especie.hashCode());
		long temp;
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnimalCasero other = (AnimalCasero) obj;
		if (especie == null) {
			if (other.especie != null)
				return false;
		} else if (!especie.equals(other.especie))
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		return true;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}

public int compareTo(AnimalCasero e)
{
	return nombre.compareTo(getNombre());
}
	
}
