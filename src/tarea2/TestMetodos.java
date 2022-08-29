package tarea2;

public class TestMetodos {

    public static void main(String[] args) {
        ArregloADT arreglo = new ArregloADT(4);
        System.out.println(arreglo.getLongitud());
        arreglo.setElemento(0, "indice 0");
        arreglo.setElemento(1, "Hola este es el indice 1");
        arreglo.setElemento(2, "indice 2");
        arreglo.setElemento(3, "Probando el indice 3");
        System.out.println(arreglo.getElemento(1));
        System.out.println(arreglo.getElemento(3));
        System.out.println(arreglo.toString());
        System.out.println("Se va a limpiar el arreglo");
        arreglo.limpiar();
        System.out.println(arreglo);
    }

}
