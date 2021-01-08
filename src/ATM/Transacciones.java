package ATM;

public abstract class Transacciones {
	
	private int numeroCuenta;
	private Pantalla pantalla;
	private BaseDatos basedatos;
	
	public Transacciones(int numeroCuenta,Pantalla pantalla,BaseDatos basedatos) {
		
		this.numeroCuenta=numeroCuenta;
		this.basedatos=basedatos;
		this.pantalla=pantalla;
		
	}
	
	
	public void EstablercerNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta=numeroCuenta;
	}
	
	public int ObtenerNumeroCuenta() {
		return numeroCuenta;
	}
	
	public void cargar(double monto) {
		basedatos.Cargar(monto);
	}
	
	public void abonar(double monto) {
		basedatos.abonar(monto);
	}
	
	public double ObtenerSaldoDisponible() {
		return basedatos.obtenerSaldoDisponible();
	}
	
	public double ObtenerSaldoTotal() {
		return basedatos.obtenerSaldoTotal();
	}
	
	
	public String consultasaldo() {
		return basedatos.consultaSaldo();
				
	}
	
	public abstract void Ejecutar();

}
