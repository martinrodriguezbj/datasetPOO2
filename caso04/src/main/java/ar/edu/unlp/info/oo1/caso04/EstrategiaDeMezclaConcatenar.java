package ar.edu.unlp.info.oo1.caso04;

import java.util.ArrayList;

public class EstrategiaDeMezclaConcatenar implements EstrategiaDeMezcla {

    @Override
    public ArrayList<String> mezclar(ArrayList<String> coleccion1, ArrayList<String> coleccion2) {
        ArrayList<String> listaMezclada = new ArrayList<>(coleccion1);
        listaMezclada.addAll(coleccion2);
        return listaMezclada;
    }
}
