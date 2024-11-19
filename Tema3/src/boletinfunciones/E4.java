package boletinfunciones;

import java.util.Scanner;

public class E4 {
	public static void main(String[] args) {
		/*
		 * Escribe la función: int buscar(int t[], int clave), que busca de forma
		 * secuencial en la tabla t el valor clave. En caso de encontrarlo, devuelve en
		 * qué posición lo encuentra; y en caso contrario, devolverá -1.
		 */
		
		//Creamos la variable para el valor clave
		int key;
		
		//Creamos la tabla de valores
		int t[] = {1, 2, 9, 7, 9};
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Preguntamos al usuario el número clave
		System.out.println("Introduce el número a buscar");
		key = rd.nextInt();
		
		//Llamamos a la función
		int posicion = buscar(key, t);
		
		//Decimos si lo ha encontrado o no
		System.out.println(posicion == -1 ? -1 : "Se ha encontrado el número en " + posicion);
		
		//Cerramos scanner
		rd.close();
	}
	
	static int buscar(int key, int t[]) {
		//Creamos una variable para contar posiciones
		int index = 0;
		
		//Creamos l variable para el resultado
		int resul = 0;
		
		//Buscamos secuencialmente en la tabla el valor clave
		while (index < t.length && key != t[index]) {
			index++;
		}
		
		if (index < t.length) {
			resul = index;
		} else {
			resul = -1;
		}
		
		return resul;
	}
}
