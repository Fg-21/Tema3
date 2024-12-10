package boletinstrings;

import java.util.Scanner;

public class E3 {
	public static void main(String[] args) {
		/*
		 * Diseña una función que recibe una frase como parámetro y devuelva cuántos
		 * espacios en blanco tiene. Recuerda probar la función en un main.
		 */
		
		//Variable para la frase 
		String frase;
		
		//Variable para la cantidad de espacios en blanco
		int spaces;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario la frase
		System.out.println("Escribe la frase para contar sus espacios:");
		frase = rd.nextLine();
		
		//Llamamos a la función
		spaces = spacesCount(frase);
		
		//Decimos cuantos espacios hay en la frase
		System.out.println("En tu frase hay " + spaces + " espacios");
		
		//Cerramos scanner 
		rd.close();
		
		
	}
	
	//
	static int spacesCount(String frase) {
		//Variable para el número de espacios
		int spaces = 0;
		
		//Bucle hasta la longitud de la frase
		for (int i = 0; i < frase.length(); i++) {
			//Si hay espacio, sumamos uno a spaces
			if (frase.charAt(i) == ' ') {
				spaces++;
			}
		}
		
		//Devolvemos el número de espacios
		return spaces;
	}
}
