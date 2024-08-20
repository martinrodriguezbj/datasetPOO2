package ar.edu.unlp.info.oo1.caso08;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test01ChatGPT {

    private CuentaBancaria cuenta;

    @BeforeEach
    public void setUp() {
        cuenta = new CuentaBancaria(100.0); // Inicializa la cuenta con un saldo de 100.0
    }

    @Test
    public void testRetiroIgualAlSaldo() {
        // Monto igual al saldo, debe permitir el retiro y devolver true
        assertTrue(cuenta.retirar(100.0));
        // Verifica que el saldo es 0 después del retiro
        assertEquals(0.0, cuenta.getSaldo(), "El saldo después del retiro igual al saldo debe ser 0.0");
    }

    @Test
    public void testRetiroJustoMayorAlSaldo() {
        // Monto justo mayor al saldo, debe devolver false
        assertFalse(cuenta.retirar(100.01));
        // Verifica que el saldo no ha cambiado
        assertEquals(100.0, cuenta.getSaldo(), "El saldo no debe cambiar si el retiro supera el saldo");
    }

    @Test
    public void testRetiroJustoMenorAlSaldo() {
        // Monto justo menor al saldo, debe permitir el retiro y devolver true
        assertTrue(cuenta.retirar(99.99));
        // Verifica que el saldo es 0.01 después del retiro
        assertEquals(0.01, cuenta.getSaldo(), "El saldo después del retiro menor al saldo debe ser 0.01");
    }
}
