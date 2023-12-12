package ud4;

public class Coche {
	String matricula;
	String marca ;
	String color;
	String modelo;
	
	double centiCubicos;
	int caballo;
	double precio;
	
	public Coche(String matricula,String marca ,String color,
	String modelo,double centiCubicos,int caballo,double precio) {
		 this.matricula=matricula;
		 this.marca=marca ;
		 this.color=color;
		 this.modelo=modelo;
		 this.centiCubicos=centiCubicos;
		 this.caballo=caballo;
		 this.precio=precio;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCentiCubicos() {
		return centiCubicos;
	}

	public void setCentiCubicos(double centiCubicos) {
		this.centiCubicos = centiCubicos;
	}

	public int getCaballo() {
		return caballo;
	}

	public void setCaballo(int caballo) {
		this.caballo = caballo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", color=" + color + ", modelo=" + modelo
				+ ", centiCubicos=" + centiCubicos + ", caballo=" + caballo + ", precio=" + precio + "]";
	}
	
	
	
	

}
