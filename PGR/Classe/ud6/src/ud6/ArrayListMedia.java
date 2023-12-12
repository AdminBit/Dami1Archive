package ud6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListMedia {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int numero;
		int sum=0;
		ArrayList<Integer> numArr = new ArrayList<Integer>();

		
		System.out.println("Introduzca una numero :");
		numero=sc.nextInt();
		while(numero>=0) {
			numArr.add(numero);
			System.out.println("Introduzca una numero :");
			numero=sc.nextInt();
		}
		System.out.println("***** for ******");

		for(int i=0;i<numArr.size() ;i++) {
			sum=sum + numArr.get(i);
		}
		
		System.out.println("Media es "+(sum/numArr.size()));
	
		
	}//main

}//class
