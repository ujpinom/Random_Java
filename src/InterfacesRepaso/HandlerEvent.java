package InterfacesRepaso;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HandlerEvent extends JFrame{
	
	public HandlerEvent() {
	JButton Okbuton= new JButton("OK");
	
	JButton cancel= new JButton("Cancelar");
	
	JPanel panel= new JPanel();
	
	panel.add(Okbuton);
	panel.add(cancel);
	
	add(panel);
	
	OkListener bottonOK= new OkListener();
	
	CancelListener okCancel= new CancelListener();
	
	Okbuton.addActionListener(bottonOK);
	cancel.addActionListener(okCancel);
	
	}
	 
	public static void main(String[] args) {
		HandlerEvent marco=  new HandlerEvent();
		
		marco.setTitle("Botones");
		marco.setSize(200,200);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
		marco.setLocationRelativeTo(null);
		
	}
	
	
	class OkListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("El boton OK fue presionado");
		}
	}
	

class CancelListener implements ActionListener
{
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("El boton  cancelar fue presionado");
	}
}
	
	
}




