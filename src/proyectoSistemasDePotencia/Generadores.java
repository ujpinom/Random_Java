package proyectoSistemasDePotencia;

public class Generadores {

	private String nombreGenerador;
	private double impedanciaZ0;
	private double impedanciaZ1;
	private double impedanciaZ2;
	private Barras barra;
	private String aterrizamiento="Y-ATERRIZADO";
	private double impedanciaAterrizamiento;
	public static final String conexion1="Y-ATERRIZADO";
	public static final String conexion2="Y";
	public double corrienteFaseA;
	public double corrienteFaseB;
	public double corrienteFaseC;
	public double anguloCorrienteFaseA;
	public double anguloCorrienteFaseB;
	public double anguloCorrienteFaseC;
	static final String LEFT="LEFT";
	static final String RIGHT="RIGHT";
	static final String ARRIBA="ARRIBA";
	static final String ABAJO="ABAJO";
	private String orientacion="LEFT";
	private double XCenter;
	private double YCenter;
	

	public double getXCenter() {
		return XCenter;
	}


	public void setXCenter(double xCenter) {
		XCenter = xCenter;
	}


	public double getYCenter() {
		return YCenter;
	}


	public void setYCenter(double yCenter) {
		YCenter = yCenter;
	}


	public String getOrientacion() {
		return orientacion;
	}


	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}


	public Generadores() {
		
	}
	
	
	public Generadores(String nombreGenerador, double impedanciaZ0,double impedanciaZ1,double impedanciaZ2, Barras barra) {
		super();
		this.nombreGenerador = nombreGenerador;
		this.impedanciaZ0 = impedanciaZ0;
		this.impedanciaZ1=impedanciaZ1;
		this.impedanciaZ2=impedanciaZ2;
		this.barra = barra;
	}


	public String getNombreGenerador() {
		return nombreGenerador;
	}
	
	public void setAterrizamiento(String aterrizamiento) {
		this.aterrizamiento=aterrizamiento;
	}
	
	public String getAterrizamiento() {
		return aterrizamiento;
	}


	public void setNombreGenerador(String nombreGenerador) {
		this.nombreGenerador = nombreGenerador;
	}

	public void setimpedanciaZ0(double impedanciaZ0) {
		this.impedanciaZ0 = impedanciaZ0;
	}
	
	public void setimpedanciaZ1(double impedanciaZ1) {
		this.impedanciaZ1 = impedanciaZ1;
	}
	
	public void setimpedanciaZ2(double impedanciaZ2) {
		this.impedanciaZ2 = impedanciaZ2;
	}
	
	public double getImpedanciaAterrizamiento() {
		return impedanciaAterrizamiento;
	}
	
	public void setImpedanciaAterrizamiento(double impedancia) {
		this.impedanciaAterrizamiento=3*impedancia;
	}
	
	
	public double getImpedanciaZ0() {
		return impedanciaZ0;
	}
	
	public double getImpedanciaZ1() {
		return impedanciaZ1;
	}
	
	public double getImpedanciaZ2() {
		return impedanciaZ2;
	}


	public Barras getBarra() {
		return barra;
	}


	public void setBarra(Barras barra) {
		this.barra = barra;
	}



	public double getCorrienteFaseA() {
		return corrienteFaseA;
	}



	public void setCorrienteFaseA(double corrienteFaseA) {
		this.corrienteFaseA = corrienteFaseA;
	}



	public double getCorrienteFaseB() {
		return corrienteFaseB;
	}



	public void setCorrienteFaseB(double corrienteFaseB) {
		this.corrienteFaseB = corrienteFaseB;
	}



	public double getCorrienteFaseC() {
		return corrienteFaseC;
	}



	public void setCorrienteFaseC(double corrienteFaseC) {
		this.corrienteFaseC = corrienteFaseC;
	}
	
	public double getAnguloCorrienteFaseA() {
		return anguloCorrienteFaseA;
	}



	public void setAnguloCorrienteFaseA(double anguloCorrienteFaseA) {
		this.anguloCorrienteFaseA = anguloCorrienteFaseA;
	}



	public double getAnguloCorrienteFaseB() {
		return anguloCorrienteFaseB;
	}



	public void setAnguloCorrienteFaseB(double anguloCorrienteFaseB) {
		this.anguloCorrienteFaseB = anguloCorrienteFaseB;
	}



	public double getAnguloCorrienteFaseC() {
		return anguloCorrienteFaseC;
	}



	public void setAnguloCorrienteFaseC(double anguloCorrienteFaseC) {
		this.anguloCorrienteFaseC = anguloCorrienteFaseC;
	}
	
}
