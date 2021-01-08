package HandlingEvents;

public class prestamo {
	
	private double interesanual;
	private double cantidadprestamo;
	private int nanios;
	
	public prestamo(double interesanual,double  cantidadprestamo,int nanios ) {
		
		this.cantidadprestamo=cantidadprestamo;
		this.interesanual=interesanual;
		this.nanios=nanios;
		
	}
	
	
	public double getIanual() {
		return interesanual;
		
	}
	
	public double getCprestamos() {
		return cantidadprestamo;
	}
	
	public int getanios() {
		return nanios;
	}
	
	
	public double getpagomensual() {
		
		double intmensual= getIanual()/1200;
		
		double pagomensual=  getCprestamos()*intmensual/(1-(Math.pow(1/(1+intmensual),getanios()*12 )));
		return pagomensual;
	}
	
	public double getpagototal() {
		return getpagomensual()*12*getanios();
	}

}
