package arraysbidimensionales;

public class E4 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que cree una tabla de 10x10 que contenga los valores de
		 * las tablas de multiplicar del 1 al 10 (cada tabla de multiplicar en una
		 * fila). Muestra la tabla por pantalla.
		 */
		
		//Creamos una tabla 10 x 10
		int tablas[][] = new int[11][11];
		
		//Rellenamos la tabla con las tablas de multiplicar
		for(int i = 1; i < tablas.length; i++) {
			for (int j = 1; j < tablas[i].length; j++) {
				System.out.print(i + " x " + j + " = " + i*j + " | ");
			}
			System.out.println();
		}
	}
}
