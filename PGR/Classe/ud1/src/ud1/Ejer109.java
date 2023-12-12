package ud1;

import java.util.Scanner;

public class Ejer109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero,n=0;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Cual es tu nombre ? ");
		numero=teclado.nextInt();
		
			while(n<=numero) {
				if(n % 2 == 0) {
					System.out.print(n + "  ");
				}
				n++;
			}
			
			teclado.close();
	}

}
