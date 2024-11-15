package arraysbidimensionales;

import java.util.Scanner;

public class E3 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida las dimensiones de una tabla bidimensional al
		 * usuario (número de filas y número de columnas). A continuación, crea dicha
		 * tabla bidimensional y rellénala de la siguiente forma: el elemento de la
		 * posición [i][j] debe contener el valor 10 * i + j. A continuación, muestra la
		 * tabla por consola.
		 */
		
		//Creamos la variable para el número de filas
		int filas = 0;
		
		//Creamos la variable para el número de columnas
		int columnas = 0;
		
		//Definimos la tabla
		int tabla[][];
		
		//Arbimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Preguntamos al usuario las filas y columnas de la tabla
		System.out.println("Escribe las filas");
		filas = rd.nextInt();
		
		System.out.println("Escribe las columnas");
		columnas = rd.nextInt();
		
		//Creamos la tabla con las filas y columnas especificadas por el usuario
		tabla= new int [filas][columnas];
		
		//Rellenamos la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				tabla [i][j] += 10*i+j;
			}
		}
		
		//Mostramos la tabla por consola
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				System.out.print(" " + tabla[i][j]);
			}
			System.out.println();
		}
		
		//Cerramos scanner
		rd.close();
		
		
		
		
		
	}
}
