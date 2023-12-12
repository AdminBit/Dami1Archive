package test5;



public class Vehiculo2 {

	 protected String matricula; 
	 protected String marca ;
	 protected String modelo ;
	 private static final String COLOR="negro"; 
	 protected int anosAntiguedad ;
	 protected double precioPorDia;
	 
	 public Vehiculo2(String matricula,String marca,String modelo,int anosAntiguedad,double precioPorDia) {
		 this.matricula=matricula;
		 this.marca=marca ;
		 this.modelo=modelo;
		 this.anosAntiguedad=anosAntiguedad;
		 this.precioPorDia=precioPorDia;
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
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnosAntiguedad() {
		return anosAntiguedad;
	}
	public void setAnosAntiguedad(int anosAntiguedad) {
		this.anosAntiguedad = anosAntiguedad;
	}
	public double getPrecioPorDia() {
		return precioPorDia;
	}
	public void setPrecioPorDia(double precioPorDia) {
		this.precioPorDia = precioPorDia;
	}

	private static final String getColor() {
		return COLOR;
	}

	
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", anosAntiguedad="
				+ anosAntiguedad + ", precioPorDia=" + precioPorDia + "]";
	}
	 
	 

	 
	 

}
