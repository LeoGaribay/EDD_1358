public class ColaPA<T> {
	private int niveles;
	private ArregloADT<Cola> ColaPA;
	
	public ColaPA(int niveles) {
		this.niveles=niveles;
		ColaPA = new ArregloADT(niveles);
		for (int i = 0; i < niveles; i++) {
			ColaPA.setElemento(i, new Cola());
		}
	}
	
	public boolean estaVacia() {
		for (int i = 0; i < niveles; i++) {
			if(ColaPA.getElemento(i).estaVacia()) {
				return true;
			}
		}
		return false;
	}
	
	public int getTamanio() {
		int tamanio=0;
		Cola auxiliar= new Cola();
		for (int i = 0; i < niveles ; i++) {
			auxiliar= ColaPA.getElemento(i);
			tamanio += auxiliar.getTamanio(); //sumara los valores de todas las colas en el arreglo
		}
		return tamanio;
	}
	
	public void enqueue(int prioridad, T elemento) {
		if(prioridad > niveles) {
			ColaPA.getElemento(prioridad-1).enqueue(elemento);
		}else if(prioridad < niveles) {
			ColaPA.getElemento(prioridad).enqueue(elemento);
		}else {
			System.out.println("Error en enqueue");
		}
	}
	
	public void dequeue() {
		for (int i = 0; i <= niveles; i++) {
			if(ColaPA.getElemento(i).estaVacia()==false) {
				ColaPA.getElemento(i).dequeue();
				break;
			}else {
				System.out.println("Error en dequeue");
			}
		}
		
	}
	
	public void transversal() {
		for (int i = 0; i < niveles; i++) {
			ColaPA.getElemento(i).imprimirCola();
			
		}
		
	}

}
