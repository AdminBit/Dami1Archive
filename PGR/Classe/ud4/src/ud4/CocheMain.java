package ud4;

import java.util.Scanner;

public class CocheMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coche arr[] = new Coche[10];

		int opcion;
		int size;
		// Coche(String matricula,String marca ,String color,
		// String modelo,double centiCubicos,int caballo,double precio)
		arr[0] = new Coche("mata", "mara", "colora", "modelb", 1, 1, 1000);
		arr[1] = new Coche("matz", "marb", "colorb", "modela", 2, 2, 1000);
		arr[2] = new Coche("matc", "marz", "colorc", "modelb", 3, 3, 3000);
		arr[3] = new Coche("maty", "mard", "colord", "modela", 4, 4, 5000);
		arr[4] = new Coche("mate", "mare", "colora", "modelc", 5, 5, 5000);
		arr[5] = new Coche("matf", "mara", "colora", "modela", 6, 6, 6000);
		arr[6] = new Coche("mata", "mary", "colorb", "modeld", 7, 7, 11000);
		arr[7] = new Coche("math", "marb", "colora", "modela", 8, 8, 12000);

		do {
			System.out.println("**************");
			System.out.println("1.Introducir los datos de coche/s nuevos");
			System.out.println("2.Listado de los coches introducidos hasta el momento.");
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

			size = estalleno(arr);
			System.out.println("this is size" + size);
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				//
				if (size == arr.length) {
					System.out.println("El array esta ellno");
				} else {
					introducirCocheDatos(arr, sc);
				}
				break;

			case 2:
				//
				mostrar(arr);
				break;
			case 3:
				//
				mostrarCochesMarca(arr, sc);
				break;
			case 4:
				//
				mostrarCochesConColor(arr, sc);
				break;
			case 5:
				//
				mostrarMediaCentiCub(arr);
				break;
			case 6:
				//
				ordenadParCaballosDescendente(arr);
				break;
			case 7:
				//
				precioTotalCoches(arr);
				break;
			case 8:
				//
				modifcarPrecio(arr, sc);
				break;
			case 9:
				//
				groupDeCocheColor(arr);
				break;
			case 10:
				//
				borrarParMatricula(arr, sc);
				break;
			case 11:
				//
				mostrarCochesConCilindrada(arr, sc);
				break;
			case 12:
				//
				numCochesRango(arr, sc);
			case 13:
				//
				modelosDeLamarca(arr,sc);
				break;
			case 14:
				//
				ordenarCochesMatricula(arr);
				break;
			case 15:
				//
				System.out.println("Hasta pronto..");
				break;
			default:
				//
				break;
			}

		} while (opcion != 15);// menu

	}// main

	public static int estalleno(Coche arr[]) {
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

	public static void introducirCocheDatos(Coche arr[], Scanner sc) {
		int pos;
		int opcion = 0;
		String matricula;
		boolean a = true;
		int size;
		do {

			size = estalleno(arr);

			if (size == arr.length) {
				System.out.println("No puedes deoasar el array size");
				a = false;
			} else {
				System.out.println("Intriduzca la matricula ");
				matricula = sc.next();

				System.out.println(matricula);
				if (size == 0) {
					llenarCocheInfo(arr, size, matricula, sc);
				} else if (size == arr.length) {
					System.out.println("Esta lleno");
				} else {
					pos = buscar(arr, matricula);
					if (pos == -1) {
						llenarCocheInfo(arr, size, matricula, sc);
					} else {
						System.out.println("este matricula existe");
					}
				}

				System.out.println("Queries continuar:(1 para continar a introducir / 2-quitar ) ");
				opcion = sc.nextInt();
			}

		} while (a && (opcion != 2));

	}

	public static void llenarCocheInfo(Coche arr[], int size, String matricula, Scanner sc) {
		String marca;
		String color;
		String modelo;
		double centiCubicos;
		int caballo;
		double precio;

		System.out.println("Intriduzca la marca ");
		marca = sc.next();

		System.out.println("Intriduzca color ");
		color = sc.next();

		System.out.println("Intriduzca modelo ");
		modelo = sc.next();

		System.out.println("Intriduzca centiCubicos ");
		centiCubicos = sc.nextInt();

		System.out.println("Intriduzca caballo ");
		caballo = sc.nextInt();

		System.out.println("Intriduzca precio ");
		precio = sc.nextDouble();
		arr[size] = new Coche(matricula, marca, color, modelo, centiCubicos, caballo, precio);
	}

	public static int buscar(Coche arr[], String matri) {
		boolean notFound = true;
		int foundPos = -1;
		int i = 0;
		int size = estalleno(arr);
		while (notFound && i < size) {
			if (arr[i].getMatricula().equalsIgnoreCase(matri)) {
				notFound = false;
				foundPos = i;
			}
			i++;
		}
		return foundPos;
	}

	public static void mostrar(Coche arr[]) {
		int size;
		size = estalleno(arr);

		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void mostrarCochesMarca(Coche arr[], Scanner sc) {
		String marca;
		int count = 0;

		int size = estalleno(arr);

		System.out.println("Introdusca la marca ");
		marca = sc.next();
		for (int i = 0; i < size; i++) {
			if (arr[i].getMarca().equalsIgnoreCase(marca)) {
				System.out.println(arr[i]);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No hay ninguna marca de este coche");

		}

	}

	public static void mostrarCochesConColor(Coche arr[], Scanner sc) {
		String color1, color2;
		int count = 0;
		int size = estalleno(arr);
		System.out.println("Introdusca la color 1 ");
		color1 = sc.next();
		System.out.println("Introdusca la color 2 ");
		color2 = sc.next();

		for (int i = 0; i < size; i++) {
			if (arr[i].getColor().equalsIgnoreCase(color1) || arr[i].getColor().equalsIgnoreCase(color2)) {
				System.out.println(arr[i]);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No hay ninguna marca de este coche");

		}

	}

	public static void mostrarMediaCentiCub(Coche arr[]) {
		double suma = 0;
		double media;
		int size = estalleno(arr);
		for (int i = 0; i < size; i++) {
			suma += arr[i].getCentiCubicos();
		}
		media = suma / size;
		System.out.println("Media de cubco : " + media);
	}

	public static void ordenadParCaballosDescendente(Coche arr[]) {
		int size = estalleno(arr);

		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {
				if (arr[i].getCaballo() < arr[j].getCaballo()) {
					Coche temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		mostrar(arr);
	}

	public static void precioTotalCoches(Coche arr[]) {
		double sumaPrecio = 0;

		int size = estalleno(arr);

		for (int i = 0; i < size; i++) {
			sumaPrecio += arr[i].getPrecio();
		}
		System.out.println("Suma de precio de  : " + sumaPrecio);

	}

	public static void modifcarPrecio(Coche arr[], Scanner sc) {
		String matricula, marca;
		int fooundAtPos, nuevoPrecio, count = 0;
		int size = estalleno(arr);

		do {
			System.out.println("Intriduzca la matricula ");
			matricula = sc.next();
			fooundAtPos = buscar(arr, matricula);
			if (fooundAtPos == -1) {
				System.out.println("Intriduzca la marca ");
				marca = sc.next();
				for (int i = 0; i < size; i++) {
					if (marca.equalsIgnoreCase(arr[i].getMarca())) {
						System.out.println(arr[i]);
						count++;
					}
				}
				if (count == 0) {
					System.out.println("No hay ninguna coche de este marca");
				}
			} else {
				System.out.println("Intriduzca nuevo precio : ");
				nuevoPrecio = sc.nextInt();
				arr[fooundAtPos].setPrecio(nuevoPrecio);
			}
		} while (fooundAtPos == -1);

	}

	public static void groupDeCocheColor(Coche arr[]) {
		String colors[] = { "colora", "colorb", "colorc", "colord", "colore", "colorf", "colorg", "colorh", "colori",
				"colorj", "colork", "colorl", "colorm", "colorn", "coloro" };
		int size = estalleno(arr);
		int count = 0;

		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size; j++) {
				if (colors[i].equalsIgnoreCase(arr[j].getColor())) {
					System.out.println(colors[i] + " : " + arr[j]);
					count++;
				}
			}
			System.out.println(colors[i] + " : " + count + " coches ");
		}

	}

	public static void borrarParMatricula(Coche arr[], Scanner sc) {
		String matricula;
		int fooundAtPos;
		int size = estalleno(arr);
		String respuesta;

		System.out.println("Intriduzca la matricula ");
		matricula = sc.next();
		fooundAtPos = buscar(arr, matricula);
		if (fooundAtPos == -1) {
			System.out.println("Este matricula no existe .");
		} else {

			if (fooundAtPos == arr.length - 1) {
				do {
					System.out.println(" Queres borrar el coche con matricula :" + matricula + "(si/no)");
					respuesta = sc.next();
				} while (!respuesta.equalsIgnoreCase("si") || !respuesta.equalsIgnoreCase("no"));

				if (respuesta.equalsIgnoreCase("si")) {
					arr[fooundAtPos] = null;
					System.out.println("El coche con matricula " + matricula + " borrado");
				} else {
					System.out.println("El coche con matricula " + matricula + " No esta borrado");

				}

			} else {
				do {
					System.out.println("Queres borrar el coche con matricula :" + matricula + "(si/no)");
					respuesta = sc.next();
				} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));

				if (respuesta.equalsIgnoreCase("si")) {
					arr[fooundAtPos] = null;
					for (int i = fooundAtPos; i < size; i++) {
						arr[i] = arr[i + 1];
					}
					System.out.println("El coche con matricula " + matricula + " borrado");
				} else {
					System.out.println("El coche con matricula " + matricula + " No esta borrado");

				}
			}
		}

	}

	// introducida.
	public static void mostrarCochesConCilindrada(Coche arr[], Scanner sc) {
		double centiCobico;
		int existe = 0;
		int size = estalleno(arr);
		System.out.println("Introduzca centímetros cúbicos :");
		centiCobico = sc.nextDouble();

		for (int i = 0; i < size; i++) {
			if (arr[i].getCentiCubicos() > centiCobico) {
				System.out.println(arr[i]);
			}
		}
		if (existe == 0) {
			System.out.println("No hay ninguna coche de con cilindro mayor que " + centiCobico);

		}

	}

	//
	public static void numCochesRango(Coche arr[], Scanner sc) {
		char rango;

		int size = estalleno(arr);
		do {
			System.out.println("******");
			System.out.println("a. Menor o igual de 1.000 €");
			System.out.println("b. Entre 1.000 y 5.000€");
			System.out.println("c. Entre 5.000 y 10.000€");
			System.out.println("d. Mayor de10.000€");
			System.out.println("Que queries hacer ");
			rango = sc.next().charAt(0);
		} while (rango != 'a' && rango != 'b' && rango != 'c' && rango != 'd');

		switch (rango) {
		case 'a':
			//
			int counta = 0;
			for (int i = 0; i < size; i++) {
				if (arr[i].getPrecio() <= 1000) {
					counta++;
				}
			}
			if (counta > 0) {
				System.out.println("Hay " + counta + " coches menor o igual de 1.000 €");
			} else {
				System.out.println("No hay ninguna coches menor o igual a 1.000 €");
			}
			break;
		case 'b':
			//
			int countb = 0;
			for (int i = 0; i < size; i++) {
				if (arr[i].getPrecio() > 1000 && arr[i].getPrecio() <= 5000) {
					countb++;
				}
			}
			if (countb > 0) {
				System.out.println("Hay " + countb + " coches  Entre 1.000 y 5.000€");
			} else {
				System.out.println("No hay ninguna coches Entre 1.000 y 5.000€");
			}
			break;
		case 'c':
			//
			int countc = 0;
			for (int i = 0; i < size; i++) {
				if (arr[i].getPrecio() > 5000 && arr[i].getPrecio() <= 10000) {
					countc++;
				}
			}
			if (countc > 0) {
				System.out.println("Hay " + countc + " coches  Entre 5.000 y 10.000€");
			} else {
				System.out.println("No hay ninguna coches Entre 5.000 y 10.000€");
			}
			break;
		case 'd':
			//
			int countd = 0;
			for (int i = 0; i < size; i++) {
				if (arr[i].getPrecio() > 10000) {
					countd++;
				}
			}
			if (countd > 0) {
				System.out.println("Hay " + countd + " coches  mayor a 10.000€");
			} else {
				System.out.println("No hay ninguna coche  mayor a 10.000€");
			}
			break;
		default:
			break;
		}
	}

	//
	public static void modelosDeLamarca(Coche arr[],Scanner sc) {
		int size;
		int k=0;
		int countModelo;
		String m;
		int count=0;
		
		String modelo[]  = new String[15];
		String modeloCopia[]  = new String[15];
		int counter[]=	new int[15];
		int t=0;
		size= estalleno(arr);
		String marca;
		
		System.out.println("Introduzca la marca :");
		marca = sc.next();
		
		for (int i = 0; i < size; i++) {
			if (marca.equalsIgnoreCase(arr[i].getMarca())) {
				modelo[k]=arr[i].getModelo();
				k++;
			}
		}
		for(int i = 0; i < modelo.length; i++) {
			if(modelo[i]!= null) {
				
			}
		}
		System.out.println("Modelo tiene n coche ");
		
		
	}
	
	// ordenar
	public static void ordenarCochesMatricula(Coche arr[]) {
		int size = estalleno(arr);
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i].getMatricula().compareToIgnoreCase(arr[j].getMatricula()) > 0) {
					Coche temp;
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		mostrar(arr);
	}

}// class
