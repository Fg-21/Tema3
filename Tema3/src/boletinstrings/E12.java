package boletinstrings;

import java.util.Scanner;

public class E12 {
	public static void main(String[] args) {
		/*
		 * Leer una frase y encontrar la palabra de mayor longitud. El programa debe
		 * imprimir tanto la palabra como el número de caracteres de la misma.
		 */
		
		//Variable para la frase
		String frase;
		
		//Variable para todas las palabras separadas
		String [] palabras;
		
		//Variable para guardar la palabra más larga
		String largo = "";
		
		//Variable para guardar el número de caracteres de las palabras
		int longitud = Integer.MIN_VALUE; 
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario la frase
		System.out.println("Introduce la frase:");
		frase = rd.nextLine();
		
		//Separamos la frase en las palabras
		palabras = frase.split(" ");
		
		//Recorremos palabra a palabra para ver cual es más larga
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].length() > longitud) {
				longitud = palabras[i].length();
				largo = palabras[i];
			}
		}
		
		//Decimos la palabra más larga
		System.out.println("La palabra más larga es: " + largo);
		
		//Cerramos scanner
		rd.close();
		
	}
}
