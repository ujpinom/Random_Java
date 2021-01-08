package HandlingEvents;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonDemo extends JApplet {
	
	private MenssagePanel mensaje= new MenssagePanel("Hola Java");
	private JPanel panel= new JPanel(new FlowLayout()); private JPanel panel3= new JPanel(new FlowLayout());
	private JRadioButton verde,azul,naraja;
	private JPanel panel2= new JPanel(new GridLayout(3,1));
	private JCheckBox hola= new JCheckBox("Centrar",false);private JCheckBox hola1= new JCheckBox("Muerase",false);
	private JCheckBox hola2= new JCheckBox("Hasta luego",false);
	private JTextField nuevomensaje= new JTextField(10);
	
	private JPanel panel1= new JPanel(new GridLayout(3,1));
	private Border lineBorder = new LineBorder(Color.BLACK, 1);

	private JButton Rbutton= new JButton("==>");
	private JButton Lbutton= new JButton("<==");
	
	public ButtonDemo() {
		
		panel2.add(verde=new JRadioButton("Verde",false));panel2.add(azul=new JRadioButton("Azul",false));panel2.add(naraja=new JRadioButton("Naranja",false));
		ButtonGroup group = new ButtonGroup();
		group.add(azul);group.add(verde);group.add(naraja);
	
		panel1.add(hola);panel1.add(hola1);panel1.add(hola2);
		panel3.add(new JLabel("Ingrese un nuevo mensaje"));
		panel3.add(nuevomensaje);
		nuevomensaje.setHorizontalAlignment(JTextField.RIGHT);
		
		mensaje.setBackground(Color.white);
		Rbutton.setMnemonic('R');
		Lbutton.setMnemonic('L');
		Rbutton.setToolTipText("Mover a la derecha");
		Lbutton.setToolTipText("Mover a la izquierda");
		setLayout(new BorderLayout());
		
		panel.add(Lbutton);
		panel.add(Rbutton);
		panel.setBorder(lineBorder);
		add(mensaje,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		add(panel1,BorderLayout.EAST);add(panel2,BorderLayout.WEST);add(panel3,BorderLayout.NORTH);

		ButtonListener button= new ButtonListener();
		
		Rbutton.addActionListener(button);
		Lbutton.addActionListener(button);
		hola.addActionListener(button);hola1.addActionListener(button);verde.addActionListener(button);azul.addActionListener(button);naraja.addActionListener(button);
		nuevomensaje.addActionListener(button);
		
	}
	

	
class ButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent m) {
		// TODO Auto-generated method stub
		
		if(m.getSource()==Rbutton) {
			mensaje.moveRight();
		}
		
		else if(m.getSource()==Lbutton) {
			mensaje.moveLeft();
		}
		else if(m.getSource()==hola) {
			mensaje.setCentered(hola.isSelected());
			
		}
		else if(m.getSource()==hola) {
			mensaje.setCentered(hola.isSelected());
			if(!hola.isSelected()) {
				mensaje.setYCoordinate(50);
			}
			
		}
		else if(m.getSource()==hola1) {
			mensaje.setMessage("Hola perro");
		}
		
		else if(m.getSource()==verde) {
			mensaje.setForeground(Color.green);
		}
		
		else if(m.getSource()==azul) {
			mensaje.setForeground(Color.blue);
		}
		else if(m.getSource()==naraja) {
			mensaje.setForeground(Color.orange);
		}
		
		else if(m.getSource()==nuevomensaje) {
			
			mensaje.setMessage(nuevomensaje.getText());
			nuevomensaje.requestFocusInWindow();
		}
		
	}
	
	
}

}
