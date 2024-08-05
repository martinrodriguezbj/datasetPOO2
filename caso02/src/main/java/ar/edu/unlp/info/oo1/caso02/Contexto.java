package ar.edu.unlp.info.oo1.caso02;

public class Contexto {
    private ContraseñaStrategy strategy;

    public Contexto() {
        this.strategy = new LongitudMinimaStrategy();
    }

    public boolean EsValida(String contraseña) {
        return this.strategy.esValida(contraseña);
    }
}
