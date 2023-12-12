package ud1;

import java.util.Scanner;

public class Ejerci20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int a ;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("el valor 1 : ");
		a=teclado.nextInt();

		if(a % 2 == 0 ) {
				System.out.println("el numero :"+ a + " es par ");
			}
		else {
			System.out.println("el numero :"+ a + " es impar ");
		}
		
		teclado.close();
	}

}
