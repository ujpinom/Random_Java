package Javafx;

import javax.swing.ImageIcon;
import javafx.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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

public class Random0Or1 extends Application {

	private SecureRandom random= new SecureRandom();
	
	public static void main(String[] args) {
		Application.launch(args);


	}

	@Override
	public void start(Stage s) throws Exception {
		GridPane pane= new GridPane();
		BorderPane p1= new BorderPane();
		pane.setPadding(new Insets(10));
		p1.setPadding(new Insets(10));
		
		Button ok= new Button("OK");
		
		
		pane.getChildren().add(ok);
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				TextField text= new TextField();
				text.setPrefColumnCount(1);
				
				int estado= random.nextInt(2);
				text.setText(String.format("%d", estado));
				pane.add(text, j, i);
				
				
			}
		}
		
		
		
		p1.setTop(pane);
		p1.setBottom(ok);
		p1.setAlignment(ok, Pos.BOTTOM_CENTER);
		
		Scene scene= new Scene(p1);
		s.show();
		s.setScene(scene);
		s.setTitle("Tablero numeros aleatorios");
		s.setResizable(false);
		
		
	}

}
