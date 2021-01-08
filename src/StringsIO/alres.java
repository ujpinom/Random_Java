package StringsIO;
import java.util.*;
public class alres {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada= new Scanner(System.in);
	
	System.out.print("Por favor ingrese una palabra: ");
	
	String palabra= entrada.nextLine();
	
	if(isPalindromes(palabra)) {
		System.out.println("La palabra ingresada es Palindromes");
		
	}
	else
		System.out.println("La palabra ingresada no es Palindromes");

	}
	
	public static boolean isPalindromes(String palabra) {
		
		int bajo=0;
		int alto=palabra.length()-1;
		boolean bandera= true;
		
		while(bajo<alto) {
			if(palabra.charAt(bajo) == palabra.charAt(alto)) {
				
				++bajo;
				--alto;
			}
			
			else {
				bandera=false;
				break;
			}
			
			
		}
		return bandera;
		
	}

}
