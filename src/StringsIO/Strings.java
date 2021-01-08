package StringsIO;
import java.util.*;
public class Strings {

	public static void main(String[] args) {
	
		String string= "wabbawabba";
		 String newstring= string.substring(4);
		 System.out.println(string.toLowerCase());
		 System.out.println(string.toUpperCase());
		 System.out.println(string.replace("perro", "perra"));
		 System.out.println(string.replaceFirst("o", "ooooo"));
		 
		 String perro[]="Hola perro".split(" ",0);
		 
		 for(int i=0;i<perro.length;i++) {
			 System.out.print(perro[i]);
		 }
		 System.out.println();
		 
		 String cosas []= {"Java is fun","Java is cool","Java is powerful","perro","gonorrea"};	
		 
		 for(int j=0;j<cosas.length;j++) {
			 if(cosas[j].matches("Java.*")) {
				 System.out.println(cosas[j]);
			 }
		 }
		 
		 //Convertir strings a arreglos
		 
		 char h []=string.toCharArray();	
		 
		ArrayList<String> diccionario= new ArrayList<>();
		
		ArrayList<Character> diccionari= new ArrayList<>();
		
		for(int k=0;k<h.length;k++) {
			
			String s= String.valueOf(h[k]);
			
			if(!diccionario.contains(s)) {
				diccionario.add(s);
			}
			
		}
		
		for(int d=0;d<diccionario.size();d++) {
			System.out.println(diccionario.get(d));
		}
		
		String []dicci= diccionario.toArray(new String[0]);
		
		System.out.println(dicci[0]);
		
		System.out.println((char)('a'+2));
		
		char ss2= '1';
		
		int num= Character.getNumericValue(ss2);
		System.out.println(num);
;		
		 
		 //Convertir arreglos a string
		 
		
	}

}
