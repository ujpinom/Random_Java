package InterfacesRepaso;

public class pruebaobjetosgeo {

	public static void main(String[] args) {
		
		
		try {
		triangulo t1= new triangulo(-4,6);
		circulo c1= new circulo(3);
		Objetosgeometricos tem=null;
		Objetosgeometricos tem1=null;
		tem=(triangulo)t1;
		tem1=(circulo)c1;
		
	System.out.println(tem);
	System.out.println(tem1);
		
		}
		
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	
		
		
		
		
		
		
		
		
	}

}
