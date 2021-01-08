package HandlingEvents;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class AnimacionReloj extends JFrame {
	
	private StillClockk Reloj= new StillClockk();
	private Timer timer= new Timer(1000,new TimerListener());
	
	public AnimacionReloj() {
		
		add(Reloj);
		timer.start();
		
	}
	
	
	public static void main(String [] args) {
		AnimacionReloj frame= new AnimacionReloj();
		
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setTitle("TestFigurePanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the frame
	}
	
	
	
	class TimerListener implements ActionListener{
		
		public void actionPerformed(ActionEvent h) {
			Reloj.setTiempo();
			Reloj.repaint();
		}
		
	}
	
	

}
