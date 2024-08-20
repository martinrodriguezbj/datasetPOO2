package ar.edu.unlp.info.oo1.caso08;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test02ChatGPT {

    private CuentaBancaria cuenta;

    @BeforeEach
    public void setUp() {
        // Inicializamos la cuenta con un saldo inicial de 100.0
        cuenta = new CuentaBancaria(100.0);
    }

    @Test
    public void testRetiroJustoMenorAlSaldo() {
        // Monto de retiro justo menor al saldo inicial
        assertTrue(cuenta.retirar(99.99), "El retiro debería ser exitoso cuando el monto es menor al saldo");
        assertEquals(0.01, cuenta.getSaldo(), "El saldo debería ser 0.01 después de retirar 99.99");
    }

    @Test
    public void testRetiroIgualAlSaldo() {
        // Monto de retiro igual al saldo inicial
        assertTrue(cuenta.retirar(100.0), "El retiro debería ser exitoso cuando el monto es igual al saldo");
        assertEquals(0.0, cuenta.getSaldo(), "El saldo debería ser 0 después de retirar el monto total");
    }

    @Test
    public void testRetiroJustoMayorAlSaldo() {
        // Monto de retiro justo mayor al saldo inicial
        assertFalse(cuenta.retirar(100.01), "El retiro debería fallar cuando el monto es mayor al saldo");
        assertEquals(100.0, cuenta.getSaldo(), "El saldo debería permanecer igual si el retiro falla");
    }
}
