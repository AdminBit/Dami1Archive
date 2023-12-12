package ud3;

import java.util.Scanner;

public class TiendaLibros {

	public static void main(String[] args) {

		//String titulo[] = new String[20];
		//int precio[] = new int[20];
		
		Scanner sc = new Scanner(System.in);
		
		String titulo[] ={"Nada","Tímidamente de la oscuridad","Pájaros a golpes",
				"Caperucita Roja","12 cuentos clásicos","Pepe y Mila","Enojaos",
				"En casa vacía","123","Día Negro","El Hobbit","Calle Judía","aa","bb","cc","dd","ee","ff","gg","hh"};
		int precio[]= {15,12,15,25,19,17,25,13,11,18,25,35,100,200,300,400,500,600,700,0};
		
		String continuar="si";
		String liboTitulo;
		String liboTitulonNuevo;
		int liboNuevoPrecio;
		int opcion;
		int size=0;
		int k=0;
		boolean notFound=true;
		
		do {
			
			System.out.println("Bienvieida");
			System.out.println("1.- Mostrar el título de todos los libros.");
			System.out.println("2.- Mostrar el título y el precio de todos los libros.");
			System.out.println("3.- Mostrar el precio de un libro.");
			System.out.println("4.- Introducir un nuevo libro.");
			System.out.println("5.- Eliminar un libro.");
			System.out.println("6.- Modificar el precio de un libro.");
			System.out.println("7.- Modificar el título de un libro.");
			System.out.println("8.- Salir del programa.");
			
			
			for(int i =0;i<titulo.length ;i++) {
				if(titulo[i] != null) {
					size++;
				}
			}
			
			
			System.out.println("this is just for books num  :" + size);
			//System.out.println("K : " + k);

			System.out.println("*******************");

			opcion=sc.nextInt();
			
			switch (opcion) {
				case 1:
					//1.- Mostrar el título de todos los libros.
				
					for(int i =0;i<size ;i++) {
						//if(titulo[i] != null) {
							System.out.println(titulo[i]);
						//}
					}
					break;
				case 2:
					//2.- Mostrar el título y el precio de todos los libros.
					for(int i =0;i<size ;i++) {
						System.out.println("El precio del libro "+titulo[i]+" son "+precio[i]+ " euros.");
					}
					break;
				case 3:
					//System.out.println("3.- Mostrar el precio de un libro.");
					System.out.println("¿Cuál es el título del libro?");
					//with while is better 
					sc.reset();
					sc.nextLine();
					//
					liboTitulo=sc.nextLine();
					
					while(notFound && k<size) {
						
						if(liboTitulo.equalsIgnoreCase(titulo[k])) {
							System.out.println("El precio del libro "+titulo[k]+" son "+precio[k]+ " euros.");
							notFound=false;
						}
						k++;
					}
					//old one was with For 
					/*for(int i =0;i<seize ;i++) {
							if(liboTitulo.equalsIgnoreCase(titulo[i])) {
								System.out.println("El precio del libro "+titulo[i]+" son "+precio[i]+ " euros.");
							}	
					}*/
					break;
				case 4:
					//4- Introducir un nuevo libro.
				
					
					if(size<titulo.length) {
						
						//
						System.out.println("¿Cuál es el título del libro?");
						
						sc.reset();
						sc.nextLine();
						liboTitulo=sc.nextLine();
						
						System.out.println("¿Cuál es el precio?");
						liboNuevoPrecio =sc.nextInt();
						System.out.println(liboTitulo + " * " + liboNuevoPrecio);
		
						//
		
						titulo[size]=liboTitulo;
						precio[size]=liboNuevoPrecio;
						System.out.println("El libro ha sido guardado.");
					}else {
						System.out.println("Tienes muchos libros en la tienda, elimina un libro");
					}
						
					break;
				case 5:
					//5.- Eliminar un libro.
					System.out.println("¿Cuál es el título del libro?");
					
					sc.reset();
					sc.nextLine();
					liboTitulo=sc.nextLine();
					
					//with while is better 
					while(notFound && k<size) {
						
						if(liboTitulo.equalsIgnoreCase(titulo[k])) {
							
							if(k == titulo.length) {
								titulo[k]=null;
								precio[k]=0;
								
								notFound=false;
								}
							else {
								
								titulo[k]=null;
								precio[k]=0;
								
								///*seize- 1*/
								for(int j=k;j<titulo.length-1;j++) {
									
									titulo[j]=titulo[j+1];
									precio[j]=precio[j+1];;
									
									
								}
								notFound=false;

								titulo[titulo.length-1]=null;
								precio[titulo.length-1]=0;
							}
							
							System.out.println("El libro ha sido eliminado.");
						}
				
						k++;
					}

					//old one was with For 
					/*for(int i=0;i<seize;i++) {
						
						if(liboTitulo.equalsIgnoreCase(titulo[i])) {
							
							if(i == titulo.length) {
								titulo[i]=null;
								precio[i]=0;
							}
							else {
								titulo[i]=null;
								precio[i]=0;
								//
								for(int j=i;j<titulo.length-1;j++) {
									titulo[j]=titulo[j+1];
									precio[j]=precio[j+1];;
								}
							}
							
							System.out.println("El libro ha sido eliminado.");
						}
					}*/
				
					break;
				case 6:
					//break
					System.out.println("¿Cuál es el título del libro?");
					
					sc.reset();
					sc.nextLine();
					
					liboTitulo=sc.nextLine();
						
					System.out.println("¿Cuál es el nuevo precio?");
					liboNuevoPrecio=sc.nextInt();	
					for(int i =0;i<size;i++) {
						if(liboTitulo.equalsIgnoreCase(titulo[i])) {
							precio[i]=liboNuevoPrecio;
							System.out.println("El precio ha sido cambiado.");
							System.out.println("El nuevo precio del libro "+ titulo[i] +" son "+ precio[i] +" euros.");
						}
					}
						
					break;
					
				case 7:
					//7.- Modificar el título de un libro.
					System.out.println("¿Cuál es el título del libro?");
					sc.reset();
					sc.nextLine();
					liboTitulo=sc.nextLine();
					//with while is better 	
					while(notFound && k<size) {
						
						if(liboTitulo.equalsIgnoreCase(titulo[k])) {
							System.out.println("¿Cuál es el nuevo título del libro?");
							
							sc.reset();
							sc.nextLine();
							liboTitulonNuevo=sc.nextLine();	
							
							titulo[k]=liboTitulonNuevo;
							System.out.println("El titulo ha sido modificado.");
							System.out.println("El nuevo título del libro "+liboTitulo +" es " +liboTitulonNuevo);
							
							notFound=false;
						}
						k++;
						
					}
					//old one was with For 
					/*for(int i =0;i<seize;i++) {
						if(liboTitulo.equalsIgnoreCase(titulo[i])) {
							System.out.println("¿Cuál es el nuevo título del libro?");
							sc.reset();
							liboTitulonNuevo=sc.nextLine();		
							System.out.println("El titulo ha sido modificado.");
							System.out.println("El nuevo título del libro "+liboTitulo +"+es " +liboTitulonNuevo);
							
						}	
					}*/
					break;
					
				case 8:
					//break8.- Salir del programa.
					System.exit(0);
					break;
				default:
					System.out.println("opcion no exite");
					break;
			}
			
		//
		do {
			System.out.println("¿Quieres continuar en el programa? SI / NO");
			continuar=sc.next();	
			}while(!(continuar.equalsIgnoreCase("si")||continuar.equalsIgnoreCase("no")));
		
		size=0;
			notFound=true;
			k=0;
			
			
		}while(continuar.equalsIgnoreCase("si"));
		
		System.out.println("Hasta pronto ...");
	
		sc.close();
		
	}//

}
