package HandlingEvents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DetectSourceDemo extends JFrame {
	private JButton Jnuevo= new JButton("Nuevo");
	private JButton Jborrar= new JButton("Borrar");
	private JButton Jparar= new JButton("Parar");
	private JButton Jseguir= new JButton("Seguir");
	public DetectSourceDemo() {
		JPanel panel= new JPanel();
		
		panel.add(Jnuevo);
		panel.add(Jborrar);
		panel.add(Jparar);
		panel.add(Jseguir);
		
		
		add(panel);
		
		
		ButonRegister botones= new ButonRegister();
		Jnuevo.addActionListener(botones);
		Jborrar.addActionListener(botones);
		Jparar.addActionListener(botones);
		Jseguir.addActionListener(botones);
		
	}
	
	public static void main(String[] args) {
		DetectSourceDemo frame= new DetectSourceDemo();
		frame.setSize(400, 80);
		frame.setVisible(true);
		frame.setTitle("TestFigurePanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.pack();
		
	}
	
	class ButonRegister implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==Jnuevo) {
				System.out.println("Boton 'Nuevo precionado'");
			}
			else if(e.getSource()==Jborrar) {
				System.out.println("Se preciona Borrar");
			}
			else if (e.getSource()==Jparar) {
				System.out.println("Se preciona parar");
			}
			else if(e.getSource()==Jseguir) {
				System.out.println("Se preciona seguir");
			}
			
		}
		
	}
	
	

}
