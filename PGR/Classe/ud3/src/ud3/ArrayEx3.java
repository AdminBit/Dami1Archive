package ud3;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		String  arrMeses[]= {"enero","febrero","marzo","abril","mayo"};
		int arrLitros[]= {123, 333,180,211,90};
		
		String salir = "no";
		int opcion;
		int masLluvioso=0;
		do {

			System.out.println("1. Mostrar en cada mes cuantos litros han llovido.");
			System.out.println("2. Mostrar en pantalla el mes y los litros del mes más lluvioso.");
	
			do {
				System.out.println("Que quieres hacer ?");
				opcion = sc.nextInt();
			} while (opcion > 2 || opcion < 1);

			switch (opcion) {
			case 1:
				//1. Mostrar en cada mes cuantos litros han llovido.
				for(int i=0;i<arrLitros.length ;i++ ) {
					System.out.println("en el mes " + arrMeses[i]+" ha lluviado :  "+ arrLitros[i]);
				}
				break;
			case 2:
				//2. Mostrar en pantalla el mes y los litros del mes más lluvioso.
				
				int k=-1;
				
				for(int i=0;i<arrLitros.length ;i++ ) {
					if(arrLitros[i]> masLluvioso) {
						masLluvioso =arrLitros[i];
						k=i;
					}
				}
				System.out.println("El mes el mas lluvioso es  : " +arrMeses[k] + " letros son : "+  arrLitros[k]);

				break;
				
				default: 
					System.out.println("ERROR opcion no existe ");
					break;
				}
			
			}while(salir.equalsIgnoreCase("no"));


		
		
			sc.close();
		
	}//main

}
