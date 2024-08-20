package ar.edu.unlp.info.oo1.caso06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test01ChatGPT {

    private enRango rango;

    @BeforeEach
    void setUp() {
        // Inicialización de los objetos necesarios para las pruebas
    }

    @Test
    void testValorEnLimiteInferior() {
        rango = new enRango(50);
        assertTrue(rango.estaEnRango(), "El valor 50 debería estar en el rango.");
    }

    @Test
    void testValorJustoDebajoDelLimiteInferior() {
        rango = new enRango(49);
        assertFalse(rango.estaEnRango(), "El valor 49 debería estar fuera del rango.");
    }

    @Test
    void testValorEnLimiteSuperior() {
        rango = new enRango(100);
        assertTrue(rango.estaEnRango(), "El valor 100 debería estar en el rango.");
    }

    @Test
    void testValorJustoEncimaDelLimiteSuperior() {
        rango = new enRango(101);
        assertFalse(rango.estaEnRango(), "El valor 101 debería estar fuera del rango.");
    }
}
