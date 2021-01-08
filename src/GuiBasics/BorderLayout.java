package GuiBasics;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;


@SuppressWarnings("serial")
public class BorderLayout extends JFrame  {
	
	
	public BorderLayout(int i, int j)
	{
		setLayout(new BorderLayout(5,10));
		
		add(new JButton("East"), BorderLayout.EAST);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
