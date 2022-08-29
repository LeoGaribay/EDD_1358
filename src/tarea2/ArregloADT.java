package tarea2;

import java.util.ArrayList;

public class ArregloADT {

    private int tamanio;
    private ArrayList datos;

    public ArregloADT(int tamanio) {
        this.tamanio = tamanio;
        datos = new ArrayList();
        for (int j = 0; j < tamanio; j++) {
            datos.add(new Object());
        }
    }

    public int getLongitud() {
        return datos.size();
    }

    public void setElemento(int indice, Object elemento) {
        datos.set(indice, elemento);
    }

    public Object getElemento(int indice) {
        if (indice >= 0 && indice < this.tamanio) {
            return datos.get(indice);
        }
        return null;
    }

    public void limpiar() {
        for (int i = 0; i < tamanio; i++) {
            setElemento(i," ");
        }

    }

    @Override
    public String toString() {
        return "ArregloADT{" + "tamanio=" + tamanio + ", datos=" + datos + '}';
    }

}
