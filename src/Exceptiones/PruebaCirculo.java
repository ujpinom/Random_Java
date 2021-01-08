package Exceptiones;

public class PruebaCirculo {

	public static void main(String[] args) {
		
		
		try {
		
		circulo c1= new circulo(5);
		circulo c2= new circulo(3);
		circulo c3= new circulo(-7);
		circulo c4= new circulo(-5);
	
	}
		catch(IllegalArgumentException e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Se crearon "+circulo.cuenta+" objetos");
	
	
	}

}
