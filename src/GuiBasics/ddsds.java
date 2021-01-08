package GuiBasics;
import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.*;
public class ddsds extends JFrame {
	
	public ddsds() {
		
		JPanel p1= new JPanel();
		
		
		p1.setLayout(new GridLayout(4,3));
		
		
		for(int i=1;i<=10;i++){
		{
			if(i!=10)
			p1.add(new JButton(""+i));
		}
		if(i==10)
		p1.add(new JButton(""+0));
		}
		p1.add(new JButton("Start"));
		p1.add(new JButton("Inicio"));
		
		JPanel p2 = new JPanel(new BorderLayout());
		
		
		p2.add(new JTextField("El tiempo se muestra acá"),BorderLayout.NORTH);
		p2.add(p1,BorderLayout.CENTER);
		
		
		add(p2, BorderLayout.EAST);
		add(new JButton("Food to be place here"),BorderLayout.CENTER);
		
	}

	public static void main(String[] args) {
	
		ddsds frame= new ddsds();
		
		frame.setSize(400,200);
		frame.setTitle("Caculadora");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

	}

}
