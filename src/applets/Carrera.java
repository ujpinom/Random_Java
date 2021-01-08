package applets;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Carrera extends JPanel{
	private int x;
	private int xx;
	private int y;
	private int radio;
	private int delay;
	private Listener listener= new Listener();
	private Timer timer;
	
	public Carrera(int x,int y,int radio,int delay) {
		
		this.x=x;
		this.xx=x;
		this.y=y;
		this.radio=radio;
		this.delay=delay;
		timer= new Timer(delay,listener);
		timer.start();
		
	}
	
	public void setDelay(int delay) {
		this.delay=delay;
		
	}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if(x+radio>getWidth()) {
			x=setX();
		}
		else
			x++;
		g.fillOval(x-radio, y-radio, 2*radio, 2*radio);
		//g.drawLine(0, getHeight()/4, getWidth(), getHeight()/4);
		//g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
		//g.drawLine(0, getHeight()/2+40, getWidth(), getHeight()/2+40);
		
	}
	public int setX() {
		return xx;
	}
	
	class Listener implements ActionListener{

		
		public void actionPerformed(ActionEvent arg0) {
			//getX();
			repaint();
			
		}
		
	}

}
