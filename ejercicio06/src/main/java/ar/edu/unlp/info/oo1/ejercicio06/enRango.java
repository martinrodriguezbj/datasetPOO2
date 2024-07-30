package ar.edu.unlp.info.oo1.ejercicio06;

public class enRango{
    private int valor;

    public enRango(int valor){
        this.valor = valor;
    }

    public boolean estaEnRango(){
        return (this.valor >= 50 && this.valor <= 100);
    }

}