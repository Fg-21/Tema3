package boletinarrays;

import java.util.Random;

public class E1 {
	public static void main(String[] args) {
		/*
		 * Crea una tabla de enteros de longitud 10 que se inicializará con números
		 * aleatorios comprendidos entre 1 y 100.
		 */
		
		//Creamos una tabla para guardar los números
		int arr[] = new int[10];
		
		//Creamos el randomizador
		Random ran = new Random();
		
		
		//Creamos un for para asignar numeros aleatorios a todas las posiciones de la tabla
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(1,101);
		}
		
		
		//Creamos un for-each para imprimir todos los valores de la tabla
		for (int value : arr) {
			System.out.println(value);
		}
	}
}
