package boletinarrays2;

import java.util.Arrays;
import java.util.Scanner;

public class E2 {
	public static void main(String[] args) {
		/*
		 * Crea un programa que pida al usuario 20 valores enteros e introduzca los 10
		 * primeros en un array y los 10 últimos en otro array. Por último, comparará
		 * ambos arrays y le dirá al usuario si son iguales o no.
		 */
		
		//Creamos las 2 tablas con los 20 valores en total
		int tab1[] = new int[10];
		int tab2[] = new int[10];
		
		//Creamos una tabla aparte para contenedor común de ambas
		int tabla[] = new int [10];
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Preguntamos al usuario los valores para rellenar las 2 tablas
		for(int i = 1; i <= 2; i++) {
			for (int j = 0; j <= tab1.length -1; j++) {
				System.out.println("Introduce número para la posición " + j + " de la tabla " + i);
				tabla[j] = rd.nextInt();
			}
			
			switch (i) {
			case 1 -> tab1 = Arrays.copyOf(tabla, tab1.length);
			case 2 -> tab2 = Arrays.copyOf(tabla, tab2.length);
			}
			//Inicializamos tabla a 0
			Arrays.fill(tabla, 0);
		}
		
		//Comparamos las 2 tablas y decimos si son iguales
		if (Arrays.equals(tab2, tab1)) {
			System.out.println("Las tablas son iguales");
		} else {
			System.out.println("Las tablas son diferentes");
		}
		
		//Cerramos el scanner
		rd.close();
		
	}
}
