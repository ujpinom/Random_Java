package StringsIO;
import java.util.*;
public class ejercicio9 {
	private static 
	String letras[]= {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Por favor ingrese una cadena");
		
		String numero= entrada.nextLine();
		
		String numeromayuscula= numero.toUpperCase();
		
		
		
		anumero(numeromayuscula);
		
		
	}
	
	public static void anumero(String s1) {
		
		ArrayList<Integer> numero= new  ArrayList<>();
		
		StringBuffer buffer= new StringBuffer();
		
		
		for(int i=0;i<s1.length();i++) {
			
			char h= s1.charAt(i);
			if(Character.isLetter(h)) {
			String s2= Character.toString(h);
			for(int j=0;j<letras.length;j++) {
				if(letras[j].contains(s2)) {
					
					//numero.add(j);
					buffer.append(j);
					
				}
						
				}
				
				
			}
			else if(Character.isDigit(h)) {
				int numeroo= Character.getNumericValue(h);
				
				//numero.add(numeroo);
				buffer.append(numeroo)
;	
			}
			
			else if(!Character.isLetterOrDigit(h)) {
				buffer.append(h)
;			}
			
			
		}
		//System.out.println(numero);
		System.out.println(buffer);
		
		
		
		
	}
}