package ATM;

public class Retiro extends Transacciones {

	private double monto;
	private Teclado teclado= new Teclado();
	
	public Retiro(int numeroCuenta,Pantalla pantalla,BaseDatos basedatos,double monto) {
		
		super(numeroCuenta,pantalla,basedatos);
	
		if(monto<0) {
			throw new IllegalArgumentException("Monto debe ser mayor que cero.");
		}
		
		
		this.monto=monto;
		
	}//Fin del constructor
	
	public double ObtenerMonto() {
		return monto;
	}
	
	public double SaldoDisponible() {
		return ObtenerSaldoDisponible() ;
	}
	
	public double SaldoTotal() {
		
		
		return ObtenerSaldoTotal();
	}
	
	@Override
	public void Ejecutar() {
		cargar(ObtenerMonto());
		
	}
	
}
