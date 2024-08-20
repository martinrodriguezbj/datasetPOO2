package ar.edu.unlp.info.oo1.caso09;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test01ChatGPT {

    private CuentaBancaria cuenta;

    @BeforeEach
    public void setUp() {
        // Inicializa la cuenta con un saldo y costo de mantenimiento
        cuenta = new CuentaBancaria(100.0, 20.0);
    }

    @Test
    public void testCobrarMantenimientoIgualAlSaldo() {
        // Inicializa con saldo 100.0 y costo de mantenimiento 100.0
        cuenta = new CuentaBancaria(100.0, 100.0);
        // Debe permitir el cobro y el saldo debe ser 0 después del cobro
        assertTrue(cuenta.cobrarMantenimiento());
        assertEquals(0.0, cuenta.getSaldo(), "El saldo después del cobro igual al saldo inicial debe ser 0.0");
    }

    @Test
    public void testCobrarMantenimientoMayorAlSaldo() {
        // Inicializa con saldo 100.0 y costo de mantenimiento 100.01 (justo mayor que el saldo)
        cuenta = new CuentaBancaria(100.0, 100.01);
        // Debe lanzar una excepción ya que el costo de mantenimiento supera el saldo
        assertThrows(IllegalArgumentException.class, () -> cuenta.cobrarMantenimiento(), "Fondos insuficientes");
    }
}
