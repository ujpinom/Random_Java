package manejoEventos;

import java.security.*;
import javafx.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class BindindREc extends Application {

	private int width=5;
	private int height=25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage a) throws Exception {
		
		int paneWidth=400;
		int paneHeight=400;
	
	double x1=Math.random()*(paneWidth-width);
	double y1= Math.random()*(paneHeight-height);
	double x2=Math.random()*(paneWidth-width);
	double y2= Math.random()*(paneHeight-height);
	
	Pane pane= new Pane();
	Rectangle rec1= new Rectangle(x1,y1,width,height);
	Rectangle rec2= new Rectangle(x2,y2,width,height);

	Line  line= new Line(x1,y1+height/2,x2,y2+height/2);
	line.setStroke(Color.BLACK);
	line.setStrokeWidth(1);
	pane.getChildren().addAll(rec1,rec2);

	pane.getChildren().add(line);
	Scene scene= new Scene(pane);
	
	a.show();
	a.setScene(scene);
	
	
		
		
		
	}

}
