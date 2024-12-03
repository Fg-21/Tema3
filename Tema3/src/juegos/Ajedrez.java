package juegos;

import java.util.Scanner;

public class Ajedrez {

	public static void main(String[] args) {
		char board[][] = new char[8][8];
		int posFila, posColumna;
		char pieza;

		Scanner rd = new Scanner(System.in);

		System.out.println("Tipo de pieza");
		pieza = rd.next().toUpperCase().charAt(0);

		System.out.println("Fila");
		posFila = rd.nextInt();

		System.out.println("Columna");
		posColumna = rd.nextInt();

		switch (pieza) {
		case 'T' -> {
			board = torre(posFila, posColumna, pieza);

			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println("");
			}

		}
		case 'A' -> {
			board = afil(posFila, posColumna, pieza);

			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println("");
			}

		}
		}

	}

	static char[][] torre(int posFila, int posColumna, char pieza) {
		char board[][] = new char[8][8];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if ((i == posFila || j == posColumna)) {
					board[i][j] = 'x';
				} else {
					board[i][j] = '0';
				}
				if (board[i][j] == board[posFila][posColumna]) {
					board[i][j] = 'T';
				}
			}
		}
		return board;
	}

	static char[][] afil(int posFila, int posColumna, char pieza) {
		char board[][] = new char[8][8];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = '0';
			}
		}

		//Arriba derecha
		for (int i = 0; i < board.length; i++) {
			if (posFila - i >= 0 && posColumna + i < board.length) {
				board[posFila - i][posColumna + i] = 'X';
			}
		}
		
		
		//Arriba izquierda
		for (int i = 0; i < board.length; i++) {
			if (posFila - i >= 0 && posColumna - i >= 0) {
				board[posFila - i][posColumna - i] = 'X';
			}
		}
		
		//Abajo derecha
		for (int i = 0; i < board.length; i++) {
			if (posFila + i < board.length && posColumna + i < board.length) {
				board[posFila + i][posColumna + i] = 'X';
			}
		}
		
		//Abajo izquierda
		for (int i = 0; i < board.length; i++) {
			if (posFila + i < board.length && posColumna - i >= 0) {
				board[posFila + i][posColumna - i] = 'X';
			}
		}
		
		//pon la A
		board[posFila][posColumna] = 'A';
		
		return board;
	}

}
