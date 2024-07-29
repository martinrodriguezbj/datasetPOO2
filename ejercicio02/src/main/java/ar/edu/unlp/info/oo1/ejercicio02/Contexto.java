package ar.edu.unlp.info.oo1.ejercicio02;

public class Contexto {
    private ContraseñaStrategy strategy;


    public Contexto() {
        this.strategy = new LongitudMinimaStrategy();
    }


    public boolean ejecutarEsValida(String contraseña) {
        return strategy.esValida(contraseña);
    }
}
