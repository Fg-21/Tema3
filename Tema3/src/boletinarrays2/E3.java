package boletinarrays2;

import java.util.Arrays;
import java.util.Random;

public class E3 {
	public static void main(String[] args) {
		/*
		 * Crea un programa que cree un array de tamaño 30 y lo rellene con valores
		 * aleatorios entre 0 y 9. Luego ordena los valores del array y los mostrará por
		 * pantalla.
		 */
		
		//Creamos la tabla para guardar los 30 valores
		int tab[] = new int [30];
		
		//Importamos la clase random
		Random rand = new Random();
		
		//Recorremos la tabla asignando números aleatorios del uno al nueve en cada posición
		for (int i = 0; i <= tab.length-1; i++) {
			tab[i] += rand.nextInt(10);
		}
		
		//Ordenamos los valores y los mostramos por pantalla
		Arrays.sort(tab);
		System.out.println(Arrays.toString(tab));
	}
}
