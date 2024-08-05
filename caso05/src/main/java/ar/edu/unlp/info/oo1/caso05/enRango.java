package ar.edu.unlp.info.oo1.caso05;

public class enRango{
    private int valor;

    public enRango(int valor){
        this.valor = valor;
    }

    public boolean estaEnRango(){
        if(this.valor >= 50 && this.valor <= 100){
            return true;
        }else{
            throw new IllegalArgumentException("El valor no está en el rango");
        }
    }
}
