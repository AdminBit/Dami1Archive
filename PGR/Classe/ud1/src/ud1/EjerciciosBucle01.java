package ud1;

import java.util.Scanner;

public class EjerciciosBucle01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int nFact;
		int numeroDigi;
		double nota1,notaTotal=0;
		
		System.out.println("\n\n**********Ejercicio 01 *******");

		int i=5; 
		
		while(i<15)	{
		System.out.println(i);
		i++;
		}
		System.out.println("\n\n**********Ejercicio 02 *******");
		
		for(int j=200;j<=300 ;j++) {
			System.out.println(j);
		}
		
		System.out.println("\n\n**********Ejercicio 03 *******");

	
		int n=0;
		for(int k=0;k<=1000 ;k++) {
			
			if(k%2==0) {
				System.out.println(k);
				n=n+1;
				if(n==5) {
					break;
				}
			}
		}
		System.out.println("\n\n**********Ejercicio 04 *******");
		// factorial
		
		
		System.out.println("Introduce un Numero ");
		nFact=sc.nextInt();
		int fact=1;
		for(int z=nFact;z>1; z-- ) {
			fact=z*fact;
		}
		System.out.println("factorial de "  +nFact + " es : " + fact);

		
		
		System.out.println("\n\n**********Ejercicio 05 *******");
		
		
		System.out.println("Introduce un Numero entero ");
			numeroDigi=sc.nextInt();
			int intermedario=numeroDigi;
			int count =1; 
				while(intermedario>10) {
					intermedario=intermedario/10;
					count++;
				}
		System.out.println("Introduce un Numero entero "+ numeroDigi + " tiene " + count +" digitos");

				
		System.out.println("\n\n**********Ejercicio 06 *******");
		int aprobadCounter=0;
		for(int m=0;m<3 ;m++ ){
			do {
				System.out.println("Introduce la nota de asignatura  " + (m+1) +" : ");
				nota1=sc.nextDouble();
				if(!(nota1 >10 || nota1 <0 ) && nota1>=5) {
					aprobadCounter++;
				}
				}while(nota1 >10 || nota1 <0);
			notaTotal=notaTotal+nota1;

		}
			
		System.out.println("la nota media : " + (notaTotal)/3);
		System.out.println("APROBADA : " + aprobadCounter + " Asignaturas ");
		System.out.println("suspendido : " +(3- aprobadCounter) +" Asignaturas ");

		System.out.println("\n\n**********Ejercicio 07 *******");


		
				
				
				
				
		System.out.println("\n\n**********Ejercicio 08 *******");
		
		char opcionMenu1;
		int opcion;
		do {
			System.out.println("**********Menu *******");
			System.out.println("1. Operaciones básicas");
			System.out.println("2. Operaciones complejas");
			System.out.println("3. Terminar programa");

			opcion=sc.nextInt();
			switch(opcion) {
			case 1 :
				do {
				opcionMenu1=sc.next().charAt(0);
				System.out.println("**Operaciones básicas**");
				System.out.println("a. Suma");
				System.out.println("b. Resta");
				System.out.println("c. Multiplicación");
				System.out.println("d. División");
				}while(opcionMenu1!='a' || opcionMenu1!='b' );
				
//				
//				
//				
				break; 
			case 2 :
				System.out.println("**Operaciones básicas**");
				System.out.println("a. Potencias");
				System.out.println("b. Raíz cuadrada");
				
				break; 
			case 3 :
				//3. Terminar programa

				// 
				break; 
				default:
					//
					System.out.println("ERROR OPCION NO EXISTE");
			}
		}while(opcion>3 || opcion<1);
			

			sc.close();	
				
		}

}
