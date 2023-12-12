package ud5;

public class EjemplosMain {

	public static void main(String[] args) {
		
		//artista
		Artista a1 = new Artista();
		System.out.println(a1);
		Artista a2 = new Artista("Kaki",99,1000);
		System.out.println(a2);
		
		// cantante
		Cantante c1= new Cantante();
		System.out.println(c1);
		c1.mostrar();
		Cantante c2= new Cantante("Al",25,100,true);
		c2.mostrar();

	}

}
