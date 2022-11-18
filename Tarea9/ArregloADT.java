import java.util.ArrayList;

public class ArregloADT<T> {

	int tamaño; 
	private final ArrayList<T> datos;

	public ArregloADT(int tam) { 
		this.tamaño = tam;
		this.datos = new ArrayList<>(tam);
		for (int j = 0; j < tam; j++) {
			datos.add(null);
		}
	}
	
	public ArregloADT(int tam, T X, T Y) { //constructor creado para un problema
		this.tamaño = tam;
		this.datos = new ArrayList<>(tam);
		for (int j = 0; j < tam; j++) {
			datos.add(null);
		}
		this.setElemento(0, X);
		this.setElemento(1, Y);
		
		
	}

	public T getElemento(int indice) { 
		if (indice >= 0 && indice < this.tamaño) {
			return datos.get(indice);
		}
		return null;
	}

	public void setElemento(int indice, T Elemento) { 
		if (indice >= 0 && indice < this.tamaño) {
			datos.set(indice, Elemento);
		} else {
			System.out.println("fuera del rango");
		}
	}

	public int getLongitud() { 
		return datos.size();
	}

	public void limpiar(T dato) { 
		for (int i = 0; i < datos.size(); i++) {
			datos.set(i, dato);
		}
	}

	
	public String toString() {
		return "" + datos + "" + "\n";
	}
	
}
