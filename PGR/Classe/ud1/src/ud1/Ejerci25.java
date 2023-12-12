package ud1;

import java.util.Scanner;

public class Ejerci25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sueldo ;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("la cantidad  : ");
		sueldo=teclado.nextInt();

		if(sueldo > 2000 ) {
				System.out.println("la retencion es 18% su sueldo sera :"+(sueldo - (sueldo * 18 / 100)) );
			}
		else if(sueldo == 2000 ) {
			System.out.println("la retencion es 16% su sueldo sera :"+(sueldo - (sueldo * 16 / 100)) );
		}
		else if(sueldo < 2000 && sueldo >1000) {
			System.out.println("la retencion es 14% su sueldo sera :"+(sueldo - (sueldo * 14 / 100)) );
		}
		else if(sueldo==1000) {
			System.out.println("la retencion es 12% su sueldo sera :"+(sueldo - (sueldo * 12 / 100)) );
		}
		else  {
			System.out.println("la retencion es 10% su sueldo sera :"+(sueldo - (sueldo * 10 / 100)) );
		}
		teclado.close();


	}

}
