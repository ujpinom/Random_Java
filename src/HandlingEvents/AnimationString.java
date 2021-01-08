package HandlingEvents;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class AnimationString extends JFrame {
	private int x=0;
	private int y=20;
	private Timer timer= new Timer(1000,new TimerListener());
	
	public AnimationString() {
		timer.start();
		
		Mensaje m= new Mensaje("Hola perro");
		
		add(m);
	}
	
	public static void main(String[] args) {
		AnimationString frame= new AnimationString();
		
		frame.setSize(280, 100);
		frame.setVisible(true);
		frame.setTitle("TestFigurePanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the frame
		
	}
	
	
	
	class Mensaje extends JPanel{
		private String mensaje;
		
		public Mensaje(String mensaje) {
			this.mensaje=mensaje;
		}
		
		public String getMensaje() {
			return mensaje;
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			if(x>getWidth()) {
				x=-20;
			}
			x+=10;
			
			g.drawString(mensaje, x, y);
		}
		
	}
	
	class TimerListener implements ActionListener{
		
	public void actionPerformed(ActionEvent g) {
		repaint();
	}
	}

}
