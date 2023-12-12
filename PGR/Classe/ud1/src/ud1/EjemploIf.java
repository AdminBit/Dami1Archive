package ud1;

import java.util.Scanner;

public class EjemploIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("el valor 1 : ");
		a=teclado.nextInt();
		
		System.out.println("el valor 2 : ");
		b=teclado.nextInt();

		if(a==b) {
				System.out.println("Buenas dias");
			}
		else if(a>b) {
			System.out.println("Hola");
		}
		else {
			System.out.println("Adios");
		}
		
		teclado.close();

	}

}
