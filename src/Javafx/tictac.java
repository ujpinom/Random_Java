package Javafx;
import javax.swing.ImageIcon;
import javafx.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;
import java.security.*;
public class tictac extends Application {
	
	private SecureRandom random= new SecureRandom();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);

	}

	@Override
	public void start(Stage s) throws Exception {
		
		
		Image imageX= new Image("file:///C:/Users/SONY/eclipse-workspace/HolaJavaAgain/src/Javafx/cross.gif");
		Image imageO= new Image("file:///C:/Users/SONY/eclipse-workspace/HolaJavaAgain/src/Javafx/o.gif");
		GridPane pane= new GridPane();
		pane.setPadding(new Insets(10));
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(5);
		pane.setVgap(5);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				int posibilidad= random.nextInt(2);
				if(posibilidad==1) {
					
					pane.add(new ImageView(imageX), j, i);
				}
				else if(posibilidad==0) {
					pane.add(new ImageView(imageO), j, i);
				}
				
			}
		}
		
		
		
		Scene sS= new Scene(pane);
		
		s.show();
		s.setScene(sS);
		
		
	}

}

