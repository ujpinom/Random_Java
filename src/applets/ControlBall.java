package applets;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ControlBall extends JPanel{
	
	private JPanel p1= new JPanel();
	private JPanel p2= new JPanel(new FlowLayout());
	private Ball ball= new Ball();
	private JButton parar= new JButton("Parar");
	private JButton reanudar= new JButton("Reanudar");
	private JLabel label= new JLabel("Ingrese el Delay");
	private JTextField entrada= new JTextField(5);
	
	
	
	public ControlBall() {
		ball.setBorder(new javax.swing.border.LineBorder(Color.red));
		setLayout(new BorderLayout());
		p1.add(parar);
		p1.add(reanudar);
		p2.add(label);
		p2.add(entrada);
		add(p2,BorderLayout.NORTH);
		add(ball,BorderLayout.CENTER);
		add(p1,BorderLayout.SOUTH);
		
		ButtonListener button= new ButtonListener();
		
		parar.addActionListener(button);
		reanudar.addActionListener(button);
		entrada.addActionListener(button);
	}
	
	
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent a) {
			int entradas=Integer.parseInt(entrada.getText());
			if(a.getSource()==parar) {
				ball.setStop();
			}
			else if(a.getSource()==reanudar) {
				ball.setResume();
			}
			else if(a.getSource()==entrada) {
				
				ball.setDelay(entradas);
			}
			
			
		}
		
	}

}
