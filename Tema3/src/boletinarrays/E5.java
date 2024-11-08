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
		
		//Creamos una variable para guardar el máximo
		double max = 0;
		
		//Creamos una variable para guardar el mínimo
		double min = Integer.MAX_VALUE;
		
		//Creamos una variable para sumar los números de la tabla
		double suma = 0;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		
		//Preguntamos al usuario los números y los asignamos a la tabla
		for (int i = 0; i <= arr.length -1; i++) {
			System.out.println("Introduce el número para la posición " + i);
			arr[i] = rd.nextDouble();
		}
		
		//Sumamos todos los números y vemos quien es el mayor
		for (double value : arr) {
			suma += value;
			max =Math.max(max, value);
			min =Math.min(min, value);
		}
		
		
		//Imprimimos la suma de los valores y el valor máximo y el mínimo
		System.out.println("La suma de los valores es: " + suma);
		System.out.println("El valor más alto es: " + max);
		System.out.println("El valor más bajo es: " + min);
		
		//Cerramos scanner
		rd.close();
	}
}
