package ud0;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		double celsius;
	
		System.out.print("Introduce la temperatura en grados Celsius: ");
		celsius=input.nextInt();

		
		System.out.println("Fahrenheit:" +((celsius * 9/5)+32) + "ºF" );
		
		System.out.println("Kelvin:"+ ( celsius + 273.14) + "ºK");

		
		input.close();
	}

}
