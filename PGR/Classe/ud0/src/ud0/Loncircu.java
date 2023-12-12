package ud0;

import java.util.Scanner;

public class Loncircu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado =new Scanner(System.in);
		double radio;
		double pi=3.14;
	
		System.out.println("Introduce el radio : ");
		radio=teclado.nextDouble();
		
		System.out.println("La circunferencia es : " + 2 * pi  * radio );
		System.out.println("La circunferencia con PI de Systema es : " + 2 * Math.PI * radio );
		

		
		teclado.close();
		
	}

}
