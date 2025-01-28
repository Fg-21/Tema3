package boletincollectios2;

import java.util.Collections;
import java.util.LinkedList;

public class E1 {
	/*
	 * Implementa una aplicación que cree una lista de números enteros del 1 al 10 y
	 * luego la mezcle de forma aleatoria. Finalmente, muestra la lista original y
	 * la lista mezclada por pantalla.
	 */
	
	public static void main(String[] args) {
		//Lista
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		//Lista auxiliar
		LinkedList<Integer> lista2 = new LinkedList<Integer>();
		
		//rellenamos la lista
		for (int i = 0; i <= 10; i++) {
			lista2.add(i);
		}
		
		//Copiamos una lista a la otra
		lista.addAll(lista2);
		
		//Mezclamos la lista
		Collections.shuffle(lista2);
		
		//Imprimimos las dos listas
		System.out.println("Lista original "  + lista);
		System.out.println("Lista desordenada " + lista2);
		
	}
}
