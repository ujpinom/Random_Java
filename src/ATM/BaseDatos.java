package ATM;

public class BaseDatos {
	
	Cuenta cuentas []= new Cuenta[2];
	Cuenta cuentatem=null;
	
	public BaseDatos() {
		
		cuentas[0]=new Cuenta(12345,54321,1000,1200);
		cuentas[1]=new Cuenta(23456,54325,200,200);
		
	}
	
	public boolean AutenticarUsuario(int numerocuenta,int clave) {
		boolean bandera=false;
		for(int i=0;i<cuentas.length;i++) {
			
			if(cuentas[i].ObtenerNumeroCuenta()==numerocuenta && cuentas[i].ObtenerClave()==clave) {
				cuentatem=cuentas[i];
				bandera=true;	
			}
		}
		
		return bandera;
		
	}
	
	public double obtenerSaldoDisponible() {
		return cuentatem.ObtenerSaldoDisponible();
	}
	
	public double obtenerSaldoTotal() {
		return cuentatem.ObtenerSaltoTotal();
	}
	
	
	
	public void Cargar(double monto) {
		
		cuentatem.EstablecerSaldoDisponible(cuentatem.ObtenerSaldoDisponible()-monto);
		cuentatem.EstablecerSaldoTotal(cuentatem.ObtenerSaltoTotal()-monto);
		
	}
	
	public void abonar(double monto) {
		cuentatem.EstablecerSaldoTotal(cuentatem.ObtenerSaltoTotal()+monto);
	}
	
	
	public String consultaSaldo() {
		return String.format("Saldo disponible: %.2f%nSaldo total: %.2f", cuentatem.ObtenerSaldoDisponible(),cuentatem.ObtenerSaltoTotal());
	}

}
