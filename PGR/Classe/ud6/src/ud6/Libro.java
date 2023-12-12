package ud6;

public class Libro extends Publicacion {

	private String isbn;
	private boolean premiado;
	
	public Libro() {
		
	}
	
	public Libro(String isbn,boolean premiado) {
		super();

		this.isbn=isbn;
		this.premiado=premiado;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean isPremiado() {
		return premiado;
	}
	public void setPremiado(boolean premiado) {
		this.premiado = premiado;
	}
	
	
}
