package ud4;

public class Persona {

	private String nombre;
	private String DNI;
	private int edad;
	
	//constucror
	public Persona() {
		this.nombre="";
		this.DNI="";
		this.edad=0;
	}
	//getters and setters 

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	//methods 
	public void mostrar() {
		System.out.println("Nombre es : "+this.nombre +" su DNI : "+this.DNI +" su edad :"+this.edad);
	}
	
	public boolean esMayorDeEdad() {
		if(this.edad>=18) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
