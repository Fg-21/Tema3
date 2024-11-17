package boletinfunciones;

import java.util.Random;
import java.util.Scanner;

public class E1 {
	public static void main(String[] args) {
		/*
		 * Realiza una función que reciba como parámetro una tabla de enteros y devuelva
		 * la suma de todos los valores almacenados en la tabla. Prueba el
		 * comportamiento de la función en un método main.
		 */

		// Creamos la variable para guardar el número de filas de la tabla
		int filas;

		// Creamos la variable para guardar el número de columnas de la tabla
		int colum;

		// Definimos la tabla que va a estar llena de enteros
		int tabla[][];

		// Creamos la variable sumTab
		int sumTab = 0;

		// Abrimos scanner
		Scanner rd = new Scanner(System.in);

		// Importamos random
		Random rand = new Random();

		// Preguntamos al usuario las filas y columnas
		System.out.println("Introduce las filas");
		filas = rd.nextInt();

		System.out.println("Introduce las columnas");
		colum = rd.nextInt();

		// Generamos la tabla con las filas y columnas que dijo el usuario
		tabla = new int[filas][colum];

		// Llenamos la tabla con números random
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = rand.nextInt(11);
			}
		}

		// Llamamos a la funcion suma
		int sumar = suma(tabla, sumTab);

		// Imprimimos la suma por pantalla
		System.out.println("La suma de los números de la tabla es: " + sumar);

		// Cerramos scanner
		rd.close();

	}

	// Creamos la función suma
	static int suma(int tabla[][], int sumTab) {

		// Sumamos todos los valores de la tabla y los guardamos en la variable suma
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				sumTab += tabla[i][j];
			}
		}

		// Devolvemos la suma
		return (sumTab);
	}

}
