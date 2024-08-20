package ar.edu.unlp.info.oo1.caso09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.caso09.CuentaBancaria;

//El programa simulará una cuenta bancaria que permite inicializarla y establecer un costo de mantenimiento. 
//La clase contará con un constructor dónde se inicializará con un saldo inicial, y el costo de mantenimiento mensual. 
//Luego contará con un método cobrarMantenimiento. 
//En caso de que el costo de mantenimiento sea mayor que el saldo inicial, entonces se produce una excepción.

class caso09test {
	
	private CuentaBancaria cuenta;

	@BeforeEach
    public void setUp() {
    
    }
    
    @Test
    public void cobrarMantenimientoConSaldoSuficiente() {
        cuenta = new CuentaBancaria(100,100);
        assertTrue(cuenta.cobrarMantenimiento());
    }
    
    @Test
    public void cobrarMantenimientoConSaldoInsuficiente() {
    	cuenta = new CuentaBancaria(100,101);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> cuenta.cobrarMantenimiento());
        assertEquals("Fondos insuficientes", exception.getMessage());
    }
    
}
