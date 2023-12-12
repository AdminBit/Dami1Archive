package ud1;

import java.util.Scanner;

public class Ejercic21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double a ;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("la cantidad  : ");
		a=teclado.nextDouble();

		if(a > 20000 ) {
				System.out.println("IVA DE  :"+ a + " es  " + (a * 16 / 100));
			}
		else {
			System.out.println("IVA DE  :"+ a + " es  " + (a * 7 / 100));
		}
		
		teclado.close();

	}

}
