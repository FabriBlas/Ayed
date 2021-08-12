package a;

import java.util.Iterator;

public class Tateti {
	
	char arreglo[][];
	
	public Tateti(char[][] arreglo) {
		super();
		this.arreglo = arreglo;
	}

	void print_board( ){
		for (int i = 0; i < this.arreglo.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < this.arreglo.length; j++) {
				System.out.print(this.arreglo[i][j] + " ");
			}
			System.out.print("|\n");
		}
	}
	
	// Conocer si un jugador gano
	boolean is_winner( char player) {
		return false;
	}
	
	// Insertar ficha en el tablero
	void player_turn (char player, int pos) {
		
	}
	
	// sabes si hay un espacio libre
	boolean has_cell_free() {
		return true;
	}
	

}