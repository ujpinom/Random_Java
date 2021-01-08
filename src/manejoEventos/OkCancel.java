package manejoEventos;


import javax.swing.ImageIcon;
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
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class OkCancel extends Application{

	private Button ok= new Button("OK");
	private Button cancel= new Button("Cancel");
	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage a) throws Exception {
		// TODO Auto-generated method stub
		
		FlowPane pane= new FlowPane();
		pane.setHgap(10);
		
		pane.getChildren().addAll(ok,cancel);
		pane.setAlignment(Pos.CENTER);
		Listener listener= new Listener();
		ok.setOnAction(listener);
		cancel.setOnAction(listener);
		
		
		Scene scene= new Scene(pane,100,100);
		a.show();
		a.setScene(scene);
	
	}
	
	class Listener implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent a) {
			
			if(a.getSource()==ok) {
				System.out.println("Boton OK presionado");
				
			}
			
			if(a.getSource()==cancel) {
				System.out.println("Boton Cancelar presionado");
			}
		
		}
		
	}

}
