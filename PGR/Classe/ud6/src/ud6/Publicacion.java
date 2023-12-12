package ud6;


public class Publicacion {
	protected String titulo;
	protected String fecha;
	
	public Publicacion() {
		
	}
		
	public Publicacion(String titulo,String fecha) {
			this.titulo=titulo;
			this.fecha=fecha;
		}
	public Publicacion(String titulo) {
		this.titulo=titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
