package boletinfunciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E3 {
	public static void main(String[] args) {
		/*
		 * Escribir la función int[] rellenaPares(int longitud, int fin), que crea y
		 * devuelve una tabla ordenada de la longitud especificada, que se encuentra
		 * rellena con números pares aleatorios comprendidos entre 2 hasta fin
		 * inclusive.
		 */

		// Creamos la variable para la longitud
		int longitud;

		// Creamos la variable para el final
		int fin;

		// Abrimos scanner
		Scanner rd = new Scanner(System.in);

		// Preguntamos al usuario la logitud y el fin
		System.out.println("Introduce la longitud");
		longitud = rd.nextInt();

		System.out.println("Introduce el fin");
		fin = rd.nextInt();

		// Llamamos a la función
		int tabla[] = rellenaPares(longitud, fin);
		
		//Mostramos la tabla
		System.out.println(Arrays.toString(tabla));
		
		//Cerramos scanner
		rd.close();
		
	}

	static int[] rellenaPares(int longitud, int fin) {
		// Creamos la tabla
		int t[] = new int[longitud];

		// Importamos random
		Random rand = new Random();

		// Creamos una variable para almacenar el número aleatorio provisionalmente
		int numRand = 0;
		// Rellenamos la tabla
		for (int i = 0; i < t.length; i++) {

			do {
				// Generamos número aleatorio
				numRand = rand.nextInt(2, fin + 1);
			} while (numRand % 2 == 1);

			// Asignamos el número aleatorio a la posición de la tabla
			t[i] = numRand;
		}

		// Ordenamos la tabla
		Arrays.sort(t);

		return t;
	}

}
