package applets;
import javax.swing.*;

import HandlingEvents.ControlCarrera;

import java.awt.*;
public class TextCarrera extends JFrame {
	private JPanel p1= new JPanel();
	private int delay[]= {10,50};
	private ControlCarrera control= new ControlCarrera();
	private Carrera carr= new Carrera(10,10,5,50);
	private Carrera carr1= new Carrera(10,20,5,10);
	private Carrera carr2= new Carrera(10,30,5,10);
	private Carrera carr4= new Carrera(10,100,5,10);
	
	public TextCarrera() {
		

		//System.out.println(carr.getX());
		add(carr4);
	}

	public static void main(String[] args) {
		TextCarrera frame= new TextCarrera();
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setTitle("TestFigurePanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the frame
		

	}

}
