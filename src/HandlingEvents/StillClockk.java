package HandlingEvents;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.*;
public class StillClockk extends JPanel{
	private int hora;
	private int minutos;
	private int segundos;

	
	public StillClockk(int hora,int minutos,int segundos) {
		
		if(hora>12|| hora<0) {
			throw new IllegalArgumentException("Horaa deber ser >0 y <12");
		}
		
		if((minutos>60 || minutos <0) || (segundos<0 || segundos>60 )){
			throw new IllegalArgumentException("La hora ingresada no esta permitida");
			
		}
		
		this.hora=hora;
		this.minutos=minutos;
		this.segundos=segundos;
	}
	
	public StillClockk() {
		setTiempo();
	}
	
	public void setTiempo() {
		
		Calendar calendar= new GregorianCalendar();
		
		
		this.hora=calendar.get(Calendar.HOUR_OF_DAY);
		
		this.minutos=calendar.get(Calendar.MINUTE);
		this.segundos=calendar.get(Calendar.SECOND);
		
		
		
	}
	
	public int getHora() {
		return hora;
	}
	
	public int getMinutos() {
		return minutos;
	}
	
	public int getSegundos() {
		return segundos;
	}
	
	public void sethora(int hora) {
		this.hora=hora;
		repaint();
	}
	
	public void setminutos(int minutos) {
		this.minutos=minutos;
		repaint();
	}
	
	
	public void setsegundos(int segundos) {
		this.minutos=segundos;
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int xcenter= getWidth()/2;
		int ycenter= getHeight()/2;
		int clockradio= (int)(Math.min(getWidth(), getHeight())*0.4);
		int slongitud= (int)(clockradio*0.9);
		int mlongitud= (int)(clockradio*0.8);
		int hlongitud=(int)(clockradio*0.7);
		int xsegundos= (int)(xcenter+slongitud*Math.sin(segundos*(2*Math.PI/60)));
		int ysegundos= (int)(ycenter-slongitud*Math.cos(segundos*(2*Math.PI/60)));
		int xminutos= (int)(xcenter+mlongitud*Math.sin(minutos*(2*Math.PI/60)));
		int yminutos= (int)(ycenter-mlongitud*Math.cos(minutos*(2*Math.PI/60)));
		int xhora= (int)(xcenter+hlongitud*Math.sin((hora%12+minutos/60)*(2*Math.PI/12)));
		int yhora= (int)(ycenter-hlongitud*Math.cos((hora%12+minutos/60)*(2*Math.PI/12)));
		
		g.setColor(Color.black);
		g.drawOval(xcenter-clockradio, ycenter-clockradio, 2*clockradio, 2*clockradio);
		g.setColor(Color.red);
		g.drawString("12", xcenter-5, 12+ycenter-clockradio);
		g.drawString("6", xcenter-3, -3+ycenter+clockradio);
		g.drawString("3", xcenter+clockradio-10, ycenter+3);
		g.drawString("9", xcenter-clockradio+3, ycenter+5);
	
		g.setColor(Color.blue);
		g.drawLine(xcenter, ycenter, xsegundos, ysegundos);
		g.setColor(Color.green);
		g.drawLine(xcenter, ycenter, xminutos, yminutos);
		g.setColor(Color.pink);
		g.drawLine(xcenter, ycenter, xhora, yhora);
		
		
		
	}
	


}
