package ud1;

import java.util.Scanner;

public class Ejer138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Realiza la clase Java Suelneto que lee por teclado sueldos
//		brutos anuales de trabajadores hasta que se lee un sueldo con valor negativo 
//		y calcula el sueldo neto de esos sueldos brutos teniendo en cuenta
//		que, por cada 150.00 que se supere 1000.00, se debe descontar un 1%,
//		con un máximo del 56%. Por
//		ejemplo, si el sueldo bruto es de 1330.00 el sueldo neto será un 3% menor.
		
		double sueldo;
		int porcentaje;
		double sobreMile;
		Scanner teclado=new Scanner(System.in);

		sueldo=1;
		while(sueldo>-1) {
			System.out.println("tu sueldo bruto es : ");
			sueldo=teclado.nextDouble();
			if(sueldo>1000) {
				sobreMile=sueldo-1000;
				porcentaje=((int)(sobreMile/150));
				
				if(porcentaje >= 56) {
					System.out.println("tu sueldo bruto es : " + sueldo +
											" porcentaje sera " + 65/100 + " neto ser  "
																+(sueldo - 0.56*sueldo));
				}else if(porcentaje >1) {
					System.out.println("tu sueldo bruto es : " + sueldo +
							" porcentaje sera " + porcentaje + " neto ser  "
												+(sueldo - ((double)(porcentaje)/100*sueldo)));
				}
				else {
					System.out.println("el bruto sera neto " + sueldo );}

				}
			}
		teclado.close();

			
		}
		
		



	}


