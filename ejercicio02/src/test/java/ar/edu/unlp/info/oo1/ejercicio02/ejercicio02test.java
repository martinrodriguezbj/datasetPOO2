package ar.edu.unlp.info.oo1.ejercicio02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class ejercicio02test {

    private Contexto contexto;

    @BeforeEach
    public void setUp() {
        contexto = new Contexto();
    }

    @Test
    public void testEjecutarEsParConNumeroPar() {
        assertFalse(contexto.ejecutarEsValida("123456789"));
    }

    @Test
    public void testEjecutarEsParConNumeroImpar() {
    	assertTrue(contexto.ejecutarEsValida("0123456789"));
    }

}
