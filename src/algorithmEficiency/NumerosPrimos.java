package algorithmEficiency;
import java.util.*;
public class NumerosPrimos {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("POr favor ingrese el limite hasta donde se dese encontrar numeros primos: ");
		int n= entrada.nextInt();
		int contador=0;
		
		System.out.println("\n Los numeros primos hasta el numero "+n+ " son: ");
		long startTime = System.currentTimeMillis();
		for(int i=2;i<n;i++) {
			
			if(isPrime(i)) {
				++contador;
				System.out.print(i+" ");

				if(contador%10==0) {
				System.out.println();
				}
				
			}
		}
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println(executionTime);
		//System.out.println(contador);
	
	}
	
	public static boolean isPrime(int numero) {
		
		int raiz=(int) Math.sqrt(numero);
		boolean bandera=true;;
		
		for(int i=2;i<=raiz;i++){
			
			if(numero%i==0) {
				bandera=false;
				break;
			}
		}
		return bandera;
	
	}

}
