package ar.edu.unlp.info.oo1.caso02;

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
    public void testContraseñaLongitudJustoDebajoDelLimite() {
        // Prueba con una contraseña de longitud 9 (justo debajo del límite mínimo)
        assertFalse(contexto.EsValida("abcdefgh9")); // longitud 9, debe ser no válida
    }

    @Test
    public void testContraseñaLongitudExactamenteEnElLimite() {
        // Prueba con una contraseña de longitud 10 (justo en el límite mínimo)
        assertTrue(contexto.EsValida("abcdefghij")); // longitud 10, debe ser válida
    }

    @Test
    public void testContraseñaLongitudJustoEncimaDelLimite() {
        // Prueba con una contraseña de longitud 11 (justo por encima del límite mínimo)
        assertTrue(contexto.EsValida("abcdefghijk")); // longitud 11, debe ser válida
    }
}
