package ar.edu.unlp.info.oo1.caso03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.caso03.ContextoDeMezcla;

import java.util.ArrayList;
import java.util.Arrays;

// El programa recibe dos colecciones, si ambas colecciones tienen el mismo tamano y es mayor a 5 entonces se realiza el merge.
// caso contrario se produce una excepción.

class Ejercicio03Test {
    
    private ContextoDeMezcla contexto;
    private ArrayList<String> lista1;
    private ArrayList<String> lista2;
    private ArrayList<String> lista3;
    private ArrayList<String> lista4;

    @BeforeEach
    public void setUp() {
        contexto = new ContextoDeMezcla();
        lista1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        lista2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6"));
        lista3 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
		lista4 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

    }

    @Test
    public void testMezclarColeccionesMismoTamanoMayorA5() {
        ArrayList<String> resultadoEsperado = new ArrayList<>(Arrays.asList("A", "1", "B", "2", "C", "3", "D", "4", "E", "5", "F", "6"));
        assertEquals(resultadoEsperado, contexto.mezclarColecciones(lista1, lista2));
    }
    
	@Test
	public void testMezclarColeccionesMismoTamano5(){
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			contexto.mezclarColecciones(lista3, lista4);
		});
		assertEquals("Las colecciones deben tener longitud mayor a 5", exception.getMessage());

	}

	@Test
	public void testMezclarColeccionesConTamanoDiferente() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			contexto.mezclarColecciones(lista1, lista3);
		});
		assertEquals("Las colecciones deben tener la misma longitud", exception.getMessage());
	}

}
