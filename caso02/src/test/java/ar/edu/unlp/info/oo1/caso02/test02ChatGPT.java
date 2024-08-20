package ar.edu.unlp.info.oo1.caso02;

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
    public void testEsValidaContraseñaLongitudNueve() {
        assertFalse(contexto.EsValida("123456789")); // Longitud 9 (justo debajo del mínimo)
    }

    @Test
    public void testEsValidaContraseñaLongitudDiez() {
        assertTrue(contexto.EsValida("1234567890")); // Longitud 10 (exactamente el mínimo)
    }
}
