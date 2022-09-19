package Juego;

import ADT.Arreglo2DADT;

public class Tablero {
	
	public static void imprimirTableroInicial() {
		System.out.println("_______________");
		for (int i = 0; i < JuegoDeLaVida.tablero.get_Filas(); i++) {
			for (int j = 0; j < JuegoDeLaVida.tablero.get_Columnas(); j++) {
				if ((Integer) JuegoDeLaVida.tablero.get_Elemento(i, j) == 0) // 0 para muertas y 1 para vivas
					System.out.print("-");
				else
					System.out.print("|");
			}
			System.out.println();
		}
		System.out.println("Tablero inicial");
		Tablero.calcularGeneraciones(JuegoDeLaVida.tablero, JuegoDeLaVida.tablero.get_Filas(), JuegoDeLaVida.tablero.get_Columnas());
		System.out.println("Generación número 1");
		
	}
	
	
	public static void calcularGeneraciones(Arreglo2DADT<Integer> tablero, int filas, int columnas) {
		JuegoDeLaVida.temporal = new Arreglo2DADT<Integer>(filas, columnas);
		for (int a = 0; a < filas; a++) {
			for (int b = 0; b < columnas; b++) { //recorrer
				int vecinosVivos = 0;
				for (int i = -1; i <= 1; i++) // Los vecinos son las ocho celdas que rodean inmediatamente una celda: vertical, horizontal y diagonalmente.
					for (int j = -1; j <= 1; j++)
						if ((a + i >= 0 && a + i < filas) && (b + j >= 0 && b + j < columnas))
							vecinosVivos += tablero.get_Elemento((a + i), (b + j));
				vecinosVivos -= tablero.get_Elemento(a, b);
				// Reglas

				if ((tablero.get_Elemento(a, b) == 1) && (vecinosVivos < 2))
					JuegoDeLaVida.temporal.set_Elemento(a, b, 0);

				else if ((tablero.get_Elemento(a, b) == 1) && (vecinosVivos > 3))
					JuegoDeLaVida.temporal.set_Elemento(a, b, 0);

				else if ((tablero.get_Elemento(a, b) == 0) && (vecinosVivos == 3))
					JuegoDeLaVida.temporal.set_Elemento(a, b, 1);

				else
					JuegoDeLaVida.temporal.set_Elemento(a, b, tablero.get_Elemento(a, b));

			}
		}

		imprimir();
	}
	public static void imprimir() {
		System.out.println("_______________");
		for (int i = 0; i < JuegoDeLaVida.tablero.get_Filas(); i++) {
			for (int j = 0; j < JuegoDeLaVida.tablero.get_Columnas(); j++) {
				if ((Integer) JuegoDeLaVida.temporal.get_Elemento(i, j) == 0)
					System.out.print("-");
				else
					System.out.print("|");
			}
			System.out.println();

		}
	}
}

