package Juego;

import ADT.Arreglo2DADT;

public class JuegoDeLaVida {
	public static Arreglo2DADT tablero;
	public static Arreglo2DADT temporal;

	public static void main(String[] args) {

		tablero = new Arreglo2DADT<Integer>(15, 15);
		tablero.limpiar(0); //rellenar de 0s
		tablero.set_Elemento(2, 2, 1);
		tablero.set_Elemento(2, 3, 1);
		tablero.set_Elemento(2, 4, 1);
		tablero.set_Elemento(6, 2, 1);
		tablero.set_Elemento(6, 3, 1);
		tablero.set_Elemento(6, 4, 1);
		tablero.set_Elemento(6, 5, 1);		
		Tablero.imprimirTableroInicial();
		for (int i = 1; i < 56; i++) { // imprimir las veces que se especifiquen
			Tablero.calcularGeneraciones(temporal, tablero.get_Filas(), tablero.get_Columnas()); 
			int numero= i+1;
			System.out.println("Generación número " + numero);
		}

	}
}
