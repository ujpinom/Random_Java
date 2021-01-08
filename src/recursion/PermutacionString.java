package recursion;
import java.util.*;
public class PermutacionString {
private static StringBuilder hola= new StringBuilder();
private static  int contador=0;
private static Scanner entrada;
	public static void main(String[] args) {
		

	entrada = new Scanner(System.in);
	System.out.println("Ingrese la palabra: ");
	String palabra= entrada.nextLine();
	String temm= palabra;
	//System.out.println(temm);
	for(int i=0;i<palabra.length();i++) {
		
		if(i>0 && i<=palabra.length()-1) {
			
			char tem= palabra.charAt(i);
			
			char[] arreglo=palabra.toCharArray();
			
			arreglo[i]=arreglo[0];
			arreglo[0]=tem;
			for(int j=0;j<arreglo.length;j++) {
				hola.append(arreglo[j]);
			}
			palabra=hola.toString();
//			System.out.println(palabra);
			hola.delete(0,hola.length());
			permutacion(palabra,0);
			palabra=temm;
		}
		
		else {
		
		permutacion(palabra,0);
		}
		
	}
	
	System.out.println(contador);
	
	}
	
	public static void permutacion(String s,int index) {
		
		
		
		if(index<s.length()) {
			
			if(index==0) {
					//System.out.println(s);
				permutacion(s,index+1);
				
			}
			else {
			
				char tem= s.charAt(index);
				//System.out.println(tem);
				char[] arreglo=s.toCharArray();
				
				if(index==s.length()-1) {
					arreglo[index]=arreglo[arreglo.length-index];
					arreglo[arreglo.length-index]=tem;
				}
				else {
				arreglo[index]=arreglo[arreglo.length-1];
				arreglo[arreglo.length-1]=tem;}
				
				for(int j=0;j<arreglo.length;j++) {
					hola.append(arreglo[j]);
				}
				
				s=hola.toString();
				++contador;
				System.out.println(s);
				
				hola.delete(0,hola.length());
				permutacion(s,index+1);
				
			
			}
	}
		
	}
}
