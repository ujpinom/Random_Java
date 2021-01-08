package colecciones;
import java.util.*;
public class TestMap {

	public static void main(String[] args) {
		
		String saludos= "Hola que mas!. Espero que todos hayan tenido unas buenas vacaciones y que sobre todo hayan hecho sus tareas.";
		
		Map<String,Integer> ocurrencias= new TreeMap<>();
		
		String[] palabras= saludos.split("[ \\n\\t\\r.,;:!?(){}]");
		
		for(int i=0;i<palabras.length;i++) {
			
			if(palabras[i].length()>0) {
				
				if(!ocurrencias.containsKey(palabras[i].toLowerCase())) {
					
					ocurrencias.put(palabras[i].toLowerCase(), 1);
					
				}
				
				else {
					
					int value= ocurrencias.get(palabras[i].toLowerCase());
					++value;
					ocurrencias.put(palabras[i].toLowerCase(), value);
				}
			
			}
			
		
			
		}
	
		Set<Map.Entry<String, Integer>> entrySet = ocurrencias.entrySet();
		
		
		
		for(Map.Entry<String,Integer> entrada:entrySet) {
			
			if(entrada.getValue()==1) {
				System.out.println(entrada.getKey());
			}
		}
		System.out.println(entrySet);
		
	
	

	}

}
