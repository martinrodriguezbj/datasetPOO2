package ar.edu.unlp.info.oo1.ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;


class Ejercicio04Test {
    
    private ContextoDeMezcla contexto;
    private ArrayList<String> lista1;
    private ArrayList<String> lista2;
    private ArrayList<String> lista3;

    @BeforeEach
	    public void setUp() {
	        contexto = new ContextoDeMezcla();
	        //Dos listas con diferencia de 5 elementos
	        lista1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F","G", "H", "I", "J"));
	        lista2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
	        //Dos listas con diferencia de 6 elementos
			lista3 = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
	
	    }

    @Test
    public void testMezclarColeccionesConDiferenciaDe5Eelementos() {
        ArrayList<String> resultadoEsperado = new ArrayList<>(Arrays.asList("A","B","C","D","E","F","G","H","I","J","1","2","3","4","5"));
        assertEquals(resultadoEsperado, contexto.mezclarColecciones(lista1, lista2));
    }
    
	@Test
	public void testMezclarColeccionesConDiferenciaDeMasDe5Elementos(){
		ArrayList<String> resultadoEsperado = new ArrayList<>(Arrays.asList("A","1","B","2","C","3","D","4"));
        assertEquals(resultadoEsperado, contexto.mezclarColecciones(lista1, lista3));

	}

}
