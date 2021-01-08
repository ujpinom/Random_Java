package recursion;
import java.util.*;
public class Palidrome {
	
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Por favor ingre la palabra: ");
		String palabra= entrada.nextLine();
		
		if(Comprobacion(palabra)) {
			System.out.println("La palabra se lee lo mismo al derecho y al reves");
			
		}
		
		else
			System.out.println("No es palindrome");
	
	}
	
	
	public static boolean Comprobacion(String pa) {
		return Check(pa,0,pa.length()-1);
	}
	
	
	public static boolean Check(String pa, int low,int high) {
		
		if(low>=high) {
			return true;
		}
		else if(pa.charAt(low)!=pa.charAt(high)) {
			return false;
		}
		else
			return Check(pa,low+1,high-1);
		
	}
	
	
	
	
//	
//	public static boolean Comprobacion(String pa) {
//		if(pa.charAt(0)!=pa.charAt(pa.length()-1)) {
//			return false;
//		}
//		else if(
//				pa.length()<=1) {
//			return true;
//		}
//		else if(pa.length()==2 && (pa.charAt(0)==pa.charAt(pa.length()-1))) {
//			return true;
//		}
//		
//		else
//			return Comprobacion(pa.substring(1,pa.length()-1));
//		
//		
//	}

}
