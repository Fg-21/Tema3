package boletinarrays;

import java.util.Scanner;

public class E5 {
	public static void main(String[] args) {
		/*
		 * Crea un programa que pida diez números reales por teclado, los almacene en un
		 * array, y luego lo recorra para calcular la suma de todos los números y,
		 * además, averiguar el máximo y mínimo y mostrarlos por pantalla.
		 */
		
		//Creamos la tabla para los números a preguntar al usuario
		double arr[] = new double[10];
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Preguntamos al usuario los números y los asignamos a la tabla
		for (int i = 0; i <= arr.length; i++) {
			System.out.println("Introduce el número para la posición " + i);
			arr[i] = rd.nextDouble();
		}
		
		
	}
}
