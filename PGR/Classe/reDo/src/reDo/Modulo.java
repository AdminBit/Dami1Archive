package reDo;

public class Modulo {
	private String nombre;
	private double nota;
	
	public Modulo(String nombre) {
		this.nombre=nombre;
		this.nota=0;
	}
	public Modulo(String nombre,double nota) {
		this.nombre=nombre;
		this.nota=nota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
}
