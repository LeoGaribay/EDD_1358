package ADT;

public class Arreglo2DADT<T> {
	int filas;
	int columnas;
	private final ArregloADT<ArregloADT> datos;

	public Arreglo2DADT(int fil, int col) {
		this.filas = fil;
		this.columnas = col;
		datos = new ArregloADT(filas);
		for (int i = 0; i < filas; i++) {
			datos.setElemento(i, new ArregloADT(col));
		}
	}

	public int get_Filas() {
		return filas;
	}

	public int get_Columnas() {
		return columnas;
	}

	@SuppressWarnings("unchecked")
	public void set_Elemento(int ren, int col, T dato) {
		datos.getElemento(ren).setElemento(col, dato);
	}

	@SuppressWarnings("unchecked")
	public T get_Elemento(int ren, int col) {
		if (col >= 0 && col < columnas) {
			if (ren >= 0 && ren < filas) {
				return (T) datos.getElemento(ren).getElemento(col);
			}
		}
		return null;
	}

	public void limpiar(T Elemento) {
		for (int i = 0; i < datos.getLongitud(); i++) {
			for (int j = 0; j < this.get_Columnas(); j++) {
				this.set_Elemento(i, j, Elemento);
			}

		}
	}

	@Override
	public String toString() {
		return "[" + datos + "]";
	}

}
