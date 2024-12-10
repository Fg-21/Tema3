package boletinfunciones;

import java.util.Arrays;
import java.util.Random;

public class E1V2 {
	public static void main(String[] args) {
		/*
		 * Realiza una función que reciba una tabla de dos dimensiones. A continuación,
		 * debe devolver un array de dos posiciones que contenga el mínimo en la
		 * posición 0 y el máximo en la posición 1. Define un método main que rellene un
		 * array de 6 filas por 10 columnas con números enteros positivos comprendidos
		 * entre 0 y 1000 (ambos incluidos). A continuación, debe llamar a la función
		 * con este array y mostrar por consola los valores mínimo y máximo de la tabla.
		 */
		
		//Creamos la tabla para guardar los números
		int t[][] = new int[6][10];
		
		//Creamos una tabla para guardar el máximo y mínimo devuelto por la función
		int minMax[] = new int [2];
		
		//Importamos random
		Random rand = new Random();
		
		//Rellenamos la tabla
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				t[i][j] = rand.nextInt(0, 1001);
			}
		}
		
		//Llamamos a la funcion max y min
		minMax = minimoMaximo(t);
		
		//Imprimimos la tabla de los máximos y mínimos
		System.out.println(Arrays.toString(minMax));
	}

	// Creamos la función par el máximo y el mínimo
	static int[] minimoMaximo(int t[][]) {
		// Crea una tabla para guardar los máximos y mínimos
		int tablaminmax[] = new int[2];

		// Creamos una variable para los máximos
		int max = Integer.MIN_VALUE;

		// Creamos una variable para los mínimos
		int min = Integer.MAX_VALUE;

		// Recorremos la tabla definiendo los máximos y mínimos
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				if (t[i][j] > max) {
					max = t[i][j];
				} else if (t[i][j] < min) {
					min = t[i][j];
				}
			}
		}
		
		//Añadimos los máxmos y mínimos a su tabla
		tablaminmax[0] = min;
		tablaminmax[1] = max;

		return tablaminmax;
	}

}
