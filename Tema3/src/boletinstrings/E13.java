package boletinstrings;

import java.util.Scanner;

public class E13 {
	public static void main(String[] args) {
		/*
		 * Diseñar un algoritmo que lea del teclado una frase e indique, para las letras
		 * que aparecen en la frase, cuántas veces se repite cada una. Se consideran
		 * iguales las letras mayúsculas y las minúsculas para realizar la cuenta. Un
		 * ejemplo sería: 
		 * 
		 * Frase : En un lugar de la Mancha . Resultado : 
		 * a: 4 veces 
		 * c: 1 vez 
		 * d: 1 vez 
		 * e: 2 veces
		 */
		
		//Variable para la frase
		String frase;
		
		//Variable para guardar la frase en minuscula
		String fraseMin;
		
		char c = ' ' ;
		int cont = 0;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario la frase
		System.out.println("Introduce la frase:");
		frase = rd.nextLine();
		
		//Pasamos la frase toda a minúsculas para contar letras luego
		fraseMin = frase.toLowerCase();
		
		//Recorremos la frase entera
		for (int i = 0; i < fraseMin.length(); i++) {
			for (int j = 0; j < fraseMin.length(); j++) {
				c = fraseMin.charAt(i);
				if (c == fraseMin.charAt(j)) {
					cont++;
				}
				
			}
			
			fraseMin = fraseMin.replace(c, ' ');
			fraseMin = fraseMin.replace(" ", "");
			System.out.println("La letra " + c + " aparece " + cont + " veces");
			cont = 0;
			
		}
		
		
		rd.close();
	}
}
