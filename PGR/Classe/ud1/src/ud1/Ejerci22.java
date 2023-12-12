package ud1;

import java.util.Scanner;

public class Ejerci22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ;
		double b;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("el numero  : ");
		a=teclado.nextInt();
		b=Math.pow(a, 2); 
		if(b> 100 ) {
			System.out.println("despues de la restara queda " + (b-100) );
			}
		else {
			System.out.println("el numero le falta " +( 100 -b ) +" par llegar a 100");
		}
		
		teclado.close();

	}

}
