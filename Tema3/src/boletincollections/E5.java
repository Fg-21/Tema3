package boletincollections;

import java.util.ArrayList;
import java.util.Scanner;

public class E5 {
	/*
	 * Introduce por teclado, hasta que se introduzca “fin”, una serie de nombres,
	 * que se insertarán en una colección, de forma que se conserve el orden de
	 * inserción y que no puedan repetirse. Al final, la colección se mostrará por
	 * pantalla.
	 */

	public static void main(String[] args) {
		// Lista para guardar los nombres
		ArrayList<String> listaNombres = new ArrayList<String>();

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
