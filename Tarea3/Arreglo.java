package clases;

import java.util.ArrayList;

public class Arreglo<T> {

	private int tamanio;
	private ArrayList<T> datos;

	public Arreglo(int tamanio) {
		this.tamanio = tamanio;
		datos = new ArrayList<>(this.tamanio);
		for (int j = 0; j < tamanio; j++) {
			this.datos.add(null); // llenar el arrayList y no tener problemas a la hora de que no apunte a nada
		}
	}

	public int getLongitud() {
		return datos.size();
	}

	public void setElemento(int indice, T dato) {
		datos.set(indice, dato);
	}

	public T getElemento(int indice) {
		if (indice >= 0 && indice < this.tamanio) {
			return datos.get(indice);
		} else {
			System.out.println("fuera del rango");
		}

		return null;
	}

	public void limpiar(T dato) {
		for (int i = 0; i < tamanio; i++) {
			setElemento(i, dato);
		}

	}

	@Override
	public String toString() {
		return "Arreglo [datos=" + datos + "]";
	}

	/*
	 * @Override public String toString() { String estado = " "; for (T dato :
	 * datos) { if (dato != null) { estado = datos.toString() + "\n"; } } return
	 * estado; }
	 */

}
