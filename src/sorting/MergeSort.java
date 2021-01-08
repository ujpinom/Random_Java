package sorting;

import java.util.Arrays;

public class MergeSort {
	
	public static int [] solucion;
	public static int [] tem;

	public static void main(String[] args) {
		
		int [] arreglo= {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
		
		merSort(arreglo,arreglo.length);
		for(int i=0;i<arreglo.length;i++) {
			System.out.print(arreglo[i]+" ");
		}
		

	}
	
	public static void merSort(int [] lista,int longitud) {
		
		
		
		if(lista.length>1) {
			
			int [] lista1=Arrays.copyOfRange(lista, 0, lista.length/2);
			
			merSort(lista1,longitud);
		
			int [] lista2=Arrays.copyOfRange(lista,lista.length/2 , lista.length);
			
			merSort(lista2,longitud);
			
			
			int [] tem= merge(lista1,lista2);
			System.arraycopy(tem, 0, lista, 0, tem.length);
			
		}

	
	}
	
	
	public static int [] merge (int []lista1,int [] lista2) {
		
		int [] tem= new int [lista1.length+lista2.length];
		
		
		int actual1=0;
		int actual2=0;
		int actual3=0;
		
		
		while(actual1<lista1.length && actual2<lista2.length) {
			
			if(lista1[actual1]<lista2[actual2]) {
				tem[actual3]=lista1[actual1];
				++actual3;
				++actual1;
			}
			else {
				tem[actual3]=lista2[actual2];
				++actual3;
				++actual2;
			}
			
		}
		
		while(actual1<lista1.length) {
			tem[actual3]=lista1[actual1];
			++actual3;
			++actual1;
		}
		
		while(actual2<lista2.length) {
			tem[actual3]=lista2[actual2];
			++actual3;
			++actual2;
		}
		
		return tem;
		
		
	}
	
	public static void imprimir(int [] resultado) {
		
		for(int i=0;i<resultado.length;i++) {
			System.out.print(resultado[i]+" ");
		}
	}

}
