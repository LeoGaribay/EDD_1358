package ADT;

public class NodoDoble<T> {
	private T dato;
	private NodoDoble siguiente;
	private NodoDoble anterior;

	public NodoDoble(T dato) {
		this.dato = dato;
		this.siguiente = null;
		this.anterior = null;
	}

	public NodoDoble(T dato, NodoDoble siguiente, NodoDoble anterior) {
		this.dato = dato;
		this.siguiente = siguiente;
		this.anterior = anterior;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public NodoDoble getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoDoble siguiente) {
		this.siguiente = siguiente;
	}

	public NodoDoble getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoDoble anterior) {
		this.anterior = anterior;
	}

	public String toString() {

		return "|" + dato + "| -->";
	}

	public String printAll() {
		return "[Dato = " + dato + "] -> [Siguiente : " + this.getSiguiente() + "]";
	}

}
