package ar.edu.unlp.info.oo1.caso01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.caso01.Contexto;

import org.junit.jupiter.api.BeforeEach;

//El programa recibe un número positivo e indica si es par o impar. En caso que el número sea negativo, se lanza una excepción.

public class caso01test {

    private ParidadStrategy validador;

    @BeforeEach
    public void setUp() {
        validador = new ValidadorDeNumero();
    }

    @Test
    public void testEsParConNumeroPar() {
        assertTrue(validador.esPar(0));
    }

    @Test
    public void testEsParConNumeroImpar() {
        assertFalse(validador.esPar(1));
    }

    @Test
    public void testEsParConNumeroNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            validador.esPar(-1);
        });
        assertEquals("Número negativo no permitido", exception.getMessage());
    }
}
