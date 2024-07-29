package ar.edu.unlp.info.oo1.ejercicio01;

public class Contexto {
    private ParidadStrategy strategy;


    public Contexto() {
        this.strategy = new ValidadorDeNumero();
    }


    public Boolean ejecutarEsPar(int numero) {
        return strategy.esPar(numero);
    }
}