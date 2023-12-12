package ud1;

import java.util.Scanner;

public class EdeEj6 {

	public static void main(String[] args) {


		Scanner sc =new Scanner(System.in);
		
		String jugaName;
		//String jugadorMejor=" ";
		
		String mejorJugador=" ";
		int numJugadores;
		int pulsacReposo;
		int pulsaEsfuerzo;
		int pulsac3Reposo ;
		
		double mejorRecup=20;
		double recup;
		String msg="";
		
		System.out.println("Cuantos jugadores en el equipo :");
		numJugadores=sc.nextInt();
		
		for(int i =0 ;i<numJugadores ;i++ ) {
			
			System.out.println("*** El nombre de jugador : ***");
			jugaName=sc.next();
			
			System.out.println("número de pulsaciones en reposo : ");
			pulsacReposo=sc.nextInt();
			
			System.out.println("número de pulsaciones después de hacer un esfuerzo intenso : ");
			pulsaEsfuerzo=sc.nextInt();
		
			System.out.println("número de pulsaciones después de 3 min : ");
			pulsac3Reposo=sc.nextInt();
			//recup=pulsacReposo/(double) pulsac3Reposo;
			
			recup= (( pulsacReposo + pulsaEsfuerzo + pulsac3Reposo ) - 200) / 10;
			System.out.println(recup);
			//link
			//https://www.todomountainbike.net/general/test-de-ruffier-dickson-averigua-cual-es-tu-estado-de-forma-sin-salir-de-casa
			// de = 0 -8 // de 8-16 // 12 - 16 
			
			if(recup >0 && recup <8) {
				msg="Atleta en plena forma";
			}else if(recup>=8 && recup<12) {
				msg="El atleta necesita entrenamiento";
			}else if(recup>=12 && recup<16){
				msg="El atleta necesita revisión médica";
			}
			if(recup< mejorRecup) {
				mejorJugador=jugaName;
				mejorRecup=recup;
			}
			System.out.println(" Nombre : " + jugaName + " Estado :" + msg);
			
		}
		System.out.println("***************");
		System.out.println("");

		System.out.println("el mejor porcentagje es : "+mejorRecup+ " de atleta que se llama : " + mejorJugador);
		
		
		
		
		
		
		sc.close();

	}

}
