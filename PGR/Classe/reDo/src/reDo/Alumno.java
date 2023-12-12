package reDo;

import java.util.ArrayList;

public class Alumno {

	private String nif;
	private String nombre;
	private String apellido;
	private String ciclo;
	private boolean repetidor;
	ArrayList<Modulo> arrMod;

	public Alumno() {

	}

	public Alumno(String nif,String nombre,String apellido,String ciclo,boolean repetidor,ArrayList<Modulo> arrMod) {
		this.nif=nif;
		this.nombre=nombre;
		this.apellido=apellido;
		this.ciclo=ciclo;
		this.repetidor=repetidor;
		this.nif=nif;
		this.arrMod=arrMod;
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

	public ArrayList<Modulo> getArrMod() {
		return arrMod;
	}

	public void setArrMod(ArrayList<Modulo> arrMod) {
		this.arrMod = arrMod;
	}

	@Override
	public String toString() {
		return "Alumno [nif=" + nif + ", nombre=" + nombre + ", apellido=" + apellido + ", ciclo=" + ciclo
				+ ", repetidor=" + repetidor + ", arrMod=" + arrMod + "]";
	}
	
	
}
