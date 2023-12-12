package test5;

public class Furgoneta2 extends Vehiculo2{
	
	 private double altura ;
	 private double tara;
	 private static int carga=500;
	 		
		public Furgoneta2(String matricula,String marca,String modelo,int anosAntiguedad,double precioPorDia,double altura,double tara) {
			super(matricula,marca,modelo,anosAntiguedad,precioPorDia);
			this.altura=altura;
			this.tara=tara;
		}

		private final double getAltura() {
			return altura;
		}

		private final void setAltura(double altura) {
			this.altura = altura;
		}

		private final double getTara() {
			return tara;
		}

		private final void setTara(double tara) {
			this.tara = tara;
		}

		private static final int getCarga() {
			return carga;
		}

		private static final void setCarga(int carga) {
			Furgoneta2.carga = carga;
		}

	 

	 

}
