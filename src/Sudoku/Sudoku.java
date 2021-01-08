package Sudoku;
import java.security.*;
import java.util.*;
public class Sudoku {

	private static ArrayList<int [][]> soluciones=new ArrayList<>();
	private static int contador;
	private static int sol=1;
	
	private static int [][] sudoku={{1, 0, 4, 0, 0, 9, 7, 0, 8},
									{0, 2, 0, 3, 0, 0, 6, 0, 0},
									{6, 0, 3, 0, 0, 0, 0, 0, 1},
									{0, 0, 5, 0, 0, 0, 0, 0, 0},
									{2, 0, 0, 0, 0, 0, 3, 0, 0},
									{0, 0, 0, 9, 0, 1, 0, 0, 0},
									{3, 0, 0, 0, 5, 0, 0, 0, 9},
									{0, 0, 0, 2, 0, 0, 0, 0, 0},
									{0, 4, 0, 0, 0, 0, 0, 7, 0}};
	
	

	public static void main(String[] args) {
		

		for(int i=0;i<sudoku.length;i++) {
			for(int j=0;j<sudoku.length;j++) {
				
				if(sudoku[i][j]==0) {
					for(int k=1;k<=9;k++) {
						
						if(comprobacion(i,j,k)) {
							
							sudoku[i][j]=k;
								
							if(Sudoku()) {
								
								++contador;
								
								if(contador==1) {
									soluciones.add(sudoku);
									System.out.println("Solucion "+contador);
									imprimir();
									System.out.println();
								}
								
							if(!comprobar() && contador>1) {
								++sol;
								soluciones.add(sudoku);
								System.out.println("Solucion "+sol);
								imprimir();
								System.out.println();
							}
								
								
								
								 int [][] tem={{1, 0, 4, 0, 0, 9, 7, 0, 8},
											{0, 2, 0, 3, 0, 0, 6, 0, 0},
											{6, 0, 3, 0, 0, 0, 0, 0, 1},
											{0, 0, 5, 0, 0, 0, 0, 0, 0},
											{2, 0, 0, 0, 0, 0, 3, 0, 0},
											{0, 0, 0, 9, 0, 1, 0, 0, 0},
											{3, 0, 0, 0, 5, 0, 0, 0, 9},
											{0, 0, 0, 2, 0, 0, 0, 0, 0},
											{0, 4, 0, 0, 0, 0, 0, 7, 0}};
								 
								
		
								sudoku=tem;
								
							}
							else {
								sudoku[i][j]=0;
								
							}
						}
						
					}
				}
				
			}
		}
		
		System.out.println(sol);
		
		
	
	}
	
	public static boolean comprobar() {
		
		boolean bandera= false;
		for(int i=0;i<soluciones.size();i++) {
			int [][] tem= (int [][])soluciones.get(i);
			
			if(Arrays.deepEquals(sudoku, tem)) {
				bandera=true;
				break;
			}
		}
		return bandera;
		
	}
		
	public static boolean Sudoku() {
	
		for(int i=0;i<sudoku.length;i++) {
			for(int j=0;j<sudoku.length;j++) {
				
				if(sudoku[i][j]==0) {
					
					for(int k=1;k<=9;k++) {
						
						if(comprobacion(i,j,k)) {
							sudoku[i][j]=k;
							
							if(Sudoku()) {
							
								return true;
							}
							else 
								sudoku[i][j]=0;
						}
					}
					return false;
		
				}
			}
		}
		
		return true;
	}
	
	
	public static boolean comprobacion(int fila,int columna,int asignacion) {
		return !(comprobarfila(fila,columna,asignacion)	|| comprobarColumna(fila,columna,asignacion) || comprobarCaja(fila,columna,asignacion));
	}
		
	
	public static boolean comprobarfila(int i,int jj,int num1) {
		
		
		
		for(int j=0; j<sudoku.length;j++) {
		
			if(sudoku[i][j]==num1) {
				return true;
			}	
		}
		
		return false;
	}
	
	public static boolean comprobarColumna(int i,int jj,int num1) {
		
		for(int j=0; j<sudoku.length;j++) {
			
			if(sudoku[j][jj]==num1) {
				return true;
				
			}
			
		}
		
		return false;
		
	}

	public static boolean comprobarCaja(int i,int j,int asignacion) {
		
		
		int f= i-i%3;
		int c= j-j%3;
		
		for(int m=f;m<f+3;m++) {
			for(int n=c;n<c+3;n++) {
				if(sudoku[m][n]==asignacion) {
					return true;
				}
			}
			
		}
		return false;
	}
	
	
	
	public static void imprimir() {
	
	for(int i=0;i<sudoku.length;i++) {
		for(int j=0;j<sudoku.length;j++) {
			
			System.out.print(sudoku[i][j]+" ");
		}
		System.out.println();
	}
}
	


}




