package recursion;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Por favor ingrese un numero entero no negativo: ");
		int n= entrada.nextInt();
		
		
		System.out.println("El factorial de "+n+" es "+ Factorial(n));

	}
	
	static long Factorial(int n) {
		
		if(n==0) {
			return 1;
		}
		else
			return n*Factorial(n-1);
	}

}
