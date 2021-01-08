package Javafx;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Intro extends Application{
	
	@Override
	public void start(Stage h) throws Exception {
		Pane pane= new Pane();
		Circle circulo= new Circle();
		Button btn= new Button("hsidfs");
		
		circulo.centerXProperty().bind(pane.widthProperty().divide(2));
		circulo.centerYProperty().bind(pane.heightProperty().divide(2));
		circulo.setRadius(20);
	
		pane.getChildren().add(circulo);
		pane.setRotate(30);
		
		Scene s= new Scene(pane,200,200);
		h.setTitle("Circulo");
		h.show();
		h.setScene(s);
		System.out.println(Font.getFontNames());
		
		
	}

}
