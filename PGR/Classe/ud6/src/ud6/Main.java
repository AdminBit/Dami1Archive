package ud6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Alumno> alArr = new ArrayList<Alumno>();

		char opc;
		ArrayList<Modulos> m1 = new ArrayList<Modulos>();
		ArrayList<Modulos> m2 = new ArrayList<Modulos>();
		ArrayList<Modulos> m3 = new ArrayList<Modulos>();
		ArrayList<Modulos> m4 = new ArrayList<Modulos>();

		m1.add(new Modulos("PGR", 0));
		m1.add(new Modulos("SIS", 10));
		m1.add(new Modulos("LMS", 10));
		m1.add(new Modulos("EDE", 4));

		m2.add(new Modulos("PGR", 10));
		m2.add(new Modulos("AND", 2));
		m2.add(new Modulos("IOS", 9));
		m2.add(new Modulos("EDE", 0));

		m3.add(new Modulos("PGR", 5));
		m3.add(new Modulos("SIS", 10));
		m3.add(new Modulos("LMS", 5));
		m3.add(new Modulos("EDE", 3));

		m4.add(new Modulos("PGR", 4.9));
		m4.add(new Modulos("AND", 3));
		m4.add(new Modulos("IOS", 5));
		m4.add(new Modulos("EDE", 0));

		alArr.add(new Alumno("a1", "a", "aa", "dami", false, m1));
		alArr.add(new Alumno("a4", "b", "bb", "dami", false, m2));
		alArr.add(new Alumno("a3", "c", "cc", "dam", true, m3));
		alArr.add(new Alumno("a2", "d", "dd", "dam", true, m4));

		do {

			System.out.println("a. Matricular alumno/a/s");
			System.out.println("b. Listado de alumno/a/s");
			System.out.println("c. Listado de toda la información disponible de un alumno/a");
			System.out.println("d. Introducir nota/s de un alumno/a ");
			System.out.println("e. Modificar la nota de un módulo ");
			System.out.println("f. Dar de baja a un alumno/a  ");
			System.out.println("g. Dar de baja un modulo de un alumno/a");
			System.out.println("h. Introducir las notas de un módulo concreto");
			System.out.println("i. Nota media de los alumno/as de un ciclo");
			System.out.println("j. Mostrar los alumno/as ordenados por nif");
			System.out.println("k. Mostrar los alumnos que hayan suspendido un módulo concreto.");
			System.out.println("l. Mostrar la nota más alta y la más baja de un módulo.");
			System.out.println("m. Alumnos sin evaluar en un módulo concreto");
			System.out.println("n. Listado de los repetidores");
			System.out.println("o. Listado del nº de suspensos");
			System.out.println("p. Nota media de un módulo concreto");
			System.out.println("s. Salir");

			System.out.println("Que queres hacer :");

			opc = sc.next().charAt(0);
			switch (opc) {
			case 'a':
				matricularAlumno(sc, alArr);
				break;
			case 'b':
				listarAlumnos(alArr);
				break;
			case 'c':
				alumnoInfo(alArr, sc);
				break;
			case 'd':
				introducirNotas(alArr, sc);
				break;
			case 'e':
				modificarNotaModulo(alArr, sc);
				break;
			case 'f':
				darBajaAlumno(alArr, sc);
				break;
			case 'g':
				darBajaModuloAlumno(alArr, sc);
				System.out.println("I'm here");
				break;
			case 'h':
				introducirNotasModuloConcreto(alArr, sc);
				break;
			case 'i':
				notaMediaAlumnoCiclo(alArr, sc);
				break;
			case 'j':
				mostrarAlumnoOrdenadosNif(alArr);
				break;
			case 'k':
				mostrarSuspendidoModulo(alArr, sc);
				break;
			case 'l':
				mostrarNotaAltaBajaModulo(alArr, sc);
				break;
			case 'm':
				alumnosSinEvalModulo(alArr, sc);
				break;
			case 'n':
				listarRepetidores(alArr, sc);
				break;
			case 'o':
				listarNumSuspensos(alArr, sc);
				break;
			case 'p':
				notaMediaModulo(alArr, sc);
				break;
			case 's':
				System.out.println("Hasta pronto ...");
				break;
			default:
				System.out.println("Opcion no existe ");
				break;
			}

		} while (opc != 's' || opc != 'S');

	}// main

	//
	public static void matricularAlumno(Scanner sc, ArrayList<Alumno> alArr) {
		String nif;
		String nombre;
		String apellido;
		String ciclo;

		boolean noExiste = true;
		boolean repetido;

		String moduloNom;
		double moduloNota;
		String continuar;
		Modulos m;
		ArrayList<Modulos> mList = new ArrayList<Modulos>();

		System.out.println("introduzca nif :");
		nif = sc.next();
		for (Alumno a : alArr) {
			if (a.getNif().equalsIgnoreCase(nif)) {
				noExiste = false;
				System.out.println("ya existe");
			} else {

			}
		}
		if (noExiste) {
			System.out.println("introduzca nombre :");
			nombre = sc.next();

			System.out.println("introduzca apellido :");
			apellido = sc.next();

			System.out.println("introduzca ciclo :");
			ciclo = sc.next();

			System.out.println("introduzca repetido :");
			repetido = sc.nextBoolean();

			do {
				System.out.println("introduzca modulo nombre :");
				moduloNom = sc.next();
				System.out.println("introduzca modulo nota :");
				moduloNota = sc.nextDouble();
				m = new Modulos(moduloNom, moduloNota);
				if (mList.contains(m)) {
					System.out.println("Modula ya existe.. ");
				} else {
					mList.add(m);
				}
				do {
					System.out.println("Queries andir mas modulos(si/no) :");
					continuar = sc.next();
				} while (!(continuar.equalsIgnoreCase("si") || continuar.equalsIgnoreCase("no")));

			} while (continuar.equalsIgnoreCase("si"));

			alArr.add(new Alumno(nif, nombre, apellido, ciclo, repetido, mList));
		}

	}

	//

	public static void listarAlumnos(ArrayList<Alumno> alArr) {
		for (Alumno a : alArr) {
			System.out.println("*" + a.getNombre() + " " + a.getApellido());
		}
	}

	//
	public static void alumnoInfo(ArrayList<Alumno> alArr, Scanner sc) {
		String nif;

		System.out.println("introduzca nif :");
		nif = sc.next();

		for (Alumno a : alArr) {
			if (a.getNif().equalsIgnoreCase(nif)) {
				System.out.println("*** Info Alumno Conf NIF : " + a.getNif() + " ***");
				System.out.println("Nombre y Apellido : " + a.getNombre() + " " + a.getApellido());
				System.out.println("Ciclo : " + a.getCiclo());
				System.out.println("*** Info Modulos ***");
				for (Modulos m : a.getM()) {
					if (m.getNota() != 0) {
						System.out.println("-Modulo : " + m.getNombre() + " -Nota : " + m.getNota());
					} else {
						System.out.println("-Modulo : " + m.getNombre() + " -SIN Nota : ");
					}
				}

			}
		}
	}

	//
	public static void introducirNotas(ArrayList<Alumno> alArr, Scanner sc) {
		String nombre, apellido;
		int pos = -1;
		int nota;
		String opcion;
		boolean notaNull = false;

		System.out.println("introduzca Nombre :");
		nombre = sc.next();

		System.out.println("introduzca Apellido :");
		apellido = sc.next();

		for (Alumno a : alArr) {
			if (a.getNombre().equalsIgnoreCase(nombre) && a.getApellido().equalsIgnoreCase(apellido)) {
				pos = alArr.indexOf(a);
			}
		}

		if (pos == -1) {
			System.out.println("Alumno no existe");
		} else {

			System.out.println("Alumno esta matriculado en " + alArr.get(pos).getCiclo());

			int numMudols = alArr.get(pos).getM().size();
			System.out.println("** Modulos sin nota *** ");
			for (int i = 0; i < numMudols; i++) {
				if ((alArr.get(pos).getM()).get(i).getNota() == 0) {
					System.out.println((alArr.get(pos).getM()).get(i).getNombre());
				}
			}
			for (int i = 0; i < numMudols; i++) {
				if ((alArr.get(pos).getM()).get(i).getNota() == 0) {
					notaNull = true;

					do {
						System.out.println("Queres intraducira la nota de " + (alArr.get(pos).getM()).get(i).getNombre()
								+ " (si/no)");
						opcion = sc.next();
					} while (!(opcion.equalsIgnoreCase("si") || opcion.equalsIgnoreCase("no")));

					if (opcion.equalsIgnoreCase("si")) {
						do {
							System.out.println("introduzca la nota :");
							nota = sc.nextInt();
						}while(nota>10 || nota <1);
						
						(alArr.get(pos).getM()).get(i).setNota(nota);
					}
				}

			}
			if (!notaNull) {
				System.out.println("todas modulos tienen nota");
			}
			//System.out.println(alArr.get(pos));
		}

	}

	//
	public static void modificarNotaModulo(ArrayList<Alumno> alArr, Scanner sc) {
		String nif, modulo;
		double nota;
		boolean alumnoExiste = false;
		boolean moduloExiste = false;
		System.out.println("introduzca NIF :");
		nif = sc.next();
		System.out.println("introduzca modulo :");
		modulo = sc.next();

		for (Alumno a : alArr) {
			if (a.getNif().equalsIgnoreCase(nif)) {
				alumnoExiste = true;
				for (Modulos m : a.getM()) {
					if (m.getNombre().equalsIgnoreCase(modulo)) {
						moduloExiste = true;
						if (m.getNota() == 0) {
							System.out.println("aún no se ha introducido :");
							do {
								System.out.println("Introduzca la nota  :");
								nota = sc.nextDouble();
								if (nota > 10 || nota <1) {
									System.out.println("La nota no pudede ser 0 o mayor que 10");
								}
							} while (nota > 10 || nota <1);
							m.setNota(nota);
						} else {
							do {
								System.out.println("nueva nota  :");
								nota = sc.nextDouble();
								if (nota > 10 || nota <1) {
									System.out.println("La nota no pudede ser 0 o mayor que 10");
								}
							} while (nota > 10 || nota <1);
							m.setNota(nota);
						}
					}
				}
			}
		}
		if (!alumnoExiste) {
			System.out.println("Alumno no existe");
		}
		if (!moduloExiste) {
			System.out.println("Modulo no existe");
		}
	}

	//
	public static void darBajaAlumno(ArrayList<Alumno> alArr, Scanner sc) {
		String nif;
		int pos = -1;
		String opcion;
		System.out.println("introduzca NIF :");
		nif = sc.next();

		for (Alumno a : alArr) {
			if (a.getNif().equalsIgnoreCase(nif)) {
				pos = alArr.indexOf(a);
			}
		}
		if (pos == -1) {
			System.out.println("error no existe");
		} else {
			do {
				System.out.println("Queres borrar alumno con nif :" + nif + " (si/no)");
				opcion = sc.next();
			} while (!(opcion.equalsIgnoreCase("si") || opcion.equalsIgnoreCase("no")));

			if (opcion.equalsIgnoreCase("si")) {
				alArr.remove(pos);
				System.out.println("Alumno com nif : " + nif + " borrado");
			}
		}
	}

	//
	public static void darBajaModuloAlumno(ArrayList<Alumno> alArr, Scanner sc) {
		String nif;
		String modulo;
		String opcion;
		int pos = -1;
		int posSinMod = -1;

		System.out.println("introduzca NIF :");
		nif = sc.next();
		for (Alumno a : alArr) {

			if (a.getNif().equalsIgnoreCase(nif)) {
				for (Modulos m : a.getM()) {
					System.out.println(m.getNombre());
				}
				System.out.println("introduzca nombre de modulo por dar baja :");
				modulo = sc.next();
				for (Modulos m : a.getM()) {
					if (m.getNombre().equalsIgnoreCase(modulo)) {
						pos = a.getM().indexOf(m);

					}
				}
				if (pos == -1) {
					System.out.println("Modulo noExiste ");

				} else {
					do {
						System.out.println("queres dar baja a lumno con nif " + nif + " del modulo :" + modulo);
						opcion = sc.next();
					} while (!(opcion.equalsIgnoreCase("si") || opcion.equalsIgnoreCase("no")));

					if (opcion.equalsIgnoreCase("si")) {
						a.getM().remove(pos);
						System.out.println("bajado alumnno de Modulo");
					}
				}

			}
			if (a.getM().size() == 0) {
				posSinMod = alArr.indexOf(a);
			}

		}
		if (posSinMod != -1) {
			alArr.remove(posSinMod);
			System.out.println("Alumo sin modulos : auto dar baja ");

		}

	}

	//
	public static void introducirNotasModuloConcreto(ArrayList<Alumno> alArr, Scanner sc) {
		String modulo;
		String opcion;
		double nota;
		boolean noExiste = true;

		System.out.println("introduzca modulo :");
		modulo = sc.next();
		for (Alumno a : alArr) {
			for (Modulos m : a.getM()) {
				if (m.getNombre().equalsIgnoreCase(modulo) && m.getNota() == 0) {
					noExiste = false;
					System.out.println(a.getNombre() + "  " + a.getApellido() + " No tiene nota en este modulo");
					do {
						System.out.println("queres añadir nota (si/no) ");
						opcion = sc.next();
					} while (!(opcion.equalsIgnoreCase("si") || opcion.equalsIgnoreCase("no")));

					if (opcion.equalsIgnoreCase("si")) {
						do {
							System.out.println("Introduzca la nota");
							nota = sc.nextDouble();
							if (nota > 10 || nota < 1) {
								System.out.println("La nota no se puede ser mayor que 10 or menor que 1");
							}
						} while (nota > 10 || nota < 1);
						m.setNota(nota);
					}
				}

			}
		}
		if (noExiste) {
			System.out.println("No hay ningun alumno en el modulo " + modulo + " sin nota ");
		}
	}

	//
	public static void notaMediaAlumnoCiclo(ArrayList<Alumno> alArr, Scanner sc) {
		String ciclo;
		double sumaNotaAlumno;
		double mediaAlumno = 0;
		double sumaNotasCiclo = 0;
		int alumnosCiclo = 0;

		System.out.println("introduzca ciclo :");
		ciclo = sc.next();
		for (Alumno a : alArr) {
			if (a.getCiclo().equalsIgnoreCase(ciclo)) {
				alumnosCiclo++;
				sumaNotaAlumno = 0;
				mediaAlumno = 0;
				for (Modulos m : a.getM()) {
					sumaNotaAlumno = sumaNotaAlumno + m.getNota();
				}
				mediaAlumno = sumaNotaAlumno / (a.getM().size());
				sumaNotasCiclo = sumaNotasCiclo + mediaAlumno;

			}
		}

		System.out.println("Nota media ciclo : " + sumaNotasCiclo / alumnosCiclo);
	}

	//
	public static void mostrarAlumnoOrdenadosNif(ArrayList<Alumno> alArr) {
		Collections.sort(alArr);
		for (Alumno a : alArr) {
			System.out.println(a);
		}

	}

	public static void mostrarSuspendidoModulo(ArrayList<Alumno> alArr, Scanner sc) {
		String modulo;

		System.out.println("introduzca el modulo :");
		modulo = sc.next();
		System.out.println("***Alumnos suspendidos en modulo " + modulo + "***");

		for (Alumno a : alArr) {
			for (Modulos m : a.getM()) {
				if (m.getNombre().equalsIgnoreCase(modulo)) {
					{
						if (m.getNota() > 0 && m.getNota() < 5) {
							System.out.println("- " + a.getNombre() + " " + a.getApellido());
						}
					}
				}
			}
		}

	}

	public static void mostrarNotaAltaBajaModulo(ArrayList<Alumno> alArr, Scanner sc) {
		String modulo;
		double notaAlta = 0.1;
		double notaBaja = 10;

		System.out.println("introduzca el modulo :");
		modulo = sc.next();
		for (Alumno a : alArr) {
			for (Modulos m : a.getM()) {
				if (m.getNombre().equalsIgnoreCase(modulo)) {
					{
						if (m.getNota() > 0 && m.getNota() > notaAlta) {
							notaAlta = m.getNota();
						}

						if (m.getNota() > 0 && m.getNota() < notaBaja) {
							notaBaja = m.getNota();
						}
					}
				}
			}
		}
		System.out.println("***Nota Alta y Baja en modulo " + modulo + "***");
		System.out.println("Nota Alta en modulo " + notaAlta);
		System.out.println("Nota Baja en modulo " + notaBaja);

	}

	public static void alumnosSinEvalModulo(ArrayList<Alumno> alArr, Scanner sc) {
		String modulo;

		System.out.println("introduzca el modulo :");
		modulo = sc.next();
		System.out.println("***lista de alumnos sin evaluar en modulo " + modulo + "***");

		for (Alumno a : alArr) {
			for (Modulos m : a.getM()) {
				if (m.getNombre().equalsIgnoreCase(modulo) && m.getNota() == 0) {
					{
						System.out.println("- " + a.getNombre() + " " + a.getApellido());
					}
				}
			}
		}
	}

	//
	public static void listarRepetidores(ArrayList<Alumno> alArr, Scanner sc) {
		String ciclo;

		System.out.println("introduzca el ciclo :");
		ciclo = sc.next();
		System.out.println("***lista de repitdores del ciclo " + ciclo + "***");

		for (Alumno a : alArr) {
			if (a.getCiclo().equalsIgnoreCase(ciclo)) {
				if (a.isRepetidor()) {
					System.out.println("- " + a.getNombre() + " " + a.getApellido());
				}
			}
		}

	}

	//
	public static void listarNumSuspensos(ArrayList<Alumno> alArr, Scanner sc) {
		String ciclo;
		int sumaNumSuspensos = 0;

		System.out.println("introduzca el modulo para calcular su media :");
		ciclo = sc.next();
		for (Alumno a : alArr) {
			if (a.getCiclo().equalsIgnoreCase(ciclo)) {
				for (Modulos m : a.getM()) {
					if (m.getNota() > 0 && m.getNota() < 5) {
						sumaNumSuspensos++;
					}
				}
			}
		}
		System.out.println("Num de suspesos del ciclo :" + ciclo + " son :" + sumaNumSuspensos);
	}

	//
	public static void notaMediaModulo(ArrayList<Alumno> alArr, Scanner sc) {
		String modulo;
		double sumaNota = 0;
		int count = 0;

		System.out.println("introduzca el modulo para calcular su media :");
		modulo = sc.next();
		for (Alumno a : alArr) {
			for (Modulos m : a.getM()) {
				if (m.getNombre().equalsIgnoreCase(modulo)) {
					sumaNota = sumaNota + m.getNota();
					count++;
				}

			}
		}
		System.out.println("Nota media de modulo :" + modulo + " es : " + sumaNota / count);
	}

}// class
