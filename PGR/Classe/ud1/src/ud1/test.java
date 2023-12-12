package ud1;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc =new Scanner(System.in);
			String nombre;
			String contrasena;
			int edad;
			
			int opcion ; 
			int numero1,numero2; 
			String palabra;
			String  respuesta="NO";
			
			
			
			do {
				System.out.println("Inroduce el nombre :");
				nombre=sc.next();
				
				System.out.println("Inroduce la contraseña :");
				contrasena=sc.next();
			}while(! contrasena.equals("program"));
			
			System.out.println("Inroduce la edad :");
			edad=sc.nextInt();
			
			if(edad <18) {
				System.out.println("No tienes acceso al sistema");
				System.out.println("ennd of program");
				System.exit(0); 
			}else {	
				while(respuesta.equalsIgnoreCase("no")) {
					
						System.out.println("Bienvenido " +nombre+" al programa");
						System.out.println("1- Sumar numeros");
						System.out.println("2- Comprobar si existe la letra A");
						System.out.println("3- Salir");
						System.out.println("¿Que quieres hacer ?");

				opcion=sc.nextInt();
				
				switch(opcion) {
				case 1: 
					// do
					System.out.println("** Sumar numeros** ");
					System.out.println("Inserta el primer numero : ");
					numero1=sc.nextInt();
					System.out.println("Inserta el segundo numero : ");
					numero2=sc.nextInt();
					
					System.out.println("Total : " +(numero1+numero2)+ " Euros");

					System.out.println("Queres salir de programa Si/No");
					respuesta=sc.next();
					if(respuesta.equalsIgnoreCase("NO")) {
						break;
					}else if(respuesta.equalsIgnoreCase("SI")){
						System.out.println("Hasta luego " + nombre);
						System.exit(0);
					}
					break; 
				case 2: 
					// do 
					System.out.println("**Comprobar si existe la letra A** ");
					System.out.println("Indtroduce una palabra : ");
					palabra=sc.next();
					if(palabra.contains("A")||palabra.contains("a")) {
						System.out.println("Contiene la letra A");
						for(int i=0;i<5 ;i++) {
							System.out.print(palabra +"  ");
						}
					}else {
						System.out.println("No contiene la letra A");

					}
					System.out.println();
					
					
					System.out.println("Queres salir de programa Si/No");
					respuesta=sc.next();
					if(respuesta.equalsIgnoreCase("NO")) {
						break;
					}else if(respuesta.equalsIgnoreCase("SI")){
						System.out.println("Hasta luego " + nombre);
						System.exit(0);
					}
					
					break; 
				case 3: 
					System.out.println("**Salir** ");
				
					
					System.out.println("Queres salir de programa Si/No");
					respuesta=sc.next();
					if(respuesta.equalsIgnoreCase("NO")) {
						break;
					}else if(respuesta.equalsIgnoreCase("SI")){
							System.out.println("Hasta luego " + nombre);
							System.exit(0);
						}
					System.out.println("Hasta luego " + nombre);
					System.exit(0);
					
					break; 
				default:
					System.out.println("ERROR");
				}
				
			}
				
			}
			
				sc.close();
			
		}

	}