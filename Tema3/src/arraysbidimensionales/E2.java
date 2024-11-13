package arraysbidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class E2 {
	public static void main(String[] args) {
		/*
		 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
		 * “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las
		 * notas por teclado y luego el programa mostrará la tabla con las notas. A
		 * continuación, mostrará la nota mínima, máxima y media de cada alumno.
		 */

		// Creamos la tabla bidimensional
		int notas[][] = new int[4][5];
		
		//Creamos la tabla de medias
		double suma = 0;
		
		//Creamos una varibale para guardar la máximanima
		int max = Integer.MIN_VALUE;
		
		//Creamos una varibale para guardar la máxima
		int min = Integer.MAX_VALUE;
		
		// Abrimos scanner
		Scanner rd = new Scanner(System.in);

		// Recorremos la tabla preguntando al usuario los valores de las notas de cada
		// alumno
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Introduce la nota del alumno " + (i + 1) + " en la asignatura " + (j + 1));
				notas[i][j] = rd.nextInt();
			}
		}

		// Imprimimos la tabla y calculamos la media,  de cada alumno
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
				if (min > notas[i][j]) {
					min = notas[i][j];
				}
				if (max < notas[i][j]) {
					max = notas[i][j];
				}
				suma += notas[i][j];
			}
			System.out.println("	Media  " + suma/5 + "  " + "Máxima: " + max + "  " + "Mínima: " + min );
			
			System.out.println();
			suma = 0;
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
		}
	}

}
