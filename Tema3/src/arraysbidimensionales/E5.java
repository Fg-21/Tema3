package arraysbidimensionales;

import java.util.Random;

public class E5 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que genere 20 números enteros aleatorios entre 100 y 999.
		 * Estos números se deben introducir en un array de 4 filas por 5 columnas.
		 * Seguidamente, muestra el array por pantalla junto con las sumas parciales de
		 * filas y columnas, igual que si de una hoja de cálculo se tratara. La suma
		 * total debe aparecer en la esquina inferior derecha. Un ejemplo de cómo deben
		 * mostrarse dichas sumas parciales sería:
		 */

		// Creamos la tabla
		int tabla[][] = new int[5][6];

		// Creamos una variable para guardar la suma de las columnas y filas
		int suma = 0;

		// Importamos random
		Random rand = new Random();

		// Añadimos los valores aleatorios a la tabla
		for (int i = 0; i < tabla.length - 1; i++) {
			for (int j = 0; j < tabla[i].length - 1; j++) {
				tabla[i][j] += rand.nextInt(100, 1000);
			}
		}

		// Sumamos los valores de cada una de las filas
		for (int i = 0; i < tabla.length - 1; i++) {
			for (int j = 0; j < tabla[i].length - 1; j++) {
				suma += tabla[i][j];
				tabla[i][tabla[j].length - 1] = suma;
			}
			suma = 0;
		}

		// Sumamos los valores de cada una de las columnas
		for (int j = 0; j < tabla[0].length - 1; j++) {
			for (int i = 0; i < tabla.length - 1; i++) {
				suma += tabla[i][j];
				tabla[tabla.length - 1][j] = suma;
			}
			suma = 0;
		}

		// Hacemos la suma total de filas y columnas
		for (int i = 0; i < tabla.length - 1; i++) {
			for (int j = 0; j < tabla[i].length - 1; j++) {
				suma += tabla[i][j];
				tabla[tabla.length - 1][tabla[i].length - 1] = suma;
			}
		}

		// Imprimimos la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t |");
			}
			System.out.println();
		}

	}
}
