package manejoEventos;
import java.util.ArrayList;
import java.util.Collections;
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
public class Triangle extends Application{
	private ArrayList<Circle> circulos= new ArrayList<>();
	Line line;
	Line lineas[] = new Line[3];
	private int radio=10;
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage a) throws Exception {

		Pane pane= new Pane();
		
		Scene scene= new Scene(pane,300,300);
		a.show();a.setScene(scene);
		
		scene.setOnMouseClicked(e->{
			
		
			
			if(e.getButton()==MouseButton.SECONDARY) {
			if(circulos.size()<3) {
				Circle cir= new Circle(e.getX(),e.getY(),radio);
				circulos.add(cir);
				pane.getChildren().add(cir);
				
			}
			
			if(circulos.size()>1 ) {
				
			
				for(int i=0;i<circulos.size();i++) {
					for(int j=i;j<circulos.size();j++) {
						if(j==i){
							continue;
						}
						else {
							
							
							line= new Line(circulos.get(i).getCenterX(),circulos.get(i).getCenterY(),
							circulos.get(j).getCenterX(),circulos.get(j).getCenterY());
							line.setStrokeWidth(2);
							pane.getChildren().add(line);
						}
					}
				}
				
			
			}
			
			
			}
			
		
			
		});
		
		
		
		
		scene.setOnMouseDragged(g->{
			
			if(g.getButton()==MouseButton.PRIMARY) {
			ObservableList<Node>list = pane.getChildren();
			
			for(Node lista:list) {
				
				if(lista instanceof Circle && lista.contains(g.getX(),g.getY())) {
					
						((Circle)lista).setCenterX(g.getX());
						((Circle)lista).setCenterY(g.getY());
						break;
					
				}
			}
			
			for(Node lista:list) {
				
				if(lista instanceof Line) {
					pane.getChildren().remove(lista);
				}
			}
			
			
				
			
			}
			
		});
		
		
	}

}
