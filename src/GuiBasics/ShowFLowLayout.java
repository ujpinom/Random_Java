package GuiBasics;
import java.awt.FlowLayout;

import javax.swing.*;
public class ShowFLowLayout extends JFrame {
	
	public ShowFLowLayout() {
		
	 setLayout(new FlowLayout(FlowLayout.CENTER));
	 
	 for(int i=1;i<=10;i++) {
		 if(i!=10) {
		 add(new JButton(String.format("%d", i)));
		 
		 }
		 else if(i==10)
			 add(new JButton(String.format("%d", 0))); 
	 }
	 //add(new JLabel("Primer Nombre"));
	 
	 //add(new JTextField(8));
	// add(new JLabel("Apellido"));
	// add(new JTextField(8));
	
	}


public static void main(String[] args) {
	
	ShowFLowLayout panel= new ShowFLowLayout();
	
	ShowFLowLayout panel1= new ShowFLowLayout();
	panel.setSize(200,300);
	panel.setTitle("Hola perro");
	panel.setVisible(true);
	panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	panel.setLocationRelativeTo(null);
	
	
}


}
