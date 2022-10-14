package ADT;

public class Pila<T> {
	private ListaLigadaADT<T> lista;
	private Nodo top;
	// private int tamanio;

	public Pila() {
		top = null;
		lista = new ListaLigadaADT();
		// tamanio= 0;
	}

	public boolean estaVacia() {
		return lista.estaVacia();
	}

	public int getTamanio() {
		return lista.getTamanio();
	}

	public Nodo<T> pop() {
		Nodo tmp;
		if (this.estaVacia()) {
			System.out.println("No hay nada que sacar");
			return null;
		} else {
			Nodo aux = lista.head;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			tmp = aux;
			lista.eliminarElFinal();
			Nodo aux2 = lista.head;
			while (aux2.getSiguiente() != null) {
				aux2 = aux2.getSiguiente();
			}
			top = aux2;
		}
		return tmp;
	}

	public void push(T valor) {
		lista.agregarAlFinal(valor);
		Nodo aux = lista.head;
		while (aux.getSiguiente() != null) {
			aux = aux.getSiguiente();
		}
		top = aux;
		// tamanio++;

	}

	public T peek() {
		if(this.estaVacia()){
			System.out.println("La pila esta vacia jiji");
			return null;
		}else {
			Nodo aux = lista.head;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			top= aux;
		}
		return (T) top.getDato();
	}

	public void transversal() {
		Nodo curr_node = lista.head;
		while (curr_node != null) {
			System.out.print(curr_node);
			curr_node = curr_node.getSiguiente();
		}
		System.out.println("");
	}
}
