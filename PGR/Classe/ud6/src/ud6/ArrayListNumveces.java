package ud6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListNumveces {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		ArrayList<Integer> numArr = new ArrayList<Integer>();
		numArr.add(0,0);
		numArr.add(1,0);
		numArr.add(2,0);
		numArr.add(3,0);
		numArr.add(4,0);
		
		System.out.println("Introduzca una numero :");
		numero=sc.nextInt();
		while(numero<=5 && numero>=1) {
			
			numArr.add(numero-1,numArr.get(numero-1)+1);

			System.out.println("Introduzca una numero :");
			numero=sc.nextInt();
		}
		
		
		
		
		
	
		
		
		System.out.println("***** for ******");

		for(int i=0;i<numArr.size() ;i++) {
			System.out.println(numArr.get(i));
		}
		
		System.out.println("***** for each ******");
		// Opción 2: for each
		for (Integer s : numArr) {
		System.out.println(s);
		}
		
		
		// Opción 3: iterator
		System.out.println("***** Iterator ******");
		Iterator<Integer> i = numArr.iterator();
		while (i.hasNext()) {
		 System.out.println(i.next());
		}

		
	}//main

}//class
