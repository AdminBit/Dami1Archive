package ud3;

import java.util.Scanner;

public class FuncExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int a []= {10,20,30,40,50};
//		int respuesta;
//			//mostrar(a);
//			respuesta=buscar(a,30);
//			System.out.println(respuesta);
//			if(respuesta==-1) {
//				System.out.println("no esta");
//
//			}else {
//				System.out.println(" esta en la posicion "+ respuesta);
//
//			}
			
			buscar1(a,sc);

	}//main
	
	
	// func mostrar
	public static void mostrar(int arr[]) {
		for(int i =0;i<arr.length ;i++) {
			System.out.println(arr[i]);
		}
	}
	// buscar
	public static int buscar(int arr[],int x) {
		boolean notfound=true;
		int i=0;
		int pos=-1;
		while(notfound && i<arr.length) {
			if(arr[i]== x) {
				notfound=false;
				pos=i;
			}
			i++;
		}	
		return pos;
	}
	
	// mostar with scanner
	public static void buscar1(int arr[],Scanner sca) {
		int num;
		int res;
		System.out.println("El numero que buscas  : ");
		num =sca.nextInt();
		//call first function
		res=buscar(arr,num);
		
		System.out.println(res);
		if(res==-1) {
			System.out.println("no esta");

		}else {
			System.out.println("esta en la posicion "+ res);

		}
	}
	
	
	//other example
	public static boolean bienvenida(String nombre, int edad ,int altura) {
		System.out.println(" Hola " +nombre);
		
		if(edad <18) {
			return false;
		} else {
			
			if(altura <160) {
				return false;
			}else {
				return true;
			}
			
		}
	}

}
