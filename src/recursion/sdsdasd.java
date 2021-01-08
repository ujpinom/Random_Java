package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class sdsdasd {

	private  int dim;
	private int [][] tablero= new int[dim][dim];
	private int[] rows= new int[dim];
	private int posi;
	
	private int row;
	
	
	public sdsdasd (int dim) {
		this.dim=dim;
	}
	
	
	public void setTablero(int [][] hola) {
		this.tablero=hola;
	}
	
	
	public void setvector(int [] hola) {
		this.rows=hola;
	}
	

	public  void imprimir() {
		for(int i=0;i<rows.length;i++) {
			tablero[i][rows[i]]=1;
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
	
	
	for(int k=0;k<tablero.length;k++) {
		for(int m=0;m<tablero.length;m++) {
			tablero[k][m]=0;
		}
	}
	
	Arrays.fill(rows, 0);
	
//	for(int m=0;m<rows.length;m++) {
//		rows[m]=0;
//	}
	
	
	
	}
	
	
	public void helper() {
		
		for(int i=0;i<rows.length;i++) {
			if(serch(0,i)) {
				imprimir();
				
			}
			
			
		}
		
	}

	public boolean serch(int row,int columna) {


		if( row==dim) {
		
		return true;	
		}
	
			for(int i=0;i<rows.length;i++) {
				if(row==0)
					rows[0]=columna;
				else
				rows[row]=i;
				if(validacion(row,i) && serch(row+1,columna)) {
					//tablero[row][i]=1;
					return true;
					
				}
			}
			
			return false;
		
	}
	

	
	public boolean validacion(int row,int col) {
		
		
		for(int i=1;i<=row;i++) {
			
			
			
			if(rows[row-i]==col || rows[row-i]==col-i || rows[row-i]==col+i) {
				  return false;
			}
			
		}
		return true;
		
	}

}
