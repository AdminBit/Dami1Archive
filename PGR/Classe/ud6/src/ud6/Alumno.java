package ud6;

import java.util.ArrayList;

public class Alumno implements Comparable<Alumno> {
	
	private String nif;
	private String nombre;
	private String apellido;
	private String ciclo;
	private boolean repetidor;
	private ArrayList<Modulos> m;
	
	public Alumno(String nif ,String nombre ,String apellido,String ciclo,
			boolean repetidor,ArrayList<Modulos> m) {
		this.nif=nif;
		this.nombre=nombre;
		this.apellido=apellido;
		this.ciclo=ciclo;
		this.repetidor=repetidor;
		this.m=m;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public boolean isRepetidor() {
		return repetidor;
	}

	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}

	public ArrayList<Modulos> getM() {
		return m;
	}

	public void setM(ArrayList<Modulos> m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "Alumno [nif=" + nif + ", nombre=" + nombre + ", apellido=" + apellido + ", ciclo=" + ciclo
				+ ", repetidor=" + repetidor + ", m=" + m + "]";
	}

	@Override
	public int compareTo(Alumno o) {
		
		if(this.nif.compareToIgnoreCase(o.getNif())>0) {
			return 1;

		}
		else if(this.nif.compareToIgnoreCase(o.getNif())<0) {
			return -1;

		}

		return 0;
	}


	
	

}
