package priorityQueues;
import java.util.*;
import genericos.GenericStack;

public class CalculadoraCompuesta {

	public static void main(String[] args) {
		
		
		
		if(args.length<1) {
			System.out.println("No elementos detectados. Operacion finalizada.");
			System.exit(0);
		}
		
		String entrada="";
		
		for(int i=0;i<args.length;i++) {
			entrada+=(args[i]);
		}
		System.out.println(entrada);
		
		try {
			System.out.println("El resultado es: "+evaluarExpresion(entrada));
			
		} catch (Exception e) {
			System.out.println("Error al leer los datos.");
		}
		
//		System.out.println("El resultado es: "+evaluarExpresion("51+54*(3+2)"));
		
		

	}
	
	public static double evaluarExpresion(String expresion) {
		
		GenericStack<Character> operadores= new GenericStack<>();
		GenericStack<Double> numeros= new GenericStack<>();
		
		StringTokenizer item= new StringTokenizer(expresion,"()*+-/",true);
	

		while(item.hasMoreElements()) {
			
			String token=item.nextToken().trim();
			
			if(token.length()==0) {
				continue;
			}
			else if(token.charAt(0)=='+' || token.charAt(0)=='-') {
				
				while(!operadores.isempty() && (operadores.obtenerElemento()=='+'||operadores.obtenerElemento()=='-'||operadores.obtenerElemento()=='*' 
						||operadores.obtenerElemento()=='/')) {
					
					ejecutarOperacion(operadores,numeros);
					
				}


				operadores.addElemento(token.charAt(0));
				
				
			}
			else if(token.charAt(0)=='*' || token.charAt(0)=='/') {
				
				while(operadores.getSize()>=1&&(operadores.obtenerElemento()=='*' 
						||operadores.obtenerElemento()=='/')) {
					
					ejecutarOperacion(operadores,numeros);
					
					
				}
				operadores.addElemento(token.charAt(0));
				
			}
			
			else if(token.charAt(0)=='(') {
				operadores.addElemento(token.charAt(0));
			}
			
			else if(token.charAt(0)==')') {
				
//				while(operadores.obtenerElemento()!='(')
				ejecutarOperacion(operadores,numeros);
				operadores.remover();
			}
			
			else {
				
				numeros.addElemento(Double.parseDouble(token));
			}
		
		}
		
		while(operadores.getSize()>0)
		ejecutarOperacion(operadores,numeros);
	
		return numeros.obtenerElemento();
		
	}
	
	
	public static void ejecutarOperacion(GenericStack<Character> operadores,GenericStack<Double> numeros) {
		
		char operador= operadores.remover();
		double op1= numeros.remover();
		double op2= numeros.remover();
		
		
		if(operador=='+') {
			numeros.addElemento(op1+op2);
		}
		if(operador=='-') {
			numeros.addElemento(op2-op1);
		}
		if(operador=='*') {
			numeros.addElemento(op2*op1);
		}
		if(operador=='/') {
			numeros.addElemento(op2/op1);
		}
		
		
	}

}
