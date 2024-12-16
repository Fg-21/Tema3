package boletinstrings;

import java.util.Scanner;

public class E11 {
	public static void main(String[] args) {
		/*
		 * Realizar un programa descodificador. La solución es tan sencilla como
		 * utilizar la función diseñada en el ejercicio anterior intercambiando los
		 * conjuntos entre sí.
		 */

		// Variable para guardar el texto
		String codifiedText;

		// Variable para guardar el texto descodificado
		String text = "";

		// Variable para el conjunto 1
		char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

		// Variable para el conjunto 2
		char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		// Variable para guardar el carácter a descodificar
		char c;

		// Abrimos scanner
		Scanner rd = new Scanner(System.in);

		// Pedimos al usuario el texto
		System.out.println("Introduce el texto a descodificar");
		codifiedText = rd.nextLine();

		// Recorremos el texto y enviamos a la función los caracteres individuales
		for (int i = 0; i < codifiedText.length(); i++) {
			c = codifiedText.charAt(i);
			text += disencrypter(conjunto1, conjunto2, c);

		}

		// Imprimimos el texto desencriptado
		System.out.println(text);

		// Cerramos scanner
		rd.close();
	}

	// Método para encriptar
	static char disencrypter(char[] conjunto1, char[] conjunto2, char c) {
		// Variable para guardar el caracter encriptado
		char encryptedChar = c;

		// Recorremos el conjunto 1 para ver si nuestro caracter se puede encriptar
		for (int i = 0; i < conjunto1.length; i++) {
			// Si coinciden los caracteres, se traduce al del conjunto 1
			if (c == conjunto2[i]) {
				encryptedChar = conjunto1[i];
			}
		}

		// Devolvemos un caracter ya encriptado
		return encryptedChar;
	}
}
