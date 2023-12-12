package ud1;

import java.util.Scanner;

public class EjercicioBucles07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int opcion;
		
		double numero1,numero2;

		char opcionMenu1;
		char opcionMenu2;

		do {
			System.out.println("**********Menu *******");
			System.out.println("1. Operaciones básicas");
			System.out.println("2. Operaciones complejas");
			System.out.println("3. Terminar programa");

			opcion=sc.nextInt();
			switch(opcion) {
			case 1 :
				do {
				System.out.println("**Operaciones básicas**");
				System.out.println("a. Suma");
				System.out.println("b. Resta");
				System.out.println("c. Multiplicación");
				System.out.println("d. División");			
				opcionMenu1=sc.next().charAt(0);

				}while(opcionMenu1!='a' && opcionMenu1!='b' && opcionMenu1!='c'&& opcionMenu1!='d');
				
				switch(opcionMenu1){
					case 'a':
						System.out.println("*** La Suma ***");
						System.out.println("Introduce el numero n1 ");
						numero1=sc.nextDouble();
						System.out.println("Introduce el numero n2 ");
						numero2=sc.nextDouble();
						System.out.println("La suma de " + numero1 +" y "+ numero2 + " = "+ (numero1+numero2));
						System.exit(0);
						break;
					case 'b':
						System.out.println("*** La Resta ***");
						System.out.println("Introduce el numero n1 ");
						numero1=sc.nextDouble();
						System.out.println("Introduce el numero n2 ");
						numero2=sc.nextDouble();
						System.out.println("La Rest de " + numero1 +" y "+ numero2 + " = "+ (numero1-numero2));
						System.exit(0);
						break;
					case 'c':
						System.out.println("*** La Multiplicación ***");
						System.out.println("Introduce el numero n1 ");
						numero1=sc.nextDouble();
						System.out.println("Introduce el numero n2 ");
						numero2=sc.nextDouble();
						System.out.println("La Multiplicación de " + numero1 +" y "+ numero2 + " = "+ (numero1*numero2));
						System.exit(0);
						break;
					case 'd':
						System.out.println("*** La División ***");
						System.out.println("Introduce el numero n1 ");
						numero1=sc.nextDouble();
						do {
							System.out.println("Introduce el numero n2 ");
							numero2=sc.nextDouble();
							if(numero2==0) {
								System.out.println(" el num 2 NO puded ser : 0 ");
							}
						}while(numero2==0);
						System.out.println("La División de " + numero1 +" y "+ numero2 + " = "+ (numero1/numero2));
						System.exit(0);
						break;
						default:
							System.err.println("ERROR OPCIN no Exist");
				}
			
				break; // case 1 menu 1
			case 2 :
				do {

					System.out.println("**Operaciones básicas**");
					System.out.println("a. Potencias");
					System.out.println("b. Raíz cuadrada");
					opcionMenu2=sc.next().charAt(0);
					
					}while(opcionMenu2!='a' || opcionMenu2!='b');

				switch(opcionMenu2){
					case 'a':
						System.out.println("*** Potencias ***");
						System.out.println("Introduce el numero n1 ");
						numero1=sc.nextDouble();
						System.out.println("Introduce el numero n2 ");
						numero2=sc.nextDouble();
						System.out.println("La suma de " + numero1 +" y "+ numero2 + " = "+ Math.pow(numero1, numero2));
						System.exit(0);
						break;
					case 'b':
						System.out.println("*** Raíz cuadrada ***");
						System.out.println("Introduce el numero n1 ");
						numero1=sc.nextDouble();
					
						System.out.println("La Raíz cuadrada  de " + numero1 + " = "+Math.sqrt(numero1));
						System.exit(0);
						break;
		
						}
				
				System.exit(0);
				break; 
			case 3 :
				
				System.exit(3);

				break; 
				default:
					//
					System.out.println("ERROR OPCION NO EXISTE");
			}
		}while(opcion>3 || opcion<1);
			

			sc.close();	
				
		}

	}


