package ar.edu.unlam.luchador;

import org.junit.Assert;
import org.junit.Test;

public class TestLuchador {

	@Test
	public void testDomina() {
		Luchador luchador1 = new Luchador(100, 150);
		Luchador luchador2 = new Luchador(150, 150);
		
		assertTrue(luchador2.domina(luchador1) == 1);
	}

}
