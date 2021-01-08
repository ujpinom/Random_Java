package sorting;

import java.util.Arrays;

public class pruebas {

	public static void main(String[] args) {
		
		int [] arreglo= {1,2,45,6,6,8,9};
		
		
		
		
		int []ar1= Arrays.copyOfRange(arreglo, 0,arreglo.length/2);
	int []	ar2=Arrays.copyOfRange(arreglo, arreglo.length/2, arreglo.length);
		
		
		for(int i=0;i<ar1.length;i++) {
			System.out.println(ar1[i]);
		}
		
		System.out.println();
		
		for(int i=0;i<ar2.length;i++) {
			System.out.println(ar2[i]);
		}
		
	

	}

}
