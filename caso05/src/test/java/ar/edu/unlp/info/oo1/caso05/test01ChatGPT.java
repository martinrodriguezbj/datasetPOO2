package ar.edu.unlp.info.oo1.caso05;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test01ChatGPT {

    private enRango rango;

    @BeforeEach
    public void setUp() {
        // Inicialización en los tests individuales
    }

    @Test
    public void testValorJustoPorDebajoDelLimiteInferior() {
        rango = new enRango(49);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            rango.estaEnRango();
        });
        assertEquals("El valor no está en el rango", exception.getMessage());
    }

    @Test
    public void testValorJustoEnElLimiteInferior() {
        rango = new enRango(50);
        assertTrue(rango.estaEnRango());
    }

    @Test
    public void testValorJustoEnElLimiteSuperior() {
        rango = new enRango(100);
        assertTrue(rango.estaEnRango());
    }

    @Test
    public void testValorJustoPorEncimaDelLimiteSuperior() {
        rango = new enRango(101);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            rango.estaEnRango();
        });
        assertEquals("El valor no está en el rango", exception.getMessage());
    }
}
