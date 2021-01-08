package manejoEventos;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class MouseEvent extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage s) throws Exception {
		
		Pane pane= new Pane();
		Text text= new Text(50,20,"Hola perro");
		pane.getChildren().add(text);
		text.setOnMouseDragged(e->{text.setX(e.getX());text.setY(e.getY());});
		Scene scene= new Scene(pane,200,200);
		s.show();
		s.setScene(scene);
		
	}

}
