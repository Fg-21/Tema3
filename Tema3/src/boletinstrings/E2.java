package boletinstrings;

import java.util.Scanner;

public class E2 {
	public static void main(String[] args) {
		/*
		 * Diseña el juego “Acierta la contraseña”. La mecánica del juego es la
		 * siguiente: el primer jugador introduce la contraseña; a continuación, el
		 * segundo jugador debe teclear palabras hasta que la acierte. El juego debe
		 * indicar si la palabra introducida es mayor o menor alfabéticamente que la
		 * contraseña.
		 */
		
		//Variable para la contraseña
		String pass;
		
		//Variable para la guess del usuario
		String guess;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos la contraseña al jugador 1
		System.out.println("Jugador 1: Introduce la contraseña a adivinar");
		pass = rd.nextLine();
		
		//Pedimos al jugador 2 que adivine
		System.out.println("Adivina si puede shulo");
		guess = rd.nextLine();
		
		//Hasta que el jugador 2 no adivine no termina el juego
		while (!pass.equals(guess)) {
			//Si falla, decimos a la distancia que se a quedado, si acierta sale
			System.out.println(pass.compareTo(guess));
			
			//Pedimos al jugador 2 que adivine
			System.out.println("Adivina si puede shulo");
			guess = rd.nextLine();
		}
		
		//Damos la enhorabuena al jugador
		System.out.println("Ole tú máquina, lo has acertao");
		
		//Cerramos scanner
		rd.close();
	}
}
