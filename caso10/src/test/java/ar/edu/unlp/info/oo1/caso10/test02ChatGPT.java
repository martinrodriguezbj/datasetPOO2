package ar.edu.unlp.info.oo1.caso10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test02ChatGPT {

    private CuentaBancaria cuenta;

    @BeforeEach
    public void setUp() {
        // Se inicializa la cuenta en cada prueba
    }

    @Test
    public void testCobrarMantenimientoIgualAlSaldo() {
        // Configura la cuenta con un saldo de 100.0 y costo de mantenimiento igual a 100.0
        cuenta = new CuentaBancaria(100.0, 100.0);

        // Debe devolver true y el saldo debe ser 0 después del cobro
        assertTrue(cuenta.cobrarMantenimiento(), "El mantenimiento debería cobrarse correctamente.");
        assertEquals(0.0, cuenta.getSaldo(), "El saldo después del mantenimiento debería ser 0.");
    }

    @Test
    public void testCobrarMantenimientoMayorQueSaldo() {
        // Configura la cuenta con un saldo de 100.0 y costo de mantenimiento justo mayor que 100.0
        cuenta = new CuentaBancaria(100.0, 100.01);

        // Debe devolver false y el saldo debe permanecer igual
        assertFalse(cuenta.cobrarMantenimiento(), "El mantenimiento no debería cobrarse si el costo es mayor que el saldo.");
        assertEquals(100.0, cuenta.getSaldo(), "El saldo después de intentar cobrar mantenimiento debería permanecer igual.");
    }

    @Test
    public void testCobrarMantenimientoMenorQueSaldo() {
        // Configura la cuenta con un saldo de 100.0 y costo de mantenimiento justo menor que 100.0
        cuenta = new CuentaBancaria(100.0, 99.99);

        // Debe devolver true y el saldo debe ser 0.01 después del cobro
        assertTrue(cuenta.cobrarMantenimiento(), "El mantenimiento debería cobrarse correctamente.");
        assertEquals(0.01, cuenta.getSaldo(), "El saldo después del mantenimiento debería ser 0.01.");
    }
}
