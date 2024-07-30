package ar.edu.unlp.info.oo1.ejercicio01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

//El programa recibe un número positivo e indica si es par o impar. En caso que el número sea negativo, se lanza una excepción.

public class ejercicio01test {

    private Contexto contexto;

    @BeforeEach
    public void setUp() {
        contexto = new Contexto();
    }

    @Test
    public void testEsParConNumeroPar() {
        assertTrue(contexto.EsPar(0));
    }

    @Test
    public void testEsParConNumeroImpar() {
        assertFalse(contexto.EsPar(1));
    }

    @Test
    public void testEsParConNumeroNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            contexto.EsPar(-1);
        });
        assertEquals("Número negativo no permitido", exception.getMessage());
    }
}
