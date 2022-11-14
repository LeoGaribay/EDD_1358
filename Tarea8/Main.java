public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaPA colatest= new ColaPA(5);
		
		System.out.println(colatest.estaVacia());
		System.out.println(colatest.getTamanio());
		//colatest.enqueue(3, "Priori 3");
		colatest.enqueue(2, "Priori 2");
		colatest.enqueue(1, "Priori 1");
		colatest.enqueue(5, "Priori 5");
		colatest.transversal();
		colatest.enqueue(2, "Ayudando a 2");
		colatest.enqueue(4, "Priori 4");
		colatest.transversal();
		colatest.dequeue();
		colatest.transversal();
	}

}
