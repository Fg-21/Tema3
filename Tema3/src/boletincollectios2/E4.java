package boletincollectios2;

import java.util.LinkedList;
import java.util.Scanner;

public class E4 {
	/*
	 * Realiza un programa que cree una lista de nombres de personas vacía. A
	 * continuación, mostrará el siguiente menú. Atendiendo a la opción seleccionada
	 * por el usuario el programa debe realizar la operación concreta: 
	 * 
	 * Añadir nuevo nombre a la lista. 
	 * Elimina un nombre específico. 
	 * Ordena la lista alfabéticamente. 
	 * Busca si un nombre específico está en la lista. 
	 * Salir.
	 */
	
	public static void main(String[] args) {
		
		//Lista de nombres
		LinkedList<String> listaNames = new LinkedList<String>();
		
		//Objeto scanner
		Scanner rd = new Scanner(System.in);
		
		//Opcion del usuario
		int select;
		
		//Nombre (a añadir o eliminar)
		String name;
		
		//Mientras que el usuario no ponga salir seguimos en el menu
		do {
			//Imprimimos menu
			printMenu();
			
			//leemos la opción del usuario
			select = rd.nextInt();
			
			//Limpiamos buffer
			rd.nextLine();			
			
			//segun la opción del usuario
			switch (select) {
			case 1 ->{
				//Preguntamos el nombre a añadir
				System.out.println("Nombre a añadir");
				name = rd.nextLine().toLowerCase();
				
				//Añadimos el nombre
				
			}
			}
			
			
		}while(select != 5);
		
		//Imprimimos la despedida
		System.out.println("BYEEE!");
	}
	
	//metodo que imprime menu
	static void printMenu() {
		System.out.println("------MENU------");
		System.out.println("1. Añadir nuevo nombre a la lista");
		System.out.println("2. Elimina un numbre de la lista");
		System.out.println("3. Ordena Alfabéticamente");
		System.out.println("4. Busca si un nombre esta en la lista");
		System.out.println("5. Salir");
		System.out.print("Introduce tu opción: ");
	}
	

}
