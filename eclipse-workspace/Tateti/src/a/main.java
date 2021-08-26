package a;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		
		char ficha;
		char tablero[][] = {{'-','-','-'},
							{'-','-','-'},
							{'-','-','-'}};
		
		
		//objeto para imprimir tablero
		Tateti ttt = new Tateti(tablero);
		//ttt.print_board();
		
	
		//objeto para checkear si hay ganador
		Tateti ganador= new Tateti ();
		
		
		
		//aca se escribe la posicion donde va la ficha
		int lugar; 
		System.out.println("Seleccione la posicion donde quiere colocar su jugada"
				+ " teniendo en cuenta el siguiente orden:\n\t1- 2- 3- \n\t4- 5- 6- \n\t7- 8- 9-");
	
		
		//objeto para colocar ficha
		Tateti jugada= new Tateti ();
		
		//objeto para checkear espacio libre
		Tateti check_space= new Tateti();
		check_space.has_cell_free(tablero);
		
	
		
		//juego
		 do {	
		ficha='x';	//jugador x 
	    lugar = teclado.nextInt();  //pide posicion
		jugada.player_turn(ficha, lugar,tablero); //coloca su ficha en el tablero 
		ttt.print_board(); //muestra la tabla
		
		
		
		ficha='o'; //jugador o
		lugar = teclado.nextInt();  //pide posicion
		jugada.player_turn(ficha, lugar,tablero); //coloca su ficha en el tablero 
		ttt.print_board(); //muestra la tabla 
		
		
		System.out.println(check_space.has_cell_free(tablero));//pruebo si funciona bien el metodo para corroborar que hay espacio
		
	
	}while (check_space.has_cell_free(tablero)==true|| ganador.is_winner(tablero, 'o')==false|| ganador.is_winner(tablero, 'x')==false );
		
		 if(ganador.is_winner(tablero,'x')==true) {
			 System.out.println("el ganador es el jugador: " + 'x');
			 }else if (ganador.is_winner(tablero,'o')==true) {
				 System.out.println("el ganador es el jugador: " + 'o');
			 }else System.out.println("tablero lleno");

	}

}
