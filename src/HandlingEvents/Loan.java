package HandlingEvents;
import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Loan extends JFrame {
	
	private JTextField InAnual= new JTextField();
	private JTextField Nannios= new JTextField();
	private JTextField Cprestamo= new JTextField();
	private JTextField Pmensual= new JTextField();
	private JTextField Tpago= new JTextField();
	
	private JButton CoPayment= new JButton("Calcular pago");
	
	public Loan() {
		
		JPanel p1= new JPanel(new GridLayout(5,2));
		JPanel p2= new JPanel();
		
		p1.setBorder(new TitledBorder("Calculadora de crédito"));
		p1.add(new JLabel(" Interes anual"));
		p1.add(InAnual);
		p1.add(new JLabel(" Numero años"));
		p1.add(Nannios);
		p1.add(new JLabel(" Prestamo Total"));
		p1.add(Cprestamo);
		p1.add(new JLabel(" Pago Mensual"));
		p1.add(Pmensual);
		p1.add(new JLabel(" Pago Total"));
		p1.add(Tpago);
		
		add(p1,BorderLayout.CENTER);
		
		p2.add(CoPayment);
		
		add(p2,BorderLayout.SOUTH);
		
		Botones Bcalculo= new Botones();
		CoPayment.addActionListener(Bcalculo);
		
		
	}
	
	public static void main(String[] args) {
		Loan frame= new Loan();
		
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setTitle("TestFigurePanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.pack();
	}
	
	class Botones implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			double intanual= Double.parseDouble(InAnual.getText());
			int anios= Integer.parseInt(Nannios.getText());
			double prestamo= Double.parseDouble(Cprestamo.getText());
			
			prestamo loan= new prestamo(intanual,prestamo,anios);
			
			Pmensual.setText(String.format("%.2f", loan.getpagomensual()));
			Tpago.setText(String.format("%.2f", loan.getpagototal()));
			
			
		}
	}
	

	

}
