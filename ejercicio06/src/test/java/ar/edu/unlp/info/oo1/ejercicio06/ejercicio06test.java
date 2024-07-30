package ar.edu.unlp.info.oo1.ejercicio06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ejericicio06test {

    public void setUp() {
	
    }

	@Test
	public void noEstaEnRangoInferior() {
		enRango enRango = new enRango(49);
		assertFalse(enRango.estaEnRango());
	}

	@Test
	public void estaEnRangoInferior(){
		enRango enRango = new enRango(50);
		assertTrue(enRango.estaEnRango());
	}

	@Test
	public void estaEnRangoSuperior(){
		enRango enRango = new enRango(100);
		assertTrue(enRango.estaEnRango());
	}

	@Test
	public void noEstaEnRangoSuperior(){
		enRango enRango = new enRango(101);
		assertFalse(enRango.estaEnRango());
	}
}
