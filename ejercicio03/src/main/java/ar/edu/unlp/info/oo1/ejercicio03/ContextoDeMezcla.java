package ar.edu.unlp.info.oo1.ejercicio03;

import java.util.ArrayList;

public class ContextoDeMezcla {
    private EstrategiaDeMezcla estrategia;

    public ContextoDeMezcla() {
        this.estrategia = new EstrategiaDeMezclaIntercalar();
    }

    public ArrayList<String> mezclarColecciones(ArrayList<String> coleccion1, ArrayList<String> coleccion2) {
        if (coleccion1.size() != coleccion2.size()) {
            throw new IllegalArgumentException("Las colecciones deben tener la misma longitud");
        } else if (coleccion1.size() <= 5) {
            throw new IllegalArgumentException("Las colecciones deben tener longitud mayor a 5");
        }
        return estrategia.mezclar(coleccion1, coleccion2);
    }
}
