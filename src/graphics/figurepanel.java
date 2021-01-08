package graphics;
import java.awt.*;

import javax.swing.*;

public class figurepanel extends JFrame {

	public figurepanel() {
		
	setLayout(new GridLayout(3,2,5,5));
	
	add(new FigurePanell(1));
	
	add(new FigurePanell(FigurePanell.LINE));
	add(new FigurePanell(FigurePanell.LINE));
	add(new FigurePanell(FigurePanell.LINE));
	add(new FigurePanell(FigurePanell.RECT));
	add(new FigurePanell(FigurePanell.RECT));
	
	}
	
	public static void main(String args[] ){
		
		figurepanel frame= new figurepanel();
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setTitle("TestFigurePanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // Center the frame
		
	}
	
	
}



