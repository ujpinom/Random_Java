package sorting;

public class BubbleSort {

	public static void main(String[] args) {
	
		int[] arreglo= {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
		
		
		boolean issort=true;
		
		for(int k=1;k<arreglo.length&&issort;k++) {
			issort=false;
			for(int i=0;i<arreglo.length-k;i++) {
				
				
				if(arreglo[i]>arreglo[i+1]) {
					int tem=arreglo[i];
					
					arreglo[i]=arreglo[i+1];
					
					arreglo[i+1]=tem;
					
					
					issort=true;
				}

			}
			
		}
	
		for(int i=0;i<arreglo.length;i++) {
			System.out.print(arreglo[i]+" ");
		}
		
		

	}

}
