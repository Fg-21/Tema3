package boletinarrays2;

import java.util.Arrays;
import java.util.Random;

public class E6 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que cree dos tablas, la primera con los 6 números de una
		 * apuesta de la primitiva generados aleatoriamente entre 1 y 49 y, la segunda
		 * (ordenada) con los 6 números de la combinación ganadora. La combinación
		 * ganadora debe establecerse en el momento de crear la tabla. El programa
		 * devolverá el número de aciertos.
		 */
		
		//Creamos una tabla para la combinación aleatoria
		int tabPlayer[] = new int[6];
		
		//Creamos una tabla para los 6 números de la combinación ganadora
		int tabWin[] = new int[6];
		
		//Creamos variable para contar iteraciones del bucle 
		int i = 0;
		
		//Creamos la variable para guardar el número aleatorio
		int randomnum;
		
		//Creamos una variable para gaurdar la busqueda
		int busqueda;
		
		//Creamos una variable para el número de aciertos
		int numAciertos = 0;
		
		//Importamos random
		Random rand = new Random();
		
		//Creamos el bucle para asignar la apuesta ganadora sin repetir números
		while (i < tabPlayer.length) {
			randomnum = rand.nextInt(0, 50);
			Arrays.sort(tabPlayer);
			busqueda = Arrays.binarySearch(tabPlayer, randomnum);
			
			if (busqueda < 0) {
				tabPlayer[0] = randomnum;
				i++;
			}
		}
		
		System.out.println(Arrays.toString(tabPlayer));
		
		for (int value : tabPlayer) {
			busqueda = Arrays.binarySearch(tabWin, value);
			if (busqueda >= 0) {
				numAciertos++;
			}
		}
		
		System.out.println("Nº de aciertos: " + numAciertos);
		
		
	}
}
