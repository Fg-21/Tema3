package boletinfunciones;

public class E4V2 {
	public static void main(String[] args) {
		/*
		 * Implementa la siguiente función: boolean esMagica(int tabla[][]), que recibe
		 * una tabla bidimensional. La función devolverá true si la matriz introducida
		 * corresponde a una matriz mágica, que es aquella donde la suma de los
		 * elementos de cualquier fila o de cualquier columna valen lo mismo. En caso
		 * contrario devolverá false.
		 */
		int [][] tabla = {{2,2,2}, {2,2,2}, {2,2,2}};
		
		boolean magia;
		
		
		
		magia = esMagica(tabla);
				
		System.out.println(magia ? "Es mágica" : "No es mágica");
	}
	
	static boolean esMagica(int tabla[][]) {
		boolean magic = true;
		int suma = 0;
		int sumaFilas = 0;
		int sumaColum = 0;
		int i = 0;
		int jo = 0;
		
		for (int j = 0; j < tabla[0].length; j++) {
			suma += tabla[0][j];
		}

		while(i < tabla.length && magic) {
			sumaFilas = 0;
			for (int j = 0; j < tabla[i].length; j++) {
				sumaFilas += tabla[i][j];
			}
			i++;
		}
		
		while(jo < tabla[0].length && magic) {
			sumaColum = 0;
			for (int j = 0; j < tabla.length; j++) {
				sumaColum += tabla[jo][j];
			}
			jo++;
		}
		if (sumaFilas != suma || sumaColum != suma) {
			magic = false;
		}
		
		return magic;
	}
}
