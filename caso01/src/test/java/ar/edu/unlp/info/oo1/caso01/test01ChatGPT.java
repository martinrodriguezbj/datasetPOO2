package ar.edu.unlp.info.oo1.caso01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test01ChatGPT {

    private Contexto contexto;

    @BeforeEach
    public void setUp() {
        contexto = new Contexto();
    }

    @Test
    public void testNumeroNegativoJustoFueraDelRango() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            contexto.EsPar(-1);
        });
        assertEquals("Número negativo no permitido", exception.getMessage());
    }

    @Test
    public void testNumeroCero() {
        assertTrue(contexto.EsPar(0));
    }

    @Test
    public void testNumeroPositivoParJustoDentroDelRango() {
        assertTrue(contexto.EsPar(2)); // Límite inferior para positivo par
    }

    @Test
    public void testNumeroPositivoImparJustoDentroDelRango() {
        assertFalse(contexto.EsPar(1)); // Límite inferior para positivo impar
    }

    @Test
    public void testNumeroPositivoParJustoFueraDelRango() {
        assertTrue(contexto.EsPar(2147483646)); // Justo dentro del límite superior para enteros positivos
    }

    @Test
    public void testNumeroPositivoImparJustoFueraDelRango() {
        assertFalse(contexto.EsPar(2147483647)); // Justo dentro del límite superior para enteros positivos
    }
}
