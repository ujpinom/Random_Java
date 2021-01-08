package HandlingEvents;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.security.*;
import java.util.Scanner;

import HandlingEvents.AnimationString.TimerListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HittingBallons extends JApplet {
	private Scanner entrada=new Scanner(System.in);
	private SecureRandom random= new SecureRandom();
	private int xx=0;
	private int xcenter;
	private int ycenter;
	private int xcanion;
	private int ycanion;
	private int pendiente=0;
	private int longitud=40;
	private int Radio=10;
	private int yy=0;
	private int xxcanion=0;
	private int yycanion=0;
	private int xxxcanion=0;
	private int yyycanion=0;
	private boolean bola= false;
	private int xxcenter;
	private int yycenter;
	private boolean esfer=true;
	private int contador=0;
	private int distancia;
	private int xrandom;
	private int yrandom;
	private JTextField texto= new JTextField(3);
	
	private Timer timer= new Timer(40,new TimerListener());
	
	public HittingBallons() {
		Border lineBorder = new LineBorder(Color.BLACK, 2);
		JPanel panel= new JPanel();
		
		JPanel panel2= new JPanel(new FlowLayout());
		
		Canion canion= new Canion();
		Esfera esfera= new Esfera();
		
		Movement move= new Movement();
		
		timer.start();
		panel.add(esfera);
		panel2.add(new JLabel("Globos estallados"));
		panel2.add(texto);
		add(panel,BorderLayout.CENTER);
		add(panel2,BorderLayout.SOUTH);
		canion.addKeyListener(move);
		add(canion);
		canion.setFocusable(true);
		panel2.setBorder(lineBorder);
		panel.setBorder(lineBorder);
	}
	
	
	public static void main(String[] args) {
		
		HittingBallons applet = new HittingBallons();
		JFrame frame= new JFrame("Hola");
		frame.add(applet);
		

		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setTitle("TestFigurePanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the frame
	}
	
	
	class Canion extends JPanel{
		
		
		private int radio=5;
		
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
	
			xcenter=getWidth()/2;
			ycenter=getHeight();
			
			xcanion= (int)(xcenter-longitud*Math.sin(xx*Math.PI/180));
			ycanion= (int)(ycenter-longitud*Math.cos(xx*Math.PI/180));
			
			
			g.drawLine(xcenter, ycenter, xcanion, ycanion);
			
			
			
			if(bola) {
				
				xxcenter=getWidth()/2;
				yycenter=getHeight();
				
				xxcanion= (int)((xxcenter-xxxcanion)-longitud*Math.sin(xx*Math.PI/180));
				yycanion= (int)((yycenter-yyycanion)-longitud*Math.cos(xx*Math.PI/180));
				//System.out.println(yycanion);
				
				g.fillOval(xxcanion-radio, yycanion-radio, 2*radio, 2*radio);
				
			}
			if(esfer) {
				xrandom=30+random.nextInt(getWidth()-30);
				yrandom= 10+random.nextInt(getHeight()-60);
				
				while(yrandom>(getHeight()-longitud)){
					yrandom= 10+random.nextInt(getHeight()-60);
					
				}
				
				
				
				if(yycanion<0  || xxcanion<0  || xxcanion>getWidth() ) {
					
					System.out.println("hola");
				}
				else
					esfer=false;
				
				}
			g.setColor(Color.red);
			g.fillOval(xrandom-Radio, yrandom-Radio,2*Radio, 2*Radio);
			
			distancia= (int)(Math.sqrt((xrandom-xxcanion)*(xrandom-xxcanion)+(yrandom-yycanion)*(yrandom-yycanion)));
			
			if(distancia<=Radio) {
				
				g.setColor(Color.RED);
				g.fillOval((xrandom+5)-4, yrandom,2*4, 2*4);
				g.fillOval((xrandom+15)-4, yrandom+12,2*4, 2*4);
				g.fillOval((xrandom+20)-4, yrandom-12,2*4, 2*4);
				g.fillOval((xrandom+30)-4, yrandom+34,2*4, 2*4);
				g.fillOval((xrandom+10)-4, yrandom-34,2*4, 2*4);
				contador++;
				texto.setText(String.format("%d", contador));
				
			}
			
		}
	}
	
class Esfera extends JPanel{
		
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
	}
}
	
class TimerListener implements ActionListener{
		
		public void actionPerformed(ActionEvent g) {
			
		if(bola) {
	
			if(xx==0 && yycanion>=0) {
				yyycanion+=4;
				repaint();
	}
			if(xx>0 && yycanion>=0) {
		
				xxxcanion+=(int)(5*Math.sin(xx*Math.PI/180));
				yyycanion+=(int)(5*Math.cos(xx*Math.PI/180));
				repaint();
	}
			if(xx<0 && yycanion>=0) {
		
				xxxcanion+=(int)(5*Math.sin(xx*Math.PI/180));
				yyycanion+=(int)(5*Math.cos(xx*Math.PI/180));
				repaint();
	}
	
	
	
	if(yycanion<0 || xxcanion<0 || xxcanion>getWidth() ||distancia<=Radio ) {
		
		timer.stop();
		yyycanion=0;
		xxxcanion=0;
		
		
		
		xxcanion= (int)((xxcenter-xxxcanion)-longitud*Math.sin(xx*Math.PI/180));
		yycanion= (int)((yycenter-yyycanion)-longitud*Math.cos(xx*Math.PI/180));
		
		repaint();
		
				
;		esfer=true;
	
			}

		}
	}
}
	
	class Movement implements KeyListener{

		@Override
		public void keyPressed(KeyEvent p) {
			
			bola=false;
			switch(p.getKeyCode()) {
			
			case KeyEvent.VK_UP:
				timer.start();
				bola=true;
				repaint();
				break;
			case KeyEvent.VK_LEFT:
				xx+=5;
				yy+=5;
				repaint();
				break;
			case KeyEvent.VK_RIGHT:
				xx-=5;
				yy-=5;
				repaint();
				break;
				
			}
				
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
				
		}
		
	}
	
}
