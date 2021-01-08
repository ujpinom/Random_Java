package recursion;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Por favor ingrese el termmino que quieres conocer de la serie: ");
		int numero= entrada.nextInt();
		
		System.out.println("El numero "+ numero+ " de la serie es: "+ Fibonacci(numero));
		
	}
	
	public static int Fibonacci(int n) {
		
		
		if(n==0) {
			return 4;
		}
		else if(n==1) {
			return 5;
		}
		else 
			return Fibonacci(n-1)+Fibonacci(n-2);
		}
	}


