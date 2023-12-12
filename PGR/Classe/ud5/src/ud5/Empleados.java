package ud5;

public class Empleados {

	
	protected static final String NOMBREEMPRESA="Electrica S.A";
	protected static final double SUELDOBASE=1000.0;
	
	protected String dni;
	protected String nombreEmpleado;
	protected String mesEntrada;
	protected int anoEntrada;
	protected double porcentajeInc;
	
	public Empleados(String dni,String nombreEmpleado,String mesEntrada,
		  int anoEntrada,double porcentajeInc) {
		  this.dni=dni;
		  this.nombreEmpleado=nombreEmpleado;
		  this.mesEntrada=mesEntrada;
		  this.anoEntrada=anoEntrada;
		  this.porcentajeInc=porcentajeInc;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public String getMesEntrada() {
		return mesEntrada;
	}
	public void setMesEntrada(String mesEntrada) {
		this.mesEntrada = mesEntrada;
	}
	public int getAnoEntrada() {
		return anoEntrada;
	}
	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}
	public double getPorcentajeInc() {
		return porcentajeInc;
	}
	public void setPorcentajeInc(double porcentajeInc) {
		this.porcentajeInc = porcentajeInc;
	}
	
	public double sueldoFinal() {
		double extra=100;
		// to be calculated after 
		int anos;
		
		anos=2023-this.anoEntrada;
		
		if(anos>=6) {
			return SUELDOBASE+porcentajeInc+extra;
		}else {
			return SUELDOBASE+porcentajeInc;

		}
		
	}
	
	@Override
	public String toString() {
		return "Empleados [dni=" + dni + ", nombreEmpleado=" + nombreEmpleado + ", mesEntrada=" + mesEntrada
				+ ", anoEntrada=" + anoEntrada + ", porcentajeInc=" + porcentajeInc + "]";
	}
	
	
	

}
