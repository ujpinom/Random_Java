package graphics;
import javax.swing.*;
import java.awt.*;
public class FigurePanell  extends JPanel{
	
	
		
		public static final int LINE=1;
		public static final int RECT=2;
		private int type;
		
		public FigurePanell(int type) {
			this.type=type;
		}
		
		
		
		protected void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			
			int largo= getWidth();
			int ancho= getHeight();
			
			
			switch(type) {
			
			
			case 1:
				g.setColor(Color.BLACK);
				g.drawLine(10, 10,largo, ancho);
				g.drawLine(largo, 10, 10, ancho);
				
				break;
			case RECT:
				
				g.setColor(Color.BLACK);
				g.drawRect((int)(0.09*largo), (int)(0.09*ancho), (int)(0.7*largo), (int)(0.7*ancho));
				
				break;
			
			}
			
		}	
		
		public void settype(int type) {
			
			this.type=type;
			repaint();
			
		}
		
		
		public int getType() {
			return type;
		}
		
		public Dimension getPreferredSize() {
			return new Dimension(80, 80);
		}
		
		
		
	}



