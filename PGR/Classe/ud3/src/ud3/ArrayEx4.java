package ud3;

import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Teniendo un array de nombre y otro de edades de una clase. Sacar por
		//pantalla los siguientes datos:
		//Alumnos:
		//Edad: 18,20,26,21,17,24
		//
		//
		Scanner sc = new Scanner(System.in);
		String nombre[]= { "Jon", "Sara", "Ander", "Marta", "Jone", "Mikel"};
		int edad []= {18,20,26,21,17,24};
		int opcion ;
		int masJoven;
		int mayor;
		
		
		do {
			 masJoven=100;
			 mayor=0;
				System.out.println("1. El nombre y edad del más joven.");
				System.out.println("2. El nombre y edad del mayor.");
				System.out.println("3. salir");
			

			opcion=sc.nextInt();
			
			switch(opcion) {
					case 1:
						//1. El nombre y edad del más joven.
						int k=-1;
						for(int i=0;i<edad.length ;i++) {
							if(	edad[i]< masJoven) {
								masJoven=edad[i];
								k=i;
							}
						}
						System.out.println("El nombre del más joven es " +nombre[k]+ " edad : "+edad[k]);

					break;
					
					case 2: 
						int t=-1;
						for(int i=0;i<edad.length ;i++) {
							if(	edad[i]> mayor) {
								mayor=edad[i];
								t=i;
							}
						}
						System.out.println("El nombre del mayor es " +nombre[t]+ "su edad : "+edad[t]);

						break;
						
					default:
						System.out.println("ERROR no existe");
						break;
			
			}
			
			
			
		}while (opcion !=3);
		
		
		
		sc.close();
		
	}// main

}
