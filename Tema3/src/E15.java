import java.util.Random;
import java.util.Scanner;

public class E15 {
	public static void main(String[] args) {
		/*
		 * Implementar el juego del anagrama, que consiste en que un jugador escribe una
		 * palabra o frase, y la aplicación muestra un anagrama (transposición de los
		 * caracteres) del texto introducido generado al azar. A continuación otro
		 * jugador tiene que acertar cuál es el texto original. La aplicación no debe
		 * permitir que el texto introducido por el jugador 1 sea la cadena vacía. Por
		 * ejemplo, si el jugador 1 escribe “teclado”, la aplicación muestra como pista
		 * un anagrama al azar: “etcloda”. Crea una función que realice la desordenación
		 * del texto.
		 */
		
		//Variable para el texto del jugador
		String text;
		
		//Variable para el anagrama
		String anagrama;
		
		//Variable para la respuesta del jugador 2
		String guess;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario la frase/palabra
		System.out.println("Jugador 1: Introduce la frase/palabra");
		text = rd.nextLine();
		
		//Comprobamos que el jugador 1 a puesto texto
		while (text.equals("")) {
			System.out.println("Jugador 1: Introduce la frase/palabra");
			text = rd.nextLine();	
		}
		
		//Llamamos al método para hacer del texto un anagrama
		anagrama = anag(text);
		
		//Mostramos el anagrama por pantalla y le pedimos al jugador 2 que lo adivine
		System.out.println("Jugador 2: ¿De dónde viene este anagrama?: " + anagrama);
		guess = rd.nextLine();
		
		
		//Felicitamos al jugador por ganar
		if (guess.equals(text)) {
			System.out.println("Has acertado!");
		} else {
			//Si el jugador 2 falla, le informamos y que lo intente de nuevo
			do {
				System.out.println("Intentalo otra vez, que has fallado: " + anagrama);
				guess = rd.nextLine();	
			} while (!guess.equals(text));
		}
		
		//Cerramos scanner
		rd.close();
	}
	
	static String anag(String text) {
		//Tabla de caracteres a rellenar con la palabra
		char[] letras = text.toCharArray();
		
		//Variable para randomizar la posición de la letra
		Random rand = new Random();
		
		//Variable para guardar el número aleatorio
		int random;
		
		//Tabla de texto desordenado a devolver
		char[] anagrama = new char[letras.length];
		
		
		//Recorremos la palabra caracter por caracter y vamos poniendo cada letra en una posición aleatoria
		for (int i = 0; i < text.length(); i++) {
			//Randomizamos la posición de la letra
			random = rand.nextInt(anagrama.length);
			
			//Controlamos que no se repitan las posiciones de las letras
			if (anagrama[random] == '\u0000') {
				anagrama[random] = letras[i];
			} else {
				i--;
			}
		}
		
		//Devolvemos el texto desordenado
		return String.valueOf(anagrama);
	}
}
