package recursion;
import java.util.*;
public class Otros {

	
	private static int contador=0;
	public static void main(String[] args) {
	
//		Scanner entrada= new Scanner(System.in);
//		System.out.println("Por favor ingrese la palabra: ");
//		String palabra= entrada.nextLine();
//		System.out.println(Inversion(palabra,palabra.length()-1));
//		
//		System.out.println("numero de ocurrencias de la letra a :"+ ocurrencias(palabra,'a'));
		
		
		StringBuffer hola= new StringBuffer();
		String s= "abc";
		char[] arreglo=s.toCharArray(); 
		char tem= s.charAt(1);
		arreglo[1]=arreglo[arreglo.length-1];
		arreglo[arreglo.length-1]=tem;
	
		for(int i=0;i<arreglo.length;i++) {
			hola.append(arreglo[i]);
		}
		
		
		s=hola.toString();
		hola.delete(0, hola.length());
		System.out.println(hola);
		
		System.out.println(s);
		System.out.println(s.length());
		
//		String m=s.replace(s.charAt(1), s.charAt(s.length()-1));
//		System.out.println(m);
//		String ss= "acc";
//		System.out.println(ss);
//	
//		System.out.println(ss.replace(ss.charAt(2), tem));
		
		

	}
	
	
	public static String Inversion(String s,int index) {
		
		
		if(index==0) {
			return String.valueOf(s.charAt(index));
		}
		
		else {
			return String.valueOf(s.charAt(index))+Inversion(s,index-1);
		}
	}
	
	public static int ocurrencias(String s,char c) {
		return ocurrencias1(s,c,0);
	}
	
	public static int ocurrencias1(String s,char letra,int index) {
		
		if(index<s.length()) {
			
			if(s.charAt(index)==letra) {
				
				++contador;
			}
			
			ocurrencias1(s,letra,index+1);
				
			
		
		}
		return contador;
		
	}

}
