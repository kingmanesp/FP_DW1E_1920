
public class IniciacionDebugger {

	private int a;
	private int b;
	
	
	public IniciacionDebugger(int a, int b) {
		
		this.a = a;
		this.b = b;
	}

	public int sumar()
	{
		return this.getA()+this.getB();
	}

	public int multiplicar()
	{
		return this.getA()*this.getB();
	}

	public static void main(String[] args) 
	{
		IniciacionDebugger obj = new IniciacionDebugger(12, 12);
		
		
		System.out.println("Suma: "+obj.sumar());
		System.out.println("Multiplicacion: "+obj.multiplicar());
		

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}
