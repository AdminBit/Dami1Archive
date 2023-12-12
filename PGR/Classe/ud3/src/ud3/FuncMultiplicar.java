package ud3;

public class FuncMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double op1,op2,op3;
		double resultado;
		
		
		op1=1;
		op2=5;
		op3=2;
		
		resultado=multiplicar(op1,op2,op3);
		System.out.println(resultado);
		resta(0,5);
	}// main 
	
	// funcion
	public static double multiplicar(double a,double b ,double c) {
		return a*b*c;
	}
	
	public static void resta (int op1,int op2) {
		if(op1>=op2) {
			System.out.println("la resta : "+(op1-op2));
		}else {
			System.out.println("ERROR");

		}
	}

}
