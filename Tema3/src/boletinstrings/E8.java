package boletinstrings;

import java.util.Arrays;
import java.util.Scanner;

public class E8 {
	public static void main(String[] args) {
		/*
		 * Implementa un programa que lea una frase y muestre todas sus palabras
		 * ordenadas de forma alfabética. Suponemos que cada palabra de la frase se
		 * separa de otra por un único espacio.
		 */
		
		//Variable para la frase
		String frase;
		
		//Variable para guardar la frase en una cadena de caracteres
		String [] palabras;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario la frase
		System.out.println("Introduce la frase");
		frase = rd.nextLine();
		
		//Ponemos la frase entera en minúscula
		frase = frase.toLowerCase();
		
		//Separamos las palabras con espacio y la guardamos en la tabla
		palabras = frase.split(" ");
		
		//Ordenamos la tabla
		Arrays.sort(palabras);
		
		//Imprimimos la tabla ordenada
		System.out.println(Arrays.deepToString(palabras));
		
		//Cerramos scanner
		rd.close();
	}
}
