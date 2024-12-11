package boletinstrings;

import java.util.Scanner;

public class E6 {
	public static void main(String[] args) {
		/*
		 * Realizar una función que reciba una frase como parámetro de entrada y nos
		 * indique si es palíndroma, es decir, que la frase sea igual leyendo de
		 * izquierda a derecha, que de derecha a izquierda, sin tener en cuenta los
		 * espacios. Un ejemplo de frase palíndroma es: “Dabale arroz a la zorra el
		 * abad”. Las vocales con tilde hacen que un algoritmo tome una frase palíndroma
		 * como si no lo fuese. Por esto, supondremos que el usuario introduce la frase
		 * sin tildes.
		 */
		
		//Variable para la frase
		String frase;
		
		//Booleano para guardar si es palíndroma o no
		boolean resul;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario la frase
		System.out.println("Introduce la frase");
		frase = rd.nextLine();
		
		//Llamamos al método para saber si es palíndroma
		resul = palindrom(frase);
		
		//Imprimimos si es palíndroma o no
		System.out.println(resul ? "Es palíndorma" : "No es palíndroma");
		
		//Cerramos scanner
		rd.close();
		
		
	}
	
	//Método para ver si la frase es palíndroma
	static boolean palindrom(String frase) {
		//Creamos variable para el resultado
		boolean result;
		
		//Variable para guardar la cadena volteada
		String invert = "";
		
		//Pasamos la frase a minúscula
		frase = frase.toLowerCase();
		
		//Quitamos los espacios a la cadena
		frase = frase.replace(" ", "");
		
		//Invertimos la cadena
		for (int i = 1; i <= frase.length(); i++) {
			invert += frase.charAt(frase.length()-i);
		}
		
		//Comprobamos si las 2 cadenas son iguales
		result = frase.equals(invert);
		
		//Devolvemos el resultado
		return result;
	}
	
	
}
