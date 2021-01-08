package manejoEventos;
import javafx.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEvent extends Application {
	private Text text= new Text(30,30,"A");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		
		
		Pane pane= new Pane();
		pane.getChildren().add(text);
		
		text.setOnKeyPressed(e->{
			switch(e.getCode()) {
			case UP:{
				text.setY(text.getY()-5);
				break;
			}
			case DOWN:{
				text.setY(text.getY()+5);
				break;
			}
			case LEFT:{
				text.setX(text.getX()-5);
				break;
			}
			case RIGHT:{
				text.setX(text.getX()+5);
				break;
			}
			
			default:
				text.setText(e.getText());
			}
			});
		
		Scene scene= new Scene(pane,200,200);
		arg0.show();
		arg0.setScene(scene);
		text.requestFocus();
		
		
	}

}
