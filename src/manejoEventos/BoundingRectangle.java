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
public class BoundingRectangle extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage a) throws Exception {

		Pane pane= new Pane();
		Rectangle rec1= new Rectangle(20, 10, 140, 60);
		rec1.setFill(Color.WHITE);
		rec1.setStroke(Color.BLACK);
		Text text = new Text(30, 30, "INSTRUCCIONES\nAdd: Left Click\nRemove: Right Click");
		Rectangle rec2= new Rectangle();
		
		pane.getChildren().addAll(rec1,text,rec2);
		Scene scene= new Scene(pane,300,300);a.show();a.setScene(scene);
		
		scene.setOnMouseClicked(e->{
			
			if(e.getButton()==MouseButton.PRIMARY) {
				Circle cir= new Circle();
				cir.setCenterX(e.getX());
				cir.setCenterY(e.getY());cir.setRadius(10);
				cir.setFill(Color.WHITE);cir.setStroke(Color.BLACK);
				pane.getChildren().add(cir);
				
				
			}
			else if(e.getButton()==MouseButton.SECONDARY) {
				
				ObservableList<Node> lista= pane.getChildren();
				
				for(Node figuras:lista) {
					
					if(figuras instanceof Circle && figuras.contains(e.getX(), e.getY())) {
						
						pane.getChildren().remove(figuras);break;
						
					}
				}
				
			}
			
			ArrayList<Double> xcoordenadas= new ArrayList<>();
			ArrayList<Double> ycoordenadas= new ArrayList<>();
			
			
			for(int i=0;i<pane.getChildren().size();i++) {
				if(pane.getChildren().get(i) instanceof Circle) {
					xcoordenadas.add(((Circle)(pane.getChildren().get(i))).getCenterX());
					ycoordenadas.add(((Circle)(pane.getChildren().get(i))).getCenterY());	
				}
			}
			
			double xmin= Collections.min(xcoordenadas);
			double ymin=Collections.min(ycoordenadas);
			double xmax= Collections.max(xcoordenadas);
			double ymax=Collections.max(ycoordenadas);
		
			rec2.setX(xmin-10);rec2.setY(ymin-10);
			rec2.setWidth(xmax-xmin+2*10);rec2.setHeight(ymax-ymin+2*10);
			
		});
		
	}

}
