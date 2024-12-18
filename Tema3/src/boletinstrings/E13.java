package boletinstrings;

import java.util.Scanner;

public class E13 {
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

		// Variable para los caracteres
		char c;

		// Variable para contar caracteres iguales
		int cuentaChar = 0;

		// Recorremos la palabra para ver si cada caracter de una está en la otra
		for (int i = 0; i < word1.length(); i++) {
			// Guardamos aqui el caracter por el que vamos al recorrer la palabra
			c = word1.charAt(i);

			// Si la letra en la que estamos, está en la otra palabra se añade uno al
			// contador de coincidencias
			if (word2.contains(String.valueOf(c))) {
				cuentaChar++;
			}

		}

		// Si contador de los caracteres es igual a la longitud de la palabra, es un
		// anagrama
		if (cuentaChar != word2.length()) {
			anagrama = false;
		}

		// Devolvemos el booleano
		return anagrama;
	}

}
