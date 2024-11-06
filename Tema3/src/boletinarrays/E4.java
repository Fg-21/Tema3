package boletinarrays;

public class E4 {
	public static void main(String[] args) {
		/*
		 * Define un array de 12 números enteros con nombre num y asigna los valores
		 * según la tabla que se muestra a continuación. Muestra el contenido de todos
		 * los elementos del array por consola. ¿Qué sucede con los valores de los
		 * elementos que no han sido inicializados?
		 */
		
		//Creamos la tabla de 12 números
		int num[] = new int[12];
		
		//Definimos los parámetros del enunciado en la tabla
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[8] = 14;
		num[6] = 5;
		num[9] = 120;
		
		//Imprimimos toda la tabla
		for (int value : num) {
			System.out.print(value + " ");
		}
		
		//Hacemos un salto de línea (Estético)
		System.out.println();
		
		//Escribimos la respuesta a la pregunta
		System.out.println("Los campos de la tabla no inicializados se asignan a 0 por defecto");
	}
}
