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
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ControlCircle extends Application {

	private Button shrink= new Button("Shrink");
	private Button enlarge= new Button("Enlarge");
	private Circuloo cir= new Circuloo();
	public static void main(String[] args) {
		
		Application.launch(args);

	}

	@Override
	public void start(Stage a) throws Exception {
		
		BorderPane p1= new BorderPane();
		HBox hbox= new HBox();
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().add(enlarge);
		hbox.getChildren().add(shrink);
		p1.setPadding(new Insets(10));
		p1.setBottom(hbox);
		p1.setCenter(cir);
		Scene scene= new Scene(p1,200,200);
		Listener listener = new Listener();
		shrink.setOnAction(listener);
		enlarge.setOnAction(listener);
		cir.setOnMouseClicked(e->{
			if(e.getButton()==MouseButton.PRIMARY) {
				cir.increaseRadio();
			}
			else if(e.getButton()==MouseButton.SECONDARY) {
				cir.decreaseRadio();
			}
			
		});
		scene.setOnKeyPressed(e->{
			if(e.getCode()==KeyCode.UP) {
				cir.increaseRadio();
			}
			else if(e.getCode()==KeyCode.DOWN) {
				cir.decreaseRadio();
			}
		});
		a.show();
		a.setScene(scene);
		a.setResizable(true);
		
	}
	
	class Listener implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent a) {
			
			if(a.getSource()==shrink) {
				cir.decreaseRadio();
				
			}
			
			if(a.getSource()==enlarge) {
				cir.increaseRadio();
				
			}
			
		}
		
	}

}
class Circuloo extends StackPane {
	private Circle circulo= new Circle(50);

	public Circuloo() {
		
		getChildren().add(circulo);
		circulo.setFill(Color.WHITE);
		circulo.setStroke(Color.BLACK);
		
	}
	public void paintCircle() {
		getChildren().clear();
		getChildren().add(circulo);
		circulo.setFill(Color.WHITE);
		circulo.setStroke(Color.BLACK);
		
	}
	
	public void increaseRadio() {
		circulo.setRadius(circulo.getRadius()+2);
		paintCircle();
	}
	public void decreaseRadio() {
		circulo.setRadius(circulo.getRadius()-2);
		paintCircle();
	}
	
}
