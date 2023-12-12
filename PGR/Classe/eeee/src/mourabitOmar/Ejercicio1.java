package mourabitOmar;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		int i = 0;
	
		do {
			System.out.println("Introuzca un num mayor que 1 ");
			n = sc.nextInt();
		}while(n<1);
		
		
		int a=0;
		int b=1;
		int c=0;
		
		while (i <=n) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		
			i++;
		}
		

	}

}
