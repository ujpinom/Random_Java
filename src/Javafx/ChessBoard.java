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
public class ChessBoard extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage s1) throws Exception {
		
		GridPane pane= new GridPane();
		pane.setPadding(new Insets(10));
		
		
		for(int i=0;i<8;i++) {
			
			for(int j=0;j<8;j++) {
				
				if(i%2==0) {
					
					if(j%2==0) {
						
						Rectangle rec= new Rectangle(20,20,20,20);
						rec.setStroke(Color.BLACK);
						rec.setFill(Color.WHITE);
						pane.add(rec, j, i);
						

					}
					else {
						Rectangle rec= new Rectangle(20,20,20,20);
						rec.setStroke(Color.BLACK);
						rec.setFill(Color.BLACK);
						pane.add(rec, j, i);
						
					}
					
					
				}
				else {
					
					if(j%2==0) {
						Rectangle rec= new Rectangle(20,20,20,20);
						rec.setStroke(Color.BLACK);
						rec.setFill(Color.BLACK);
						pane.add(rec, j, i);
					}
					else {
						Rectangle rec= new Rectangle(20,20,20,20);
						rec.setStroke(Color.BLACK);
						rec.setFill(Color.WHITE);
						pane.add(rec, j, i);
					}
				}
				
			}
		}
		
		Scene scene= new Scene(pane);
		
		s1.show();
		s1.setScene(scene);
		
		
		
	}

}
