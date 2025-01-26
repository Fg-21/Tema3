package boletincollections;


import java.util.Scanner;
import java.util.TreeMap;

public class E7 {
	/*
	 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
	 * (con su correspondiente traducción). Utiliza un objeto de la clase TreeMap
	 * para almacenar las parejas de palabras. El programa mostrará un menú con dos
	 * opciones: 1.- Inserta palabra. Debe solicitar una palabra en español y su
	 * traducción al inglés.
	 * 
	 * 2.- Busca palabra. Pregunta por una palabra en español y devuelve su
	 * traducción en inglés.
	 * 
	 * 0.- Salir. Termina el programa.
	 */

	public static void main(String[] args) {
		// Diccionario
		TreeMap<String, String> diccionario = new TreeMap<String, String>();

		// Objeto scanner
		Scanner rd = new Scanner(System.in);

		// Palabra en español del usuario
		String palabra;

		// Palabra en inglés del usuario
		String word;

		// Palabra a buscar por el usuario
		String busca;
		
		//Palabra encontrada
		String search;

		// Opción del usuario
		int select;

		// Rellenamos el diccionario
		diccionario.put("Hola", "Hello");
		diccionario.put("Adios", "Bye");
		diccionario.put("Yo", "I");
		diccionario.put("Tú", "You");
		diccionario.put("Él", "He");
		diccionario.put("Ella", "She");
		diccionario.put("Nosotros", "We");
		diccionario.put("Vosotros", "You");
		diccionario.put("Ellos", "They");
		diccionario.put("Qué", "What");
		diccionario.put("Quién", "Who");
		diccionario.put("Cómo", "How");
		diccionario.put("Por qué", "Why");
		diccionario.put("Cuándo", "When");
		diccionario.put("Dónde", "Where");
		diccionario.put("Aquí", "Here");
		diccionario.put("Allí", "There");
		diccionario.put("Pequeño", "Small");
		diccionario.put("Bonito", "Beautifull");
		diccionario.put("Cascos", "Headphones");

		// Imprimimos el menú
		System.out.println("Bienvenido al diccionario Español-Inglés");
		System.out.println("Selecciona una opción:");
		System.out.println("1.- Inserta palabra.");
		System.out.println("2.- Busca palabra.");
		System.out.println("0.- Salir.");

		// Leemos la seleccion del usuario
		select = rd.nextInt();
		
		//Limpiamos el buffer
		rd.nextLine();

		// Mientras que no sea 0 la selección, seguimos en el diccionario
		while (select != 0) {

			if (select == 1) {
				// Pedimos palabra en español
				System.out.println("Introduce la palabra a insertar en Español:");
				palabra = rd.nextLine();

				// La pedimos en ingles
				System.out.println("Ahora, introdúcela en Inglés:");
				word = rd.nextLine();

				// Añadimos las palabras al diccionario
				diccionario.put(palabra, word);

			} else if (select == 2) {
				// Pedimos la palabra a buscar
				System.out.println("Introduce la palabra a buscar en Español:");
				busca = rd.nextLine();

				// Buscamos la palabra
				search = diccionario.get(busca);

//				Si no se encuentra se lo decimos al usuario
				if (search == null) {
					System.err.println("Palabra no encontrada");
				} else {
					System.out.println("Palabra traducida: " + search);
				}
			}

			// Imprimimos el menú
			System.out.println("Bienvenido al diccionario Español-Inglés");
			System.out.println("Selecciona una opción:");
			System.out.println("1.- Inserta palabra.");
			System.out.println("2.- Busca palabra.");
			System.out.println("0.- Salir.");

			// Leemos la seleccion del usuario
			select = rd.nextInt();
			
			//Limpiamos el buffer
			rd.nextLine();

		}
		
		//Imprimimos el diccionario final
		System.out.println(diccionario);
		
		//Cerramos scanner
		rd.close();

	}
}
