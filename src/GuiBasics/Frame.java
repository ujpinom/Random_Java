package GuiBasics;
import javax.swing.*;
import java.awt.*;


public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame panel= new JFrame();
		JButton boton= new JButton("OK");
		
		JLabel etiquete= new JLabel("Gnorrea");
		
		panel.add(etiquete);
		
		panel.add(boton);
		panel.remove(boton);
		panel.setTitle("perro");
		
		panel.setSize(400, 500);
		panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLocationRelativeTo(null);
		
		panel.setVisible(true);

	}

}
