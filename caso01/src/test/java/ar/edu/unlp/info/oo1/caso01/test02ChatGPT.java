package ar.edu.unlp.info.oo1.caso01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test02ChatGPT {

    private Contexto contexto;

    @BeforeEach
    public void setUp() {
        contexto = new Contexto();
    }

    @Test
    public void testEsParNumeroNegativoInmediato() {
        assertThrows(IllegalArgumentException.class, () -> {
            contexto.EsPar(-1);
        });
    }

    @Test
    public void testEsParNumeroPositivoInmediatoImpar() {
        assertFalse(contexto.EsPar(1));
    }

    @Test
    public void testEsParNumeroPositivoInmediatoPar() {
        assertTrue(contexto.EsPar(2));
    }
}
