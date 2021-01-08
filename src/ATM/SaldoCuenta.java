package ATM;

public class SaldoCuenta extends Transacciones {
	
	public SaldoCuenta(int numeroCuenta,Pantalla pantalla,BaseDatos basedatos) {
		
		super(numeroCuenta,pantalla,basedatos);
	}

	 
	 @Override
	public void Ejecutar() {
		 
		consultasaldo();
		
	}
	 
	 public String ConsultaSaldo() {
		 return consultasaldo();
	 }

}
