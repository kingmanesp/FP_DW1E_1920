
public class Lista 
{

	public static void main(String[] args) 
		{
		int array[]=new int[50]; //creamos el array
		int primero=202; // inicializamos la variable primero en 202
		for (int i=0;i<array.length;i++) //creamos la condicion para la repeticion
		{
			array[i]=primero;
			primero=primero+2;
		}
		for (int i=0;i<50;i++)
		{
			System.out.println(array[i]); //mostrar todos los valores
			System.out.println("****************************");
			System.out.println("Elemento 26:"+array[25]); //mostrar especificamente elemento 26 de la lista
			System.out.println(array.length); //mostrar la cantidad de elementos de mi array
			
			
			
			//otra manera
			// while (i<array.length)
			// {
			//    array[i]=primero;
			//	  primero+=2;
			//	  i++;
			// }
			//
			//	System.out.println("***************);
			
			
			
			for(int v:array)   //no es el mismo for, este se llama "for each" aunque se escribe for, lo unico que cambia es lo de dentro del parentesis.
				System.out.println(v);
			
			PersonaArray obj1=new PersonaArray();
			PersonaArray obj2=new PersonaArray(); //creamos los objetos identificandolos con un nombre =new y su tipo
			PersonaArray obj3=new PersonaArray();
			PersonaArray obj4=new PersonaArray("Felipe", 2010.80, false);
			
			
			obj1.nombre="Amancio";
			obj1.sueldo=1500.60;  //les damos caracteristicas a cada uno de los objetos
			obj1.casado=false;
			

			obj2.nombre="Amancia";
			obj2.sueldo=1400.60;       //<-----------
			obj2.casado=false;
			

			obj3.nombre="Amancie";
			obj3.sueldo=1200.60;	//<---------------
			obj3.casado=true;
			
			PersonaArray listaPersonas[]=new PersonaArray[5];  //creamos el array definiendo su tipo, despues el nombre del array, corchetes=new y otra vez ek tipo y entre corchetes la dimension
			
			listaPersonas[0]=obj1;
			listaPersonas[1]=obj2;
			listaPersonas[2]=obj3;
			listaPersonas[3]=obj4;
			
			for(PersonaArray people:listaPersonas)
				
				System.out.println("El nombre es: "+people.nombre+", tiene un sueldo de: "+people.sueldo+" y "+people.getEC());
			
			PersonaArray objImp=new PersonaArray ("De Chocolate");
			
			
		}
	}
}


class PersonaArray
{
	public String nombre;
	public double sueldo;
	public boolean casado;
	
	public PersonaArray() {};
	public PersonaArray(String galleta)
	{
		System.out.println(galleta);
	}
	public PersonaArray(String nombre,double sueldo,boolean casado)
{
	this.nombre=nombre;
	this.sueldo=sueldo;
	this.casado=casado;
}
	
	
	
	public String getNombre ()            //
		{
		return nombre;
		}
	public String getEC()		//creamos un metodo para en vez de responder true o false a esta casado, responda esta casado o esta soltero																																																				
		{
		if(casado==true)  //para decir si es igual de comparativa se escriben 2 iguales
		{
			return "esta casado";													//si casado=true devuelve "esta casado" sino devuelve "esta soltero"
		}
		else {return "esta soltero";}
	
		
	}
}
