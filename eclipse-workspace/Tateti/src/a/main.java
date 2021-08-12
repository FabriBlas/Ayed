package a;

public class main {

	public static void main(String[] args) {
		
		char tablero[][] = {{'-','-','-'},
							{'-','-','-'},
							{'-','-','-'}};
		
		Tateti ttt = new Tateti(tablero);
		ttt.print_board();

	}

}
