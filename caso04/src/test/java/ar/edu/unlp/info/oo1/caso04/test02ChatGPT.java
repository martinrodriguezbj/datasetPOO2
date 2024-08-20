package ar.edu.unlp.info.oo1.caso04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class test02ChatGPT {

    private EstrategiaDeMezclaIntercalar estrategia;

    @BeforeEach
    public void setUp() {
        estrategia = new EstrategiaDeMezclaIntercalar();
    }

    @Test
    public void testColeccionesTamano6() {
        // Borde inmediato superior: ambas colecciones con tamaño 6 (válido)
        ArrayList<String> coleccion1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        ArrayList<String> coleccion2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6"));

        ArrayList<String> resultado = estrategia.mezclar(coleccion1, coleccion2);

        ArrayList<String> esperado = new ArrayList<>(Arrays.asList("A", "1", "B", "2", "C", "3", "D", "4", "E", "5", "F", "6"));
        assertEquals(esperado, resultado);
    }

    @Test
    public void testColeccionesTamano5() {
        // Borde inmediato inferior: ambas colecciones con tamaño 5 (inválido)
        ArrayList<String> coleccion1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        ArrayList<String> coleccion2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));

        ArrayList<String> resultado = estrategia.mezclar(coleccion1, coleccion2);

        ArrayList<String> esperado = new ArrayList<>(Arrays.asList("-1"));
        assertEquals(esperado, resultado);
    }

    @Test
    public void testColeccionesTamano6y5() {
        // Borde inmediato: una colección con tamaño 6 y la otra con tamaño 5 (inválido)
        ArrayList<String> coleccion1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        ArrayList<String> coleccion2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));

        ArrayList<String> resultado = estrategia.mezclar(coleccion1, coleccion2);

        ArrayList<String> esperado = new ArrayList<>(Arrays.asList("-1"));
        assertEquals(esperado, resultado);
    }

    @Test
    public void testColeccionTamano7Con6() {
        // Borde inmediato superior: una colección con tamaño 7 y la otra con tamaño 6 (inválido)
        ArrayList<String> coleccion1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
        ArrayList<String> coleccion2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6"));

        ArrayList<String> resultado = estrategia.mezclar(coleccion1, coleccion2);

        ArrayList<String> esperado = new ArrayList<>(Arrays.asList("-1"));
        assertEquals(esperado, resultado);
    }
}
