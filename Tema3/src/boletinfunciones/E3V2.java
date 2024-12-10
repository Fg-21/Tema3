package boletinfunciones;

public class E3V2 {
	public static void main(String[] args) {
		/*
		 * Define una función que reciba una tabla bidimensional y devuelva un booleano
		 * para indicar si la matriz es o no simétrica. Una matriz se dice que es
		 * simétrica si A[i][j] = A[j][i] para todo i, j dentro de los límites de la
		 * matriz. Delfine un método main que llame a la función y muestre por pantalla
		 * el resultado, indicando si la tabla pasada por parámetro es simétrica o no.
		 */
		
		//Creamos la tabla para comprobar su simetría
		int tabla[][] = {{1, 2, 9},
						 {2, 4, 9}, 
						 {3, 5, 6}};
		
		//Creamos el booleano que guardará el resultado de la función
		boolean vuleano;
		
		//Llamamos a la función para comprobar simetría
		vuleano = simetria (tabla);
		
		//Imprimimos si la tabla es simétrica o no
		System.out.println(vuleano ? "La tabla es simétrica" : "La tabla no es simétrica");
		
		
	}
	static boolean simetria (int[][] tabla) {
		//Creamos un booleano para devolverlo en la función
		boolean booleano = true;
		
		//Creamos un contador para las filas
		int cont = 0;
		
		//Creamos un contador para las columnas
		int cont2 = 0;
		
		//Recorremos la tabla comprobando si es simétrica
		while (booleano && cont < tabla.length ) {
			
			while (booleano && cont2 < tabla[cont].length) {
				if (tabla[cont][cont2] != tabla[cont2][cont]) {
					booleano = false;
				}
				cont2++;
			}
			cont++;
		}
		//Devolvemos el booleano
		return booleano;
		
		
	}
}
