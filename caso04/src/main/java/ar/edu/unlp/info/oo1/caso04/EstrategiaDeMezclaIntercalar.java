package ar.edu.unlp.info.oo1.caso04;

import java.util.ArrayList;

public class EstrategiaDeMezclaIntercalar implements EstrategiaDeMezcla {

    @Override
    public ArrayList<String> mezclar(ArrayList<String> coleccion1, ArrayList<String> coleccion2) {
    	ArrayList<String> listaMezclada = new ArrayList<>();
        int tamanoMinimo = Math.min(coleccion1.size(), coleccion2.size());

        for (int i = 0; i < tamanoMinimo; i++) {
            listaMezclada.add(coleccion1.get(i));
            listaMezclada.add(coleccion2.get(i));
        }
        return listaMezclada;
    }
}
