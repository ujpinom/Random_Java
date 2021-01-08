package HandlingEvents;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MovingTheBall extends JFrame {
	private JButton left= new JButton("Left");
	private JButton rigth= new JButton("Right");
	private JButton up= new JButton("Up");
	private JButton down= new JButton("Down");
	
	private int x=50;
	private int y=50;
	private MovingCircle circulo=new MovingCircle();
	
	
	public MovingTheBall() {
		
		
		JPanel panel= new JPanel(new FlowLayout());
		
		
		panel.add(left);
		panel.add(rigth);
		panel.add(up);
		panel.add(down);
		
		
		add(panel,BorderLayout.SOUTH);
		add(circulo,BorderLayout.CENTER);
		
		ButtonListener boton= new ButtonListener();
		left.addActionListener(boton);
		rigth.addActionListener(boton);
		up.addActionListener(boton);
		down.addActionListener(boton);
		
		
	}
	
	
	public static void main(String[] args)
	{
		
		MovingTheBall frame= new MovingTheBall();
		
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setTitle("Moving the Ball");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the frame
		
	}
	
	
	class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent h) {
			
			if(h.getSource()==left) {
				circulo.moveLeft();
			}
			else if(h.getSource()==rigth) {
				circulo.moveRigth();
			}
		else if(h.getSource()==up) {
					circulo.moveUp();
			}
		else if(h.getSource()==down) {
		circulo.moveDown();
	}
			
			
		}
		
	}
	
	class MovingCircle extends JPanel{
		
		private int radio=10;
		private int moveleftright=0;
		
		private int moveupordown=0;
		
		public void paintComponent(Graphics g)
		{
			int xcenter= (getWidth()/2)-moveleftright;
			int ycenter=(getHeight()/2)-moveupordown;
			super.paintComponent(g);
			
		g.drawOval(xcenter-radio, ycenter-radio, 2*radio, 2*radio);
			
		}
		
		public void moveLeft() {
			
			moveleftright+=5;
			repaint();
		}
		
		public void moveRigth() {
			moveleftright-=5;
			repaint();
		}
		
		public void moveUp() {
			moveupordown+=5;
			repaint();
		}
		public void moveDown() {
			moveupordown-=5;
			repaint();
		}
		
	}

}
