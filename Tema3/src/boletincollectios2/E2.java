package boletincollectios2;

import java.util.LinkedHashSet;
import java.util.Random;

public class E2 {
	/*
	 * Implementa una aplicación que genere 10 números enteros aleatorios distintos
	 * en el rango del 1 al 20 y los guarde en una implementación que no permita que
	 * se dupliquen números en el caso de que se repitan y que garantice un orden
	 * basado en inserción. Luego, muestra los números únicos generados por
	 * pantalla.
	 */
	
	public static void main(String[] args) {
		//Conjunto basado en orden de inserción
		LinkedHashSet<Integer> conjunto = new LinkedHashSet<Integer>();
		
		//Objeto random
		Random rand = new Random();
		
		//numero random
		int numR;
		
		//Rellenamos el conjunto
		for (int i = 0; i < 10; i++) {
			//randomizamos el numero
			numR = rand.nextInt(0,21);
			
			//Prevenimos la repeticion de numeros aleatorios
			while (!conjunto.add(numR)) {
				
				//randomizamos el numero
				numR = rand.nextInt(0,21);		
			}
			
			//Asignamos el numero al conjunto
			conjunto.add(numR);
			
		}
		
		//Imprimimos el conjunto
		System.out.println("Numeros unnicos: " + conjunto);
	}
	
	
}
