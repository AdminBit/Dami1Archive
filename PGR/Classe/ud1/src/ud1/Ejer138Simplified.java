package ud1;

import java.util.Scanner;

public class Ejer138Simplified {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Realiza la clase Java Suelneto que lee por teclado sueldos
//		brutos anuales de trabajadores hasta que se lee un sueldo con valor negativo 
//		y calcula el sueldo neto de esos sueldos brutos teniendo en cuenta
//		que, por cada 150.00 que se supere 1000.00, se debe descontar un 1%,
//		con un máximo del 56%. Por
//		ejemplo, si el sueldo bruto es de 1330.00 el sueldo neto será un 3% menor.
		
		int sueldo; 
		int sueldoNeto;

		Scanner teclado=new Scanner(System.in);
		do {
			System.out.println("Inroduce tus sueldos brutos : ");
			sueldo=teclado.nextInt();
			if(sueldo>0) {
				sueldoNeto=sueldo - sueldo * 3/100;
				System.out.println("tu sueldo : " + sueldoNeto);
			}
			
			}while(sueldo > 0);
				System.out.println("ERROR el sueldo no puede ser negativo");

			teclado.close();

	}
}
	

