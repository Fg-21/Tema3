package boletincollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class E3 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que genere 30 números enteros aleatorios, con valores
		 * comprendidos entre 1 y 10. Se deben almacenar en una colección de forma
		 * ordenada. Pinta la colección por consola una vez rellena.
		 */
		
		//Lista
		ArrayList <Integer> listaOrdenada = new ArrayList<Integer>();
		
		//Objeto random
		Random rand = new Random();
		
		//Numero aleatorio
		int numRandom;
		
		//Recorremos la lista poniendo en cada indice un numero aleatorio hasta llegar a 30
		while (listaOrdenada.size() < 30) {
			//aleatorizamos el numero
			numRandom = rand.nextInt(0 , 11);
			
			//Aignamos el numero a la lista
			listaOrdenada.add(numRandom);
		}
		
		//Ordenamos la lista
		Collections.sort(listaOrdenada);
		
		System.out.println(listaOrdenada);
	}
}
