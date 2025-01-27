package boletincollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class E4 {
	public static void main(String[] args) {
		/*
		 * Implementa una aplicación donde se insertan 20 números enteros aleatorios
		 * distintos, menores que 100, en una colección. Hay que asegurarse de que se
		 * guardan 20. Deben guardarse ordenados a medida que se vayan generando, y se
		 * mostrará la colección resultante por pantalla.
		 */

		// Lista para guardar los numeros
		ArrayList<Integer> listaOrdenada = new ArrayList<Integer>();

		// Objeto random
		Random rand = new Random();

		// Numero aleatorio
		int numRandom;

		// Recorremos la lista poniendo en cada indice un numero aleatorio hasta llegar
		// a 30
		while (listaOrdenada.size() < 20) {
			// aleatorizamos el numero
			numRandom = rand.nextInt(0, 100);

			// Si no hay otro numero igual en la lista, este numero se añadirá y se ordenará
			if (!listaOrdenada.contains(numRandom)) {

				// Aignamos el numero a la lista
				listaOrdenada.add(numRandom);

				// Ordenamos la lista
				Collections.sort(listaOrdenada);
			}
			
		}
		//Imprimimos la lista
		System.out.println(listaOrdenada);
	}
}
