package ud1;

import java.util.Scanner;

public class EdeEj3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Let N be any number then the square root of N can be given by the formula:
	//root = 0.5 * (X + (N / X)) where X is any guess which can be assumed to be N or 1.
	//In the above formula, 
	//X is any assumed square root of N and root is the correct square root of N.

		Scanner sc = new Scanner(System.in);
		//la tasa de eror que el usario ha entrado
		double tasa_error;
		//Valor inicial de la raíz antes de empezar a calcular la aproximación
		double raiz=0;
		//el numero que el usario ha entrado para hacer la aproximación de su raíz
		double numero;
		//es la diferencia entre nueva aproximación y la última aproximación 
		double error;
		// Iniciamos el valor de x por 1 o de un valor random
		double x=1;//
		//
		do {
		System.out.println(" Introduce el numero N para calcular su raiz : ");
		numero=sc.nextInt();}while(numero<0);
		System.out.println(" Introduce la tasa de error : ");
		tasa_error=sc.nextDouble();
		
		do{
			//System.out.println("*******************");
			
			//calcular la aproximación de la raíz usando la fórmula
			raiz=0.5*( x +  numero/x );
			
			//System.out.println("root estimado es :"+root);
			
			//calcular el error de la nueva aproximación
			error=Math.abs(raiz-x);
			
			//System.out.println("erro calculado :"+error);
			//asignar una nueva aproximación calculada a x
			x=raiz;
			//System.out.println("nuevo valor de x = "+x);

			// bucle sigue calculando nueva proximaciones hasta error calulado 
			//sera mayor que la tasa de error ha l usario entrado
		}while(error>tasa_error) ;
	
		
		System.out.println(raiz);
		
		sc.close();
		
	}
		
}
