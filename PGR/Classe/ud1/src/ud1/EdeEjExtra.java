package ud1;

public class EdeEjExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;

		System.out.println("********** Otro Ejer*****");
		
		
		for(int i=0;i<n ;i++ ) {
			
			for(int j=n;j>i ;j-- ) {
				System.out.print(j-i+ " ");	
				}
	
			System.out.println();
		}
		
		System.out.println();
		System.out.println("********** Otro Ejer*****");
		
		
		for(int i=0;i<n ;i++ ) {
			
			for(int j=1;j<n-i ;j++ ) {
				System.out.print(" - ");	
				}
			for(int k=0;k<=i ;k++ ) {
			System.out.print(" * ");	
			}
			
			System.out.println();
		}
		
	}//main

}//class
