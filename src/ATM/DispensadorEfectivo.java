package ATM;

public class DispensadorEfectivo {
	
	private int  billetes=500;
	private  boolean bandera=true;
	
	
	public DispensadorEfectivo() {
		
	}
	
	public boolean EstablecerMontooo(int monto) {
		
		int nbilletes= monto/20;
		
		if(nbilletes>billetes) {
			bandera=false;
		}
		else
		billetes=billetes-nbilletes;
		
		return bandera;
	}
	
	public int billetesdisponibles() {
		return billetes;
	}
	

	
	

	
	

}
