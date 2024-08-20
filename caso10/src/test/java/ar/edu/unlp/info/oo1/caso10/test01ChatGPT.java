package ar.edu.unlp.info.oo1.caso10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test01ChatGPT {

    private CuentaBancaria cuenta;

    @BeforeEach
    public void setUp() {
        // Inicializa la cuenta con un saldo y costo de mantenimiento para las pruebas
        cuenta = new CuentaBancaria(100.0, 20.0);
    }

    @Test
    public void testCobrarMantenimientoIgualAlSaldo() {
        // Costo de mantenimiento igual al saldo inicial (valor de borde inmediato)
        cuenta = new CuentaBancaria(100.0, 100.0);
        // Debe permitir el cobro y el saldo debe ser 0 después del cobro
        assertTrue(cuenta.cobrarMantenimiento(), "El mantenimiento debería ser cobrado exitosamente cuando el costo es igual al saldo.");
        assertEquals(0.0, cuenta.getSaldo(), "El saldo después del cobro igual al saldo inicial debe ser 0.0");
    }

    @Test
    public void testCobrarMantenimientoMayorAlSaldo() {
        // Costo de mantenimiento ligeramente mayor que el saldo inicial (valor de borde inmediato)
        cuenta = new CuentaBancaria(100.0, 100.01);
        // Debe devolver false ya que el costo de mantenimiento supera el saldo
        assertFalse(cuenta.cobrarMantenimiento(), "El mantenimiento no debería ser cobrado cuando el costo es mayor que el saldo.");
        assertEquals(100.0, cuenta.getSaldo(), "El saldo no debería cambiar si el mantenimiento no puede ser cobrado.");
    }

    @Test
    public void testCobrarMantenimientoJustoMenorAlSaldo() {
        // Costo de mantenimiento justo menor que el saldo inicial (valor de borde inmediato)
        cuenta = new CuentaBancaria(100.0, 99.99);
        // Debe permitir el cobro y el saldo debe ser 0.01 después del cobro
        assertTrue(cuenta.cobrarMantenimiento(), "El mantenimiento debería ser cobrado exitosamente cuando el costo es menor que el saldo.");
        assertEquals(0.01, cuenta.getSaldo(), "El saldo después del cobro debe ser 0.01.");
    }
}
