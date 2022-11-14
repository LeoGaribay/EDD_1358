public class ListaLigadaADT<T> {
	Nodo<T> head;
	int tamanio;

	public ListaLigadaADT() {
		this.head = null;
		this.tamanio = 0;
	}

	public boolean estaVacia() {
		return this.head == null;
	}

	public int getTamanio() {
		Nodo aux = this.head;
		if (this.estaVacia()) {
			this.tamanio = 0;
		} else {
			tamanio=1;
			do {
				aux=aux.getSiguiente();
				tamanio ++;
			}while(aux.getSiguiente() != null);
		}
		return tamanio;
	}

	public void agregarAlFinal(T valor) {
		Nodo nuevo = new Nodo(valor);
		if (this.estaVacia()) {
			this.head = nuevo;
		} else {
			Nodo aux = this.head;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
		}
	}

	public void agregarAlInicio(T valor) {
		Nodo nuevo = new Nodo(valor);
		if (this.estaVacia()) {
			this.head = nuevo;
		} else {
			nuevo.setSiguiente(this.head);
			this.head = nuevo;
		}
	}

	public void agregarDespuesDe(T valor, int posicion) {
		Nodo nuevo = new Nodo(valor);
		Nodo aux = this.head;
		for (int contador = 1; contador < posicion ; contador++) {
			aux = aux.getSiguiente();
		}
		nuevo.setSiguiente(aux.getSiguiente());
		aux.setSiguiente(nuevo);
	}

	public void eliminar(int posicion) {
		Nodo aux = this.head;
		for (int contador = 1; contador < posicion-1 ; contador++) {
			aux = aux.getSiguiente();
		}

		aux.setSiguiente(aux.getSiguiente().getSiguiente());
	}

	// testear desde aqui
	public void elminiarElPrimero() {
		this.head = this.head.getSiguiente();

	}

	public void eliminarElFinal() {
		Nodo aux =head;
		for (int contador = 1; contador < this.getTamanio()-1 ; contador++) {
			aux = aux.getSiguiente();
		}
		aux.setSiguiente(null);
	}

	public int buscar(T valor) {
		int contador = 1;
		Nodo aux = this.head;
		if (this.estaVacia()) {
			System.out.println("error");
		} else {
			while (aux.getDato() != valor) {
				aux = aux.getSiguiente();
				contador += 1;
			}
		}
		return contador;
	}

	public void actualizar(T a_buscar, T valor) {
		Nodo aux = this.head;
		while (aux.getDato() != a_buscar) {
			aux = aux.getSiguiente();
		}
		aux.setDato(valor);
	}

	// testear hasta aca
	public void transversal() {
		Nodo curr_node = this.head;
		while (curr_node != null) {
			System.out.print(curr_node);
			curr_node = curr_node.getSiguiente();
		}
		System.out.println("");
	}
}
