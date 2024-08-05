package ar.edu.unlp.info.oo1.caso07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.caso07.CuentaBancaria;

//El programa simulará una cuenta bancaria que permite inicializar la cuenta y realizar retiros. 
//La clase contará con un constructor dónde se inicializará con un saldo inicial. 
//Luego contará con un método que recibirá un parámetro de un monto a retirar. 
//En caso de que el monto a retirar sea menor o igual al saldo inicial, se devolverá True. Si el monto a retirar es superior al saldo inicial, se lanzará una excepción.

class caso07Test {
	
	private CuentaBancaria cuenta;

	@BeforeEach
    public void setUp() {
    
    }

    @Test
    public void retirarConSaldoSuficiente() {
        cuenta = new CuentaBancaria(100);
        assertTrue(cuenta.retirar(100));
    }

    @Test
    public void retirarSinSaldoSuficiente() {
        cuenta = new CuentaBancaria(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(101));
        assertEquals("Fondos insuficientes", exception.getMessage());
    }
}