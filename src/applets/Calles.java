package applets;
import javax.swing.*;
import java.awt.*;
public class Calles extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	
		
		g.drawLine(getWidth()/2-20, 0, getWidth()/2-20, getHeight()/2-20);
		g.drawLine(getWidth()/2+20, 0, getWidth()/2+20, getHeight()/2-20);
		g.drawLine(0,getHeight()/2-20,getWidth()/2-20, getHeight()/2-20);
		g.drawLine(getWidth()/2+20,getHeight()/2-20 , getWidth(), getHeight()/2-20);
		g.drawLine(0,getHeight()/2+20,getWidth()/2-20, getHeight()/2+20);
		g.drawLine(getWidth()/2-20,getHeight()/2+20,getWidth()/2-20, getHeight());
		g.drawLine(getWidth()/2+20,getHeight()/2+20,getWidth()/2+20, getHeight());
		g.drawLine(getWidth()/2+20,getHeight()/2+20,getWidth(), getHeight()/2+20);
		
		g.drawRect(getWidth()/2-50, getHeight()/2+25, 20, 50);
	}

}
