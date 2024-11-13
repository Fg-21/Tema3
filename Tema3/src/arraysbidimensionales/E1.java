package arraysbidimensionales;

import java.util.Arrays;

public class E1 {
	public static void main(String[] args) {
		/*
		 * Define un array de números enteros de 3 filas por 6 columnas con nombre num y
		 * asigna los valores según la siguiente tabla. Muestra el contenido de todos
		 * los elementos del array dispuestos en forma de tabla como se muestra en la
		 * figura.
		 */

		// Creamos el array bidimensional
		int arr[][] = new int[3][6];

		// Asignamos los números del enunciado a las posiciones correspondientes
		arr[0][0] = 0;
		arr[0][1] = 30;
		arr[0][2] = 2;
		arr[0][5] = 2;
		arr[1][0] = 75;
		arr[1][4] = 0;
		arr[2][2] = -2;
		arr[2][3] = 9;
		arr[2][5] = 11;

		// Creamos un bucle para recorrer todas las posiciones de la tabla e imprimirlas
		// en el formato pedido
		for (int y = 0; y < arr.length; y++) {
			for (int x = 0; x < arr[y].length; x++) {
				System.out.print(arr[y][x] + " ");
			}
			System.out.println();
		}
	}
}
