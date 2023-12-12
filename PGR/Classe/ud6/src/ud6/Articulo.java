package ud6;

public class Articulo extends Publicacion{
	private String medio;
	
	public Articulo() {	
	}

	public Articulo(String isbn,boolean premiado,String medio) {	
		super();
		this.medio=medio;
	}
	public String getMedio() {
		return medio;
	}

	public void setMedio(String medio) {
		this.medio = medio;
	}
	

}
