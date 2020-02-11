
public class TercerTryCatch {

	public static void main(String[] args) {
	
		// TercerTryCatch obj = new TercerTryCatch
		//obj.operacion();
		int v1 = 4 , v2 = 2 ;
		
		int resultado=operacion(v1,v2);
		
		System.out.println(resultado);
		
	}
	
	
	public static int operacion (int v1, int v2)
	{
		int resultado = 0;
		try
		{
		
			resultado = v1/ v2;
		
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		return resultado;
		
	}

}
