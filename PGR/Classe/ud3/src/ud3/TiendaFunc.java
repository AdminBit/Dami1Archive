package ud3;

import java.util.Scanner;

public class TiendaFunc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nombreProducto[] = new String[5];
		double precioProducto[] = new double[5];
		int opcion;
		boolean salir = false;

		int arrSize;
		int foundAtPos;

		do {
			do {
			System.out.println("*******");
			System.out.println("1.- Añadir articulos y precios");
			System.out.println("2.- Mostar productos de la tienda");
			System.out.println("3.- Obtener el precio de un producto");
			System.out.println("4.- obtener el iva de un producto ");
			System.out.println("5.- modificar el precio de un producto");
			System.out.println("6.- slair");
			System.out.println("Que quiers hacer ?");
			opcion = sc.nextInt();

			}while(opcion>6 || opcion<1);
			

			arrSize = estaLleno(nombreProducto);
			System.out.println("This is my size : " + arrSize);

			switch (opcion) {
			case 1:
				//
				if (arrSize == -1) {
					System.out.println("No hay espacio libro");
				} else {
					anadir(nombreProducto, precioProducto, sc, arrSize);
				}
				break;
			case 2:
				//
				if (arrSize == 0) {
					System.out.println("No hay productos en la tienda ");
				} else {
					mostrar(nombreProducto, precioProducto);
				}
				break;
			case 3:
				//
				// arrSize=estaLleno(nombreProducto);
				if (arrSize == 0) {
					System.out.println("No hay productos en la tienda ");
				} else {
					foundAtPos = buscar(nombreProducto, sc);
					if (foundAtPos == -1) {
						System.out.println("El producto no existe en la tienda ");
					} else {
						System.out.println("El precio del articulo : " + nombreProducto[foundAtPos] + " es :"
								+ precioProducto[foundAtPos]);

					}
				}
				break;
			case 4:
				//
				double precio;
				if (arrSize == 0) {
					System.out.println("No hay productos en la tienda ");
				} else {
					foundAtPos = buscar(nombreProducto, sc);
					if (foundAtPos == -1) {
						System.out.println("El producto no existe en la tienda ");
					} else {
						precio = precioProducto[foundAtPos];
						calcularIva(nombreProducto, foundAtPos, precio);

					}
				}
				break;
			case 5:
				//
				if (arrSize == 0) {
					System.out.println("No hay productos en la tienda ");
				} else {
					foundAtPos = buscar(nombreProducto, sc);
					if (foundAtPos == -1) {
						System.out.println("El producto no existe en la tienda ");
					} else {
						modificar(precioProducto, foundAtPos, sc);

					}
				}
				break;
			case 6:
				//
				// System.exit(0);
				System.out.println("Hasta pronto ..");
				salir = true;
				break;
			default:
				System.out.println("ERROR opcion no existe");
				break;

			}

		} while (!salir);

		sc.close();
	}// main

	// pos is size of the array
	public static int estaLleno(String nomP[]) {
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

	public static void anadir(String peoductos[], double precios[], Scanner sc, int size) {
		String nomP;
		double precioP;

		System.out.println("El nombre del producto : ");
		nomP = sc.next();
		do {
		System.out.println("El precio del producto : ");
		precioP = sc.nextDouble();
		if(precioP<0) {
			System.out.println("El precio del producto nno pude ser negativo ");
		}
		}while(precioP<0);
		
		peoductos[size] = nomP;
		precios[size] = precioP;

	}

	public static void mostrar(String pro[], double pre[]) {
		int i=0;
		boolean notNull=true;
		while (notNull &&  i < pro.length) {
			if(pro[i]==null) {
				notNull=false;
			}else {
				System.out.println("El precio del articulo " + pro[i] + " es : " + pre[i]);
				i++;
			}
		}
	}

	public static int buscar(String pro[], Scanner sc) {
		int pos = -1;
		boolean notFound = true;
		int i = 0;
		String titulo;
		System.out.println("Cual es el nombre de el articulo :");
		titulo = sc.next();
		while (notFound && i < pro.length) {
			if (titulo.equalsIgnoreCase(pro[i])) {
				pos = i;
				notFound = false;
			}
			i++;
		}
		return pos;
	}

	public static void calcularIva(String pro[], int position, double precio) {
		double iva;
		iva = precio * 21 / 100;
		System.out.println("El iva del articulo : " + pro[position] + " es :" + iva);
	}

	public static void modificar( double proPrice[], int foundAtPos, Scanner sc) {
		double nuevoPrecio;
		System.out.println("Cual es nuevo precio del articulo :");	
		nuevoPrecio=sc.nextDouble();
		proPrice[foundAtPos]=nuevoPrecio;
		System.out.println("El precio ha sido modificado :");	

		};

}// class
