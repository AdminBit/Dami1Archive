package ud5;


public class Coche extends Vehiculo{
	
	private boolean descapotable;
	
	public Coche(String matricula,String marca,String modelo,int anosAntiguedad,double precioPorDia,boolean descapotable) {
		super(matricula,marca,modelo,anosAntiguedad,precioPorDia);
		this.descapotable=descapotable;
	}

	public boolean isDescapotable() {
		return descapotable;
	}


	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}


	@Override
	public String toString() {
		return super.toString() + "Coche [descapotable=" + descapotable + "]";
	}

	
	
}
