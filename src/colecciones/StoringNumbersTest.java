package colecciones;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class StoringNumbersTest extends JFrame {
	
	private JLabel eti1= new JLabel("Ingrese un numero");
	private JTextField campo1= new JTextField(5);
	private JTextArea area= new JTextArea(2,10);
	private JPanel p1= new JPanel(new FlowLayout());
	private JPanel p2= new JPanel(new FlowLayout());
	private JButton btn1= new JButton("Ordenar");
	private JButton btn2= new JButton("Shuffle");
	private JButton btn3= new JButton("Invertir");
	private StringBuilder hola= new StringBuilder();
	private List<Integer> lista= new LinkedList<>();
	
	
	
	public StoringNumbersTest() {
		p1.add(eti1);
		p1.add(campo1);
		add(area,BorderLayout.CENTER);
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.SOUTH);
		
		Listener listener= new Listener();
		campo1.addActionListener(listener);
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);
			
	}
	

	public static void main(String[] args) {
		
		StoringNumbersTest frame= new StoringNumbersTest();
		
		frame.setSize(200,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.pack();

	}
	
	
	class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent g) {
			
			
			
			if(g.getSource()==btn1) {
				sortLista();
				imprimir();
			}
			if(g.getSource()==btn2) {
				shuffleLista();
				imprimir();
			}
			if(g.getSource()==btn3) {
				invertirLista();
				imprimir();
			}
			if(g.getSource()==campo1) {
				int entradas=Integer.parseInt(campo1.getText());
				campo1.repaint();
				
				if(!estaYa(entradas)) {
					
					addLista(entradas);
					
				}
				imprimir();
				System.out.println(lista);
			}
			
		}
		
	}
	
	
	public boolean estaYa(int entrada) {
		
		return lista.contains(entrada);
		
		
	}
	
	public void addLista(int entrada) {
		lista.add(entrada);
	}
	
	public void imprimir() {
		for(int i=0;i<lista.size();i++) {
			hola.append(lista.get(i)+" ");
			}
		area.setText(hola.toString()+" ");
		hola.delete(0, hola.capacity());
	}
	
	
	public void sortLista() {
		Collections.sort(lista);
	}
	
	public void shuffleLista() {
		Collections.shuffle(lista);
	}
	
	public void invertirLista() {
		Collections.reverse(lista);
	}
	
}


