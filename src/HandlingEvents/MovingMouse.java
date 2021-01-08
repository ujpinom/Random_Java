package HandlingEvents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
public class MovingMouse extends JFrame {
	private int x=20;
	private int y=20;
	private String mensaje="Hola perro";
	public MovingMouse() {
		
		Mensaje string= new Mensaje(mensaje);
		
		regitrarmouse mouse= new regitrarmouse();
		string.addMouseMotionListener(mouse);
		setLayout(new BorderLayout());
		
		add(string);
	}
	
	public static void main(String[] args) {
		
		MovingMouse frame = new MovingMouse();
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setTitle("TestFigurePanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the frame
		
		
	}
	
	
	class Mensaje extends JPanel{
		
		public Mensaje(String mensaje) {
		
	}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString(mensaje, x, y);
			repaint();
			
		}
	}
	
	class regitrarmouse implements MouseMotionListener{
		
		public void mouseDragged(MouseEvent m) {
			x=m.getX();
			y=m.getY();
			
		}
		
	public void mouseMoved(MouseEvent m) {
		
	}
		
	}
	
}
