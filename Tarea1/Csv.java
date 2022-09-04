package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Csv {
	private int primerMes;
	private int segundoMes;
	private String[][] listaBi;
	Scanner scanner = new Scanner(System.in);

	public Csv(int columna, int fila) {
		listaBi = new String[fila][columna];
		String txt;

		try {
			FileReader rutaArchivo = new FileReader(
					"\\Users\\leona\\Documents\\Leo\\Ing\\3ersemestre\\ED\\espacio_trabajo\\TareaCSV\\src\\test\\presenciaredes.csv");
			@SuppressWarnings("resource")
			BufferedReader leer = new BufferedReader(rutaArchivo);
			List<String[]> listaDatos = new ArrayList<String[]>();
			while ((txt = leer.readLine()) != null) { // != distinto
				listaDatos.add(txt.split(","));

			}
			listaBi = new String[listaDatos.size()][0];
			listaDatos.toArray(listaBi);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void metodoDiferencia() {
		String enero = listaBi[8][3];
		String junio = listaBi[8][8];
		int followersEnero = Integer.parseInt(enero);
		int followersJunio = Integer.parseInt(junio);
		int diferencia = followersJunio - followersEnero;
		System.out.println(diferencia);

	}

	public void metodoPromedio() {
		int followersTwEnero = Integer.parseInt(listaBi[8][3]);
		int followersFbEnero = Integer.parseInt(listaBi[1][3]);
		int followersTwJunio = Integer.parseInt(listaBi[8][8]);
		int followersFbJunio = Integer.parseInt(listaBi[1][8]);
		double promedioTw = (((double) followersTwJunio / followersTwEnero) - 1) * 100;
		double promedioFb = (((double) followersFbJunio / followersFbEnero) - 1) * 100;
		System.out.println(promedioTw + "% es el promedio de crecimiento de Twitter");
		System.out.println(promedioFb + "%es el promedio de crecimiento de Facebook");
	}

	public void youtubeDiferencia() {
		int eneroVisu = Integer.parseInt(listaBi[16][3]);
		int febreroVisu = Integer.parseInt(listaBi[16][4]);
		int marzoVisu = Integer.parseInt(listaBi[16][5]);
		int abrilVisu = Integer.parseInt(listaBi[16][6]);
		int mayoVisu = Integer.parseInt(listaBi[16][7]);
		int junioVisu = Integer.parseInt(listaBi[16][8]);
		System.out.println("Escoja el primer mes de entre las siguientes opciones:");
		System.out.println(
				"Enero= Digite 1 \nFebrero= Digite 2 \nMarzo= Digite 3 \nAbril= Digite 4 \nMayo= Digite 5 \nJunio= Digite 6");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		if (!scan.hasNextInt()) {
			System.out.println("Error");
		}
		primerMes = scan.nextInt();
		switch (primerMes) {
		case 1:
			primerMes = eneroVisu;
			System.out.println("Escoja el segundo mes");
			segundoMes = scan.nextInt();
			if (segundoMes == 1) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(eneroVisu - eneroVisu);
			}
			if (segundoMes == 2) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(eneroVisu-febreroVisu);
			}
			if (segundoMes == 3) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(eneroVisu-marzoVisu);
			}
			if (segundoMes == 4) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(eneroVisu-abrilVisu);
			}
			if (segundoMes == 5) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(eneroVisu-mayoVisu);
			}
			if (segundoMes == 6) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(eneroVisu-junioVisu);
			}
			break;

		case 2:
			System.out.println("Escoja el segundo mes");
			segundoMes = scan.nextInt();
			if (segundoMes == 1) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(febreroVisu-eneroVisu);
			}
			if (segundoMes == 2) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(febreroVisu-febreroVisu);
			}
			if (segundoMes == 3) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(febreroVisu-marzoVisu);
			}
			if (segundoMes == 4) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(febreroVisu-abrilVisu);
			}
			if (segundoMes == 5) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(febreroVisu-mayoVisu);
			}
			if (segundoMes == 6) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(febreroVisu-junioVisu);
			}
			break;
		case 3:
			System.out.println("Escoja el segundo mes");
			segundoMes = scan.nextInt();
			if (segundoMes == 1) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(marzoVisu-eneroVisu);
			}
			if (segundoMes == 2) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(marzoVisu-febreroVisu);
			}
			if (segundoMes == 3) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(marzoVisu-marzoVisu);
			}
			if (segundoMes == 4) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(marzoVisu-abrilVisu);
			}
			if (segundoMes == 5) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(marzoVisu-mayoVisu);
			}
			if (segundoMes == 6) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(marzoVisu);
			}
			break;
		case 4:
			System.out.println("Escoja el segundo mes");
			segundoMes = scan.nextInt();
			if (segundoMes == 1) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(abrilVisu-eneroVisu);
			}
			if (segundoMes == 2) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(abrilVisu-febreroVisu);
			}
			if (segundoMes == 3) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(abrilVisu-marzoVisu);
			}
			if (segundoMes == 4) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(abrilVisu-abrilVisu);
			}
			if (segundoMes == 5) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(abrilVisu-mayoVisu);
			}
			if (segundoMes == 6) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(abrilVisu-junioVisu);
			}
			break;
		case 5:
			System.out.println("Escoja el segundo mes");
			segundoMes = scan.nextInt();
			if (segundoMes == 1) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(mayoVisu-eneroVisu);
			}
			if (segundoMes == 2) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(mayoVisu-febreroVisu);
			}
			if (segundoMes == 3) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(mayoVisu-marzoVisu);
			}
			if (segundoMes == 4) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(mayoVisu-abrilVisu);
			}
			if (segundoMes == 5) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(mayoVisu-mayoVisu);
			}
			if (segundoMes == 6) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(mayoVisu-junioVisu);
			}
			break;
		case 6:
			System.out.println("Escoja el segundo mes");
			segundoMes = scan.nextInt();
			if (segundoMes == 1) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(junioVisu-eneroVisu);
			}
			if (segundoMes == 2) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(junioVisu-febreroVisu);
			}
			if (segundoMes == 3) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(junioVisu-marzoVisu);
			}
			if (segundoMes == 4) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(junioVisu-abrilVisu);
			}
			if (segundoMes == 5) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(junioVisu-mayoVisu);
			}
			if (segundoMes == 6) {
				System.out.println("La diferencia de visualicaciones es de:");
				System.out.println(junioVisu-junioVisu);
			}
			break;
		}

	}

}
