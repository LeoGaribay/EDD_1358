public class Cola<T> {

	private ListaLigadaADT<T> lista;

	public Cola() {
		ListaLigadaADT<T> lista = new ListaLigadaADT<T>();
		this.lista = lista;
	}

	public boolean estaVacia() {
		return lista.estaVacia();
	}

	public int getTamanio() {
		return lista.getTamanio();
	}

	public void enqueue(T dato) {
		lista.agregarAlInicio(dato);
	}

	public void dequeue() {
		lista.eliminarElFinal();
	}

	public void imprimirCola() {
		lista.transversal();
	}

}
