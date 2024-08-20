package ar.edu.unlp.info.oo1.caso04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class test01ChatGPT {

    private ContextoDeMezcla contexto;

    @BeforeEach
    public void setUp() {
        contexto = new ContextoDeMezcla();
        // Instanciamos la estrategia dentro del contexto
        contexto.establecerEstrategia(new EstrategiaDeMezclaIntercalar());
    }

    @Test
    public void testColeccionesConTamanoJustoDebajoDelMinimo() {
        // Tamaño igual a 5 (justo debajo del mínimo válido, debe retornar [-1])
        ArrayList<String> coleccion1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        ArrayList<String> coleccion2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));

        ArrayList<String> resultado = contexto.mezclarColecciones(coleccion1, coleccion2);
        ArrayList<String> resultadoEsperado = new ArrayList<>(Arrays.asList("-1"));

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testColeccionesConTamanoExactamenteEnElLimite() {
        // Tamaño igual a 6 (justo en el límite mínimo válido, debe realizar la mezcla)
        ArrayList<String> coleccion1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        ArrayList<String> coleccion2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6"));

        ArrayList<String> resultadoEsperado = new ArrayList<>(Arrays.asList("a", "1", "b", "2", "c", "3", "d", "4", "e", "5", "f", "6"));
        ArrayList<String> resultado = contexto.mezclarColecciones(coleccion1, coleccion2);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testColeccionesConTamanoJustoPorEncimaDelMinimo() {
        // Tamaño igual a 7 (justo por encima del mínimo válido, debe realizar la mezcla)
        ArrayList<String> coleccion1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));
        ArrayList<String> coleccion2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7"));

        ArrayList<String> resultadoEsperado = new ArrayList<>(Arrays.asList("a", "1", "b", "2", "c", "3", "d", "4", "e", "5", "f", "6", "g", "7"));
        ArrayList<String> resultado = contexto.mezclarColecciones(coleccion1, coleccion2);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testColeccionesConTamanoDiferente() {
        // Tamaño diferente (debería retornar [-1])
        ArrayList<String> coleccion1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        ArrayList<String> coleccion2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));

        ArrayList<String> resultado = contexto.mezclarColecciones(coleccion1, coleccion2);
        ArrayList<String> resultadoEsperado = new ArrayList<>(Arrays.asList("-1"));

        assertEquals(resultadoEsperado, resultado);
    }
}
