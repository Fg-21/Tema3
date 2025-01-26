package boletincollections;

import java.util.Scanner;
import java.util.TreeSet;

public class E6 {
	/*
	 * Repite la actividad anterior de forma que se inserten los nombres manteniendo
	 * el orden alfabético.
	 */

	public static void main(String[] args) {
		// Conjunto para guardar los nombres por orden alfabético
		TreeSet<String> listaNombres = new TreeSet<String>();

		// Objeto scanner
		Scanner rd = new Scanner(System.in);

		// Variable para guardar los nombres
		String name;

		// Preguntamos al usuario la primera vez
		System.out.println("Introduce un nombre");
		name = rd.nextLine();

		// Mientras que el usuario no ponga fin, seguimos añadiendo los nombres a la
		// lista
		while (!name.equals("fin")) {

			// Si el nombre no se repite lo añadimos
			if (!listaNombres.contains(name)) {
				listaNombres.add(name);
			}

			// Preguntamos al usuario
			System.out.println("Introduce un nombre");
			name = rd.nextLine();
		}

		// Imprimimos la lista al final
		System.out.println(listaNombres);

		// Cerramos scanner
		rd.close();

	}
}
