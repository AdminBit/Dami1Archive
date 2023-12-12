package ud1;

import java.util.Scanner;

public class Ejer46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//, , , , , , , ,
		//, ,  y 
		
		char ch;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Elige el dia : ");
		System.out.println("\t E Enero");
		System.out.println("\t F Febrero ");
		System.out.println("\t M  marzo");
		System.out.println("\t A Abril");
		System.out.println("\t Y Mayo ");
		System.out.println("\t J Junio ");
		System.out.println("\t X Julio ");
		System.out.println("\t G Agosto  ");
		System.out.println("\t S Septiembre  ");
		System.out.println("\t O octubre  ");
		System.out.println("\t N Noviembre ");
		System.out.println("\t D Diciembre ");
	


		ch=teclado.nextLine().charAt(0);
		

		switch(ch) {
			case 'E':
			case 'e':
				System.out.println("1 " );
				break;
			case 'F' :
			case 'f':

				System.out.println("2" );
				break;
			case 'M' :
			case 'm':

				System.out.println("3"  );
				break;
			case 'A' :
			case 'a':

				System.out.println("4" );
				break;
			case 'Y' :
			case 'y':

				System.out.println("5" );
				break;
			case 'J' :			
			case 'j':

				System.out.println("6" );
				break;
			case 'X' :
			case 'x':

				System.out.println("7" );
				break;
			case 'G' :
			case 'g':

				System.out.println("8" );
				break;
			case 'S' :
			case 's':

				System.out.println("9" );
				break;
			case 'O' :
			case 'o':

				System.out.println("10" );
				break;
			case 'N' :
			case 'n':

				System.out.println("11" );
				break;
			case 'D' :
			case 'd':

				System.out.println("12" );
				break;
			default:
				System.out.println("ERROR");
	}

		teclado.close();

		

	}

}
