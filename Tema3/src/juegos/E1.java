package juegos;

import java.util.Scanner;

public class E1 {
	/*
	 * Realiza una función que reciba como parámetro una tabla bidimensional de
	 * enteros y un valor. Debe devolver un booleano indicando si dicho valor se
	 * encuentra en la tabla o no.
	 */
public static void main(String[] args) {
	int tabla [][] = {{3,4},{6,7}};
	int valor = 0;
	boolean encontrado;
	Scanner rd = new Scanner(System.in);
	
	System.out.println("Valor a buscar");
	valor = rd.nextInt();
	
	encontrado = busca(valor, tabla);
	
	System.out.println(encontrado);

	rd.close();

	
}
static boolean busca(int valor, int tabla[][]) {
	boolean finded = false;
	int filas = 0;
	int columnas = 0;
	
	while (filas < tabla.length && !finded) {
		columnas = 0;
		while (columnas < tabla[filas].length && !finded) {
			
			if (valor == tabla[filas][columnas]) {
				finded = true;
			}
			columnas++;
		}
		filas++;
	}
	
	
	
	return finded;
}
	

}
