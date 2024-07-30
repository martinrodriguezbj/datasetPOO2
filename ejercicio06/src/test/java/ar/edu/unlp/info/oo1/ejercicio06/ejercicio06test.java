package ar.edu.unlp.info.oo1.ejercicio06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// El programa indica si su variable de instancia “valor” está en el rango (50,100)

class ejericicio06test {
	
	private enRango enRango;

    public void setUp() {
	
    }

	@Test
	public void noEstaEnRangoInferior() {
		enRango = new enRango(49);
		assertFalse(enRango.estaEnRango());
	}

	@Test
	public void estaEnRangoInferior(){
		enRango = new enRango(50);
		assertTrue(enRango.estaEnRango());
	}

	@Test
	public void estaEnRangoSuperior(){
		enRango = new enRango(100);
		assertTrue(enRango.estaEnRango());
	}

	@Test
	public void noEstaEnRangoSuperior(){
		enRango = new enRango(101);
		assertFalse(enRango.estaEnRango());
	}
}
