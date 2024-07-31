package ar.edu.unlp.info.oo1.ejercicio02;

public class LongitudMinimaStrategy implements ContraseñaStrategy {

    @Override
    public boolean esValida(String contraseña) {
        return contraseña.length() >= 10;
    }
}
