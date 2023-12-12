package ud0;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado =new Scanner(System.in);
		
		String name;
		double radio;
		double lado;
		double ladoLargo;
		double ladoCorto;
		double altura;
		double base;

		System.out.println("Hola");
		System.out.println("¿Cuál es tu nombre?");
		
		name=teclado.next();
		System.out.println("Bienvenida " +name +". Vamos a realizar diferentes cálculos.");

		System.out.println("*********************************************");
		System.out.println("CÍRCULO");
		System.out.print("Introduce el valor del radio: ");
		radio=teclado.nextDouble();
		System.out.printf("El valor de la variable es %.1f m2",(Math.PI * radio*radio));
		System.out.println();
		
		System.out.println("*********************************************");
		System.out.println("CUADRADO");
		System.out.print("Introduce el valor del lado:");
		lado=teclado.nextDouble();
		
		System.out.println("El área del cuadrado es : " + lado*lado +" m2" );

		System.out.println("*********************************************");
		System.out.println("RECTÁNGULO");
		System.out.print("Introduce el valor del lado más largo : ");
		ladoLargo=teclado.nextDouble();
		System.out.print("Introduce el valor del lado más corto: ");
		ladoCorto=teclado.nextDouble();
		System.out.println("El área del rectángulo es :" + ladoCorto*ladoLargo+" m2");

		System.out.println("*********************************************");
		System.out.println("TRIÁNGULO");
		System.out.print("Introduce el valor de la altura: ");
		altura=teclado.nextDouble();
		System.out.print("Introduce el valor de la base: ");
		base=teclado.nextDouble();
		System.out.println("El área del triángulo es :" +(( altura*base)/2)+" m2");

		teclado.close();

	}

}
