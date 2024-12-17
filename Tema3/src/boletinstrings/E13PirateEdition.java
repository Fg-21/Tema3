package boletinstrings;

import java.util.Arrays;
import java.util.Scanner;

public class E13PirateEdition {
	public static void main(String[] args) {
		/*
		 * Un anagrama es una palabra, o frase, que resulta de la transposición de otra
		 * palabra o frase. Ejemplos de anagramas para la palabra roma son: amor, ramo o
		 * mora. Construir una función que recibe dos palabras por parámetro e indique
		 * si son anagramas una de otra.
		 */

		// Variable para las distintas palabras
		String word1, word2;

		// Variable para decir si es un anagrama
		boolean anag = true;

		// Abrimos scanner
		Scanner rd = new Scanner(System.in);

		// Preguntamos al usuario las dos palabras
		System.out.println("introduce la palabra 1:");
		word1 = rd.nextLine();

		System.out.println("introduce la palabra 2:");
		word2 = rd.nextLine();

		// Comprobamos si la palabra es un anagrama con el método
		anag = anagram(word1, word2);

		// Dedimos si es un anagrama o no
		System.out.println(anag ? "Es un anagrama" : "No es un anagrama");
	}

	// Metodo para averiguar si es anagrama
	static boolean anagram(String word1, String word2) {
		// Variable para guardar la respuesta del método
		boolean anagrama = true;
		
		//Pasamos las palabras a una tabla de cadenas
		char tablaCadenas1[] = word1.toCharArray();
		char tablaCadenas2[] = word2.toCharArray();
		
		//Ordenamos las 2 tablas
		Arrays.sort(tablaCadenas1); 
		Arrays.sort(tablaCadenas2); 
		
		if (!Arrays.equals(tablaCadenas1, tablaCadenas2)) {
			anagrama = false;
		}
		
		
		// Devolvemos el booleano
		return anagrama;
	}

}

