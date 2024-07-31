package ar.edu.unlp.info.oo1.ejercicio02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

//El programa recibe una contraseña. Si la longitud de la misma es mayor o igual a 10 devuelve True, sinó False.

public class ejercicio02test {

    private Contexto contexto;

    @BeforeEach
    public void setUp() {
        contexto = new Contexto();
    }
    
    @Test
    public void testEsValidaConLongitud10() {
    	assertTrue(contexto.EsValida("0123456789"));
    }

    @Test
    public void testEsValidaConLongitudMenorA10() {
        assertFalse(contexto.EsValida("123456789"));
    }
}
