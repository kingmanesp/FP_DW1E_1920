package pruebas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculoLogaritmoTest {

	

	@Test
	void testLogaritmo() {
		int esperado = 5;
		
		CalculoLogaritmo obj = new CalculoLogaritmo();
		int resultado = obj.logaritmo();
		
		if(resultado!= obj.logaritmo())fail("Hubo un error");
		else {assertEquals(esperado, resultado, 0);}
	}

	@Test
	void testUnCaracter() {
		
		char esperando = 'E';
		CalculoLogaritmo obj = new CalculoLogaritmo();
		char resultado= obj.unCaracter();
		
		if(resultado!=obj.unCaracter()) fail("Huno un error");
		else {assertEquals(esperando, resultado);}
	}

}
