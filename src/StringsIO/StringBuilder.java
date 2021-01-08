package StringsIO;
import java.util.*;


public class StringBuilder {
	
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Por favor ingrese la palabra");
		String palabra= entrada.nextLine();
		String s1= filtrarcaracteresnoalfanumericos(palabra);
		
		String s2= reversar(s1);
		
		
		if(s1.equals(s2)) {
			System.out.println("La palabra es palinndrome");
		}
		else
			System.out.println("La palabra NO es palinndrome");
		
	}
	
	public static String filtrarcaracteresnoalfanumericos(String palabra) {
		
		StringBuffer hola= new StringBuffer();
		for(int i=0;i<palabra.length();i++) {
			
			if(Character.isLetterOrDigit(palabra.charAt(i))) {
				
				hola.append(palabra.charAt(i));
			}
			
		}
		
		String s2=hola.toString();
		return s2;
		
	}
	
	public static String reversar(String s1) {
		
		StringBuffer hola= new StringBuffer();
		
		hola.append(s1);
		
		hola.reverse();
		
		return hola.toString();
		
		
	}
	
}
