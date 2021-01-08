package applets;
import javax.swing.*;
import java.awt.*;
public class TextBouncingBall extends JApplet{

	private ControlBall control= new ControlBall ();
	
	public TextBouncingBall() {
		add(control);
	}
}
