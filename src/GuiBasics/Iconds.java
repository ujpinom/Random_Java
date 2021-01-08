package GuiBasics;
import javax.swing.*;
import java.awt.*;

public class Iconds extends JFrame{
	
	private  ImageIcon usIcon = new ImageIcon("C:\\Users\\SONY\\Desktop\\transporte\\hola.jpg");
	
	public Iconds() {
		
		add(new JButton(usIcon));
		
	}
	
	
	public static void main(String[] args) {
		
		Iconds frame= new Iconds();
		frame.setSize(200,200);
		frame.setVisible(true);
		frame.setTitle("TestFigurePanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the fra
		frame.pack();
	}

}
