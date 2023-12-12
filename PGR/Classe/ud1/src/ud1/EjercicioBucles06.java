package ud1;

import java.util.Scanner;

public class EjercicioBucles06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double nota1,notaTotal=0;
		
		int aprobadCounter=0;
		
		for(int m=0;m<3 ;m++ ){
			do {
				System.out.println("Introduce la nota de asignatura  " + (m+1) +" : ");
				nota1=sc.nextDouble();
				if(!(nota1 >10 || nota1 <0 ) && nota1>=5) {
					aprobadCounter++;
				}
			}while(nota1 >10 || nota1 <0);
			notaTotal=notaTotal+nota1;

		}
		
	System.out.println("la nota media : " + (notaTotal)/3);
	System.out.println("APROBADA : " + aprobadCounter + " Asignaturas ");
	System.out.println("suspendido : " +(3- aprobadCounter) +" Asignaturas ");

		sc.close();
	}

}
