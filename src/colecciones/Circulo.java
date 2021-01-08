package colecciones;

public class Circulo extends  GeometricObject {

	private double radio;
	
	public Circulo(double radio) {
		
		if(radio<0) {
			throw new IllegalArgumentException("Las dimensiones de los objetos deben ser positivas");
			
			
		}
		
		this.radio=radio;
	}
	
	
	public double obtenerRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		if(radio<0) 
			throw new IllegalArgumentException("Las dimensiones de los objetos deben ser positivas");
	
		this.radio=radio;
	}

	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI* obtenerRadio()* obtenerRadio();
	}
	
	

}
