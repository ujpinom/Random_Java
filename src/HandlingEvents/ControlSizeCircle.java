package HandlingEvents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlSizeCircle extends JFrame {
	private circulo cir= new circulo();
	private JButton enlarge= new JButton("Enlarge");
	private JButton shrink= new JButton("Shrink");
	
	public ControlSizeCircle() {
		
		JPanel panel= new JPanel();
		panel.add(enlarge);
		panel.add(shrink);
	
		
		RegistrarBotones blarger= new RegistrarBotones();
		enlarge.addActionListener(blarger);
		shrink.addActionListener(blarger);
		
	
		add(cir,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
	}
	

	public static void main(String[] args) {
		ControlSizeCircle frame= new ControlSizeCircle();
		
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setTitle("TestFigurePanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the frame
		
		
	}
	
 class RegistrarBotones implements ActionListener{
	 
	 public void actionPerformed(ActionEvent e) {
		 
		 
		 if(e.getSource()==enlarge) {
			 cir.enlarge();
			 
		 }
		 else if(e.getSource()==shrink) {
			 cir.shrink();
		 }
	 }
 }
	


	
	class circulo extends JPanel{
		
		
		private int radio=5;
		
		public void enlarge() {
			radio++;
			repaint();
		}
		
		public void shrink() {
			radio--;
			repaint();
		}
		
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			int xcenter= getWidth()/2;
			int ycenter= getHeight()/2;
			
			g.drawOval(xcenter-radio, ycenter-radio, 2*radio, 2*radio);
			
		}
	}
}








