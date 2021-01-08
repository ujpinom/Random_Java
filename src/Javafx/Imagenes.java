package Javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class Imagenes extends Application {

	@Override
	public void start(Stage s) throws Exception {
		FlowPane pane= new FlowPane(5,5);
		pane.setPadding(new Insets(11, 12, 13, 14));
		
		pane.getChildren().addAll(new Label("Firts Name"),new TextField(),new Label("ID"));
		TextField id= new TextField();
		id.setPrefColumnCount(2);
		pane.getChildren().addAll(id,new Label("Last Name"),new TextField());
		Scene scene= new Scene(pane,250,200);
		
		s.show();
		s.setScene(scene);
		
		
		Stage s1= new Stage();
		GridPane p1= new GridPane();
		p1.setPadding(new Insets(7));
		p1.setHgap(5);
		p1.setVgap(5);
		p1.add(new Label("First Name"),0,0);
		p1.add(new TextField(), 1, 0);
		p1.add(new Label("ID"),0,1);
		p1.add(new TextField(), 1, 1);
		p1.add(new Label("Last Name"),0,2);
		p1.add(new TextField(), 1, 2);
		p1.setAlignment(Pos.CENTER);
		Button btAdd = new Button("Add Name");
		p1.add(btAdd, 1, 3);
		GridPane.setHalignment(btAdd,HPos.RIGHT);
		Scene scene1= new Scene(p1);
		s1.show();
		s1.setScene(scene1);
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
