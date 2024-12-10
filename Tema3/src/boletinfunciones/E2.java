package boletinfunciones;

public class E2 {
	public static void main(String[] args) {
		/*
		 * Diseñar la función: int maximo(int t[]), que devuelva el máximo valor
		 * contenido en la tabla t.
		 */

		// Creamos la tabla y la rellenamos
		int t[] = { 15, 24, 32, 2, 112 };

		// LLamamos a la función
		max(t);
		
		
		
	}

	static int max(int t[]) {

		// Creamos la variable para guardar el valor máximo
		int max = 0;

		// Averiguamos el valor mínimo
		max = Integer.MIN_VALUE;

		// Comparamos con todos los valores de la tabla para saber cual es el máximo
		for (int i = 0; i < t.length; i++) {
			if (max < t[i]) {
				max = t[i];
			}
		}
		
		System.out.println("El valor máximo de la tabla es " + max);
		
		//Devolvemos el valor máximo
		return (max);
	}

}
