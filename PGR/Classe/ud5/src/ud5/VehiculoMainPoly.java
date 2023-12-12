package ud5;

import java.util.Scanner;

public class VehiculoMainPoly {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Vehiculo arrVeh[] = new Vehiculo[10];

		int opcion;
		int vehiculoSize;

		arrVeh[0] = new Coche("a111", "audi", "a1", 5, 11000, true);
		arrVeh[2] = new Coche("a115", "seat", "s2", 4, 9000, false);
		arrVeh[4] = new Coche("a113", "audi", "a3", 4, 10000, true);
		arrVeh[6] = new Coche("a114", "seat", "s1", 1, 8000, false);
		arrVeh[8] = new Coche("a104", "seat", "s1", 1, 5000, true);

		arrVeh[1] = new Furgoneta("a112", "audi", "a2", 2, 15000, 150, 2000);
		arrVeh[3] = new Furgoneta("a110", "seat", "s4", 1, 14000, 150, 1000);
		arrVeh[5] = new Furgoneta("a109", "audi", "a4", 3, 16000, 150, 3000);
		arrVeh[7] = new Furgoneta("a108", "seat", "s3", 5, 17000, 150, 500);

		do {
			System.out.println("**************");
			System.out.println(
					"Introducir un nuevo vehículo (antes de pedir los datos se preguntará si se va a introducir un coche o\r\n"
							+ "una furgoneta, que se manejaran en listas separadas).");
			System.out.println("2.Listar los datos de los coches que sean descapotables.");
			System.out.println(
					"3.Pedir una tara al usuario y listar las furgonetas con una tara menor a la introducida..");
			System.out.println("4.Pedir una nueva carga y modificarla para todas las furgonetas.");
			System.out.println("5.Mostrar los datos de la furgoneta más antigua y más nueva.");
			System.out.println("6.Listado de los coches ordenados por sus caballos en descendente.");
			System.out.println("7. Ordenar el listado de furgonetas por tara y mostrarlo");
			System.out.println("8.Modificar el precio a un coche concreto a partir de su matrícula.");
			System.out.println("9.Resumen por colores (color/nº coches). Vamos a suponer que hay 15 posibles colores.");
			System.out.println("10.Salir");

			System.out.println("Que queres hacer");

			vehiculoSize = estaLlenoVehiculo(arrVeh);

			opcion = sc.nextInt();
			System.out.println("Size : "+vehiculoSize);
			switch (opcion) {
			case 1:
				// 1. Introducir un nuevo vehículo (antes de pedir los datos se preguntará si se
				// va a introducir un coche o
				// una furgoneta, que se manejaran en listas separadas).
				if (vehiculoSize == arrVeh.length) {
					System.out.println("esta lleno no hay espacio");
				} else {
					introducirVehiculo(arrVeh, vehiculoSize, sc);
				}
				break;
			case 2:
				// 2 Listar los datos de los coches que sean descapotables.
				listarCochesDeca(arrVeh, vehiculoSize);
				break;
			case 3:
				// Pedir una tara al usuario y listar las furgonetas con una tara menor a la
				// introducida.
				listarFargoDeTara(arrVeh, vehiculoSize, sc);
				break;
			case 4:
				// 4. Pedir una nueva carga y modificarla para todas las furgonetas. [0.75 ptos]
				nuevaCarga(sc);
				break;
			case 5:
				// Mostrar los datos de la furgoneta más antigua y más nueva
				mostrarFurgonetasAntiguas(arrVeh, vehiculoSize);
				break;
			case 6:
				// 6. Mostrar la antigüedad media de los coches, de las furgonetas y de los
				// vehículos. [1 pto]
				antiguedadMedia(arrVeh, vehiculoSize);
				break;
			case 7:
				// 7. Ordenar el listado de furgonetas por tara y mostrarlo
				 ordenarFurgoTara(arrVeh, vehiculoSize);
				break;
			case 8:
				// 8. Listar todos los vehículos ordenados por matrícula
				vehiculosOrdenadosPorMatricula(arrVeh, vehiculoSize);
				break;
			case 9:
				// 9. Introducir una matrícula y borrar dicho vehículo.
				 borrarVehiculoPorMatricula(arrVeh, vehiculoSize, sc);
				break;
			case 10:
				// salir
				System.out.println(" Hasta pronto ..!");
				break;

			default:
				//
				System.out.println("Opcion no existe ");
				break;
			}

		} while (opcion != 10);// menu

	}// main

	public static int estaLlenoVehiculo(Vehiculo arr[]) {
		boolean notFound = true;
		int i = 0;
		while (notFound && i < arr.length) {
			if (arr[i] == null) {
				notFound = false;
			} else {
				i++;
			}
		}
		return i;
	}

	// 1. Introducir un nuevo vehículo (antes de pedir los datos se preguntará si se
	// va a introducir un coche o
	// una furgoneta, que se manejaran en listas separadas).
	public static void introducirVehiculo(Vehiculo arr[], int size, Scanner sc) {
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

			foundPos = buscarMatricula(arr, size, matricula);

			if (foundPos == -1) {
				System.out.println("Introduce la marca del coche :");
				marca = sc.next();

				System.out.println("Introduce la modelo del coche :");
				modelo = sc.next();

				System.out.println("Introduce anos Antiguedad del coche :");
				anosAntiguedad = sc.nextInt();

				System.out.println("Introduce anos Precio del coche :");
				precioPorDia = sc.nextDouble();

				System.out.println("Introduce es descapotablel coche :");
				esDescapotable = sc.nextBoolean();
				arr[size] = new Coche(matricula, marca, modelo, anosAntiguedad, precioPorDia, esDescapotable);

			} else {
				System.out.println("la coche ya existe :");
			}

		} else if (miOpcion == 1) {
			// 2. introducir un farguneta
			System.out.println("Introduce la matricula del la fargoneta :");
			matricula = sc.next();
			foundPos = buscarMatricula(arr, size, matricula);
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

				arr[size] = new Furgoneta(matricula, marca, modelo, anosAntiguedad, precioPorDia, altura, tara);

			} else {
				System.out.println("la furgoneta ya existe :");
			}
		}
	}

	public static int buscarMatricula(Vehiculo arr[], int size, String matri) {
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

	public static int buscarMatriculaFarguneta(Furgoneta arr[], int size, String matri) {
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

	// if (((Piano) instrumento1).isCola()){
	// instrumento1.getDatos();
	// }

	public static void listarCochesDeca(Vehiculo arr[], int size) {
		for (int i = 0; i < size; i++) {
			if (arr[i] instanceof Coche) {
				if (((Coche) arr[i]).isDescapotable()) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	public static void listarFargoDeTara(Vehiculo arr[], int size, Scanner sc) {
		int tara;

		System.out.println("Introduce tara del furgoneta :");
		tara = sc.nextInt();

		for (int i = 0; i < size; i++) {
			if (arr[i] instanceof Furgoneta) {
				if (((Furgoneta) (arr[i])).getTara() <= tara) {
					System.out.println(arr[i]);
				}

			}
		}
	}

	// 4. Pedir una nueva carga y modificarla para todas las furgonetas. [0.75 ptos]
	public static void nuevaCarga(Scanner sc) {
		int carga;

		System.out.println("Introduce nueva carga del furgoneta :");
		carga = sc.nextInt();
		Furgoneta.setCarga(carga);
	}

	// Mostrar los datos de la furgoneta más antigua y más nueva
	public static void mostrarFurgonetasAntiguas(Vehiculo arr[], int size) {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[j].getAnosAntiguedad() > arr[i].getAnosAntiguedad()) {
					int temp;
					temp = arr[j].getAnosAntiguedad();
					arr[j].setAnosAntiguedad(arr[i].getAnosAntiguedad());
					arr[i].setAnosAntiguedad(temp);
				}
			}

		}
		for (int k = 0; k < size; k++) {
			System.out.println(arr[k]);
		}
	}

	// 6. Mostrar la antigüedad media de los coches, de las furgonetas y de los
	// vehículos. [1 pto]
	public static void antiguedadMedia(Vehiculo arr[], int size) {
		double sumac = 0;
		int countC=0;
		
		double sumaf = 0;
		int countF=0;

		double sumav = 0;
		
		for (int i = 0; i < size; i++) {
			sumac += ((Coche)arr[i]).getAnosAntiguedad();
			countC++;
		}
		
		for (int i = 0; i < size; i++) {
			sumaf += ((Furgoneta)(arr[i])).getAnosAntiguedad();
		}
		
		sumav = sumac + sumaf;
		System.out.println("Antiguedad media de coches es : " + (sumac / countC));
		System.out.println("Antiguedad media de Furgonetas es : " + (sumaf / countF));
		System.out.println("Antiguedad media de vehiculos es : " + (sumav / (countC + countF)));
	}

	// 7. Ordenar el listado de furgonetas por tara y mostrarlo
	public static void ordenarFurgoTara(Vehiculo arr[], int size) {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (((Furgoneta)arr[i]).getTara() > ((Furgoneta)arr[j]).getTara()) {
					double temp;
					temp = ((Furgoneta)arr[j]).getTara();
					((Furgoneta)arr[j]).setTara(((Furgoneta)arr[i]).getTara());
					((Furgoneta)arr[i]).setTara(temp);
				}
			}
		}
		for (int k = 0; k < size; k++) {
			System.out.println(arr[k]);
		}
	}

	// 8. Listar todos los vehículos ordenados por matrícula.
	public static void vehiculosOrdenadosPorMatricula(Vehiculo arr[], int size) {

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[j].getMatricula().compareToIgnoreCase(arr[i].getMatricula()) < 0) {
					String temp;
					temp = arr[j].getMatricula();
					arr[j].setMatricula(arr[i].getMatricula());
					arr[i].setMatricula(temp);
				}
			}
		}
		mostrarVehiculo(arr);
	}

	public static void mostrarVehiculo(Vehiculo v[]) {

		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}

	// 9. Introducir una matrícula y borrar dicho vehículo.
	public static void borrarVehiculoPorMatricula(Vehiculo arr[], int size, Scanner sc) {
		String matricula;
		int foundPos;
	

		System.out.println("Introduce la matricula del vegiculo queries borrar:");
		matricula = sc.next();

		foundPos = buscarMatricula(arr, size, matricula);

		if (foundPos == -1) {
			System.out.println("No existe");
		}else {
			if (foundPos == size) {
				arr[foundPos] = null;
				System.out.println("borrado");
			} else {
				for (int i = foundPos; i < size - 1; i++) {
					arr[i] = arr[i + 1];
				}
				arr[size - 1] = null;

				System.out.println("borrado");
			}

			for (int i = 0; i < size - 1; i++) {
				System.out.println(arr[i]);
			}
		}
	}

}// class
