package applets;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Semaforo extends JPanel {
	
	private int radio=5;
	private int delays[]= {1000,5000} ;
	private TimerListener listener= new TimerListener();
	private TimerListener1 listener1= new TimerListener1();
	private Timer timer= new Timer(delays[0],listener);
	private Timer timer1= new Timer(delays[1],listener1);
	
	
	
	private boolean bandera;
	private boolean bandera1=true;
	private boolean bandera2=true;
	private boolean bandera3=true;
	private int contador;
	private int contador1;
	public Semaforo() {
		
		timer.start();
		timer1.start();
		
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	
		
		g.drawLine(getWidth()/2-20, 0, getWidth()/2-20, getHeight()/2-20);
		g.drawLine(getWidth()/2+20, 0, getWidth()/2+20, getHeight()/2-20);
		g.drawLine(0,getHeight()/2-20,getWidth()/2-20, getHeight()/2-20);
		g.drawLine(getWidth()/2+20,getHeight()/2-20 , getWidth(), getHeight()/2-20);
		g.drawLine(0,getHeight()/2+20,getWidth()/2-20, getHeight()/2+20);
		g.drawLine(getWidth()/2-20,getHeight()/2+20,getWidth()/2-20, getHeight());
		g.drawLine(getWidth()/2+20,getHeight()/2+20,getWidth()/2+20, getHeight());
		g.drawLine(getWidth()/2+20,getHeight()/2+20,getWidth(), getHeight()/2+20);
		
		g.drawRect(getWidth()/2-50, getHeight()/2+25, 20, 50);
		
		
		g.drawOval(getWidth()/2-45,getHeight()/2+30 , 2*radio, 2*radio);
		g.drawOval(getWidth()/2-45,getHeight()/2+43 , 2*radio, 2*radio);
		g.drawOval(getWidth()/2-45,getHeight()/2+56 , 2*radio, 2*radio);
		
		if(!bandera1) {
			g.setColor(Color.green);
			g.fillOval(getWidth()/2-45,getHeight()/2+30 , 2*radio, 2*radio);
		}
		if(!bandera2) {
			g.setColor(Color.red);
			g.fillOval(getWidth()/2-45,getHeight()/2+56 , 2*radio, 2*radio);
		}
		if(!bandera3) {
			g.setColor(Color.yellow);
			g.fillOval(getWidth()/2-45,getHeight()/2+43 , 2*radio, 2*radio);
		}
	}
	

	
	class TimerListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			bandera1=true;bandera2=true;bandera3=true;
		
		switch(contador) {
		case 0:
			bandera1=false;repaint();
			contador=2;
			break;
			
		case 1 :
			bandera2=false;repaint();
			contador=0;
			break;
			
		case 2:
			
			contador=1;
			
			break;
			
		}
		
		
			
		}
		
	}
	
	class TimerListener1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
	
			
	if(contador==2) {
		bandera3= false;repaint();
		
		
	}
		
		
		}
	}
	
	
	

}
