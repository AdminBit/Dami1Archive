package _10_Colecciones_y_diccionarios;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		// page 228
		// correction 716
		ArrayList<String> comp = new ArrayList<String>();
		comp.add("Nombre 1");
		comp.add("Nombre 2");
		comp.add("Nombre 3");
		comp.add("Nombre 4");
		comp.add("Nombre 5");
		comp.add("Nombre 6");
		//foreach
		for(String s:comp) {
			System.out.println(s);
		}

	}

}
