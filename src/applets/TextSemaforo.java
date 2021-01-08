package applets;
import javax.swing.*;
import java.awt.*;
public class TextSemaforo extends JFrame{
	private JPanel p1= new JPanel();
	private Calles calles= new Calles();
	private Semaforo semaforo1= new Semaforo();
	
	
	public TextSemaforo() {
		setLayout(new BorderLayout());
		p1.add(calles);
		p1.add(semaforo1);
		
		
		add(semaforo1,BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		
		TextSemaforo frame= new TextSemaforo();
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setTitle("TestFigurePanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the frame
	}

}
