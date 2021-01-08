package priorityQueues;

import java.util.ArrayList;
import java.util.Arrays;

public class pruebas {

	public static void main(String[] args) {
		
		ArrayList<int [][]> soluc= new ArrayList<>();
		
		int [][] ar1= {{1,2,4,5},{6,7,8,9},{10,11,12,13},{14,15,16,17},{18,19,19,20}};
		
		int [][] ar2={{0,2,4,5,7},{6,7,8,9},{10,11,12,13},{14,15,16,17},{18,19,19,20}};
		int [][] ar3={{0,2,4,5,7,8},{6,7,8,9},{10,11,12,13},{14,15,16,17},{18,19,19,20}};
		
		soluc.add(ar2);
		soluc.add(ar1);
		
		boolean flag=false;
		for(int i=0;i<soluc.size();i++) {
			int [][] tem= (int [][])soluc.get(i);
			if(Arrays.deepEquals(ar3, tem)) {
				flag=true;
				break;
			}
			
		}
		
		if(!flag) {
			soluc.add(ar3);
		}
		
		System.out.println(soluc.size());

	
	}

}


