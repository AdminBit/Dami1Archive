package ud1;

import java.util.Scanner;

public class TestboucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero N : ");
		n=sc.nextInt();

		for(int i= 0 ;i<=n ; i++) {
			System.out.print( i+"   ");
		}
		
		sc.close();
	}

}
