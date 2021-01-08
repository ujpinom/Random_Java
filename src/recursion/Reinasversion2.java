package recursion;
import java.util.*;
public class Reinasversion2 {

public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese el numero de filas del triangulo: ");
		int filas=entrada.nextInt();
		int tri [][] = new int[filas][filas];
		Triangulo triangulo= new Triangulo();
		triangulo.setDimensiones(tri);
		triangulo.run();
	}
}

class Triangulo{
	private int dim;
	private  int [][] soluciones= new int[dim][dim];
	public void run() {
		for(int i=1;i<=soluciones.length;i++) {
			getSolutions(i);
		
			//System.out.println();
		}
		imprimir();
	}
	
	public void setDimensiones(int [][] dim) {
		this.soluciones=dim;
	}
	
	public  void getSolutions(int fila){
		
		if(fila==1) {
			soluciones[fila-1][fila-1]=1;
		}
		
		else if(fila==2) {
			for(int i=0;i<fila;i++) {
				soluciones[fila-1][i]=1;
				
			}
		}
		
		else if(fila>2){
			for(int i=0;i<fila;i++) {
				
				if(i==0 || i== fila-1) {
					soluciones[fila-1][i]=1;	
				}
				else {
					soluciones[fila-1][i]=getValores(fila-1,i);
				}
			}
		}
	
	}

	public int getValores(int fila,int index) {
	return soluciones[fila-1][index-1]+soluciones[fila-1][index];
	}
	
	public void imprimir() {
		
		for(int i=0;i<soluciones.length;i++) {
			for(int j=0;j<soluciones.length;j++) {
				
				if(soluciones[i][j]==0) {
					System.out.print(" ");
				}
				else
					System.out.print(soluciones[i][j]+" ");
			}
			System.out.println();
		}
	}
}



