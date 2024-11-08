package boletinarrays;

import java.util.Scanner;

public class E7 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de
		 * un determinado año y las almacene en una tabla (una posición por mes). A
		 * continuación, se debe mostrar un diagrama de barras horizontales con esos
		 * datos. Las barras del diagrama se pueden dibujar a base de asteriscos o
		 * cualquier otro carácter.
		 */
		
		//Creamos la tabla con todos los meses para la temperatura
		int arrMes[] = new int[12];
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos las temperaturas medias de cada mes 
		for (int i = 0; i < arrMes.length; i++) {
			System.out.println("Introduce la temperatura media del mes  " + (i+1));
			arrMes[i] = rd.nextInt();
		}
		
		//Mostramos la tamperatura y el diagrama de barras correspondinte
		for (int i = 0; i < arrMes.length; i++) {
			System.out.print("Mes " + (i+1) + " ");
			for(int j = 0; j < arrMes[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Cerramos scanner
		rd.close();
	}
}
