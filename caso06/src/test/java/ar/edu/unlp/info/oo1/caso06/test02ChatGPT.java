package ar.edu.unlp.info.oo1.caso06;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test02ChatGPT {

    private enRango instancia;

    @BeforeEach
    public void setUp() {
        // Inicializamos la instancia de la clase que vamos a probar.
    }

    @Test
    public void testValorEnBordeInferior() {
        instancia = new enRango(50);
        assertTrue(instancia.estaEnRango(), "El valor 50 debería estar en el rango.");
    }

    @Test
    public void testValorEnBordeSuperior() {
        instancia = new enRango(100);
        assertTrue(instancia.estaEnRango(), "El valor 100 debería estar en el rango.");
    }

    @Test
    public void testValorDebajoDelBordeInferior() {
        instancia = new enRango(49);
        assertFalse(instancia.estaEnRango(), "El valor 49 no debería estar en el rango.");
    }

    @Test
    public void testValorEncimaDelBordeSuperior() {
        instancia = new enRango(101);
        assertFalse(instancia.estaEnRango(), "El valor 101 no debería estar en el rango.");
    }
}
