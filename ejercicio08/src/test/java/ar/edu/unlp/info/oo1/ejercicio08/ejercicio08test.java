package ar.edu.unlp.info.oo1.ejercicio08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ejercicio08.CuentaBancaria;

class ejercicio08test {

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
        assertFalse(cuenta.retirar(101));
    }
}