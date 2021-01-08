package colecciones;
import java.util.*;
import java.security.*;
public class TestComparatorPoints {

	public static void main(String[] args) {
		
		SecureRandom random= new SecureRandom();
		
		Points [] puntos = new Points[100];
		
		for(int i=0;i<puntos.length;i++) {
			
			int x= random.nextInt(1000);
			int y= random.nextInt(1000);
			puntos[i]=new Points(x,y);
			
		}
		
		Set<Points> set= new TreeSet<>(new ComparatorPoints());
		
		for(int i=0;i<puntos.length;i++) {
			
			set.add(puntos[i]);
		}
		
		System.out.println(set.size());
	
		for(Points elementos: set) {
			
			System.out.println(elementos.getX()+"   "+elementos.getY());
		}
		
		Object hola;
		
		
	}

}
