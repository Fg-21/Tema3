package boletinarrays;

import java.util.Scanner;

public class E6 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida 8 números enteros y los almacene en una tabla. A
		 * continuación, en un bucle distinto, recorrerá esa tabla y mostrará esos
		 * números junto con la palabra “par” o “impar” según proceda.
		 */
		
		//Creamos la tabla para guardar los enteros
		int arr[] = new int[8];
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos los números al usuario en un bucle
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Introduce el número " + i);
			arr[i] = rd.nextInt();
		}
		
		//Comprobamos si son pares y los mostramos
		for (int value : arr) {
			if (value % 2 == 0) {
				System.out.println(value + " <-Par");
			} else {
				System.out.println(value + " <-Impar");
			}
		}
		
		//Cerramos scanner
		rd.close();
		
	}
}
