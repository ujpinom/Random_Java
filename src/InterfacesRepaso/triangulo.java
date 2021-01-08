package InterfacesRepaso;

public class triangulo extends Objetosgeometricos{
	
	private double base;
	private double altura;
	
	public triangulo(double base,double altura) {
		
		if(base<0 || altura<0) {
			throw new IllegalArgumentException("Dimensiones deben ser mayor que cero");
			
		}
		
		this.altura=altura;
		this.base=base;
	}
	
	public double obtenerbase() {
		return base;
		
	}
	
	public double obtenerAltura() {
		return altura;
	}
	
	@Override
	
	public double ObtenerArea() {
		return 0.5*obtenerbase()*obtenerAltura();
	}
	
	@Override 
	public double obtenerPerimetro() {
		return 3*obtenerbase();
	}
	
	@Override
	
	public String toString() {
		return String.format("El area de triangulo es: %.2f%nEl perimetro del tringulo es: %.2f%n",ObtenerArea(),obtenerPerimetro());
	}
	

}
