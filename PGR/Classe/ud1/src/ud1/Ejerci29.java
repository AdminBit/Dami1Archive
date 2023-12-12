package ud1;

import java.util.Scanner;

public class Ejerci29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int operacion ;
		int val1,val2;
		

		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Elige la operacion : ");
		operacion=teclado.nextInt();
		
		System.out.println("numero 1 " );
		val1=teclado.nextInt();
		System.out.println("numero 2 " );
		val2=teclado.nextInt();
		
		if(operacion ==1 ) {
			System.out.println(" operacion de + " );
			System.out.println("La suma de  " + val1 + " + " +  val2 +" = " +(val1 + val2) );
			}
		else if(operacion ==2 ) {
			System.out.println(" operacion de * " );
			System.out.println("La  de  " + val1 + " - " +  val2 +" = " +(val1 - val2) );
			}

		else if(operacion ==3 ) {
			System.out.println(" operacion de * " );
			System.out.println("La  de  " + val1 + " * " +  val2 +" = " +(val1 * val2) );
		}
		

		else if(operacion ==4 ) {
			System.out.println(" operacion de / " );
			System.out.println("La  de  " + val1 + " / " +  val2 +" = " +(val1 / val2) );
			}
		else if(operacion ==5 ) {
			System.out.println(" operacion de % " );
			System.out.println("La  de  " + val1 + " % " +  val2 +" = " +(val1 % val2) );
			}
		else if(operacion ==0) {
			System.exit(0);
			}
		teclado.close();
	}

}
