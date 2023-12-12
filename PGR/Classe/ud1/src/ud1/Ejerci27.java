package ud1;

import java.util.Scanner;

public class Ejerci27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota ;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("la nota  : ");
		nota=teclado.nextInt();

		if(nota >= 9&& nota <=10 ) {
				System.out.println("su nota es  :"+ nota + " CALIFICACION : SOBRE " );
			}
		else if(nota >=7 && nota <9 ) {
			System.out.println("su nota es  :"+ nota + " CALIFICACION : NOT " );
		}
		
		else if(nota >=6 && nota <7 ) {
			System.out.println("su nota es  :"+ nota + " CALIFICACION : BIEN " );
		}
		else if(nota >=5 && nota <6 ) {
			System.out.println("su nota es  :"+ nota + " CALIFICACION : SUF " );
		}
		else if(nota >=3 && nota <5 ) {
			System.out.println("su nota es  :"+ nota + " CALIFICACION : INS " );
		}
		else if(nota >=0 && nota <3 )
		{
			System.out.println("su nota es  :"+ nota + " CALIFICACION : MD " );
		}
		else {
			System.out.println("ERROR ESTE NOTA NO EXISTE " );

		}
		teclado.close();

	}

}
