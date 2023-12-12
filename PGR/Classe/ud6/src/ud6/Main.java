package ud6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		char opc;
		
		do {
			System.out.println("Que queres hacer :");
			opc=sc.next().charAt(0);
			
			System.out.println("Hola");
			
		}while(opc != 's');
		
		sc.close();
	}//main

}//class
