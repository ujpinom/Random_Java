package Exceptiones;

public class circulo {

	
	public double radio;
	public static int cuenta=0;
	
	public circulo(double radio) {
		
		
		if(radio<0) {
			
			throw new IllegalArgumentException("Radio no puede ser menor que cero");
			
		}
		
		this.radio=radio;
		
		++cuenta;
	}
	
	
	
	public void establecerRadio(double radio) {
		if(radio<0) {
			
			throw new IllegalArgumentException("Radio no puede ser menor que cero");
			
		}
		
		this.radio=radio;
		
	}
	

}
