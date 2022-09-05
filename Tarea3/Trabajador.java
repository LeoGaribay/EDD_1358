package clases;

public class Trabajador {
	double HORA_EXTRA = 276.5;
	String numero_trabajador;
	String nombre;
	String paterno;
	String materno;
	String horas_extra;
	String sueldo_base;
	String anio_ingreso;

	public Trabajador(String nt, String nom, String pat, String mat, String ht, String suel, String anio) {
		this.numero_trabajador = nt;
		this.nombre = nom;
		this.paterno = pat;
		this.materno = mat;
		this.horas_extra = ht;
		this.sueldo_base = suel;
		this.anio_ingreso = anio;
	}

	public String getNumero_trabajador() {
		return numero_trabajador;
	}

	public void setNumero_trabajador(String nt) {
		this.numero_trabajador = nt;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String pat) {
		this.paterno = pat;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String mat) {
		this.materno = mat;
	}

	public String getHoras_extra() {
		return horas_extra;
	}

	public void setHoras_extra(String ht) {
		this.horas_extra = ht;
	}

	public String getSueldo_base() {
		return sueldo_base;
	}

	public void setSueldo_base(String suel) {
		this.sueldo_base = suel;
	}

	public String getAnio_ingreso() {
		return anio_ingreso;
	}

	public void setAnio_ingreso(String anio) {
		this.anio_ingreso = anio;
	}
	
	@Override
	public String toString() {
		return "Trabajador [numero_trabajador=" + numero_trabajador + ", nombre=" + nombre + ", paterno=" + paterno
				+ ", materno=" + materno + ", horas_extra=" + horas_extra + ", sueldo_base=" + sueldo_base
				+ ", anio_ingreso=" + anio_ingreso + "]";
	}
	
	public double calcularSueldo() {
		int antiguedad = 2022 - (Integer.parseInt(anio_ingreso));
		double total= (double) (Integer.parseInt(sueldo_base) + (Integer.parseInt(sueldo_base)*(antiguedad*0.03)) + (Integer.parseInt(horas_extra) * HORA_EXTRA));
		return total;
		
	}
			

}
