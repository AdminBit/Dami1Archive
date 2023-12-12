package test5;

import ud5.Empleados;

public class Jefes extends Empleados{
	
	private static final double EXTRAJEFE=250.0;
	private String departamento;
	private String nombreJefe;
	
	public Jefes (String dni,String nombreEmpleado,String mesEntrada,int anoEntrada,double porcentajeInc,String departamento, String nombreJefe) {
		super(dni, nombreEmpleado, mesEntrada, anoEntrada, porcentajeInc);
		 this.departamento=departamento;
		 this.nombreJefe=nombreJefe;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getNombreJefe() {
		return nombreJefe;
	}
	public void setNombreJefe(String nombreJefe) {
		this.nombreJefe = nombreJefe;
	}
	
	
	

}
