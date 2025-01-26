package boletincollections;

import java.util.Scanner;
import java.util.TreeMap;

public class E9 {
	/*
	 * Implementa una aplicación donde ir registrando el número de veces que ha
	 * salido cada número del euromillón. 
	 * 
	 * Para ello tendrás que usar dos colecciones, una para los números y otra 
	 * para las estrellas. 
	 * 
	 * Al usuario se le debe pedir que introduzca primero los 5 números y a 
	 * continuación las 2 estrellas del último sorteo. 
	 * El programa comprobará si ya se encuentra el número correspondiente en la 
	 * colección, si no está, lo añadirá y le pondrá el valor 1. Si ya está, 
	 * incrementará en 1 su valor. 
	 * 
	 * Las colecciones no pueden tener repetidos y deben estar ordenadas.
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Creamos dos colecciones directamente con TreeMap para almacenar los números y
		// las estrellas
		TreeMap<Integer, Integer> numeros = new TreeMap<>();
		TreeMap<Integer, Integer> estrellas = new TreeMap<>();

		// Variable para almacenar la respueta del usuario
		String respuesta;

		// El bucle se ejecutará al menos una vez y luego controlamos la repetición con
		// la respuesta
		do {
			// Pedimos al usuario los 5 números del último sorteo
			System.out.println("Introduce los 5 números del último sorteo (de 1 a 50):");
			for (int i = 0; i < 5; i++) {
				int numero = scanner.nextInt();
				if (numero < 1 || numero > 50) {
					System.out.println("Número inválido. Debe estar entre 1 y 50.");
				} else {
					// Registramos o incrementamos la aparición del número
					numeros.put(numero, numeros.getOrDefault(numero, 0) + 1);
				}
			}

			// Pedimos al usuario las 2 estrellas del ultimo sorteo
			System.out.println("Introduce las 2 estrellas del último sorteo (de 1 a 12):");
			for (int i = 0; i < 2; i++) {
				int estrella = scanner.nextInt();
				if (estrella < 1 || estrella > 12) {
					System.out.println("Estrella inválida. Debe estar entre 1 y 12.");
				} else {
					// Registramos o incrementamos la aparición de la estrella
					estrellas.put(estrella, estrellas.getOrDefault(estrella, 0) + 1);
				}
			}

			// Mostramos el conteo de números y estrellas
			System.out.println("\nConteo de Números:");
			for (var entry : numeros.entrySet()) {
				System.out.println("Número " + entry.getKey() + ": " + entry.getValue() + " vez(es)");
			}

			System.out.println("\nConteo de Estrellas:");
			for (var entry : estrellas.entrySet()) {
				System.out.println("Estrella " + entry.getKey() + ": " + entry.getValue() + " vez(es)");
			}

			// Preguntamos si el usuario desea registrr otro sorteo
			System.out.println("\n¿Quieres registrar otro sorteo? (sí/no):");
			
			// Limpiar el buffer
			scanner.nextLine();			
			respuesta = scanner.nextLine();

			// Continuamos el bucle si la respuesta es "sí"
		} while (respuesta.equalsIgnoreCase("sí"));

		System.out.println("Fin del programa.");
		
		// Cerramos scanner
		scanner.close();
	}
}
