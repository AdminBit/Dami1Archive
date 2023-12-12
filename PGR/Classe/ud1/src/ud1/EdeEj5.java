package ud1;

import java.util.Scanner;

public class EdeEj5 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);

		int limitInfer;
		int limiteSuper;
		int oportunidades;
		int diferencia;
		int numazar;
		int miAdvina;
		
	
		System.out.println("Introduce el limite inferior:");
		limitInfer = sc.nextInt();
		
		System.out.println("Introduce el limite superior:");
		limiteSuper = sc.nextInt();
		if(limitInfer > limiteSuper) {
			System.out.println("El limite inferior es mayor que el superior.");
			diferencia = limiteSuper - limitInfer * (-1);
		}
		else {
			diferencia = limiteSuper - limitInfer ;
		}
		
		
		
		 numazar = (int) ((Math.random() * (limiteSuper - limitInfer)) + limitInfer);

		System.out.println(numazar);
		System.out.println("*****");
		
		if((diferencia) <= 10) {
			oportunidades=3;
			
			do {
				System.out.println("Adivina el numero :");
				System.out.println("Tienes " + oportunidades + " oportunidades");

				miAdvina=sc.nextInt();
				
					if(miAdvina>numazar) {
						System.out.println("El codigo secreto es MENOR");
					}else if(miAdvina<numazar) {
						System.out.println("El codigo secreto es MAYOR");
					}	else if(miAdvina==numazar){
						System.out.println("Lo has conseguido, te ha costado :"+oportunidades+ " oportunidades.");
					}
					
				oportunidades--;
			}while(miAdvina!=numazar && oportunidades>0 );
			
			if(miAdvina!=numazar) {
				System.out.println("Has perdido.");

			}
			
				
		}
		//
		if(diferencia > 10 && diferencia<=50) {
			oportunidades=5;
			
			do {
				System.out.println("Adivina el numero :");
				System.out.println("Tienes " + oportunidades + " oportunidades");

				miAdvina=sc.nextInt();
				
					if(miAdvina>numazar) {
						System.out.println("El codigo secreto es MENOR");
					}else if(miAdvina<numazar) {
						System.out.println("El codigo secreto es MAYOR");
					}	else if(miAdvina==numazar){
						System.out.println("Lo has conseguido, te ha costado :"+oportunidades+ " oportunidades.");
					}
					
				oportunidades--;
			}while(miAdvina!=numazar && oportunidades>0 );
			
			if(miAdvina!=numazar) {
				System.out.println("Has perdido.");

			}
			
				
		}
		//
		
		if(diferencia > 50) {
			oportunidades=8;
			
			do {
				System.out.println("Adivina el numero :");
				System.out.println("Tienes " + oportunidades + " oportunidades");

				miAdvina=sc.nextInt();
				
					if(miAdvina>numazar) {
						System.out.println("El codigo secreto es MENOR" );
					}else if(miAdvina<numazar) {
						System.out.println("El codigo secreto es MAYOR");
					}	else if(miAdvina==numazar){
						System.out.println("Lo has conseguido, te ha costado :"+oportunidades+ " oportunidades.");
					}
					
				oportunidades--;
			}while(miAdvina!=numazar && oportunidades>0 );
			
			if(miAdvina!=numazar) {
				
				System.out.println("Has perdido.");

			}
			
				
		}
		
		sc.close();
		
	}//main

}//class
