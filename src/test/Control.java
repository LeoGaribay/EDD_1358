package test;

public class Control {
	public static void main(String[] args) {
		Csv redesSociales = new Csv(19, 15);

		System.out.println("Tarea: Ejercicio Redes sociales.");
		System.out.println(
				"Mostrar en pantalla la diferencia de seguidores (followers) en Twitter entre el mes de enero y junio: ");
		redesSociales.metodoDiferencia();
		System.out.println(
				"Calcular el promedio de crecimiento de Twitter y Facebook entre los meses de enero a junio. ");
		redesSociales.metodoPromedio();
		System.out.println(
				"Permita calcular la diferencia de visualizaciones de YouTube entre los meses seleccionados por teclado (enero a junio): ");
		redesSociales.youtubeDiferencia();
	}
}
