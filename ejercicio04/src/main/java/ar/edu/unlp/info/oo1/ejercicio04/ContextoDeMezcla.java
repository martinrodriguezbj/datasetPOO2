package ar.edu.unlp.info.oo1.ejercicio04;

import java.util.ArrayList;

public class ContextoDeMezcla {
    private EstrategiaDeMezcla estrategia;

    private void establecerEstrategia(EstrategiaDeMezcla estrategia) {
        this.estrategia = estrategia;
    }

    public ArrayList<String> mezclarColecciones(ArrayList<String> coleccion1, ArrayList<String> coleccion2) {
        if (Math.abs(coleccion1.size() - coleccion2.size()) > 5) {
            establecerEstrategia(new EstrategiaDeMezclaIntercalar());
        } else {
            establecerEstrategia(new EstrategiaDeMezclaConcatenar());
        }
        return this.estrategia.mezclar(coleccion1, coleccion2);
    }
}
