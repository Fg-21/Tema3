package boletincollections;

import java.util.HashMap;
import java.util.Scanner;

public class E8 {
	/*
	 * Implementa el control de acceso al área restringida de un programa. Los
	 * nombres de usuario con sus correspondientes contraseñas deben estar
	 * almacenados en una estructura de la clase HashMap. El programa mostrará un
	 * menú con dos opciones: 
	 * 
	 * Registro. Debe pedir un nombre de usuario y una
	 * contraseña. A continuación, se almacenarán en el mapa. 
	 * 
	 * Login. Debe pedir un nombre de usuario y una contraseña. Si el usuario introduce 
	 * los datos correctamente, el programa dirá “Ha accedido al área restringida”. 
	 * El usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades el
	 * programa dirá “Lo siento, no tiene acceso al área restringida”. 
	 * 
	 * Salir. Termina el programa.
	 */

	public static void main(String[] args) {
		// Objeto scanner
		Scanner scanner = new Scanner(System.in);

		// Lista de usuarios y contraseñas
		HashMap<String, String> usuarios = new HashMap<>();

		// Opcion del usuario
		int opcion;

		// Numero de intentos
		int intentos = 3;

		// Mientras que el usuario no seleccione salir...
		do {

			// Imprimimos menu
			System.out.println("\n--- Menú ---");
			System.out.println("1. Registro");
			System.out.println("2. Login");
			System.out.println("3. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = scanner.nextInt();

			// Limpiamos buffer
			scanner.nextLine();

			// Dependiendo de la opción...
			if (opcion == 1) {
				// Pedimos un nuevo nombre de usuario
				System.out.print("Ingrese un nuevo nombre de usuario: ");
				String usuario = scanner.nextLine();

				// Si ya existe, le informamos
				if (usuarios.containsKey(usuario)) {
					System.out.println("El usuario ya está registrado.");
				} else {
					// Pedimos una contraseña
					System.out.print("Ingrese una contraseña: ");
					String contraseña = scanner.nextLine();

					// La añadimos al map junto con el usuario
					usuarios.put(usuario, contraseña);
					System.out.println("Usuario registrado con éxito.");
				}
				continue;
			}

			if (opcion == 2) {
				// Le pedimos que ingrese su usuario
				System.out.print("Ingrese su nombre de usuario: ");
				String usuario = scanner.nextLine();

				// Si no existe se lo hacemos saber
				if (!usuarios.containsKey(usuario)) {
					System.err.println("El usuario no existe.");
					continue;
				}

				// Mientras queden intentos seguimos pidiendo contraseñas haasta que acierte
				while (intentos > 0) {
					// Pedimos contraseña
					System.out.print("Ingrese su contraseña: ");
					String contraseña = scanner.nextLine();

					// Si la acierta, se le da acceso
					if (usuarios.get(usuario).equals(contraseña)) {
						System.out.println("Ha accedido al área restringida.");
						intentos = 0;
					} else {

						// Si no la acierta se le resta un intento y se le pregunta de nuevo
						intentos--;
						System.err.println("Contraseña incorrecta. Intentos restantes: " + intentos);
					}
				}

				// si se acaban los intentos y en el ultimo no ha acertado se le restringe el
				// acceso
				if (intentos == 0 && !usuarios.get(usuario).equals(scanner.nextLine())) {
					System.err.println("Lo siento, no tiene acceso al área restringida.");
				}
				continue;
			}

			// Informamos que la opción no existe
			if (opcion != 3) {
				System.err.println("Opción no válida.");
			}

		} while (opcion != 3);

		// Salimos del programa
		System.out.println("Saliendo del programa...");

		// Cerramos scanner
		scanner.close();
	}
}
