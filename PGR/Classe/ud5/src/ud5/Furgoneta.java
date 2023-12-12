package ud5;

public class Furgoneta extends Vehiculo {

	private double altura;
	private double tara;
	private static int carga = 500;

	public Furgoneta(String matricula, String marca, String modelo, int anosAntiguedad, double precioPorDia,
			double altura, double tara) {
		super(matricula, marca, modelo, anosAntiguedad, precioPorDia);
		this.altura = altura;
		this.tara = tara;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getTara() {
		return tara;
	}

	public void setTara(double tara) {
		this.tara = tara;
	}

	public static int getCarga() {
		return carga;
	}

	public static void setCarga(int carga) {
		Furgoneta.carga = carga;
	}

	@Override
	public String toString() {
		return super.toString() + "Furgoneta de altura=" + altura + ", tara=" + tara + "]" + " su carga es :" + carga;
	}

}
