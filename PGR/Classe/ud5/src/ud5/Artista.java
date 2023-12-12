package ud5;

public class Artista {
	
	protected String nombre;
	protected int edad;
	protected double salario;
	
	public Artista() {
		this.nombre= nombre;
		this.edad = edad;
		this.salario = salario;
	}
	public Artista(String nombre,int edad, double salario) {
		this.nombre= nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	
	public Artista(String nombre,int edad) {
		this.nombre= nombre;
		this.edad = edad;
		this.salario = 0;

	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
		
	}
	@Override
	public String toString() {
		return "Artista [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
	}
	
	public void mostrar() {
		System.out.println("nombre:" + nombre  );
		System.out.println("edad=" + edad );
		System.out.println("salario=" + salario );
	}
	

}
