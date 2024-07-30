package ar.edu.unlp.info.oo1.ejercicio09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ejercicio09.CuentaBancaria;

class ejercicio09test {

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
        Exception exception = assertThrows(IllegalArgumentException.class, () -> cuenta.cobrarMantenimiento());
        assertEquals("Fondos insuficientes", exception.getMessage());
    }
}
