package ud1;

import java.util.Scanner;

public class EjercicioBucles08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	
//		
//		
//	

		Scanner sc = new Scanner(System.in);
		int opcion;
		String respuesta;
		
		
		do {
			System.out.println("Tienda de libros");
			System.out.println("1.- Comprar libro");
			System.out.println("2.- Comprobar si hay stock");
			System.out.println("3.- Salir del programa");
			opcion=sc.nextInt();
		}while(opcion>3 || opcion <1 );
		
		//
		double precio1,precio2;

		String libro="Tiburón";
		switch(opcion) {
			case 1: 
				System.out.println("**Comprar libro** ");

				do {
					
				do {
					System.out.println("Inserta el primer precio: ");
					precio1=sc.nextDouble();
				}while(precio1<0);
			
				do {
					System.out.println("Inserta el segundo precio: ");
					precio2=sc.nextDouble();
				}while(precio2<0);
				
				
				System.out.println("Total: " +( precio1 + precio2) + " Euros" );
				System.out.println("¿Quieres salir del programa? SI / NO ");
				respuesta=sc.next();
				}while(respuesta.equals("NO") || respuesta.equals("no"));
				
				System.exit(0);
				System.out.println("TERMINAR PROGRAM ....");
				break;
				
			case 2: 
				System.out.println("**Comprobar si hay stock** ");
			
				do {
					System.out.println("Inserta el nombre del libro: ");
					libro=sc.next();
					if(libro.toUpperCase() != "Tiburón") {
						System.out.println("Ese libro no está disponible.");
					}else {
						System.out.println("Ese libro está disponible.");
					}
				
					System.out.println("¿Quieres salir del programa? SI / NO ");
					respuesta=sc.next();
					respuesta.toUpperCase();
					}while(respuesta.equals("NO"));
				
					System.out.println("TERMINAR PROGRAM ....");
					System.exit(0);
					
				
				break;
				
			case 3: 
				System.out.println("TERMINAR PROGRAM ....");
				System.exit(0);
				break;
			default :
				System.out.println("ERROR");
		}
		

		
		sc.close();
	}

}
