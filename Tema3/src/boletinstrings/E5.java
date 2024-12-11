package boletinstrings;

import java.util.Scanner;

public class E5 {
	public static void main(String[] args) {
		/*
		 * Introducir por teclado una frase palabra a palabra, y mostrar la frase
		 * completa separando las palabras introducidas con espacios en blanco. Terminar
		 * de leer la frase cuando alguna de las palabras introducidas sea la cadena
		 * “fin” escrita con cualquier combinación de mayúsculas/minúsculas. La cadena
		 * “fin” no aparecerá en la frase final.
		 */
		
		//Variable para guardar la frase
		String palabra;
		
		//Variable para contar las palabras
		int cont = 0;
		
		//Variable auxiliar para la frase
		String aux = "";
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos la pimera palabra de la frase al usuario
		System.out.println("Escribe la palabra 1:");
		palabra = rd.nextLine();
		
		
		
		//Seguimos preguntando hasta que el usuario escriba fin
		while (!palabra.equals("fin")) {
			cont++;
			
			//Concatenamos la variable auxiliar a la palabra
			aux += palabra + " ";	
			
			//Pedimos palabras al usuario
			System.out.println("Escribe la palabra "+ cont + ":");
			palabra = rd.nextLine();	
		}
		
		//Imprimimos la frase
		System.out.println(aux);
		
		//Cerramos scanner
		rd.close();
	}
}
