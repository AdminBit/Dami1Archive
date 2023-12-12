package test5;

public class Coche2 extends Vehiculo2{
	
	private boolean descapotable;
	
	public Coche2(String matricula,String marca,String modelo,int anosAntiguedad,double precioPorDia,boolean descapotable) {
		super(matricula,marca,modelo,anosAntiguedad,precioPorDia);
		this.descapotable=descapotable;
	}



	final boolean isDescapotable() {
		return descapotable;
	}



	private final void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}



	@Override
	public String toString() {
		return super.toString() + "Coche [descapotable=" + descapotable + "]";
	}

	
	
}
