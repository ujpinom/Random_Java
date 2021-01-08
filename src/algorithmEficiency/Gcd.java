package algorithmEficiency;
import java.util.*;
public class Gcd {

	public static void main(String[] args) {
		
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Por favor ingrese el primer numero: ");
		int num1= entrada.nextInt();
		System.out.print("Por favor ingrese el segundo numero: ");
		int num2= entrada.nextInt();
		
		
		System.out.println("El maximo comun divisor de los numeros "+num1+ " y "+ num2+ " es: "+gcd(num1,num2));
		

	}
	
	public static int gcd(int num1,int num2) {
	
		if(num1%num2==0) {
			return num2;
		}
		
		else {
			return gcd(num2,num1%num2);
		}
	}

}
