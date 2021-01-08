package ATM;

public class Deposito extends Transacciones {
	

	private double monto;
	private RanuraDeposito ranura;
	private Teclado teclado;
	
	public Deposito(int numeroCuenta,Pantalla pantalla,BaseDatos basedatos,RanuraDeposito ranura,Teclado teclado,double monto) {
		
		super(numeroCuenta,pantalla,basedatos);
		
		if(monto<0) {
			throw new IllegalArgumentException("Monto a depositar debe ser mayor que cero.");
		}
		
		this.monto=monto;
		
		
	}
	
	public double ObtenerMonto() {
		return monto;
	}
	
	public double ObtenerSaldoTotall() {
		return ObtenerSaldoTotal();
	}
	
	@Override
	
	public void Ejecutar() {
		
		abonar( ObtenerMonto());
		
	}
	
	

}
