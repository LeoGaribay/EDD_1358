public class Main {

	public static void main(String[] args) {
		Cola colita= new Cola();
		System.out.println(colita.estaVacia());
		colita.enqueue("Agregando un elemento a la Cola");
		colita.enqueue("segundo objeto agrgado");
		colita.enqueue("tercer objeto agregado");
		colita.imprimirCola();
		System.out.println(colita.getTamanio());
		System.out.println(colita.estaVacia());
		System.out.println("Quitando un objeto de la cola...");
		colita.dequeue();
		colita.imprimirCola();
		System.out.println("La cola funciona correctamente!");
		
	}

}
