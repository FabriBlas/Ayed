package a;

//import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//Scanner teclado= new Scanner (System.in);
		
		char tablero[][] = {{'-','-','-'},
							{'-','-','-'},
							{'-','-','-'}};
		
		Tateti ttt = new Tateti(tablero);
		
		ttt.print_board();
		
	
		
		Tateti ganador= new Tateti ();
		System.out.println(ganador.is_winner(tablero));
		ganador.is_winner(tablero);
		
	
		
		
		
	
		
		
		
	 
		
		

	
		
		

	}

}
