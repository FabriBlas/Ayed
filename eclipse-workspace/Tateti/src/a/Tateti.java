package a;

import java.util.Scanner;

public class Tateti {
	Scanner teclado= new Scanner (System.in);
    char vacio= '-';
	char arreglo[][]= new char [3][3];
	int posicion;
	

	
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
				   if(arreglo[0][0]==vacio) {
				    arreglo [0][0]= player;
				   } else { System.out.println("lugar ocupado");
				      }
				   break;
			   case 2:
				   if(arreglo [0][1]==vacio) {
					   arreglo [0][1]= player;
				   }else { System.out.println("lugar ocupado");
				      }
				   break;
			   case 3: if(arreglo [0][2]==vacio) {
				   arreglo [0][2]= player;
			   } else { System.out.println("lugar ocupado");
			      }
				   break;
			   case 4:if( arreglo [1][0]==vacio) {
				   arreglo [1][0]= player;
				   }else { System.out.println("lugar ocupado");
				      }
				   break;
			   case 5: if( arreglo [1][1]==vacio) {
				   arreglo [1][1]= player;
			   }else { System.out.println("lugar ocupado");
			      }
				   break;
			   case 6: if(arreglo [1][2]==vacio) {
				   arreglo [1][2]= player;
			   }else { System.out.println("lugar ocupado");
			      }
				   break;
			   case 7: if(arreglo [2][0]==vacio) {
				   arreglo [2][0]= player;
			   }else { System.out.println("lugar ocupado");
			      }
				   break;
			   case 8: if(arreglo [2][1]==vacio) {
				   arreglo [2][1]= player;
			   }else { System.out.println("lugar ocupado");
			      }
				   break;
			   case 9: if (arreglo [2][2]==vacio) {
				   arreglo [2][2]= player;
			   }else { System.out.println("lugar ocupado");
			      }
				   break;
			   default: System.out.println("error, el numero ingresado no equivale a un lugar");
				  
			   }	
	    }
	// sabes si hay un espacio libre
	public boolean has_cell_free(char arreglo [][]) {
		
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				if (arreglo[i][j]==vacio) {
					return true;
			}
		  }	
		}
		
		return false;
	
	
	}
	
	public  boolean space (char arreglo[][], int pos) {
		int fila;
		int columna;
		boolean res=false;
		fila=(pos-1)/3;
		columna= (pos-1)%3;
		if (arreglo [fila][columna]==vacio) {
			res= true;
		} 
		return res;
	}
	
}