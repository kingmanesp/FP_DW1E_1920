import java.util.*;
import java.time.*;
import java.time.format.*;
public class marioReyExamenP1Eva {

	public static void main(String[] args) 
	{
		ArrayList <Cliente> misClientesVip=new ArrayList<Cliente>();
		ArrayList <Cliente> misClientesNoVip=new ArrayList<Cliente>();
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Cuantos clientes desea dar de alta");
		int numClientes=teclado.nextInt();
		Cliente contenedor[]=new Cliente[numClientes];
		
		String fechaTeclado="",datoVip="";
		double sueldoC=0;
		
		for(int i=0;i<numClientes;i++)
		
		{
			System.out.println("Datos para dar de alta al cliente "+(i+1));
			
			System.out.println("Nombre: ");
			String nombreC=teclado.next();
			LocalDate fechaNaciC=null;
			
			try 
			{
				
				fechaNaciC=LocalDate.parse(fechaTeclado);
				
			}
			catch (Exception e)
			{
				
				e.printStackTrace();
				
			}
			
			System.out.println("Sueldo: <Si no lo conoce teclee 0>");
			sueldoC=teclado.nextDouble();
			
			System.out.println("VIP (s/n): ");
			
			datoVip=teclado.next();
			datoVip.toLowerCase();
			boolean vipC=false;
			
			if(datoVip.contentEquals("s"))
				vipC=true;
			if(sueldoC==0)
				contenedor[i]=new Cliente("Cliente"+i,nombreC,fechaNaciC,vipC);
			else
				contenedor[i]=new Cliente("Cliente"+i,nombreC,fechaNaciC,sueldoC,vipC);
			
		}
		
		teclado.close();
		
		for(Cliente c:contenedor)
		{
			
			if(c.isVip())
				misClientesVip.add(c);
			else
				misClientesNoVip.add(c);
		}
		
		System.out.println("");
		System.out.println("Clientes VIP");
		System.out.println("=================");
		
		/*	for(int i=0;i<misClientesVip.size();i++)
		 * 	{
		 * 
		 * 	System.out.println(misClientesVip.get(i));
		 * 
		 * 
		 * 	}
		 * 
		 * 
		 */
		
		for(Cliente cvip:micClientesVip)
			System.out.println(cvip.toString());
		
		System.out.println("");
		System.out.println("Clientes Generales");
		System.out.println("==================");
		
		for(Cliente cgral:micClientesNoVip)
			System.out.println(cgral.toString());
		
	}

}
