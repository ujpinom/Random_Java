package HandlingEvents;
import javax.swing.*;
import java.awt.*;
import applets.Carrera;

public class ControlCarrera extends JPanel {
	private int x=10;
	private int y=10;
	private int radio=5;
	private int delay[]= {10,50};
	private Carrera car;
	
	public ControlCarrera() {
		car= new Carrera(x,y,radio,delay[0]);
		add(car,BorderLayout.CENTER);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		x=10;
		y=getHeight()/4-10;
		
		
	}
	
	
	
}
