package recursion;
import java.util.*;
public class OchoDeReinas {
	
	private static  int [][] tablero= new int[8][8];
	private static  int[] rows= new int[8];
	private static int contador=0;
	

	
	public static void main(String[] args) {

		OchoDeReinas gg= new OchoDeReinas();
		
		
		serch(0);
		
		System.out.println(contador);
		
		
		
		for(int i=0;i<rows.length;i++) {
			System.out.println(rows[i]);
		}
		System.out.println();
		
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero.length;j++) {
				if(tablero[i][j]==1) {
					System.out.print("R ");
				}
				else System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public int [] obtenerfilas() {
		return rows;
	}
	
	public static  boolean serch(int row) {
		if(row==8) 
			return true;
			
			for(int i=0;i<rows.length;i++) {
				rows[row]=i;
				if(validacion(row,i) && serch(row+1)) {
					++contador;
					tablero[row][i]=1;
					return true;
					
				}
			}
			
			return false;
	}
	
	public static  boolean validacion(int row,int col) {
		
		
		for(int i=1;i<=row;i++) {
			
			if(rows[row-i]==col || rows[row-i]==col-i || rows[row-i]==col+i) {
				  return false;
			}
			
			
			
		}
		return true;
		
	}

}
