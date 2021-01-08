package colecciones;
import java.util.*;
public class TestHashSet {
	
	public static void main(String [] args) {
		
		Set<String> set= new HashSet<String>();
		
		set.add("Holas");
		set.add("perro");
		set.add("gato");
		set.add("Hasdas");
		set.add("Holassad");
		
		System.out.println(set);
		
		TreeSet<String> setordered= new TreeSet<>(set);
		
	System.out.println(setordered);
		
	}
	

}
