package Lab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import ADT.Arreglo2DADT;
import ADT.ArregloADT;
import ADT.Pila;

public class Laberinto {

	static ArrayList<ArrayList<String>> Labe = new ArrayList();
	static Arreglo2DADT LabeRelleno = new Arreglo2DADT(10, 10);
	static ArregloADT<Integer> coorActuales= new ArregloADT(2);
	static Pila<ArregloADT<Integer>> pila= new Pila();

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
	
	public static boolean existeInicio(Arreglo2DADT laberinto) {
		boolean entrada = false;
		//ArregloADT coorActuales= new ArregloADT(1);
		for (int i = 0; i < LabeRelleno.get_Filas(); i++) {
			for (int j = 0; j < LabeRelleno.get_Columnas(); j++) {
				if(LabeRelleno.get_Elemento(i, j) == "*") {
					coorActuales.setElemento(0, i);
					coorActuales.setElemento(1, j);
					entrada = true;
					//pila.push(i +","+  j);
					pila.push(coorActuales); //empujar arregloadt
				}
			}
			
		}
		return entrada;
	}
	
	public static boolean ultimaCoord() {
		if(LabeRelleno.get_Elemento(coorActuales.getElemento(0)-1, coorActuales.getElemento(1))=="~") {//izq
			return true;
		}else if(LabeRelleno.get_Elemento(coorActuales.getElemento(0), coorActuales.getElemento(1)+1)=="~") {//arriba
			return true;
		}else if(LabeRelleno.get_Elemento(coorActuales.getElemento(0)+1, coorActuales.getElemento(1))=="~") {//derecha
			return true;
		}else if(LabeRelleno.get_Elemento(coorActuales.getElemento(0), coorActuales.getElemento(1)-1)=="~") {//abajo
			return true;
		}else {
			return false; //no
		}
	}
	
	public static void recorrido() {
		coorActuales= pila.peek();
		if(LabeRelleno.get_Elemento(coorActuales.getElemento(0), coorActuales.getElemento(1)-1) == "."){
		}else if() {
			
		}else if() {
			
		}else if() {
			
		}else {
			
		}
	}

	public static void main(String args[]) throws IOException {
		leerArchivo();
		rellenarLabe(Labe);
		imprimirLaberinto(LabeRelleno);
		existeInicio(LabeRelleno);
		System.out.println(existeInicio(LabeRelleno));
		System.out.println(coorActuales);
		System.out.println(pila.peek());
		pila.transversal();

	}
}
