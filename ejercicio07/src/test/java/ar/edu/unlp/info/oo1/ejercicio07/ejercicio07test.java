package ar.edu.unlp.info.oo1.ejercicio07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio07Test {

    public void setUp() {
        // Método de configuración si es necesario
    }

    @Test
    public void retirarConSaldoSuficiente() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        assertTrue(cuenta.retirar(100));
    }

    @Test
    public void retirarSinSaldoSuficiente() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(101));
        assertEquals("Fondos insuficientes", exception.getMessage());
    }
}