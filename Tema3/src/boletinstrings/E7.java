package boletinstrings;

import java.util.Scanner;

public class E7 {
	public static void main(String[] args) {
		/*
		 * Diseñar una función que reciba por parámetros una frase y una palabra. Debe
		 * devolver cuántas veces aparece la palabra en la frase.
		 */	
		
		//Variable para la frase
		String frase;
		
		//Variable para la palabra
		String word;
		
		//Variable para las veces que aparece la palabra en la frase
		int times;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario la frase
		System.out.println("Introduce la frase");
		frase = rd.nextLine();
		
		//Pedimos al usuario la palabra
		System.out.println("Introduce la palabra");
		word = rd.nextLine();
		
		//Llamámos al método para saber cuantas veces se repite la palabra en la frase
		times = countWords (frase, word);
		
		//Decimos las veces que aparece la palabra en la frase
		System.out.println(word + " aparece " + times + " veces");
		
		//Cerramos scanner
		rd.close();
	}
	
	//Método para saber las veces que se repite la palabra
	static int countWords(String frase, String word) {
		//Variable para las veces que se repite la palabra
		int veces = 0;
		
		//Variable para la posición de búsqueda
		int posi;
		
		//Buscamos la primera vez que aparezca la palabra
		posi = frase.indexOf(word, 0);
		
		//Si encuentra la palabra entra en el bucle
		while (posi >= 0) { 
			//Empieza a buscar a partir de la palabra encontrada
			posi = frase.indexOf(word, (posi + word.length()) - 1);
			veces++;
		}
		
		//Devolvemos las veces 
		return veces;
	}
}
