package boletinstrings;

import java.util.Scanner;

public class E1 {
	public static void main(String[] args) {
		/*
		 * Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es
		 * decir, la que contiene menos caracteres.
		 */
		
		//Creamos las variables para las dos frases
		String frase1, frase2;
		
		//Variables para medir la longitud de las frases
		int lenght1, lenght2;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos las frases al usuario
		System.out.println("Frase 1:");
		frase1 = rd.nextLine();
		
		System.out.println("Frase 2:");
		frase2 = rd.nextLine();
		
		//Añadimos la longitud de las frases a los enteros
		lenght1 = frase1.length();
		lenght2 = frase2.length();
		
		//Indicamos cual es más corta
		System.out.println(lenght1 < lenght2 ? "La primera frase es más corta" : "La segunda frase es más corta");
		
		//Cerramos scanner
		rd.close();
		
		
		
	}
}
