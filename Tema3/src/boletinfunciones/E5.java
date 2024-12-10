package boletinfunciones;

import java.util.Arrays;
import java.util.Scanner;

public class E5 {
	public static void main(String[] args) {
		/*
		 * Realiza la función: int[] buscarTodos(int t[], int valor), que crea y
		 * devuelve una tabla con todos los índices de los elementos donde se encuentra
		 * el valor de búsqueda. En el caso de que el valor no se encuentre en la tabla
		 * t, la función devolverá una tabla vacía.
		 */
		
		//Definimos la tabla con los valores para buscar
		int t[] = {2, 5, 8, 8, 6, 7, 3, 2, 1, 9, 7, 5, 3, 0, 4};
		
		//Creamos la tabla para guardar los índices
		int indexArr[] = new int [t.length];
		
		//Creamos una variable para el valor a buscar en la tabla
		int valor;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Preguntamos al usuario el valor a buscar en la tabla
		System.out.println("Introduce el valor a buscar en la tabla");
		valor = rd.nextInt();
		
		//Llamamos a la función
		indexArr = buscarTodos(t, valor);
		
		//Mostramos la tabla de los índices
		System.out.println(Arrays.toString(indexArr));
		
		
		//Cerramos scanner
		rd.close();
		
	}
	//Creamos la función
	static int[] buscarTodos(int t[], int valor) {
		//Creamos una tabla para guardar las posiciones en las que se encuentra el valor de búsqueda
		int t2[] = new int [t.length];

		
		
		//Buscamos por toda la tabla anterior para encontrar el índice de búsqueda
		for (int i = 0; i < t.length; i++) {
			if (valor == t[i]) {
			t2[i] = i;
			}
		}
		return t2;
		
		
	}



}
