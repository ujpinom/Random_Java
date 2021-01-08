package GuiBasics;
import java.awt.GridLayout;

import javax.swing.*;
public class GridLayoout extends JFrame {
	
	
	public GridLayoout() {
	GridLayout grilla= new GridLayout(2,2);
	setLayout(grilla);
	JLabel frame= new JLabel("Nombre");
	
	add(frame);
	add(new JTextField(8));
	add(new JLabel("Apellido"));
	add(new JTextField(8));
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GridLayoout grilla= new GridLayoout();
		
		
		grilla.setTitle("BAse datos");
		grilla.setSize(200,100);
		grilla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		grilla.setVisible(true);
		grilla.setLocationRelativeTo(null);
		

	}

}
