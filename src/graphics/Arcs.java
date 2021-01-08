package graphics;
import javax.swing.*;
import java.awt.*;
public class Arcs extends JFrame {
	
	public Arcs() {
		
		panell pp= new panell();
		
		add(pp);
		
		add(new JLabel("Hola perro"),BorderLayout.SOUTH);
		
		
	}
	
	public static void main(String[] args) {
		
		Arcs frame= new Arcs();
		
		frame.setSize(500, 600);
		frame.setVisible(true);
		frame.setTitle("TestFigurePanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the frame
		
		
	}

}


class panell extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		
		super.paintComponent(g);
		
		int centrox= getWidth()/2;
		int centroy= getHeight()/3;
		
		
		int radio= (int)(Math.min(getHeight(), getWidth())*0.3); 
		
		g.drawArc(centrox-radio, centroy-radio, 2*radio, 2*radio, 0, 30);
		g.fillArc(centrox-radio, centroy-radio, 2*radio, 2*radio, 0, 30);
		g.drawArc(centrox-radio, centroy-radio, 2*radio, 2*radio, 60, 30);
		g.fillArc(centrox-radio, centroy-radio, 2*radio, 2*radio, 60,30);
		g.drawArc(centrox-radio, centroy-radio, 2*radio, 2*radio, 120, 30);
		g.fillArc(centrox-radio, centroy-radio, 2*radio, 2*radio, 120, 30);
		g.drawArc(centrox-radio, centroy-radio, 2*radio, 2*radio, 180, 30);
		g.fillArc(centrox-radio, centroy-radio, 2*radio, 2*radio, 180, 30);
		g.drawArc(centrox-radio, centroy-radio, 2*radio, 2*radio, 240, 30);
		g.fillArc(centrox-radio, centroy-radio, 2*radio, 2*radio, 240, 30);
		g.drawArc(centrox-radio, centroy-radio, 2*radio, 2*radio, 300, 30);
		g.fillArc(centrox-radio, centroy-radio, 2*radio, 2*radio,300, 30);
	}
	
}
