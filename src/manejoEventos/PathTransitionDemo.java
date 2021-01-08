package manejoEventos;

import javafx.*;
import javafx.collections.ObservableList;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class PathTransitionDemo extends Application{

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage a) throws Exception {
		
		Pane pane= new Pane();
		Rectangle rec= new Rectangle(0, 0, 25, 50);
		Circle cir= new Circle(125, 100, 50);
		cir.setFill(Color.WHITE);
		cir.setStroke(Color.BLACK);
		rec.setFill(Color.ORANGE);
		pane.getChildren().addAll(rec,cir);
		PathTransition ptm= new PathTransition();
		ptm.setDuration(Duration.millis(1000));
		ptm.setPath(cir);
		ptm.setNode(rec);
		ptm.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		ptm.setCycleCount(Timeline.INDEFINITE);
		ptm.setAutoReverse(true);
		ptm.play();
		cir.setOnMousePressed(e->ptm.pause());
		cir.setOnMouseReleased(e->ptm.play());
		
		
		
		
		Scene scene= new Scene(pane,200,200);
		a.show();a.setScene(scene);
		
		
	}

}
