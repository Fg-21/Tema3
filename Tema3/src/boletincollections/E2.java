package boletincollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class E2 {
	/*
	 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
	 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
	 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
	 * entre 5 y 10 elementos ambos inclusive.
	 */
	
	
	public static void main(String[] args) {
	
		//Creamos la lista
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		
		//Objeto random
		Random rand = new Random();
		
		//Numero aleatorio para el tamaño
		int tamañoAleatorio;
		
		//Numero aleatorio para el valor a añadir
		int valorAleatorio;
		
		//Almacenamiento de la suma
		int suma = 0;
		
		//Almacenamiento de la media
		double media;
		
		//Almacenamiento del máximo
		int maximo;
		
		//Almacenamiento del mínimo
		int minimo;
		
		
		//Randomizamos 
		tamañoAleatorio = rand.nextInt(5, 11);
		
		//Recorremos la lista añadiento numeros aleatorios hasta llegar a un tamaño aleatorio entre 5 y 10
		for (int i = 0; i < tamañoAleatorio; i++) {
			//Randomizamos valor
			valorAleatorio = rand.nextInt(0,101);
			
			//Sumamos el valor
			suma += valorAleatorio;
						
			//Asignamos el valor a la lista
			listaNumeros.add(valorAleatorio);
		}
		
		//Hacemos la media de los valores
		media = suma/tamañoAleatorio;
		
		//Maximo valor
		maximo = Collections.max(listaNumeros);
		
		//mínimo valor
		minimo = Collections.min(listaNumeros);
		
		//Imprimimos lista 
		System.out.println(listaNumeros);
		//Imprimimos calculos
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
		System.out.println("Máximo: " + maximo);
		System.out.println("Minimo: " + minimo);
		
	}
}
