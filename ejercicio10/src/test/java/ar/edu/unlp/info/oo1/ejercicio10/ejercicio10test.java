package ar.edu.unlp.info.oo1.ejercicio10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ejercicio10.CuentaBancaria;

class ejercicio10test {

    public void setUp() {
        // Método de configuración si es necesario
    }
    
    @Test
    public void cobrarMantenimientoConSaldoSuficiente() {
        CuentaBancaria cuenta = new CuentaBancaria(100,100);
        assertTrue(cuenta.cobrarMantenimiento());
    }
    
    @Test
    public void cobrarMantenimientoConSaldoInsuficiente() {
    	CuentaBancaria cuenta = new CuentaBancaria(100,101);
        assertFalse(cuenta.cobrarMantenimiento());
    }
}
