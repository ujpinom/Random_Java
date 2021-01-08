package Exceptiones;
import java.util.*;
public class exception1 {
	
	public static void main(String[] args) {
		
		
		Scanner entrada= new Scanner(System.in);
		System.out.print("Por favor ingrese dos numeros: ");
		
		int num1= entrada.nextInt();
		int num2= entrada.nextInt();
		
		
		try {
			if(num2==0) {
				throw new ArithmeticException("Divisor debe ser distinto de cero:");
				
			}
			
			System.out.println("LA division de los dos numeros es: "+(double)num1/num2);
		
		}
		
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("The program continues");
	}

}
