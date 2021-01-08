package ATM;

public class Cuenta {
	
	private int numeroCuenta;
	private int clave;
	private double saldodisponible;
	private double saldototal;
	
	public Cuenta(int numeroCuenta,int clave,double saldodisponible,double saldototal) {
		
		this.clave=clave;
		this.numeroCuenta=numeroCuenta;
		this.saldodisponible=saldodisponible;
		this.saldototal=saldototal;
		
	}
	
	public void EstablecerNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta=numeroCuenta;
	}
	
	public void EstablecerClave(int clave) {
		this.clave=clave;
	}
	
	public void EstablecerSaldoDisponible(double saldodisponible) {
		this.saldodisponible=saldodisponible;
	}
	
	public void EstablecerSaldoTotal(double saldototal) {
		this.saldototal=saldototal;
	}
	
	public int ObtenerNumeroCuenta() {
		return numeroCuenta;
	}
	
	public int ObtenerClave() {
		return clave;
	}
	
	public double ObtenerSaltoTotal() {
		return saldototal;
	}
	
	public double ObtenerSaldoDisponible() {
		return saldodisponible;
	}
	

}
