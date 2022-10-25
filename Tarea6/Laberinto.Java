package Lab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import ADT.Arreglo2DADT;
import ADT.ArregloADT;
import ADT.Pila;

public class Laberinto {

	static ArrayList<ArrayList<String>> Labe = new ArrayList();
	static Arreglo2DADT<String> LabeRelleno = new Arreglo2DADT(10, 10);
	static ArregloADT<Integer> coorActuales = new ArregloADT(2);
	static ArregloADT<Integer> coorAnteriores = new ArregloADT(2);
	static Pila<ArregloADT<Integer>> pila = new Pila();
	static int[][] anterior = new int[2][1];
	static String anteriorStr = "";

	public static void leerArchivo() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(
				"\\Users\\leona\\Documents\\Leo\\Ing\\3ersemestre\\ED\\espacio_trabajo\\Tarea6\\src\\Lab\\laberinto.csv"));
		String line = "";
		while ((line = br.readLine()) != null) {
			String[] datos = line.split(",");
			ArrayList<String> aux = new ArrayList();
			for (String tmp : datos) {
				aux.add(tmp);
			}
			Labe.add(aux);
		}
	}

	public static void rellenarLabe(ArrayList<ArrayList<String>> Labe) {
		for (int i = 0; i < LabeRelleno.get_Filas(); i++) {
			for (int j = 0; j < LabeRelleno.get_Columnas(); j++) {
				switch (Labe.get(i).get(j)) {
				case "0":
					LabeRelleno.set_Elemento(i, j, "#");
					break;

				case "1":
					LabeRelleno.set_Elemento(i, j, ".");
					break;

				case "8":
					LabeRelleno.set_Elemento(i, j, "*");
					break;

				case "9":
					LabeRelleno.set_Elemento(i, j, "~");
					break;

				}
			}

		}
	}

	public static void imprimirLaberinto(Arreglo2DADT laberinto) {
		for (int i = 0; i < laberinto.get_Filas(); i++) {
			for (int j = 0; j < laberinto.get_Columnas(); j++) {
				System.out.print(laberinto.get_Elemento(i, j));
			}
			System.out.println("");

		}
	}

	public static boolean coorInicio(Arreglo2DADT laberinto) {
		boolean entrada = false;
		for (int i = 0; i < LabeRelleno.get_Filas(); i++) {
			for (int j = 0; j < LabeRelleno.get_Columnas(); j++) {
				if (LabeRelleno.get_Elemento(i, j) == "*") {
					coorActuales.setElemento(0, i);
					coorActuales.setElemento(1, j);
					entrada = true;
					// pila.push(i +","+ j);
					pila.push(coorActuales); // empujar un arregloadt
				}
			}

		}
		return entrada;
	}

	public static boolean ultimaCoord() {
		if (LabeRelleno.get_Elemento(coorActuales.getElemento(0) + 1, coorActuales.getElemento(1)) == "~") {// derecha
			return true;
		} else if (LabeRelleno.get_Elemento(coorActuales.getElemento(0), coorActuales.getElemento(1) + 1) == "~") {//  abajo
			return true;
		} else if (LabeRelleno.get_Elemento(coorActuales.getElemento(0) - 1, coorActuales.getElemento(1)) == "~") {// izquierda
			return true;
		} else if (LabeRelleno.get_Elemento(coorActuales.getElemento(0), coorActuales.getElemento(1) - 1) == "~") {// arriba
			return true;
		} else {
			return false;
		}
	}

	// Un "." es camino, "?" es camino sin salida
	// Revisar metodo despues para no repetir tanto codigo
	public static void recorrido() {
		coorActuales = pila.peek(); // ArregloADT<Integer>coorActuales= new ArregloADT(2) "x" en [0] y "y" en [1]
		// DERECHA
		if (LabeRelleno.get_Elemento(coorActuales.getElemento(0), coorActuales.getElemento(1) + 1) == "."
				& LabeRelleno.get_Elemento(coorActuales.getElemento(0), coorActuales.getElemento(1) + 1) != "?"
				& !(Objects.equals(anteriorStr, coorActuales.getElemento(0) + "," + String
						.valueOf(Integer.parseInt(coorActuales.getElemento(1).toString()) + Integer.parseInt("1"))))) {
			System.out.println("Anteriores a comparar" + anteriorStr);
			System.out.println("Comparar" + coorActuales.getElemento(0) + ","
					+ String.valueOf(Integer.parseInt(coorActuales.getElemento(1).toString()) + Integer.parseInt("1")));
			pila.push(new ArregloADT<Integer>(2, coorActuales.getElemento(0), coorActuales.getElemento(1) + 1));
			anteriorStr = coorActuales.getElemento(0) + "," + coorActuales.getElemento(1);
			System.out.println("Anteriores" + anteriorStr);

			// ABAJO
		} else if (LabeRelleno.get_Elemento(coorActuales.getElemento(0) + 1, coorActuales.getElemento(1)) == "."
				& LabeRelleno.get_Elemento(coorActuales.getElemento(0) + 1, coorActuales.getElemento(1)) != "?"
				& !(Objects.equals(anteriorStr, String.valueOf(Integer.parseInt(coorActuales.getElemento(0).toString())
						+ Integer.parseInt("1") + "," + coorActuales.getElemento(1))))) {
			pila.push(new ArregloADT<Integer>(2, coorActuales.getElemento(0) + 1, coorActuales.getElemento(1)));
			anteriorStr = coorActuales.getElemento(0) + "," + coorActuales.getElemento(1);

			// IZQUIERDA
		} else if (LabeRelleno.get_Elemento(coorActuales.getElemento(0), coorActuales.getElemento(1) - 1) == "."
				& LabeRelleno.get_Elemento(coorActuales.getElemento(0), coorActuales.getElemento(1) - 1) != "?"
				& !(Objects.equals(anteriorStr, coorActuales.getElemento(0) + "," + String
						.valueOf(Integer.parseInt(coorActuales.getElemento(1).toString()) - Integer.parseInt("1"))))) {
			System.out.println("Anteriores a comparar" + anteriorStr);
			System.out.println("Comparar" + coorActuales.getElemento(0) + ","
					+ String.valueOf(Integer.parseInt(coorActuales.getElemento(1).toString()) - Integer.parseInt("1")));
			pila.push(new ArregloADT<Integer>(2, coorActuales.getElemento(0), coorActuales.getElemento(1) - 1));
			anteriorStr = coorActuales.getElemento(0) + "," + coorActuales.getElemento(1);
			System.out.println("Anteriores" + anteriorStr);

			// ARRIBA
		} else if (LabeRelleno.get_Elemento(coorActuales.getElemento(0) - 1, coorActuales.getElemento(1)) == "."
				& LabeRelleno.get_Elemento(coorActuales.getElemento(0) - 1, coorActuales.getElemento(1)) != "?"
				& !(Objects.equals(anteriorStr, String.valueOf(Integer.parseInt(coorActuales.getElemento(0).toString())
						- Integer.parseInt("1") + "," + coorActuales.getElemento(1))))) {
			pila.push(new ArregloADT<Integer>(2, coorActuales.getElemento(0) - 1, coorActuales.getElemento(1)));
			anteriorStr = coorActuales.getElemento(0) + "," + coorActuales.getElemento(1);

			// OTRO
		} else {
			LabeRelleno.set_Elemento(coorActuales.getElemento(0), coorActuales.getElemento(1), "?"); // back tracking
			pila.pop();
			System.out.println("POP");
		} // No se estaba llegando al else porque "!=" no comparaba Strings
	}

	public static void main(String args[]) throws IOException {
		leerArchivo();
		rellenarLabe(Labe);
		imprimirLaberinto(LabeRelleno);
		coorInicio(LabeRelleno);
		while (ultimaCoord() == false) {
			recorrido();
			pila.transversal();
			System.out.print("-----------" + "\n");

		}
		imprimirLaberinto(LabeRelleno);
		//Todo funciona correctamente, pero la ultima cordenada antes del "~" es popeada
		//Creo que el problema esta en como el while verifica el metodo, algun dia lo arreglare
	}
}
