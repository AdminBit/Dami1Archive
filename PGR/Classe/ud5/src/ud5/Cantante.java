package ud5;

public class Cantante extends Artista{
	
	private boolean soprano;
	
	//
	public Cantante() {
		super();
		this.soprano=false;
	}
	
	//
	public Cantante(String nombre,int edad, double salario,boolean soprano) {
		
		super(nombre,edad,salario);
		this.soprano=false;
	}
	
	//
	public Cantante(boolean soprano) {
		super();
		this.soprano=false;
	}
	
	public Cantante(String nombre,int edad) {
		
		super(nombre,edad);
	}

	public boolean isSoprano() {
		return soprano;
	}

	public void setSoprano(boolean soprano) {
		this.soprano = soprano;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+"Cantante [soprano=" + soprano + "]";
	}

	public void mostrar() {
		System.out.println("soprano:" + soprano);
		super.mostrar();
	}
}
