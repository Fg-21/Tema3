package boletinarrays;

import java.util.Random;
import java.util.Scanner;

public class E8 {
	public static void main(String[] args) {
		/*
		 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
		 * valores enteros aleatorios entre 1 y 10. Luego pedirá un valor N y mostrará
		 * en qué posiciones del array aparece N.
		 */
		
		//Creamos la tabla para 100 enteros
		int arr[] = new int[100];
		
		//Creamos el número N a pedir al usuario
		int numN;
		//Importamos random
		Random ran = new Random();
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Hacemos el bucle para rellenar los valores de la tabla de números aleatorios
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(1,11); 
		}
		
		//Pedimos al usuario el valor N
		System.out.println("Introduce el valor el cual quieras saber su posición:");
		numN = rd.nextInt();
		
		//Hacemos un bucle recorriendo toda la tabla para saber en las posiciones que está el número
		for (int i = 0; i <= arr.length -1; i++) {
			if ( arr[(i)] == numN) {
				System.out.println("Valor " + numN + " encontrado en la " + arr[(i-1)] + " posición");
			}
		}
		
		//Cerramos scanner
		rd.close();
	}
}
