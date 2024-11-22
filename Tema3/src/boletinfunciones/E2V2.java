package boletinfunciones;

public class E2V2 {
	public static void main(String[] args) {
		/*
		 * Realiza una función que reciba una tabla bidimensional y devuelva en otro
		 * array distinto su transposición:
		 * 
		 * Define un método main que llame a esta función pasándole una tabla
		 * bidimensional y muestre por pantalla el resultado.
		 */
		
		//2 for y 2 tablas. Lees por filas y almacenas a la inversa (guardas en columna x, fila x)
		
		//Creamos la tabla bidimendional a recibir por la función
		int[][] arr = {{4, 5, 7}, {3, 6, 8}, {6, 7, 3}} ;
		
		//Creamos la tabla en la que se va a guardar la transformación de la tabla anterior
		int [][] arrTransform = new int [arr.length][arr[0].length];
		
		//Llamamos a la función
		arrTransform = transform(arr);
		
		//Imprimimos la tabla 
				System.out.println("Tabla inicial");
				for(int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
		
		//Imprimimos la tabla transformada
		System.out.println("Tabla transformada");
		for(int i = 0; i < arrTransform.length; i++) {
			for (int j = 0; j < arrTransform[i].length; j++) {
				System.out.print(arrTransform[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//Creamos la función
	static int[][] transform(int[][] arr){
		
		//Creamos la tabla donde se va a hacer la transformación
		int trans[][] = new int[arr.length][arr[0].length];
		
		//Hacemos la transformación
		for (int i = 0; i < trans.length; i++) {
			for (int j = 0; j < trans[i].length; j++) {
				trans[j][i] = arr[i][j];
			}
		}
		return trans;
	}
}
