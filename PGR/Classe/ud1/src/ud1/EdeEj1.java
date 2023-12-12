package ud1;

import java.util.Scanner;

public class EdeEj1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anaDias;
		int bernardoDias;
		int carlosDias;
			
		Scanner sc = new Scanner(System.in);

		System.out.println("Ana va a comprar fruta cada Cuantas dias : ");
		anaDias=sc.nextInt();
		
		System.out.println("Bernardo va a comprar fruta cada Cuantas dias : ");
		bernardoDias=sc.nextInt();
		
		System.out.println("Carlos va a comprar fruta cada Cuantas dias : ");
		carlosDias=sc.nextInt();
		
		int n=1;
		
		while(n%anaDias != 0 || n%bernardoDias != 0 ||n%carlosDias != 0){	
			n=n+1;
		}
		System.out.println("Ana , Bernardo y Carlos coincidirán de nuevo dentro de " +n+ " días ");
		sc.close();
		System.out.println();
		System.out.println("*********");


	}

}


