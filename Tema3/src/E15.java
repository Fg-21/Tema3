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
		
		//Variable para ver si acierta o no
		boolean acierto;
		
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
		
		//Si el jugador 2 acierta o falla, le informamos y que lo intente de nuevo
		while (!guess.equals(text)) {
			System.out.println("Intentalo otra vez, que has fallado: " + anagrama);
			guess = rd.nextLine();	
		} 
	}
	
	static String anag(String text) {
		
	}
}
