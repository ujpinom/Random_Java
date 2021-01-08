package colecciones;

public class Rectangulo extends  GeometricObject {

	private double lado;
	private double largo;
	
	public Rectangulo(double lado,double largo) {
		
		if(lado<0 || largo<0)
			throw new IllegalArgumentException("Dimensiones de los objectos geometricos no pueden ser negativas");
		
		
		this.lado=lado;
		this.largo=largo;
	}
	
	
	public double obtenerLargo() {
		return largo;
	}
	public double obtenerLado() {
		return lado;
	}
	

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return obtenerLargo()*obtenerLado() ;
	}
	
	

}
