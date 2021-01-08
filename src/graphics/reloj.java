package graphics;
import javax.swing.*;
import HandlingEvents.MenssagePanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class reloj extends JFrame {
	
	
	
	public reloj() {
		
		
		
		
		StillClock currentTime= new StillClock();
		JPanel p1= new JPanel(new GridLayout(2,1));
		JPanel p2= new JPanel();
		MenssagePanel mensaje= new MenssagePanel(currentTime.getHora()+" :"+currentTime.getMinutos()+" :"+currentTime.getSegundos());
		mensaje.setCentered(true);
		mensaje.setForeground(Color.blue);
		mensaje.setFont(new Font("Courier",Font.BOLD,16));
		p1.add(currentTime);
		p1.add(mensaje);
		
		
		
		add(p1,BorderLayout.CENTER);
		//add(p2,BorderLayout.SOUTH);
		//add(currentTime);
		
		
		//add(mensaje)
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reloj frame= new reloj();
		frame.setSize(300, 350);
		frame.setVisible(true);
		frame.setTitle("TestFigurePanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the frame
	
		

	}
	
	
	
	

}
	class StillClock extends JPanel{
	
	private int hora;
	private int minutos;
	private int segundos;

	
	public StillClock(int hora,int minutos,int segundos) {
		
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
	
	public StillClock() {
		setTiempo();
	}
	
	public void setTiempo() {
		
		Calendar calendar= new GregorianCalendar();
		
		if(calendar.get(Calendar.HOUR_OF_DAY)>12) {
			this.hora=calendar.get(Calendar.HOUR_OF_DAY)%12;
		}
		else
		{
		this.hora=calendar.get(Calendar.HOUR_OF_DAY);}
		
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
		int xhora= (int)(xcenter+hlongitud*Math.sin((hora+minutos/60)*(2*Math.PI/12)));
		int yhora= (int)(ycenter-hlongitud*Math.cos((hora+minutos/60)*(2*Math.PI/12)));
		
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




