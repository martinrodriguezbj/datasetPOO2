package ar.edu.unlp.info.oo1.caso10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.caso10.CuentaBancaria;

//El programa simulará una cuenta bancaria que permite inicializar la cuenta y establecer un costo de mantenimiento. 
//La clase contará con un constructor dónde se inicializará con un saldo inicial, y el costo de mantenimiento mensual. 
//Luego contará con un método cobrarMantenimiento, que en caso de que el monto del mantenimiento sea menor o igual al saldo inicial, se devolverá True. 
//Si el monto del mantenimiento es superior al saldo inicial, se devuelve False.

class caso10test {
	
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
        assertFalse(cuenta.cobrarMantenimiento());
    }
}
