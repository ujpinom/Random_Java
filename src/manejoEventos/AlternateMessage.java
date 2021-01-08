package manejoEventos;
import javafx.*;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AlternateMessage extends Application {
	int contador= 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	
	public void start(Stage a) throws Exception {
		
		Pane pane= new Pane();
		Text text1= new Text(50,50,"Hola perro");
		Text text2= new Text(30,50,"Hola gonorrea");
		//pane.getChildren().addAll(text1,text2);
		Scene scene=  new Scene(pane,300,300);
		scene.setOnMouseClicked(e->{
			++contador;
			
			System.out.println(contador);
			if(contador%2==0) {
				pane.getChildren().removeAll(text1,text2);
				pane.getChildren().add(text2);
			}
			else {
				pane.getChildren().removeAll(text1,text2);
				pane.getChildren().add(text1);
				
			}
		});
		a.show();a.setScene(scene);

		
	}

}
