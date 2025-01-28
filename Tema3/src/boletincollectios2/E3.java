package boletincollectios2;

import java.util.TreeMap;

public class E3 {
	/*
	 * Implementa una aplicación que cuente la frecuencia de aparición de cada letra
	 * (solo los caracteres alfabéticos) en la siguiente cadena de texto y luego
	 * muestre el conteo por pantalla. Usa la implementación más apropiada:
	 * 
	 * "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad"
	 * Pista: se puede utilizar el método estático isLetter de la clase Character.
	 */

	public static void main(String[] args) {
		// Mapa ordenado alfabéticamente
		TreeMap<Character, Integer> conteo = new TreeMap<Character, Integer>();

		// Frase
		String frase = "En un agujero en el suelo, vivia un hobbit. "
				+ "No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, "
				+ "ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: "
				+ "era un agujero-hobbit, y eso significa comodidad";

		// Valor de la clave
		int valor;
		
		//caracter por el que va recorriendo la frase
		char caracter;

		// Recorremos la frase
		for (int i = 0; i < frase.length(); i++) {

			caracter = frase.charAt(i);
			
			// Comprobamos si el caracter que toca es una letra, si lo es, la añadimos al
			// conteo
			if (Character.isLetter(caracter)) {

				// Si la clave del conteo ya esta añadida le sumamos uno al conteo
				if (conteo.containsKey(caracter)) {

					// Obtenemos el valor de la clave
					valor = conteo.get(caracter);

					// añadimos valor al conteo sumandole uno mas
					valor++;
					conteo.put(caracter, valor);
				} else {
					conteo.put(caracter, 1);
				}

			}
		}
		
		//Imprimimos el diccionario
		System.out.println(conteo);
	}
}
