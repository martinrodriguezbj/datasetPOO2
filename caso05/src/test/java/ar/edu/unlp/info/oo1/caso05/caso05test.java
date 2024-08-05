package ar.edu.unlp.info.oo1.caso05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.caso05.enRango;

//El programa devuelve True si su variable de instancia “valor” está en el rango [50,100], en caso contrario lanza una excepción.

class caso05test {
	
	private enRango enRango;

	@BeforeEach
    public void setUp() {
	
    }
    
	@Test
	public void noEstaEnRangoInferior() {
		enRango = new enRango(49);
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			enRango.estaEnRango();
		});
		assertEquals("El valor no está en el rango", exception.getMessage());
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
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			enRango.estaEnRango();
		});
		assertEquals("El valor no está en el rango", exception.getMessage());
	}
}
