package ud1;

import java.util.Scanner;

public class Ejercico28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		int cantidad ;
		

		Scanner teclado=new Scanner(System.in);
		
		System.out.println("La cantidad  : ");
		cantidad=teclado.nextInt();
		
		if(cantidad > 100 ) {
			System.out.println("el descuento es 40% " );
			}
		else if(cantidad >25 && cantidad <=100){
			System.out.println("el descuento es 20% " );
		}
		else if(cantidad >10 && cantidad <=25){
			System.out.println("el descuento es 10% " );
		}
		
		else if(cantidad <=10){
			System.out.println("el descuento es 0% " );
		}
		teclado.close();
	}

}
