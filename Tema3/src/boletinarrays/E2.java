package boletinarrays;


import java.util.Scanner;

public class E2 {
	public static void main(String[] args) {
		/*
		 * Diseñar un programa que solicite al usuario 5 números decimales y los
		 * almacene en una tabla. Utiliza el mismo bucle tanto para solicitar los 5
		 * números como para almacenarlos en la tabla. A continuación, en un bucle
		 * distinto, mostrar por consola los números en el mismo orden en el que se han
		 * introducido.
		 */
	
		//Creamos tabla para guardar los números
		int arr[] = new int[5];
		
		//Creamos scanner
		Scanner rd = new Scanner(System.in);
		
		//Solicitamos los números al usuario
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Introduce el número para la posición " + i);
			arr[i] = rd.nextInt();
		}
		
		//Mostramos la tabla al usuario
		for(int value : arr) {
			System.out.print(value + " ");
		}
		
		//Cerramos scanner
		rd.close();
	}
}
