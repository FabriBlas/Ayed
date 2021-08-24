package a;

//import java.util.Iterator;
public class Tateti {
	
   // char vacio= '-';
	char arreglo[][];

	
	public Tateti(char[][] arreglo) {
		
		this.arreglo = arreglo;
	}
	public Tateti () {}

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
	boolean is_winner(char arreglo[][],char entrada) {
		boolean check;
		      if  (arreglo[0][0]==entrada && arreglo[0][1]==entrada && arreglo[0][2]==entrada
				|| arreglo[1][0]==entrada && arreglo[1][1]==entrada && arreglo[1][2]==entrada
				|| arreglo[2][0]==entrada && arreglo[2][1]==entrada && arreglo[2][2]==entrada
				|| arreglo[0][0]==entrada && arreglo[1][0]==entrada && arreglo[2][0]==entrada
				|| arreglo[0][1]==entrada && arreglo[1][1]==entrada && arreglo[2][1]==entrada
				|| arreglo[0][2]==entrada && arreglo[1][2]==entrada && arreglo[2][2]==entrada
				|| arreglo[0][0]==entrada && arreglo[1][1]==entrada && arreglo[2][2]==entrada
				|| arreglo[0][2]==entrada && arreglo[1][1]==entrada && arreglo[2][0]==entrada){
			  
		    check=true;
			 }else {
			
		    check= false;
		     }
		      return check;
	
	}
	
	
	
	
	
	
	// Insertar ficha en el tablero
	void player_turn (char player, int pos,char arreglo[][]) {
		      
			   switch (pos) {
			   case 1:
				    arreglo [0][0]= player;
				    
				   break;
			   case 2: arreglo [0][1]= player;
				   break;
			   case 3: arreglo [0][2]= player;
				   break;
			   case 4: arreglo [1][0]= player;
				   break;
			   case 5: arreglo [1][1]= player;
				   break;
			   case 6: arreglo [1][2]= player;
				   break;
			   case 7: arreglo [2][0]= player;
				   break;
			   case 8: arreglo [2][1]= player;
				   break;
			   case 9: arreglo [2][2]= player;
				   break;
				  
			   }	
	}
	 
	
	
	// sabes si hay un espacio libre
	boolean has_cell_free(char player, int pos) {
		
	   
	    return true;
	
	
	}
}