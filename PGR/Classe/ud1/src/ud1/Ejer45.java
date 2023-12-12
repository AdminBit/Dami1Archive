package ud1;

import java.util.Scanner;

public class Ejer45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				char ch;
				
				Scanner teclado=new Scanner(System.in);
				
				System.out.println("Elige el dia : ");
				System.out.println("\t L  ");
				System.out.println("\t M  ");
				System.out.println("\t X  ");
				System.out.println("\t J ");
				System.out.println("\t V ");
				System.out.println("\t S ");
				System.out.println("\t D ");


				ch=teclado.nextLine().charAt(0);
				

				switch(ch) {
					case 'L':
					case 'l':
						System.out.println("Lunes " );
						break;
					case 'M' :
					case 'm':

						System.out.println("Martes" );
						break;
					case 'X' :
					case 'x':

						System.out.println("Miércoles"  );
						break;
					case 'J' :
					case 'j':

						System.out.println("Jueves" );
						break;
					case 'V' :
					case 'v':

						System.out.println("Viernes" );
						break;
					case 'S' :			
					case 's':

						System.out.println("Sábado" );
						break;
					case 'D' :
					case 'd':

						System.out.println("Domingo" );
						break;
					default:
						System.out.println("ERROR");
			}

				teclado.close();

				
			}

		

	}


