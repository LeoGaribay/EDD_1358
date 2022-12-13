import java.util.ArrayList;

public class Stack {
	public static void main(String[] args) {
		Pila stack = new Pila(); //Constructor
		stack.push(2121); //Agregando elementos
		stack.push("perro");
		stack.push("test");
		stack.push(new ArrayList());
		stack.push("ultimo objeto");
		System.out.println(stack.peek()); //Nos asomamos al ultimo objeto
		System.out.println(stack.estaVacia());//Revisando si esta vacia
		System.out.println(stack.getTamanio());//Debe regresar un tamanio de 5
		stack.transversal();
		stack.pop();//quitando el ultimo objeto
		stack.transversal();
	}
}
