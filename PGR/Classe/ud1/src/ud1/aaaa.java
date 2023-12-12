package ud1;

import java.util.Scanner;

public class aaaa {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		char operacion;//variable que se usa para el menu.
		
		String salir="No";
		do {
			System.out.println("Introduzca numero 1");
			num1 = sc.nextInt();
		} while (num1 < 0);//pide el numero que el usuario ponga, hasta que este numero sea positivo.
		do {
			System.out.println("Introduzca numero 2");
			num2 = sc.nextInt();
		} while (num2 < 0);//pide el numero que el usuario ponga, hasta que este numero sea positivo.

		do {//este do while hace que el menu y todas las funciones del switch se repitan.
			System.out.println("------MENU---------------------");
			System.out.println("a) Suma");
			System.out.println("b) Resta");
			System.out.println("c) Multiplicacion");
			System.out.println("d)Dividir");
			System.out.println("e) Elevar el primer Nº al segundo");
			System.out.println("f) Solicitar otros numeros");
			System.out.println("s)Salir del programa");
			System.out.print("Seleccione una opcion:");
			operacion = sc.next().charAt(0);
			
			switch (operacion) {
			case 'a'://Hace la suma.
				System.out.println("" + num1 + "+" + num2 + "=" + (num1 + num2) + "");
				break;
			case 'b'://Hace la resta siempre y cuando el resultado de este de positivo, si no se le pide que escribe el num2 de nuevo(Esto hace que el menu se repita y remplaze el num2 puesto hal inicio).
				if ((num1-num2) >= 0) {
					System.out.println("" + num1 + "-" + num2 + "=" + (num1 - num2) + "");
				} else {

				do{
					System.out.println("el resultado en negativo introduzca otros numeros");
					System.out.println("Introduzca otro numero 2");
					num2 = sc.nextInt();
				}while(num1<num2); 	
				System.out.println("" + num1 + "-" + num2 + "=" + (num1 - num2) + "");
				}
				break;
			case 'c'://hace la multiplicacion
				System.out.println("" + num1 + "*" + num2 + "=" + (num1 * num2) + "");
				break;
			case 'd'://Hace la division siempre que el num2 no sea 0, en caso de que lo sea se le pide otro num2(Funciona igual que en la resta).
				if (num2 != 0) {
					System.out.println("" + num1 + "/" + num2 + "=" + (num1 / num2) + "");
				} else {
					do {
					System.out.println("no se puede dividir entre 0 introduzca otros numeros");
					System.out.println("Introduzca otro numero 2");
					num2 = sc.nextInt();
					}while(num2==0);
				}
				break;
			case 'e'://Eleva el num1 a 2.
				System.out.println("" + num1 + " elevado a 2 " + (num1 * num1) + "");
				break;
			case 'f'://Pide otros num1 y num2 para remplazar los anteriores.
				System.out.println("Introduzca otro numero 1");
				num1 = sc.nextInt();
				System.out.println("Introduzca otro numero 2");
				num2 = sc.nextInt();
				break;
			case 's'://Cierra el programa.
				System.exit(0);

			default://En caso de que no se use ninguna de las letras usadas en el menu dara error.
				System.out.println("error");
				
				System.out.println("Queries salir del programa (SI/No)");
				salir =  sc.next();
			}
			
		} while (salir.equalsIgnoreCase("no"));
		sc.close();
	}

}