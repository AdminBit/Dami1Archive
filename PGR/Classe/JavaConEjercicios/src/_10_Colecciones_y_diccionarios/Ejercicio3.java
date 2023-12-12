package _10_Colecciones_y_diccionarios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int size=10;
		//fill list of numbers
		for(int i=0 ; i<size;i++) {
			System.out.println("Introduzca un numero ");
			arr.add(sc.nextInt());
		}
		//show list of numbers
		for(int a:arr) {
			System.out.println(a);
		}
		sc.close();
	}//main

}
