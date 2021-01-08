package HandlingEvents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SimpleCalculator extends JFrame {
	
	private JButton sumar= new JButton("Sumar");
	private JButton restar= new JButton("Restar");
	private JButton multiplicar= new JButton("Multiplicar");
	private JButton dividir= new JButton("Dividir");
	
	private JTextField tnum1= new JTextField(3);
	private JTextField tnum2= new JTextField(3);
	private JTextField tresult= new JTextField(5);
	
	public SimpleCalculator() {
		
		
		JPanel p1= new JPanel(new FlowLayout());
		
		p1.add(new JLabel("Numero 1"));
		p1.add(tnum1);
		p1.add(new JLabel("Numero 2"));
		p1.add(tnum2);
		p1.add(new JLabel("Resultado"));
		p1.add(tresult);
		
		add(p1,BorderLayout.NORTH);
		JPanel p2= new JPanel(new FlowLayout());
		
		
		p2.add(sumar);
		p2.add(restar);
		p2.add(multiplicar);
		p2.add(dividir);
		
		add(p2,BorderLayout.SOUTH);
		
		ButtonListener botones= new ButtonListener();
		
		sumar.addActionListener(botones);
		restar.addActionListener(botones);
		multiplicar.addActionListener(botones);
		dividir.addActionListener(botones);
		
	}
	
	
	public static void main(String[] args) {
		SimpleCalculator frame= new SimpleCalculator();
		frame.setSize(500, 100);
		frame.setVisible(true);
		frame.setTitle("TestFigurePanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.pack();
	}
	
	class ButtonListener implements ActionListener{
		
		
		Operaciones opera= new Operaciones();
		
		public void actionPerformed(ActionEvent r) {
			opera.getNumeros();
			if(r.getSource()==sumar) {
				
				double suma=opera.setSuma();
				tresult.setText(String.format("%.1f", suma));
			}
			

			else if(r.getSource()==restar) {
				
				tresult.setText(String.format("%.1f", opera.setResta()));
				
			}

			else if(r.getSource()==multiplicar) {
				
				tresult.setText(String.format("%.1f", opera.setMulti()));
			}

			else if(r.getSource()==dividir) {
				
				tresult.setText(String.format("%.1f", opera.setDivi()));
				
			}
		}
	}
	
	
	class Operaciones{
		
		private double num1;
		private double num2;

		public void getNumeros() {
			num1=Double.parseDouble(tnum1.getText());
			num2=Double.parseDouble(tnum2.getText());
			
		
			
		}
		
		public double setSuma() {
			
			return num1+num2;
			
		}
		
		public double setResta() {
			return num1-num2;
		}
		
		public double setMulti() {
			return num1*num2;
		}
		
		public double setDivi()
		
		{
			
			if(num2==0) {
				System.out.println("El denominador no puede ser cero.Ingrese un nuevo numero");
				num2=Double.parseDouble(tnum2.getText());
			}
			
			return num1/num2;
		}
		
	}

}
