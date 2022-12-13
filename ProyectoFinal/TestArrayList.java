import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList test = new ArrayList(); //Creando una arrayList
		System.out.println(test.isEmpty()); //Debe regresar TRUE
		System.out.println(test.size());//el tamaño deberia de ser de 0
		test.add(12);
		test.add(10);
		test.add(1);
		test.add(455);
		test.add(432);
		test.add(43242);//añadiendo datos de tipo int
		System.out.println(test.size());//el tamaño ahora debe de ser de 6
		System.out.println(test.get(3));//regresando el int en el indice 3
		test.removeAll(test); //borrando todo
	}
}
