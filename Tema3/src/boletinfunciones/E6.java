package boletinfunciones;

import java.util.Arrays;
import java.util.Scanner;

public class E6 {
	public static void main(String[] args) {
		/*
		 * Implementa la función: int[] suma(int t[], int numElementos), que crea y
		 * devuelve una tabla con las sumas de los numElementos elementos consecutivos
		 * de t. Veamos un ejemplo, sea t=[10, 1, 5, 8, 9, 2]. Si los elementos de t se
		 * agrupan de 3 en 3, se harán las sumas: 
		 * 
		 * 10+1+5=16 
		 * 1+5+8=14 
		 * 5+8+9=22 
		 * 8+9+2=19
		 * 
		 * Por lo tanto, la función devolverá una tabla con los resultados: [16, 14, 22,
		 * 19].
		 */
		
		//Creamos la tabla de los elementos
		int t[] = {10, 1, 5, 8, 9, 2};
		
		//Creamos una variable para guardar los elementos  //
		int numElementos;
		
		//Creamos una variable para guardar el sumatorio
		int sumas[] = {t.length};
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Preguntamos al usuario en cuantos elementos se agrupa la suma
		System.out.println("En cuántos elementos se agrupa la suma?");
		numElementos = rd.nextInt();
		
		//Llamamos a la función
		sumas = suma(t, numElementos);
		
		//Imprimimos los resultados de las sumas
		System.out.println(Arrays.toString(sumas));
		
		//Cerramos scanner
		rd.close();
	}
	//Creamos la función
	static int[] suma(int t[], int numElementos) {
		 //Creamos una variable para guardar la suma
		 int [] sumatorio = new int[t.length-numElementos+1];
		 
		 for (int i = 0; i < sumatorio.length; i ++) {
			 for (int j = i; j < i+numElementos; j++) {
				 sumatorio[i] += t[j]; 
			 }
		 }
		 
		 return sumatorio;
				 
	 }

}
