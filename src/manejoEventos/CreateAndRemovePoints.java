package manejoEventos;
import java.util.ArrayList;
import java.util.List;
import javafx.*;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class CreateAndRemovePoints extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage a) throws Exception {
		
		ArrayList<Circle> lista= new ArrayList<>();
		Pane pane= new Pane();
		Scene scene= new Scene(pane,200,200);
		
		scene.setOnMouseClicked(e->{
			if(e.getButton()==MouseButton.PRIMARY) {
				
				
				Circle cir= new Circle(e.getX(),e.getY(),10);
				cir.setFill(Color.WHITE);cir.setStroke(Color.BLACK);
				pane.getChildren().add(cir);
				lista.add(cir);
			}
			else if(e.getButton()==MouseButton.SECONDARY) {
				ObservableList<Node> li= pane.getChildren();
				double x= e.getX();
				double y= e.getY();
				for(int i=0;i<lista.size()&&lista.size()>0;i++) {
					
					if(lista.get(i).contains(x,y)) {
						pane.getChildren().remove(lista.get(i));
					lista.remove(lista.get(i));
				
					}
					
				}
				
			}
			
		});

		a.setScene(scene);a.show();
	}

}
