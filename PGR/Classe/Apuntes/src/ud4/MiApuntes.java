package ud4;

import java.util.Scanner;

public class MiApuntes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// menu
		int opcion;
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
		// switch case
		switch (opcion) {
		case 1:
			//
			break;
		case 2:
			//
			break;
		case 3:
			//
			break;
		default:
			break;
		}
		
	
		
		
		
	}// main 

	do {
		System.out.println("Quieres salir ?(si/no)");
		salir = sc.next();
	} while (!(salir.equalsIgnoreCase("si") || salir.equalsIgnoreCase("no")));
	
	//size of array 
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
	//order 
	int arr[]= new int[50];
	   void bubbleSort(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i = 0; i < n - 1; i++) 
	            for (int j = 0; j < n - i - 1; j++) 
	                if (arr[j] > arr[j + 1]) { 
	                    // swap temp and arr[i] 
	                    int temp = arr[j]; 
	                    arr[j] = arr[j + 1]; 
	                    arr[j + 1] = temp; 
	                } 
	    } 
	 //mi method
	  void mibubbleSort(int arr[]) {
		  int temp;
			for (int i = 0; i < arr.length -1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] < arr[i]) {
						temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
	  }
	
	//delete with compact
	
	//mostrar
	public static void mostrar(Coche arr[]) {
		int size;
		size = estalleno(arr);

		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}
	//buscar
	public static int buscarParMatricula(Coche arr[], Scanner sc, int size) {
		String matricula;
		int foundPos=-1;
		int i =0; 
		boolean notFound=true;
		
		System.out.println("Introduzca la matricula : ");
		matricula =sc.next();
		while(notFound && i<size) {
			if(matricula.equalsIgnoreCase(arr[i].getMatricula())) {
				notFound=false;
				foundPos=i;
			}
			i++;
		}
		return foundPos;
	}

	
	
}// class
