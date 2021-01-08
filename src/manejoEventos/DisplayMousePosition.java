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
public class DisplayMousePosition extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage a) throws Exception {
		
		Circle cir= new Circle();Text text= new Text();
		cir.setRadius(50);cir.setCenterX(100);cir.setCenterY(60);cir.setFill(Color.WHITE);cir.setStroke(Color.BLACK);
		Pane p1= new Pane(); p1.getChildren().add(cir);p1.getChildren().add(text);
		Scene scene= new Scene(p1,200,200);
		scene.setOnMouseMoved(e->{
			if(cir.contains(e.getX(),e.getY())) {
				text.setText("El mouse está dentro del circulo");
				text.setX(e.getX());text.setY(e.getY());
			}
			else {
				text.setText("El mouse está afuera del circulo");
				text.setX(e.getX());text.setY(e.getY());
				
			}
			
		});

		a.show();a.setScene(scene);
				
	}

}
