package ar.edu.unlp.info.oo1.ejercicio01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class ejercicio01test {

    private Contexto contexto;

    @BeforeEach
    public void setUp() {
        contexto = new Contexto();
    }

    @Test
    public void testEjecutarEsParConNumeroPar() {
        assertTrue(contexto.ejecutarEsPar(4), "4 debería ser par");
    }

    @Test
    public void testEjecutarEsParConNumeroImpar() {
        assertFalse(contexto.ejecutarEsPar(5), "5 debería ser impar");
    }

    @Test
    public void testEjecutarEsParConCero() {
        assertTrue(contexto.ejecutarEsPar(0), "0 debería ser par");
    }

    @Test
    public void testEjecutarEsParConNumeroNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            contexto.ejecutarEsPar(-1);
        });
        assertEquals("Número negativo no permitido", exception.getMessage());
    }
}
