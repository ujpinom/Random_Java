package InterfacesRepaso;

public class circulo extends Objetosgeometricos {
	
	private double radio;
	
	public circulo(double radio) {
		
		if(radio<0) {
			throw new IllegalArgumentException("Radio no puede ser negativo");
		}
		
		this.radio=radio;
		
	}
	
	public void establercerRadio(double radio) {
		if(radio<0) {
			throw new IllegalArgumentException("Radio no puede ser negativo");
		}
		
		this.radio=radio;
	}
	
	public double obtenerRadio() {
		return radio;
	}
	
	@Override
	public double ObtenerArea()
	{
		return obtenerRadio()*obtenerRadio()*Math.PI;
		
	}
	@Override
	public double obtenerPerimetro() {
		
		return 2*Math.PI*obtenerRadio();
	}
	
	@Override
	
	public String toString() {
		return String.format("El area de circulo es: %.2f%nEl perimetro del circulo es: %.2f%n",ObtenerArea(),obtenerPerimetro());
	}
}
