package ud0;

import java.util.Scanner;

public class Areacirc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);
		double radio;
		
		System.out.println("Indriuce el radio de :");
		radio=teclado.nextDouble();
		
		System.out.println("Area del circulo es : "+ Math.PI*radio*radio);
		System.out.println("Area del circulo es : "+ Math.PI*Math.pow(radio, 2));
		
		
		teclado.close();

	}

}
