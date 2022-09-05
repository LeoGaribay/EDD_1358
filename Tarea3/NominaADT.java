package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NominaADT {

	public static void main(String[] args) {
		String info;
		Arreglo nomina = new Arreglo(15);
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\leona\\Desktop\\junio.csv"));		
			for (int i = 0; i < 15; i++) {			
				String[] tmp = br.readLine().split(",");			
				Trabajador trabTemp = new Trabajador((tmp[0]), tmp[1], tmp[2], tmp[3], (tmp[4]), (tmp[5]), (tmp[6]));
				nomina.setElemento(i, trabTemp);
			}

			for (int i = 1; i < nomina.getLongitud(); i++) { // listando sueldos
				Trabajador emp = (Trabajador) nomina.getElemento(i);
				System.out.println("Id: " + emp.getNumero_trabajador() + " Sueldo: " + emp.calcularSueldo());

			}
	
			int mayor = 2023; // listando mayor antiguedad
			int idx= 0;
			for (int j = 1; j < nomina.getLongitud(); j++) {
				Trabajador emp = (Trabajador) nomina.getElemento(j);
				if(Integer.parseInt(emp.getAnio_ingreso()) < mayor) {
					idx = j;
					mayor= (Integer.parseInt(emp.getAnio_ingreso()));
					System.out.println("La mayor antiguedad es del emleado en el indice: " + idx);
					
				}
			}
		

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
