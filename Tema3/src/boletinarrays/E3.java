package boletinarrays;

import java.util.Scanner;

public class E3 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que lea 10 números por teclado, los almacene en una
		 * tabla, y que luego los muestre en orden inverso, es decir, el primero que se
		 * introduce es el último en mostrarse.
		 */
		
		//Creamos la tabla para los números
		int arr[] = new int[10];
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Preguntamos y guardamos los números del usuario
		for (int i = 9; i >= 0; i--) {
			System.out.println("Introduce el número " + i);
			arr[i] = rd.nextInt();
		}
		
		//Mostramos los números de la tabla
		for (int value : arr) {
			System.out.print(value + " ");
		}
		
		//Cerramos scanner
		rd.close();
	}
}
