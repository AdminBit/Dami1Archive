package ud1;

import java.util.Scanner;

public class Ej10Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realiza la clase Java Sumanumw que lee un numero entero
		//por teclado y muestra la suma de todos
		//los números hasta el inclusive. Con While.
		
		int numero,n=0;
		int suma=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Cual es tu nombre ? ");
		numero=teclado.nextInt();

		do {
			suma=suma+n;
			n++;
			
		}while(n<=numero);
		
		System.out.println("suma de numeros de 0 hasta " + numero + " es :"+suma);
		teclado.close();
		

	}

}
