package mourabitOmar;

public class Asignatura {

	private String nombre;
	private String curso;
	private int numAlumnos;
	private int numSuspensos;

	public Asignatura(String nombre, String curso) {
		this.nombre = nombre;
		this.curso = curso;
	}

	public Asignatura(String nombre, String curso, int numAlumnos, int numSuspensos) {
		this.nombre = nombre;
		this.curso = curso;
		this.numAlumnos = numAlumnos;
		this.numSuspensos = numSuspensos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}

	public int getNumSuspensos() {
		return numSuspensos;
	}

	public void setNumSuspensos(int numSuspensos) {
		this.numSuspensos = numSuspensos;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", curso=" + curso + ", numAlumnos=" + numAlumnos + ", numSuspensos="
				+ numSuspensos + "]";
	}

	public double porcentajeAprobados() {

		return ((numAlumnos-numSuspensos)/(double)numAlumnos)*100;
	}

	public int obtenerNumeroAprobados() {

		return (numAlumnos-numSuspensos);
	}
}
