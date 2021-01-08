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
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class AnonymousHandlerDemo extends Application {

	private Button up= new Button("Up");
	private Button down= new Button("Down");
	private Button right= new Button("Right");
	private Button left= new Button("Left");
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage a) throws Exception {
		
		Text text= new Text(100,150,"La programación es divertidad");
		Pane pane1= new Pane(text);
		HBox hbox= new HBox();
		hbox.setSpacing(10);
		hbox.getChildren().addAll(up,down,right,left);
		hbox.setAlignment(Pos.CENTER);
		BorderPane pane= new BorderPane();
		pane.setCenter(pane1);
		pane.setBottom(hbox);
		pane.setPadding(new Insets(10));
		Scene scene= new Scene(pane);
		up.setOnAction(e->{text.setY(text.getY()>10?text.getY()-10:10);});
		down.setOnAction(e->{text.setY(text.getY()<pane1.getHeight()-10?text.getY()+10:text.getY());});
		left.setOnAction(e->{text.setX(text.getX()>0?text.getX()-10:0);});
		right.setOnAction(e->{text.setX(text.getX()<pane1.getWidth()-80?text.getX()+10:pane1.getWidth()-80);});
		a.show();
		a.setScene(scene);
	}
}
