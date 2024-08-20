package ar.edu.unlp.info.oo1.caso07;

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
    public void testRetiroExactoAlSaldo() {
        // Monto igual al saldo, debe permitir el retiro y devolver true
        assertTrue(cuenta.retirar(100.0));
        // Verifica que el saldo es 0 después del retiro
        assertEquals(0.0, cuenta.getSaldo(), "El saldo después del retiro exacto al saldo debe ser 0.0");
    }

    @Test
    public void testRetiroJustoMayorAlSaldo() {
        // Monto mayor al saldo, debe lanzar una excepción
        assertThrows(IllegalArgumentException.class, () -> {
            cuenta.retirar(100.01);
        }, "Se esperaba una excepción por fondos insuficientes");
    }
}
