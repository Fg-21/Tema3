package boletinstrings;

import java.util.Scanner;

public class E4 {
	public static void main(String[] args) {
		/*
		 * Diseñar una función a la que se le pase una cadena de caracteres y la
		 * devuelva invertida. Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”.
		 * Recuerda probar la función en un main.
		 */

		// Variable para la cadena normal
		String cadena;

		// Variable para la cadena a la inversa
		String reverse;

		// Abrimos Scanner
		Scanner rd = new Scanner(System.in);

		// Pedimos al usuario la frase
		System.out.println("Di una frase a invertir:");
		cadena = rd.nextLine();

		// Llamamos a la función para invertir la cadena
		reverse = invertirCadena(cadena);

		// Imprimimos la cadena inversa
		System.out.println("Cadena invertida:");
		System.out.println(reverse);

		// Cerramos scanner
		rd.close();

	}

	// Método para invertir la cadena
	static String invertirCadena(String cadena) {
		// Variable para la cadena invertida
		String invert = "";

		// Sustrae de cadena el ultimo y lo pone en la invert concatenando cada vez
		for (int i = 1; i <= cadena.length(); i++) {
			invert += cadena.charAt(cadena.length()-i);
		}

		// Devolvemos la cadena invertida
		return invert;
	}
}
