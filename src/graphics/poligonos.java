package graphics;
import javax.swing.*;
import java.awt.*;
public class poligonos extends JFrame{
	
	public poligonos() {
		
		add(new puntos());
		
	}
	
	public static void main(String [] args) {
		
		poligonos frame= new poligonos();
		frame.setSize(110, 110);
		frame.setVisible(true);
		frame.setTitle("TestFigurePanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the frame
	}

}

class puntos extends JPanel{
	
	private int [] x= {40, 70, 60, 45, 20};
	private int [] y= {20, 40, 80, 45, 60};
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawPolygon(x, y, x.length);
	}
	
	
}
