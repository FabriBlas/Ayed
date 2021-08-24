package a;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		
		char tablero[][] = {{'-','-','-'},
							{'-','-','-'},
							{'-','-','-'}};
		
		Tateti ttt = new Tateti(tablero);
		
		ttt.print_board();
		
	
		
		Tateti ganador= new Tateti ();
		System.out.println(ganador.is_winner(tablero,'x'));
		ganador.is_winner(tablero,'x');
		
	
		
		
		
	

		System.out.println("Seleccione la posicion donde quiere colocar su jugada"
				+ " teniendo en cuenta el siguiente orden:\n\t1- 2- 3- \n\t4- 5- 6- \n\t7- 8- 9-");
	
		int lugar; 
		
		Tateti jugada= new Tateti ();
		
		for (int i = 0; i < tablero.length ; i++) {
			
	    lugar = teclado.nextInt();
		jugada.player_turn('x', lugar,tablero);
		ttt.print_board();
		  
		
		lugar = teclado.nextInt();
		jugada.player_turn('o', lugar,tablero);
		ttt.print_board();
		  
		lugar = teclado.nextInt();
		jugada.player_turn('x', lugar,tablero);
		ttt.print_board();
		 
	     
		
		}
	
		
		

	}

}
