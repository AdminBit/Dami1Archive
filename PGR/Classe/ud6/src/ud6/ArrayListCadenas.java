package ud6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListCadenas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String entrada;
		
		ArrayList<String> cadenaArray = new ArrayList();
		
		
		System.out.println("Introduzca una palabra :");
		entrada=sc.nextLine();
		
		while(!entrada.isBlank()) {	
			cadenaArray.add(entrada);
			System.out.println("Introduzca una palabra :");
			entrada=sc.nextLine();
		}
		// isBlank & isEmpty should be nextLine
		
		System.out.println("***** for ******");

		for(int i=0;i<cadenaArray.size() ;i++) {
			System.out.println(cadenaArray.get(i));
		}
		
		System.out.println("***** for each ******");
		// Opción 2: for each
		for (String s : cadenaArray) {
		System.out.println(s);
		}
		
		
		// Opción 3: iterator
		System.out.println("***** Iterator ******");
		Iterator<String> i = cadenaArray.iterator();
		while (i.hasNext()) {
		 System.out.println(i.next());
		}

		
		
		sc.close();
	}//main

}//class
