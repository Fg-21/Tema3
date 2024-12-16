package boletinstrings;

import java.util.Scanner;

public class E10 {
	public static void main(String[] args) {
		/*
		 * Disponemos de la siguiente relación de letras: 
		 * conjunto 1: e i k m p q r s t u v 
		 * conjunto 2: p v i u m t e r k q s
		 * 
		 * mediante la cual es posible codificar un texto, convirtiendo cada letra del
		 * conjunto 1, en su correspondiente del conjunto 2. El resto de las letras no
		 * se modifican. Los conjuntos se utilizan tanto para codificar mayúsculas como
		 * minúsculas, mostrando siempre la codificación en minúsculas. Un ejemplo: la
		 * palabra «PaquiTo» se codifica como «matqvko». Se pide realizar un programa
		 * codificador, en el que se implemente la función: char codifica(char
		 * conjunto1[],char conjunto2[], char c) que devuelve el carácter c codificado
		 * según los conjuntos 1 y 2 que se le pasan.
		 */
		
		//Variable para guardar el texto
		String text;
		
		//Variable para guardar el texto codificado
		String codifiedText = "";
		
		//Variable para el conjunto 1
		char conjunto1 [] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't','u' ,'v'};
		
		//Variable para el conjunto 2
		char conjunto2 [] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		
		//Variable para guardar el carácter a codificar
		char c;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario el texto
		System.out.println("Introduce el texto a codificar");
		text = rd.nextLine();
		
		
		
		//Recorremos el texto y enviamos a la función los caracteres individuales
		for (int i = 0; i < text.length(); i++) {
			c = text.charAt(i);
			codifiedText += encrypter(conjunto1, conjunto2, c);
			
		}
		
		//Imprimimos el texto encriptado
		System.out.println(codifiedText);
	
		//Cerramos scanner
		rd.close();
	}
	
	//Método para encriptar
	static char encrypter(char[] conjunto1, char[] conjunto2, char c) {
		//Variable para guardar el caracter encriptado
		char encryptedChar = c;
		
		//Recorremos el conjunto 1 para ver si nuestro caracter se puede encriptar
		for (int i = 0; i < conjunto1.length; i++) {
			//Si coinciden los caracteres, se traduce al del conjunto 2
			if(c == conjunto1[i]) {
				encryptedChar = conjunto2[i];
			} 
		}
		
		
		//Devolvemos un caracter ya encriptado
		return encryptedChar;
	}
	
}
