package proyectoSistemasDePotencia;

import javafx.geometry.Point2D;

public class Barras {
	
	private    double ancho=10;
	private   double largo=70;
	static final double vprefalla=1.0;
	private double vposfallaA=1;
	private double vposfallaB=1;
	private double vposfallaC=1;
	private double anguloFaseA=0;
	private double anguloFaseB=-120;
	private double anguloFaseC=120;
	private double xbarra;
	private double ybarra;
	private String nombreBarra;
	private double contribuccionFalla;  //Para calculo de fallas trifasicas
	private double contribuccionFallaFaseA; //Para calculo de fallas desbalanceadas
	private double contribuccionFallaFaseB;	//Para calculo de fallas desbalanceadas
	private double contribuccionFallaFaseC;	//Para calculo de fallas desbalanceadas
	private double anguloContribucionFaseA;	//Para calculo de fallas desbalanceadas
	private double anguloContribucionFaseB;	//Para calculo de fallas desbalanceadas
	private double anguloContribucionFaseC;	//Para calculo de fallas desbalanceadas
	private double magcorrientePuntoFallaFaseA;
	private double magcorrientePuntoFallaFaseB;
	private double magcorrientePuntoFallaFaseC;
	private double angCorrientePuntoFallaFaseA;
	private double angCorrientePuntoFallaFaseB;
	private double angCorrientePuntoFallaFaseC;
	private boolean establecido;
	private double anguloVoltajeSecuencia0;
	private double anguloVoltajeSecuencia1;
	private double anguloVoltajeSecuencia2;
	private String tipoConexionBarra;
	private Point2D puntoMedioBarra;
	private String orientacion="V";
	private double anguloVoltajeBarra;
	private Point2D coordenadasCarga;
	private double coordenadaVerticalDeLaCarga;
	private double impedanciaFalla;
	private double xCoorG;
	private double yCoorG;
	private double voltajePrefalla=1;
	private String orientacionPrimaria="V";
	private Point2D coordenadasBanco;
	
	public Point2D getCoordenadasBanco() {
		return coordenadasBanco;
	}

	public void setCoordenadasBanco(Point2D coordenadasBanco) {
		this.coordenadasBanco = coordenadasBanco;
	}

	public String getOrientacionPrimaria() {
		return orientacionPrimaria;
	}

	public void setOrientacionPrimaria(String orientacionPrimaria) {
		this.orientacionPrimaria = orientacionPrimaria;
	}

	public Barras() {
		
	}
	
	public  void setAncho(double ancho) {
		this.ancho = ancho;
	}


	public  void setLargo(double largo) {
		this.largo = largo;
	}
	
	
	public  double getAncho() {
		return ancho;
	}


	public  double getLargo() {
		return largo;
	}


	public double getCoordenadaVerticalDeLaCarga() {
		return coordenadaVerticalDeLaCarga;
	}


	public void setCoordenadaVerticalDeLaCarga(double coordenadaVerticalDeLaCarga) {
		this.coordenadaVerticalDeLaCarga = coordenadaVerticalDeLaCarga;
	}


	public Point2D getCoordenadasCarga() {
		return coordenadasCarga;
	}


	public void setCoordenadasCarga(Point2D coordenadasCarga) {
		this.coordenadasCarga = coordenadasCarga;
	}


	public double getAnguloVoltajeBarra() {
		return anguloVoltajeBarra;
	}


	public void setAnguloVoltajeBarra(double anguloVoltajeBarra) {
		this.anguloVoltajeBarra = anguloVoltajeBarra;
	}


	public String getOrientacion() {
		return orientacion;
	}


	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}


	public Point2D getPuntoMedioBarra() {
		return puntoMedioBarra;
	}


	public void setPuntoMedioBarra(Point2D puntoMedioBarra) {
		this.puntoMedioBarra = puntoMedioBarra;
	}


	public String getTipoConexionBarra() {
		return tipoConexionBarra;
	}


	public void setTipoConexionBarra(String tipoConexionBarra) {
		this.tipoConexionBarra = tipoConexionBarra;
	}


	public boolean isEstablecido() {
		return establecido;
	}


	public void setEstablecido(boolean establecido) {
		this.establecido = establecido;
	}


	public double getAnguloVoltajeSecuencia0() {
		return anguloVoltajeSecuencia0;
	}


	public void setAnguloVoltajeSecuencia0(double anguloVoltajeSecuencia0) {
		this.anguloVoltajeSecuencia0 = anguloVoltajeSecuencia0;
	}


	public double getAnguloVoltajeSecuencia1() {
		return anguloVoltajeSecuencia1;
	}


	public void setAnguloVoltajeSecuencia1(double anguloVoltajeSecuencia1) {
		this.anguloVoltajeSecuencia1 = anguloVoltajeSecuencia1;
	}


	public double getAnguloVoltajeSecuencia2() {
		return anguloVoltajeSecuencia2;
	}


	public void setAnguloVoltajeSecuencia2(double anguloVoltajeSecuencia2) {
		this.anguloVoltajeSecuencia2 = anguloVoltajeSecuencia2;
	}


	public double getMagcorrientePuntoFallaFaseA() {
		return magcorrientePuntoFallaFaseA;
	}


	public void setMagcorrientePuntoFallaFaseA(double magcorrientePuntoFallaFaseA) {
		this.magcorrientePuntoFallaFaseA = magcorrientePuntoFallaFaseA;
	}


	public double getMagcorrientePuntoFallaFaseB() {
		return magcorrientePuntoFallaFaseB;
	}


	public void setMagcorrientePuntoFallaFaseB(double magcorrientePuntoFallaFaseB) {
		this.magcorrientePuntoFallaFaseB = magcorrientePuntoFallaFaseB;
	}


	public double getMagcorrientePuntoFallaFaseC() {
		return magcorrientePuntoFallaFaseC;
	}


	public void setMagcorrientePuntoFallaFaseC(double magcorrientePuntoFallaFaseC) {
		this.magcorrientePuntoFallaFaseC = magcorrientePuntoFallaFaseC;
	}


	public double getAngCorrientePuntoFallaFaseA() {
		return angCorrientePuntoFallaFaseA;
	}


	public void setAngCorrientePuntoFallaFaseA(double angCorrientePuntoFallaFaseA) {
		this.angCorrientePuntoFallaFaseA = angCorrientePuntoFallaFaseA;
	}


	public double getAngCorrientePuntoFallaFaseB() {
		return angCorrientePuntoFallaFaseB;
	}


	public void setAngCorrientePuntoFallaFaseB(double angCorrientePuntoFallaFaseB) {
		this.angCorrientePuntoFallaFaseB = angCorrientePuntoFallaFaseB;
	}


	public double getAngCorrientePuntoFallaFaseC() {
		return angCorrientePuntoFallaFaseC;
	}


	public void setAngCorrientePuntoFallaFaseC(double angCorrientePuntoFallaFaseC) {
		this.angCorrientePuntoFallaFaseC = angCorrientePuntoFallaFaseC;
	}

	
	
	public double getContribuccionFallaFaseA() {
		return contribuccionFallaFaseA;
	}


	public double getAnguloContribucionFaseA() {
		return anguloContribucionFaseA;
	}


	public void setAnguloContribucionFaseA(double anguloContribucionFaseA) {
		this.anguloContribucionFaseA = anguloContribucionFaseA;
	}


	public double getAnguloContribucionFaseB() {
		return anguloContribucionFaseB;
	}


	public void setAnguloContribucionFaseB(double anguloContribucionFaseB) {
		this.anguloContribucionFaseB = anguloContribucionFaseB;
	}


	public double getAnguloContribucionFaseC() {
		return anguloContribucionFaseC;
	}


	public void setAnguloContribucionFaseC(double anguloContribucionFaseC) {
		this.anguloContribucionFaseC = anguloContribucionFaseC;
	}


	public void setContribuccionFallaFaseA(double contribuccionFallaFaseA) {
		this.contribuccionFallaFaseA = contribuccionFallaFaseA;
	}


	public double getContribuccionFallaFaseB() {
		return contribuccionFallaFaseB;
	}


	public void setContribuccionFallaFaseB(double contribuccionFallaFaseB) {
		this.contribuccionFallaFaseB = contribuccionFallaFaseB;
	}


	public double getContribuccionFallaFaseC() {
		return contribuccionFallaFaseC;
	}


	public void setContribuccionFallaFaseC(double contribuccionFallaFaseC) {
		this.contribuccionFallaFaseC = contribuccionFallaFaseC;
	}


	public double getVoltajePrefalla() {
		return voltajePrefalla;
	}


	public void setVoltajePrefalla(double voltajePrefalla) {
		this.voltajePrefalla = voltajePrefalla;
	}


	public double getxCoorG() {
		return xCoorG;
	}


	public void setxCoorG(double xCoorG) {
		this.xCoorG = xCoorG;
	}


	public double getyCoorG() {
		return yCoorG;
	}


	public void setyCoorG(double yCoorG) {
		this.yCoorG = yCoorG;
	}


	public Barras(double xbarra,double ybarra,String nombreBarra) {
		this.xbarra=xbarra;
		this.ybarra=ybarra;
		this.nombreBarra=nombreBarra;
	}
	
	
	public Barras(String nombreBarra) {
		this.nombreBarra=nombreBarra;
	}
	
	public double getXbarra() {
		return xbarra;
	}
	
	public void setXbarra(double xbarra) {
		this.xbarra = xbarra;
	}
	
	public double getYbarra() {
		return ybarra;
	}
	
	public void setYbarra(double ybarra) {
		this.ybarra = ybarra;
	}
	
	public String getNombreBarra() {
		return nombreBarra;
	}
	
	public void setNombreBarra(String nombreBarra) {
		this.nombreBarra=nombreBarra;
	}
	
	public void setVoltajePosFallaFaseA(double voltaje) {
		this.vposfallaA=voltaje;
	}
	
	public double getVoltajePosFallaFaseA() {
		return vposfallaA;
	}
	
	public void setVoltajePosFallaFaseB(double voltaje) {
		this.vposfallaB=voltaje;
	}
	
	public double getVoltajePosFallaFaseB() {
		return vposfallaB;
	}
	
	public void setVoltajePosFallaFaseC(double voltaje) {
		this.vposfallaC=voltaje;
	}
	
	public double getVoltajePosFallaFaseC() {
		return vposfallaC;
	}
	
	public void setAnguloVoltajeFaseA(double angulo) {
		this.anguloFaseA=angulo;
		
	}
	
	public double getAnguloVoltajeFaseA() {
		return anguloFaseA;
	}
	
	public void setAnguloVoltajeFaseB(double angulo) {
		this.anguloFaseB=angulo;
		
	}
	
	public double getAnguloVoltajeFaseB() {
		return anguloFaseB;
	}
	
	public void setAnguloVoltajeFaseC(double angulo) {
		this.anguloFaseC=angulo;
		
	}
	
	public double getAnguloVoltajeFaseC() {
		return anguloFaseC;
	}
	
	
	
	public void setContribuccionFalla(double contribuccionFalla) {
		this.contribuccionFalla=contribuccionFalla;
		
	}
	
	public double getContribuccionFalla() {
		return contribuccionFalla;
	}
	
	public void setImpedanciaFalla(double impedanciaFalla) {
		this.impedanciaFalla=impedanciaFalla;
	}
	
	public double getImpedanciaFalla() {
		return impedanciaFalla;
	}
	
}
