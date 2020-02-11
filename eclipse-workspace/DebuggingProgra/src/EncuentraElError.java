
public class EncuentraElError {

	public static void main(String[] args) {
		EncuentraElError obj = new EncuentraElError();
		
		obj.rellenaArray();

	}
	public void rellenaArray()
	{
		int lista[] = new int[10];
		
		for(int i=0;i<10;i++)
		{
			lista[i]=(int)(Math.random()*100);
		}
		for(int a:lista)
			System.out.println(a);
		
		
	}

}
