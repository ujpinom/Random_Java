package Javafx;
import javafx.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class HboxAndVbox extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage s) throws Exception {
		
		BorderPane pane= new BorderPane();
		HBox hbox= new HBox(10);
		VBox vbox= new VBox(5);
		hbox.setStyle("−fx−background−color: gold");
		hbox.setPadding(new Insets(10));
		hbox.getChildren().add(new Button("Hola"));
		hbox.getChildren().add(new Button("Hasta luego"));
		hbox.getChildren().add(new Button("Hasta luego"));
		hbox.getChildren().add(new Button("Hasta luego"));
		
		vbox.setPadding(new Insets(10));
		vbox.getChildren().add(new Button("Hola"));
		vbox.getChildren().add(new Button("Hasta luego"));
		vbox.getChildren().add(new Button("Hasta luego"));
		vbox.getChildren().add(new Button("Hasta luego"));
		
		pane.setTop(hbox);
		pane.setRight(vbox);
		
		Scene scene= new Scene(pane);
		s.setScene(scene);
		s.show();
		
	}

}
