package ar.edu.unlp.info.oo1.caso05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test02ChatGPT {

    private enRango enRangoInstance;

    @BeforeEach
    public void setUp() {
        // No se instancia aquí porque cada test tiene un valor diferente.
    }

    @Test
    public void testValorEnBordeInferior() {
        // Borde inmediato inferior dentro del rango (50)
        enRangoInstance = new enRango(50);
        assertTrue(enRangoInstance.estaEnRango());
    }

    @Test
    public void testValorEnBordeSuperior() {
        // Borde inmediato superior dentro del rango (100)
        enRangoInstance = new enRango(100);
        assertTrue(enRangoInstance.estaEnRango());
    }

    @Test
    public void testValorDebajoDelBordeInferior() {
        // Borde inmediato inferior fuera del rango (49)
        enRangoInstance = new enRango(49);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            enRangoInstance.estaEnRango();
        });
        assertEquals("El valor no está en el rango", exception.getMessage());
    }

    @Test
    public void testValorEncimaDelBordeSuperior() {
        // Borde inmediato superior fuera del rango (101)
        enRangoInstance = new enRango(101);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            enRangoInstance.estaEnRango();
        });
        assertEquals("El valor no está en el rango", exception.getMessage());
    }
}
