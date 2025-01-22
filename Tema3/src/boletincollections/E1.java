package boletincollections;

import java.util.ArrayList;
import java.util.Scanner;

public class E1 {
	/*
	 * Crear una lista de números enteros positivos introducidos por consola hasta
	 * que se introduzca uno negativo. A continuación, recorrer la lista y mostrar
	 * por pantalla los índices de los elementos de valor par.
	 */
	
	public static void main(String[] args) {
		//Numero a pedir al usuario
		int num;
		
		//Indice actual 
		int index;
		
		//Scanner
		Scanner rd = new Scanner(System.in);
		
		//Objeto lista
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		//Preguntamos al  usuario 
		System.out.println("Introduce un número positivo para añadir, introduce uno negativo para parar de añadir");
		num = rd.nextInt();
		
		while (num >= 0) {
			//añadimos a la lista
			lista.add(num);
			
			//Preguntamos al usuario
			System.out.println("Introduce un número positivo para añadir, introduce uno negativo para parar de añadir");
			num = rd.nextInt();
						
		}
		
		//For para imprimir que recorre y muestra los indices de los pares
		for (int i = 0; i < lista.size(); i++) {
			//capturamos el valor del indice actual
			index = lista.get(i);
			
			//Comprobamos si es par e imprimimos si lo es
			if (index % 2 == 0){
				System.out.print(i + " ");
			}
			
		}		
	}
}
