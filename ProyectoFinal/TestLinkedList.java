public class LinkedList {
	    public static void main(String[] args) {
	        ListaLigadaADT list = new ListaLigadaADT(); //ccreando la lista
	        System.out.println(list.estaVacia()); //checando si la lista esta vacia
	        list.agregarAlInicio("Primer objeto agrgado");//metiendo un objeto al inicio
	        list.agregarAlInicio(23);
	        list.agregarAlFinal("Agregando al final");//metiendo un objeto al final
	        list.transversal();
	        list.agregarDespuesDe("Agregando despues ", 2);//agregando despues del indice 2
	        list.transversal();
	        System.out.println(list.getTamanio());//obteniendo el tamanio
	        list.agregarAlInicio(4);
	        list.agregarAlInicio(56);
	        list.transversal();
	        list.eliminar(1);//eliminando el objeto en el indice 1
	        list.transversal();
	        System.out.println(list.buscar(56));
	        //obteniendo el indice del objeto 56
	             
	    }
	}
