package applets;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Calculadora extends JFrame {
	private JPanel p1= new JPanel(new GridLayout(5,4));
	private JButton botones []= new JButton[24];
	private JPanel p2= new JPanel();private int contador1=0;
	private JTextField entrada= new JTextField(43);
	private StringBuffer num= new StringBuffer();
	private StringBuffer num11= new StringBuffer();
	private ArrayList<String> texto= new ArrayList<>();
	private ArrayList<String> numeros= new ArrayList<>();
	private EjecutaarOP op= new EjecutaarOP();
	private boolean sqr= false;
	private int contador;
	private double num1;
	private double num2;
	private int UNO;private int DOS;private int TRES;private int CUATRO;private int CINCO;private int SEIS;private int SIETE;private int OCHO;private int NUEVE;
	private int CERO;private char PUNTO;private char Operador;private int operador;
	
		public Calculadora() {
		// TODO Auto-generated constructor stub
	
		p1.add(botones[0]=new JButton("Abs"));
		p1.add(botones[1]=new JButton("Sqrt"));
		p1.add(botones[2]=new JButton("%"));
		p1.add(botones[3]=new JButton("AC"));
		p1.add(botones[4]=new JButton("7"));
		p1.add(botones[5]=new JButton("8"));
		p1.add(botones[6]=new JButton("9"));
		p1.add(botones[7]=new JButton("/"));
		p1.add(botones[8]=new JButton("4"));
		p1.add(botones[9]=new JButton("5"));
		p1.add(botones[10]=new JButton("6"));
		p1.add(botones[11]=new JButton("x"));
		p1.add(botones[12]=new JButton("1"));
		p1.add(botones[13]=new JButton("2"));
		p1.add(botones[14]=new JButton("3"));
		p1.add(botones[15]=new JButton("-"));
		p1.add(botones[16]=new JButton("0"));
		p1.add(botones[17]=new JButton("."));
		p1.add(botones[18]=new JButton("="));
		p1.add(botones[19]=new JButton("+"));
		entrada.setHorizontalAlignment(JTextField.RIGHT);
		add(p1,BorderLayout.SOUTH);
		p2.add( entrada);
		ButtonListener button= new ButtonListener();
		
		for(int i=0;i<20;i++) {
			botones[i].addActionListener(button);
		}
		
		entrada.addActionListener(button);
		add(p2,BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		
		Calculadora frame= new Calculadora();
		frame.setSize(500,200);
		frame.setVisible(true);
		frame.setTitle("Moving the Ball");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.pack();
	}
	
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent g) {
			
			if(g.getSource()==botones[12]) {
				UNO=1;
				num.append(UNO);
				num11.append(UNO);
				entrada.setText(num.toString());
				contador=0;
				
			}
			
			else if(g.getSource()==botones[13]) {
				DOS=2;
				num.append(DOS);
				num11.append(DOS);
				entrada.setText(num.toString());
				contador=0;
			}
			
			else if(g.getSource()==botones[14]) {
				TRES=3;
				num.append(TRES);
				num11.append(TRES);
				entrada.setText(num.toString());
				contador=0;
			}
			
			else if(g.getSource()==botones[16]) {
				CERO=0;
				num.append(CERO);
				num11.append(CERO);
				entrada.setText(num.toString());
				contador=0;
			}
			
			else if(g.getSource()==botones[8]) {
				CUATRO=4;
				num.append(CUATRO);
				num11.append(CUATRO);
				entrada.setText(num.toString());
				contador=0;
			}
			
			else if(g.getSource()==botones[9]) {
				CINCO=5;
				num.append(CINCO);
				num11.append(CINCO);
				entrada.setText(num.toString());
				contador=0;
			}
			
			else if(g.getSource()==botones[10]) {
				SEIS=6;
				num.append(SEIS);
				num11.append(SEIS);
				entrada.setText(num.toString());
				contador=0;
			}
			
			else if(g.getSource()==botones[4]) {
				SIETE=7;
				num.append(SIETE);
				num11.append(SIETE);
				entrada.setText(num.toString());
				contador=0;
			}
			
			else	if(g.getSource()==botones[5]) {
				OCHO=8;
				num.append(OCHO);
				num11.append(OCHO);
				entrada.setText(num.toString());
				contador=0;
			}
			
			else if(g.getSource()==botones[6]) {
				NUEVE=9;
				num.append(NUEVE);
				num11.append(NUEVE);
				entrada.setText(num.toString());
				contador=0;
			}
			
			else if(g.getSource()==botones[18]) {
				if(!sqr) {
				num2=Double.parseDouble(num11.toString());}
				op.establecerOP();
				//System.out.println(num1);
				num.delete(0, num.capacity());
				num11.delete(0, num11.capacity());
				num.append(num1);
				num11.append(num1);
				contador=0;
				sqr=false;
			}
			
			if(g.getSource()==botones[3]) {
				num.delete(0, num.capacity());
				num11.delete(0, num11.capacity());
				entrada.setText(num.toString());
				contador1=0;
				contador=0;
			}
			
			
			if(contador1<=0) {
				if(g.getSource()==botones[17]) {
					num.append('.');
					num11.append('.');
					entrada.setText(num.toString());
					contador1++;
				}
			}
			
			if(contador<=0) {
				
				if(g.getSource()==botones[19]) {
					Operador='+';
					num.append('+');
					entrada.setText(num.toString());
					num1=Double.parseDouble(num11.toString());
					num11.delete(0, num.capacity());
					contador1=0;
					contador++;
				}
				if(g.getSource()==botones[1]) {
					Operador='s';
					sqr=true;
					num1=Double.parseDouble(num11.toString());
					num11.delete(0, num.capacity());
					contador1=0;
					contador++;
				}
				
				if(g.getSource()==botones[0]) {
					Operador='A';
					sqr=true;
					num1=Double.parseDouble(num11.toString());
					num11.delete(0, num.capacity());
					contador1=0;
					contador++;
				}
				
				if(g.getSource()==botones[11]) {
					Operador='*';
					num.append('*');
					entrada.setText(num.toString());
					num1=Double.parseDouble(num11.toString());
					num11.delete(0, num.capacity());
					contador1=0;
					contador++;
				}
				
				if(g.getSource()==botones[15]) {
					Operador='-';
					num.append('-');
					entrada.setText(num.toString());
					if(num11.length()>0) {
					num1=Double.parseDouble(num11.toString());}
					num11.delete(0, num11.capacity());
					contador1=0;
					contador++;
				}
				
				if(g.getSource()==botones[7]) {
					Operador='/';
					num.append('/');
					entrada.setText(num.toString());
					num1=Double.parseDouble(num11.toString());
					num11.delete(0, num.capacity());
					contador1=0;
					contador++;
				}
				if(g.getSource()==botones[2]) {
					Operador='M';
					num.append('%');
					entrada.setText(num.toString());
					num1=Double.parseDouble(num11.toString());
					num11.delete(0, num.capacity());
					contador1=0;
					contador++;
				}
			}
		}	
}
	class EjecutaarOP{
		
		public void establecerOP() {
			
			if(Operador=='+') {
				
				entrada.setText(String.format("%.1f",num1+num2));
				num1=num1+num2;
			}

			if(Operador=='-') {
				
				entrada.setText(String.format("%.1f",num1-num2));
				num1=num1-num2;
			
			}

			if(Operador=='*') {
				
				entrada.setText(String.format("%.1f",num1*num2));
				num1=num1*num2;
			}

			if(Operador=='/') {
				
				entrada.setText(String.format("%.1f",num1/num2));
			num1=num1/num2;
			
			}
			if(Operador=='s') {
				
				entrada.setText(String.format("%.1f",Math.sqrt(num1)));
				num1=Math.sqrt(num1);
				
			}
			if(Operador=='M') {
				
				entrada.setText(String.format("%.1f",num1%num2));
				num1=num1%num2;
			}
			if(Operador=='A') {
				
				entrada.setText(String.format("%.1f",Math.abs(num1)));
				num1=Math.abs(num1);
				}
		}
}

}


