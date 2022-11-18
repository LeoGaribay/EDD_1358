public class Main {

	public static void main(String[] args) {
		HashTable tablita= new HashTable(13);
		tablita.agregar(236, "En el indice 2");
		System.out.println(tablita.valorDe(236));
		tablita.imprimir();
		tablita.agregar(526, "Hola");
		System.out.println(tablita.valorDe(526));
		tablita.remover(236);
		tablita.imprimir();
		System.out.println("Todo parece funcionar bien");
		

	}

}
