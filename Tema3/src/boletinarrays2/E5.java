package boletinarrays2;

import java.util.Random;
import java.util.Scanner;

public class E5 {
	public static void main(String[] args) {
		/*
		 * Crea un programa que cree un array de tamaño 1000 y lo rellene con valores
		 * enteros aleatorios entre 0 y 99. Luego pedirá por teclado un valor y se
		 * mostrará por pantalla si ese valor existe en el array, además de cuántas
		 * veces.
		 */
		
		//Creamos el array
		int arr[] = new int[1000];
		
		//Creamos la varbiable para guardar el valor a buscar
		int val;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Importamos random
		Random rand = new Random();
		
		//Creamos un número aleatorio entre 0 y 99 en cada posición de la tabla
		for (int i = 0; i <= arr.length -1; i++) {
			arr[i] = rand.nextInt(0, 100);
		}
	
		//Pedimos por teclado el valor
		System.out.println("Introduce el valor a buscar:");
		val = rd.nextInt();
		
		//Buscamos en el array el número
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i] == val) {
				System.out.println("Encontrado número " + val + " en posición " + i);
			}
		}
		
	}
}
