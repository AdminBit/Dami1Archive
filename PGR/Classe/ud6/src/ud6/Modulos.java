package ud6;

public class Modulos {
	
	private String nombre;
	private double nota;
	
	public Modulos(String nombre ,double nota) {
		this.nombre=nombre;
		this.nota=nota;
	}
	public Modulos(String nombre) {
		this.nombre=nombre;
		this.nota=0.0;
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
	@Override
	public String toString() {
		return "Modulos [nombre=" + nombre + ", nota=" + nota + "]";
	}




	
	
}
