package ud4;

public class PersonaExampleMain {

	public static void main(String[] args) {
		
		// atriutos public 
		// constructor 1
		//Persona p = new Persona();
		
		//dni y edad son public
		//System.out.println(p.dni);
		//System.out.println(p.edad);
		
		// nombre es private
		//System.out.println(p.nombre);
		
		//with constructor 2
		//Persona p2 = new Persona("miNombre",100);
		
		//with construcor 3
		//Persona p3 = new Persona(15,true,1.75);
	
		//p4 es copia de p3
		//Persona p4 = new Persona(p3);
		
		//System.out.println(p3.edad);
		//System.out.println(p4.edad);
		//p4.edad=100;
		//System.out.println(p4.edad);
		
		// atriutos private 


		
		PersonaExample p = new PersonaExample();

		
		//dni y edad son public
		 System.out.println(p.getAltura());
		 System.out.println(p.getEdad());

		// nombre es private
		// System.out.println(p.nombre);

		// with constructor 2
		// Persona p2 = new Persona("miNombre",100);

		// with construcor 3
		PersonaExample p3 = new PersonaExample(15,true,1.75);

		// p4 es copia de p3
		PersonaExample p4 = new PersonaExample(p3);

		// System.out.println(p3.edad);
		// System.out.println(p4.edad);
			p4.setEdad(100);
			System.out.println(p4.getEdad());
			
		// to string method
			System.out.println("****");
			System.out.println(p4.toString());
			
			// llamar a otro methodo 
			p4.sumarEdad();
	}

}
