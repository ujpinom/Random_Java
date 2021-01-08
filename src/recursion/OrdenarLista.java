package recursion;
import java.util.*;
public class OrdenarLista {

	public static int lista []= {10,2,-1,-2,30};
	private static Scanner entrada;
	
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		Ordenacion(lista,0,lista.length-1);
		
		for(int i=0; i<lista.length;i++) {
			System.out.print(lista[i]+" ");
		}
		
		System.out.print("Ingrese el numero que desea buscar en la lista: ");
		int numero= entrada.nextInt();
		
		int low=0;
		int high=lista.length-1;
		
		
		
		
		if( Busquedad(lista,numero,low,high)>=0) {
			System.out.println("Se encontro el numero en la posicion "+ Busquedad(lista,numero,low,high));
		}
		else
			System.out.println("No se encontro el valor solicitado dentro de la lista");

		
	}
	
	public static int Busquedad(int []lista,int numero,int low,int high) {
		
		
		if(low>high) {
			return -1;
		}
		
		int mid= (low+high)/2;
		
		if(numero<lista[mid] ){
			
			return Busquedad(lista,numero,low,mid-1);
		}
	
		else if(numero>lista[mid]) {
			return Busquedad(lista,numero,mid+1,high);
		}
		else 
			return mid;
		
	}

	
	public static void Ordenacion(int lista [], int low,int high) {
		
		if(low<high) {
		
			int min= lista[low];
		
			for(int i=low+1;i<lista.length;i++) {
				
				if(lista[i]<min) {
				
					lista[low]=lista[i];
					lista[i]=min;
					min=lista[low];
					
				}
			
			}
			
				Ordenacion(lista,low+1,high);
		}
	}
}
