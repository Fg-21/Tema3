package boletinarrays2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E4 {
	public static void main(String[] args) {
		/*
		 * Necesitamos crear un programa para mostrar el ranking de puntuaciones de un
		 * torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las
		 * puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800,
		 * de tipo entero) y luego muestre las puntuaciones en orden descendente (de la
		 * más alta a la más baja).
		 */
		
		//Creamos la tabla para las puntuaciones de los 8 jugadores
		Integer pts[] = new Integer [8];
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Recorremos las posiciones de la tabla pidiendo al usuario los puntos de cada jugador
		for (int i = 0; i <= pts.length-1; i++) {
			System.out.println("Introduce la puntuación del jugador " + (i+1) + "(Debe ser de tipo entero y entre 1000 y 2800)");
			pts[i] = rd.nextInt();
		}
		
		//Ordenamos primero en orden ascendente y luego revertimos el orden de puntuaciones
		Arrays.sort(pts, Collections.reverseOrder());
	
		//Imprimimos la tabla por pantalla
		System.out.println(Arrays.toString(pts));
		
		//Cerramos scanner
		rd.close();
	}
}
