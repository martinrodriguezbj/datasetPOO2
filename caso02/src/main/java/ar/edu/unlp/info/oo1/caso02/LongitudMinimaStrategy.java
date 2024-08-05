package ar.edu.unlp.info.oo1.caso02;

public class LongitudMinimaStrategy implements ContraseñaStrategy {

    @Override
    public boolean esValida(String contraseña) {
        return contraseña.length() >= 10;
    }
}
