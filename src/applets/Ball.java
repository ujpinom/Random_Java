package applets;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ball extends JPanel {
	
	private int radio=10;
	private int x=100 ;
	private int y=100;
	private int dx=2;
	private int dy=2;
	
	private int delay=50;
	
	private TimerListener t=new TimerListener();
	
	Timer timer= new Timer(delay,t);
	
	public Ball() {
		timer.start();
	}
	
	public void setDelay(int delay) {
		this.delay=delay;
		timer.setDelay(delay);
	}
	
	public void setStop() {
		timer.stop();
	}
	
	public void setResume() {
		timer.restart();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if((y-radio)<0) {
			dy=Math.abs(dy);
		}
		if((y+radio)>getHeight()) {
			dy=-Math.abs(dy);
		}
		if((x-radio)<0) {
			dx=Math.abs(dx);
			
		}
		if((x+radio)>getWidth()) {
			dx=-Math.abs(dx);
		}
	

		x+= dx;
		y+=dy;
		g.setColor(Color.red);
		g.fillOval(x-radio, y-radio, 2*radio, 2*radio);
		
	}
	
class TimerListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			repaint();
		}
		
	}
}
