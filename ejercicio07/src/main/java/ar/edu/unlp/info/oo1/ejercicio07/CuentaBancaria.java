package ar.edu.unlp.info.oo1.ejercicio07;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean retirar(double monto) {
        if (monto > this.saldo) {
            throw new IllegalArgumentException("Fondos insuficientes");
        } else {
            this.saldo -= monto;
            return true;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}
