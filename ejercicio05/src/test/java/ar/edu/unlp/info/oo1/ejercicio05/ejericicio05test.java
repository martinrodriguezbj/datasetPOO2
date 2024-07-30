package ar.edu.unlp.info.oo1.ejercicio05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ejericicio05test {

    public void setUp() {
	
    }

	//El programa devuelve True si su variable de instancia “valor” está en el rango (50,100), en caso contrario lanza una excepción.
	@Test
	public void noEstaEnRangoInferior() {
		enRango enRango = new enRango(49);
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			enRango.estaEnRango();
		});
		assertEquals("El valor no está en el rango", exception.getMessage());
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
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			enRango.estaEnRango();
		});
		assertEquals("El valor no está en el rango", exception.getMessage());
	}
}
