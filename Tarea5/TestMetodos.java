package ADT;

public class TestMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaLigadaADT head= new ListaLigadaADT();
		head.agregarAlInicio(4);
		head.agregarAlInicio(15);
		head.agregarAlFinal(17);
		head.agregarAlFinal(23);
		head.transversal();
		head.agregarDespuesDe(24, 2);
		head.transversal();
		head.eliminar(3);
		head.transversal();
		head.eliminarElFinal();
		head.transversal();
		System.out.println("\n"+ "Empieza lista doble ligada");
		//empiezan los metodos de la lista doble ligada
		ListaDobleADT head2= new ListaDobleADT();
		head2.agregarAlinicio(1);
		head2.agregarAlFinal(3);
		head2.agregarAlFinal(6);
		head2.agregarAlFinal(9);
		head2.transversal();
		System.out.println(head2.getTamanio());
		head2.agregarDespuésDe(90, 3);
		head2.transversal();
		head2.eliminar(2);
		head2.transversal();
		head2.elminiarElPrimero();
		head2.transversal();
		head2.eliminarElFinal();
		head2.transversal();
		System.out.println(head2.buscar(90));
		head2.actualizar(90, 678);
		head2.transversal();
		//todos los metodos funcionan correctamente
	}

}
