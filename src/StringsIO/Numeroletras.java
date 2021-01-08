package StringsIO;
import java.util.*;
public class Numeroletras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Ingrese la palabra: ");
		String palabra= entrada.nextLine();
		
		
		String p1= palabra.toLowerCase();
			
		char [] letras= p1.toCharArray();
		
		ArrayList<Character> letrass= new ArrayList<>();
		
		
		for(int i=0;i<letras.length;i++) {
			
			if(!letrass.contains(letras[i])) {
				
				letrass.add(letras[i]);
				
			}
			
		}
		
		
		int frecuencia []= new int[letrass.size()];
		
		int count=0;
		for(int i=0;i<letrass.size();i++) {
			
			for(int j=0;j<palabra.length();j++) {
				
				if(letrass.get(i)==palabra.charAt(j)) {
					
					frecuencia[i]+=1;
					
					
				}
			
			}
			System.out.printf("La letra %s, se repite %d veces %n",letrass.get(i),frecuencia[i]);
		}
		
	}

}
