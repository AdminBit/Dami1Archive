package ud4;

import java.util.Scanner;

public class ArticulosMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Articulos articuloArray[] = new Articulos[5];

		int opcion;
		int arrSize;
	

		do {

			do {
				System.out.println("*******");
				System.out.println("1.- Añadir articulos ");
				System.out.println("2.- Borrar articulo dado su nombre ");
				System.out.println("3.- Modificar el nombre");
				System.out.println("4.- Ordenar par nombre ");
				System.out.println("5.- Modificar el precio de un producto");
				System.out.println("6.- MostrarTodo");
				System.out.println("7.- slair");
				System.out.println("Que quiers hacer ?");
				opcion = sc.nextInt();

			} while (opcion > 7 || opcion < 1);

			arrSize = estaLleno(articuloArray);
			System.out.println("This is my size : " + arrSize);

			switch (opcion) {
			case 1:
				//make the cindition if esta bacia no busca 
				if (arrSize == -1) {
					System.out.println("No hay espacio libro");
				} else {
					anadir(articuloArray, sc, arrSize);
				}
				break;
			case 2:
				//
				if (arrSize == 0) {
					System.out.println("No hay productos en la tienda ");
				} else {
					borrar(articuloArray, sc, arrSize);
				}
				break;
			case 3:
				//

				if (arrSize == 0) {
					System.out.println("No hay productos en la tienda ");
				} else {
					modificarNombre(articuloArray, sc, arrSize);
				}
				break;
			case 4:
				//

				if (arrSize == 0) {
					System.out.println("No hay productos en la tienda ");
				} else {

					ordenarParNombre(articuloArray, arrSize);

				}
				break;
			case 5:
				//
				if (arrSize == 0) {
					System.out.println("No hay productos en la tienda ");
				} else {
					modificarPrecio(articuloArray, sc, arrSize);
				}
				break;
			case 6:
				//
				mostrarTodo(articuloArray, arrSize);
				break;
			case 7:
				//
				// System.exit(0);
				System.out.println("Hasta pronto ..");
				
				break;
			default:
				System.out.println("ERROR opcion no existe");
				break;

			}

		} while (opcion != 7);

		sc.close();
	}// main

	// pos is size of the array
	public static int estaLleno(Articulos nomP[]) {
		int pos = -1;
		int i = 0;
		boolean notFound = true;
		while (notFound && i < nomP.length) {
			if (nomP[i] == null) {
				notFound = false;
				pos = i;
			} else {
				i++;
			}
		}
		return pos;
	}

	public static void anadir(Articulos art[], Scanner sc, int size) {
		String nomP;
		double precioP;

		System.out.println("El nombre del producto : ");
		nomP = sc.next();
		do {
			System.out.println("El precio del producto : ");
			precioP = sc.nextDouble();
			if (precioP < 0) {
				System.out.println("El precio del producto nno pude ser negativo ");
			}
		} while (precioP < 0);

		art[size] = new Articulos(nomP, precioP);

	}

	public static void borrar(Articulos arr[], Scanner sc, int size) {
		int pos;

		pos = buscar(arr, sc, size);
		if (pos == -1) {
			System.out.println("El articulo NO existe !!");
		} else {
			//este no signifca que el articulo esta null 
			//arr[pos].setNombre(null);
			//arr[pos].setPrecio(0);
			//pudes hacerlo directament 
			arr[pos]=null;
			for(int i=0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
		}

	}

	public static void modificarNombre(Articulos arr[], Scanner sc, int size) {
		int pos;
		String nom;

		pos = buscar(arr, sc, size);
		if (pos == -1) {
			System.out.println("El articulo NO existe !!");
		} else {
			System.out.println("introduzca el nombre de articulo");
			nom = sc.next();

			arr[pos].setNombre(nom);
			System.out.println("El nombre del articulo ha sid modificado");

		}
	}

	public static void modificarPrecio(Articulos arr[], Scanner sc, int size) {
		int pos;
		double price;

		pos = buscar(arr, sc, size);
		if (pos == -1) {

			System.out.println("El articulo NO existe !!");
		} else {
			System.out.println("introduzca el precio de articulo");
			price = sc.nextDouble();
			arr[pos].setPrecio(price);
		}
	}

	public static void mostrarPrecio(Articulos pro[], double pre[], int size) {
		int i = 0;
		boolean notNull = true;
		while (notNull && i < size) {
			if (pro[i] == null) {
				notNull = false;
			} else {
				System.out.println("El precio del articulo " + pro[i] + " es : " + pre[i]);
				i++;
			}
		}
	}

	public static int buscar(Articulos arr[], Scanner sc, int size) {
		int pos = -1;
		boolean notFound = true;
		int i = 0;
		String titulo;
		System.out.println("Cual es el nombre de el articulo :");
		titulo = sc.next();
		while (notFound && i < size) {
			if (titulo.equalsIgnoreCase(arr[i].getNombre())) {
				pos = i;
				notFound = false;
			}
			i++;
		}
		return pos;
	}

	public static void ordenarParNombre(Articulos arr[], int size) {
		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {

				if (arr[j].getNombre().compareTo(arr[i].getNombre()) < 0) {
					Articulos temp;
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		// mostrar
		mostrarTodo(arr, size);

	}

	public static void mostrarTodo(Articulos arr[], int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}

}// main
