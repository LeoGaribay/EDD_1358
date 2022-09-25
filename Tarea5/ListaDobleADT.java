package ADT;

public class ListaDobleADT<T> {
	private NodoDoble head;
	private int tamanio;

	public ListaDobleADT() {
		this.head = null;
		this.tamanio = 0;
	}

	public boolean estaVacia() {
		return this.head == null;
	}

	public int getTamanio() {
		NodoDoble aux = this.head;
		if (this.estaVacia()) {
			this.tamanio = 0;
		} else {
			tamanio = 1;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
				tamanio++;
			}
		}
		return tamanio;
	}

	public void agregarAlFinal(T valor) {
		NodoDoble<T> nuevo = new NodoDoble(valor);
		if (head == null) {
			this.head = nuevo;
		} else {
			NodoDoble<T> aux = this.head;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			nuevo.setAnterior(aux);
			aux.setSiguiente(nuevo);
			// nuevo=null;
			// aux=null;
		}
	}

	public void agregarAlinicio(T valor) {
		NodoDoble<T> nuevo = new NodoDoble(valor);
		if (this.estaVacia()) {
			head = nuevo;
		} else {
			nuevo.setSiguiente(head);
			head.setAnterior(nuevo);
			this.head = nuevo;
		}
	}
	
	public void agregarDespuésDe(T valor, int posicion) {
		NodoDoble<T> nuevo= new NodoDoble(valor);
		NodoDoble aux= head;
		for (int contador = 1; contador < posicion ; contador++) {
			aux= aux.getSiguiente();
		}
		nuevo.setAnterior(aux);
		aux.getSiguiente().setAnterior(nuevo);
		nuevo.setSiguiente(aux.getSiguiente());
		aux.setSiguiente(nuevo);
		
	}
	
	public void eliminar(int posicion) {
		NodoDoble aux = head;
		for (int contador = 1; contador < posicion-1 ; contador++) {
			aux = aux.getSiguiente();
		}

		aux.setSiguiente(aux.getSiguiente().getSiguiente());
		aux.getSiguiente().setAnterior(aux);
	}

	public void transversal() {
		NodoDoble curr_node = this.head;
		while (curr_node != null) {
			System.out.print(curr_node);
			curr_node = curr_node.getSiguiente();
		}
		System.out.println("");
	}
	
	public void elminiarElPrimero() {
		head.getSiguiente().setAnterior(null);
		head = head.getSiguiente();

	}
	
	public void eliminarElFinal() {
		NodoDoble aux =head;
		for (int contador = 1; contador < this.getTamanio()-1 ; contador++) {
			aux = aux.getSiguiente();
		}
		aux.getSiguiente().setAnterior(null);
		aux.setSiguiente(null);
	}
	
	public int buscar(T valor) {
		int contador = 1;
		NodoDoble aux = this.head;
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
		NodoDoble aux = head;
		while (aux.getDato() != a_buscar) {
			aux = aux.getSiguiente();
		}
		aux.setDato(valor);
	}

}
