package ud3;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		
//	Realiza la clase Java Mediatem que pide temperaturas por pantalla y las almacena 
// en un array hasta que se introduzca la temperatura -999 que no será tenida
// en cuenta o el array esté lleno. Después calcula la temperatura media y

		double a[] = new double [10];
		
		double may[] = new double [10];
		int k=0;
		
		double men[] = new double [10];
		int m=0;
		
		double numero;
		double media=0;
		int count =0;
		int j=1;
		
		System.out.println("introduzca la temperatura  ");
		Scanner sc = new Scanner(System.in);
		numero=sc.nextDouble();
		a[0]= numero;
		while(j<a.length && numero!=999 ) {
			
			a[j]= numero;
			media=media+a[j];
			
			System.out.println("introduzca la temperatura  ");
			numero=sc.nextDouble();

			j++;			

		}
		
		/*for(int i =0 ;i<j ;i++) {
			suma=suma+a[i];
		}
		double  media=suma/j;*/
		media=media/j;
		System.out.println("la temperatura media : " + media );
	
		
		for(int i =0 ;i<j ;i++) {
			if(a[i] > media) {
				may[k]=a[i];
				k++;
			}else if(a[i] < media) {
				men[m]=a[i];
				m++;
			}else if(a[i]==media) {
				count++;
			}
		}
		
		System.out.println("*****mayor****");

		for(int z=0;z<k ;z++) {
			System.out.println("las temperaturas menor que media : " +men[z]   );
		}
		System.out.println("*****menor****");

		for(int z=0;z<m ;z++) {
			System.out.println("las temperaturas mayores que media : " +may[z]   );
		}
		
		System.out.println("****repiticio****");
		System.out.println("la temperaturas se repite : " +count   );

		sc.close();
	}//main

}
