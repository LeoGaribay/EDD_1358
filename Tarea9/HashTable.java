import java.util.ArrayList;

public class HashTable<T> {

	ArregloADT<ArrayList> Tabla;
	int tamanio;

	public HashTable(int tamanioDeLaTabla) {
		this.tamanio = tamanioDeLaTabla;
		if (verificarPrimo(tamanioDeLaTabla) == true) {
			Tabla = new ArregloADT(tamanioDeLaTabla);
		} else {
			System.out.println("Error: porfavor introduzca un numero primo jiji");
		}
		for (int i = 0; i < tamanioDeLaTabla; i++) {
			Tabla.setElemento(i, new ArrayList());
		}
	}

	public void agregar(int llavesita, T elemento) {
		int indice = Math.abs(llavesita) % tamanio; // valor absoluto
		Tabla.getElemento(indice).add(elemento);
		Tabla.getElemento(indice).add(llavesita);

	}

	public T valorDe(int llavesita) {
		int indice = Math.abs(llavesita) % tamanio;
		T valor;
		for (int i = 0; i < Tabla.getElemento(indice).size(); i++) {
			if (Tabla.getElemento(indice).get(i).equals(llavesita)) {
				valor = (T) Tabla.getElemento(indice).get(i);

			}

		}

		return (T) Tabla.getElemento(indice);

	}

	public void remover(int llavesita) {
		int indice = Math.abs(llavesita) % tamanio;
		 for (int i = 0; i < Tabla.getElemento(indice).size(); i++) {
             if (Tabla.getElemento(indice).get(i).equals(llavesita)) {
                 Tabla.getElemento(indice).remove(i);
                 Tabla.getElemento(indice).remove(i-1);
             }
         }
	}
	
	public void imprimir() {
		System.out.print(Tabla.toString());
	}

	private boolean verificarPrimo(int numero) {
		if (numero <= 1 || numero == 0) {
			return false;
		}
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}
