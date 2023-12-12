package reDo;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAlumno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Alumno> arrAlum= new ArrayList<Alumno>();
		int opcion;

		do {
			System.out.println("   -----------------   ");
			System.out.println("1.Matricular alumno/a/s:");

			System.out.println("Elige una opcion :");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				//
				matricularAlumno(arrAlum,sc);

				break;
			case 2:
				//
				break;
			case 3:
				//
				break;
			case 4:
				//
				break;
			case 5:
				//
				break;
			case 6:
				//
				break;
			default:
				//
				break;
			}// switch

		} while (opcion != 24);

	}// main
	//case 1
	public static void matricularAlumno(ArrayList<Alumno> arr,Scanner sc) {
		String nif,nombre,apellido,ciclo;
		String nomModulo,opcion;
		boolean repetidor;
		boolean modNoExist=true;
		boolean nifNoExist=true;
		Modulo m;
		ArrayList<Modulo> arrMod= new ArrayList<Modulo>();
		System.out.println("Introduzca el NIF :");
		nif=sc.next();
		for(Alumno a : arr) {
			if(a.getNif().equalsIgnoreCase(nif)) {
				nifNoExist=false;
			}
		}
		
		if(nifNoExist) {
			//add
			System.out.println("Introduzca el NIF :");
			nif=sc.next();
			
			System.out.println("Introduzca el nombre :");
			nombre=sc.next();
			
			System.out.println("Introduzca el apellido :");
			apellido=sc.next();
			
			System.out.println("Introduzca el ciclo :");
			ciclo=sc.next();
			
			System.out.println("Introduzca el repetidor :");
			repetidor=sc.nextBoolean();
			
			do {
				System.out.println("Queres añadir modulo :");
				opcion= sc.next();
				if(opcion.equalsIgnoreCase("si")) {
					System.out.println("Introduzca un Modulo :");
					nomModulo=sc.next();
					for(Alumno a:arr) {
						for(Modulo mod: a.getArrMod()) {
							if(mod.getNombre().equalsIgnoreCase(nomModulo)) {
								modNoExist=false;
							}
						}
					}
					if(modNoExist) {
						m= new Modulo(nomModulo);
						arrMod.add(m);
					} else {
						System.out.println(" este modulo ya existe..");
					}
				}
			
			
			}while(opcion.equalsIgnoreCase("si"));
		}else {
			System.out.println(" Nif  ya existe..");
		}
	}
	
	
}// class
