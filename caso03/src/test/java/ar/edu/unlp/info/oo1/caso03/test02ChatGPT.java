package ar.edu.unlp.info.oo1.caso03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class test02ChatGPT {

    private ContextoDeMezcla contextoDeMezcla;

    @BeforeEach
    public void setUp() {
        contextoDeMezcla = new ContextoDeMezcla();
    }

    @Test
    public void testMezclarColeccionesMismoTamanoMayorQueCinco() {
        ArrayList<String> coleccion1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        ArrayList<String> coleccion2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6"));

        ArrayList<String> resultadoEsperado = new ArrayList<>(Arrays.asList("a", "1", "b", "2", "c", "3", "d", "4", "e", "5", "f", "6"));
        ArrayList<String> resultado = contextoDeMezcla.mezclarColecciones(coleccion1, coleccion2);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testMezclarColeccionesMismoTamanoExactamenteCinco() {
        ArrayList<String> coleccion1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        ArrayList<String> coleccion2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            contextoDeMezcla.mezclarColecciones(coleccion1, coleccion2);
        });
        assertEquals("Las colecciones deben tener longitud mayor a 5", exception.getMessage());
    }

    @Test
    public void testMezclarColeccionesDiferenteTamanoUnaMayorQueCincoOtraMenor() {
        ArrayList<String> coleccion1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        ArrayList<String> coleccion2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7"));

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            contextoDeMezcla.mezclarColecciones(coleccion1, coleccion2);
        });
        assertEquals("Las colecciones deben tener la misma longitud", exception.getMessage());
    }
}
