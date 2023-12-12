package mourabitOmar;

import java.util.Scanner;

public class AsignaturasMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Asignatura arr[] = new Asignatura[10];
		
		
		arr[0] = new Asignatura("asiga", "curso1", 20, 15);
		arr[1] = new Asignatura("asigb", "curso2", 10, 5);
		arr[2] = new Asignatura("asigc", "curso1", 30, 15);
		arr[3] = new Asignatura("asigd", "curso4", 100, 25);
		arr[4] = new Asignatura("asige", "curso5", 10, 5);
		arr[5] = new Asignatura("asigf", "curso1", 20, 10);
		arr[6] = new Asignatura("asigg", "curso7", 20, 15);
		arr[7] = new Asignatura("asigh", "curso8", 20, 3);

		int opcion;
		do {
			System.out.println("**************");
			System.out.println("1.Introducir asignaturas");
			System.out.println("2.Mostarr el porcentaje de aprobados de las asignaturas de una curso");
			System.out.println("3.Obtener las asignaturas por numero de aprobados");
			System.out.println("4.Modificar datos de una asignature concreta");
			System.out.println("5.mostrar");
			System.out.println("6.salir");

			System.out.println("Que queres hacer");
			int size = estalleno(arr);
			System.out.println("this is size" + size);
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				if (size == arr.length) {
					System.out.println("El array esta ellno");
				} else {
					introducirAsignaturas(arr, sc);
				}
				break;

			case 2:
				pocentajeAprobadosCurso(arr,sc);
				
				break;
			case 3:
				ordenarAsigNumAprobados(arr);
				break;
			case 4:
				modificarAsigDatos(arr,sc);
				break;
			case 5:
				mostrarTodos(arr);
				break;
			case 6:
				System.out.println("Hasta pronto.. ");
				break;
			default:
				System.out.println("Opcion no existe ");
				break;
			}

		} while (opcion != 6);// menu

	}// main

	public static int estalleno(Asignatura arr[]) {
		int pos = -1;
		boolean notEmpty = true;
		int i = 0;
		while (notEmpty && i < arr.length) {
			if (arr[i] == null) {
				notEmpty = false;
				pos = i;
			}
			i++;
		}
		if (pos == -1) {
			return arr.length;
		} else {
			return pos;
		}
	}

	public static void introducirAsignaturas(Asignatura arr[], Scanner sc) {
		String nombre;
		String opcions = "si";
		int pos;
		boolean a = true;
		int size;
		do {
			size = estalleno(arr);
			if (size == arr.length) {
				System.out.println("No puedes depasar el array size");
				a = false;
			} else {
				System.out.println("Introduce el nombre de la asignatura :");
				nombre = sc.next();

				if (size == 0) {
					llenarAsignaturaInfo(arr, size, nombre, sc);
				} else if (size == arr.length) {
					System.out.println("Esta lleno");
				} else {
					pos = buscar(arr, nombre);
					if (pos == -1) {
						llenarAsignaturaInfo(arr, size, nombre, sc);
					} else {
						System.out.println("este matricula existe");
					}
				}

				System.out.println("Queries introducia otra asignatura:(si/no) ");
				opcions = sc.next();
			}

		} while (!opcions.equalsIgnoreCase("no") && a);

	}

	public static int buscar(Asignatura arr[], String nombre) {
		boolean notFound = true;
		int foundPos = -1;
		int i = 0;
		int size = estalleno(arr);
		while (notFound && i < size) {
			if (nombre.equalsIgnoreCase(arr[i].getNombre())) {
				notFound = false;
				foundPos = i;
			}
			i++;
		}
		return foundPos;
	}

	public static int buscarCurso(Asignatura arr[], String nombre) {
		boolean notFound = true;
		int foundPos = -1;
		int i = 0;
		int size = estalleno(arr);
		while (notFound && i < size) {
			if (nombre.equalsIgnoreCase(arr[i].getCurso())) {
				notFound = false;
				foundPos = i;
			}
			i++;
		}
		return foundPos;
	}
	public static void llenarAsignaturaInfo(Asignatura arr[], int size, String nombre, Scanner sc) {
		String curso;
		int numAlumnos, numSuspensos;
		System.out.println("Introduce el curso de la asignatura :");
		curso = sc.next();
		System.out.println("Introduce el numero de matriculados de la asignatura :");
		numAlumnos = sc.nextInt();
		do {
			System.out.println("Introduce el numero de suspensos de la asignatura :");
			numSuspensos = sc.nextInt();
			if (numSuspensos > numAlumnos) {
				System.out.println("num de suspensos no puede ser mayor que num dealumnos");
			}
		} while (numSuspensos > numAlumnos);

		arr[size] = new Asignatura(nombre, curso, numAlumnos, numSuspensos);

		System.out.println("La asignatura  ha sido introducida :");
	}
	public static void pocentajeAprobadosCurso(Asignatura arr[],Scanner sc) {
		int size, pos;
		String curso;

		size=estalleno(arr);
		Asignatura cursos[]= new Asignatura[size];

		System.out.println("Introduce el nombre de el curso :");
		curso = sc.next();
		int k=0;
		pos = buscarCurso(arr, curso);
		if (pos == -1) {
			System.out.println("Esa curso No existe:");
		} else {
			System.out.println("Here :");
			
			for(int i=0;i<size ;i++) {
				if(curso.equalsIgnoreCase(arr[i].getCurso())) {
					cursos[k]=arr[i];
					k++;
				}
				
			}
			int z=0;
			while(cursos[z]!= null && z<cursos.length) {
				System.out.println(cursos[z].getNombre() + " el porcentaje de aprobados "+cursos[z].porcentajeAprobados()+"%");
			z++;
			}
		}
	}
	public static void ordenarAsigNumAprobados(Asignatura arr[]) {
		int size;
		
		size = estalleno(arr);
		
		for(int i=0;i<size ;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i].obtenerNumeroAprobados()> arr[j].obtenerNumeroAprobados()) {
					Asignatura temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}
		}
		for(int i=0;i<size ;i++) {
			System.out.println(arr[i]);
		}
	
	}
	
	public static void modificarAsigDatos(Asignatura arr[],Scanner sc ) {
		String nombre;
		int pos;
		int size;
		String opc;
		size=estalleno(arr);
		
		
		System.out.println("Introduce el nombre de la asignatura :");
		nombre = sc.next();
		
		pos = buscar(arr, nombre);
		if (pos == -1) {
			System.out.println("Esa asignatura No existe:");

		} else {
		
			System.out.println("Queries camibar el nombre de la asignatura :");
			opc = sc.next();
			if(opc.equalsIgnoreCase("si")) {
				System.out.println("Introduce nuevo nombre de la asignatura :");
				nombre = sc.next();
				arr[pos].setNombre(nombre);
			}
			
			String curso ;
			int numAlumnos, numSuspensos;
			System.out.println("Queries camibar el curso de la asignatura :");
			opc = sc.next();
			if(opc.equalsIgnoreCase("si")) {
				System.out.println("Introduce el curso de la asignatura :");
				curso = sc.next();
				arr[pos].setCurso(curso);

			} 

			System.out.println("Queries camibar el numero de matriculados de lade la asignatura :");
			opc = sc.next();
			if(opc.equalsIgnoreCase("si")) {
				System.out.println("Introduce el numero de matriculados de la asignatura :");
				numAlumnos = sc.nextInt();
				arr[pos].setNumAlumnos(numAlumnos);
			} 
			
			System.out.println("Queries camibar el numero de de suspensos de de lade la asignatura :");
			opc = sc.next();
			if(opc.equalsIgnoreCase("si")) {
				do {
					System.out.println("Introduce el numero de suspensos de la asignatura :");
					numSuspensos = sc.nextInt();
					arr[pos].setNumSuspensos(numSuspensos);
					if (numSuspensos > arr[pos].getNumAlumnos()) {
						System.out.println("num de suspensos no puede ser mayor que num dealumnos");
					}
				} while (numSuspensos > arr[pos].getNumAlumnos());
				
			} 
			
		}
	}

	public static void mostrarTodos(Asignatura arr[]) {
		int size;
		size = estalleno(arr);
		if(size==0) {
			System.out.println("No hay nada ");
		}else {
			for (int i = 0; i < size; i++) {
				System.out.println(arr[i]);
			}
		}
		

	}

}// class
