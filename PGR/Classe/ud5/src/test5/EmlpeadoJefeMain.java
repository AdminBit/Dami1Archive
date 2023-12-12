package test5;

import java.util.Scanner;

import ud5.Empleados;
public class EmlpeadoJefeMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Empleados  arrEmp[] = new Empleados[150];
		Empleados  arrJef[] = new Empleados[150];
		
		int opcion;
		do {
			System.out.println("**************");
			System.out.println("1.Introducir los datos de empleado/s nuevos");
			System.out.println("2.Visualizar todos los datos (con sueldo final) de todes les empleades (les jefes son empleades)");
			System.out.println("3.Visualizar les jefes.");
			System.out.println("4.Visualizar les jefe/s de un departamento concreto: se introduce el departamento.");
			
			System.out.println("ELIJA UNA OPCIÓN:");
			opcion=sc.nextInt();
			
			int size;
			size = mySize(arrEmp);
			
			System.out.println("This is the array size : " + size);

		
		}while(true);
		
		
		
	}//main
	public static int mySize(Empleados arr[]) {
		boolean notEmpty= true;
		int i = 0;
		while (notEmpty && i < arr.length) {
			if (arr[i] == null) {
				notEmpty = false;
			} else {
				i++;
			}
		}
		return i;
	}
	
}//class
