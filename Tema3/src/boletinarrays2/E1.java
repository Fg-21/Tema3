package boletinarrays2;

import java.util.Arrays;
import java.util.Scanner;

public class E1 {
	public static void main(String[] args) {
		/*
		 * Crea un programa que pida al usuario dos valores, tamaño y valor, y luego
		 * cree un array del tamaño dado y que almacene valor en todas sus posiciones.
		 * Luego muestra el array por pantalla.
		 */
		
		//Creamos las variables para los dos números a pedir al usuario
		int tam, val;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario el tamaño y el valor de la tabla
		System.out.println("Introduce el tamaño de la tabla");
		tam = rd.nextInt();
		
		System.out.println("Introduce el valor a rellenar en tabla");
		val = rd.nextInt();
		
		//Creamos la tabla con el tamaño introducido
		int arr[] = new int[tam];
		
		//Rellenamos la tabla con el valor introducido
		Arrays.fill(arr, val);
		
		//Mostramos la tabla por consola
		System.out.println(Arrays.toString(arr));
		
		//Cerramos scanner
		rd.close();
		
	}
}
