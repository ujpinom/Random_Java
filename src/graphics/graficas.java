package graphics;
import javax.swing.*;
import java.awt.*;
public class graficas extends JFrame {
	
	public graficas() {
		
		panel p= new panel();
		
		add(p);
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		graficas marcos= new graficas();
		
		marcos.setVisible(true);
		marcos.setTitle("Graficas");
		marcos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marcos.setLocationRelativeTo(null);
		marcos.setSize(200,200);
	}

}

class panel extends JPanel{
	
	public void paintComponent(Graphics dibujos){
		
		super.paintComponent(dibujos);
		dibujos.drawLine(50, 0, 50, 150);
		dibujos.drawString("Perro", 100, 100);
		dibujos.drawRect(50, 50, 100, 100);
		
	}
	
}
