package colecciones;
import java.util.*;
public class OperacionesConjuntos {

	public static void main(String[] args) {
		
		Set<String> nonduplicated= new TreeSet<>();
		String palabra= "words from a text file and displays all the nonduplicate words in ascending order.";
		
		String[] palabras= palabra.split("[ \\n\\t\\r.,;:!?(){}]");
		
		
		for(int i=0;i<palabras.length;i++) {
			String key= palabras[i].toLowerCase();
			
			if(key.length()>0) {
				nonduplicated.add(key);
				
			}
		}
		
		System.out.println(nonduplicated);
		
		
		

	}

}
