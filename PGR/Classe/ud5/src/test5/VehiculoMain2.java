package test5;

import java.util.Scanner;

public class VehiculoMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coche2 cocheArr[] = new Coche2[50];
		Furgoneta2 furgoArr[] = new Furgoneta2[50];

		int opcion;
		int cocheSize;
		int FurgSize;

		do {
			System.out.println("**************");
			System.out.println(
					"Introducir un nuevo vehículo (antes de pedir los datos se preguntará si se va a introducir un coche o\r\n"
							+ "una furgoneta, que se manejaran en listas separadas).");
			System.out.println("2.Listar los datos de los coches que sean descapotables.");
			System.out.println("3.Listar aquellos coches que sean de una determinada marca.");
			System.out.println("4.Listar los coches que sean de cualquiera de dos colores por teclado.");
			System.out.println("5.Sacar la media de los centímetros cúbicos de los coches.");
			System.out.println("6.Listado de los coches ordenados por sus caballos en descendente.");
			System.out.println("7.Suma del precio total de los coches que tenemos hasta el momento.");
			System.out.println("8.Modificar el precio a un coche concreto a partir de su matrícula.");
			System.out.println("9.Resumen por colores (color/nº coches). Vamos a suponer que hay 15 posibles colores.");
			System.out.println("10.Borrar un coche a partir de su matrícula.");
			System.out.println("11.Mostrar los coches con cilindrada (centímetros cúbicos) igual o mayor .");
			System.out.println("12.a .");
			System.out.println("13.a .");
			System.out.println("14.Ordenar los coches por su matrícula y mostrarlos.");
			System.out.println("15.Salir.");
			System.out.println("Que queres hacer");

			cocheSize = estallenoCoches(cocheArr);
			FurgSize = estallenoCoches(cocheArr);

			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				//
				introducirVehiculo(cocheArr,furgoArr,FurgSize,cocheSize,sc);

			case 2:
				//Listar los datos de los coches que sean descapotables.
				//listarCochesDeca();
				
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
			case 7:
				//
				break;
			case 8:
				//
				break;
			case 9:
				//
				break;
			case 10:
				//
				break;

			default:
				//
				break;
			}

		} while (opcion != 10);// menu

	}// main

	public static int estallenoCoches(Coche2 arr[]) {
		int pos = -1;
		boolean notEmpty = true;
		int i = 0;
		while (notEmpty && i < arr.length) {
			if (arr[i] == null) {
				notEmpty = false;
				pos = i;
			}
			i++;
		}
		if (pos == -1) {
			return arr.length;
		} else {
			return pos;
		}
	}

	public static void introducirVehiculo(Coche2 arrC[], Furgoneta2 arrF[], int posF, int posC, Scanner sc) {
		int miOpcion;
		int foundPos;

		String matricula;
		String marca;
		String modelo;
		boolean esDescapotable;
		int anosAntiguedad;
		double precioPorDia;
		double altura;
		int tara;

		do {
			System.out.println("Que queris hacer :");
			System.out.println("1. introducir un coche");
			System.out.println("2. introducir una furgoneta");
			miOpcion = sc.nextInt();
		} while (miOpcion > 2 || miOpcion < 1);
		if (miOpcion == 1) {
			// 1. introducir un coche
			System.out.println("Introduce la matricula del coche :");
			matricula = sc.next();
			foundPos = buscarMatriculaCoche(arrC, posC, matricula);
			if (foundPos == -1) {

				System.out.println("LA matricula ya existe ");
				System.out.println("Introduce la marca del coche :");
				marca = sc.next();

				System.out.println("Introduce la modelo del coche :");
				modelo = sc.next();

				System.out.println("Introduce anos Antiguedad del coche :");
				anosAntiguedad = sc.nextInt();

				System.out.println("Introduce anos Antiguedad del coche :");
				precioPorDia = sc.nextDouble();

				System.out.println("Introduce es descapotablel coche :");
				esDescapotable = sc.nextBoolean();
				arrC[posC] = new Coche2(matricula, marca, modelo, anosAntiguedad, precioPorDia, esDescapotable);

			} else {
				System.out.println("la coche ya existe :");
			}

		} else if (miOpcion == 1) {
			// 2. introducir un farguneta
			System.out.println("Introduce la matricula del la fargoneta :");
			matricula = sc.next();
			foundPos = buscarMatriculaFarguneta(arrF, posF, matricula);
			if (foundPos == -1) {

				System.out.println("Introduce la marca del fargoneta :");
				marca = sc.next();

				System.out.println("Introduce la modelo del fargoneta :");
				modelo = sc.next();

				System.out.println("Introduce anos Antiguedad del fargoneta :");
				anosAntiguedad = sc.nextInt();

				System.out.println("Introduce anos Antiguedad del fargoneta :");
				precioPorDia = sc.nextDouble();

				System.out.println("Introduce  altura fargoneta :");
				altura = sc.nextDouble();

				System.out.println("Introduce  tara fargoneta :");
				tara = sc.nextInt();

				arrF[posF] = new Furgoneta2(matricula, marca, modelo, anosAntiguedad, precioPorDia, altura, tara);

			} else {
				System.out.println("la coche ya existe :");
			}
		}

	}

	public static int buscarMatriculaCoche(Coche2 arr[], int size, String matri) {
		boolean notFound = true;
		int foundPos = -1;
		int i = 0;

		while (notFound && i < size) {
			if (arr[i].getMatricula().equalsIgnoreCase(matri)) {
				notFound = false;
				foundPos = i;
			}
			i++;
		}
		return foundPos;
	}

	public static int buscarMatriculaFarguneta(Furgoneta2 arr[], int size, String matri) {
		boolean notFound = true;
		int foundPos = -1;
		int i = 0;

		while (notFound && i < size) {
			if (arr[i].getMatricula().equalsIgnoreCase(matri)) {
				notFound = false;
				foundPos = i;
			}
			i++;
		}
		return foundPos;
	}
	public static void listarCochesDeca(Coche2 arr[]) {
		for(int i=0;i<arr.length ; ) {
			if(arr[i].isDescapotable()==true) {
				System.out.println(arr[i]);
			}
		}
	}

}// class
