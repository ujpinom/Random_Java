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
public class MovableVertices extends Application {
	private Line line1= new Line();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	@Override
	public void start(Stage a) throws Exception {
		 int width= 300;int height=300;
		 int radio=15;
		 double x1=Math.random()*(width-20);
		 double y1=Math.random()*(height-20);
		 double x2=Math.random()*(width-20);
		 double y2=Math.random()*(height-20);
		 double d = distancia(x1,y1,x2,y2);
		 
		 Pane pane= new Pane();
		 Circle cir1= new Circle(x1,y1,radio);cir1.setFill(Color.WHITE);cir1.setStroke(Color.BLACK);
		 Circle cir2= new Circle(x2,y2,radio);cir2.setFill(Color.WHITE);cir2.setStroke(Color.BLACK);
		 Text text1= new Text(x1,y1,"1");Text text2= new Text(x2,y2,"2");Text text3= new Text(x2+40,y2+20,String.format("%.2f", d));
		 Line line=dibujarlinea(x1,y1,x2,y2,radio);pane.getChildren().addAll(cir1,cir2,text1,text2,line,text3);
		 Scene scene= new Scene(pane,width,height);scene.setOnMouseDragged(e->{
			 
			 double dd;double x= e.getX();double y=e.getY();
			 if(cir1.contains(x, y)&&e.getButton()==MouseButton.PRIMARY) {
				
				 cir1.setCenterX(e.getX());cir1.setCenterY(e.getY());
				 text1.setX(e.getX()); text1.setY(e.getY());
				 line1=dibujarlinea(e.getX(),e.getY(),cir2.getCenterX(),cir2.getCenterY(),radio);
				 dd=distancia(cir1.getCenterX(),cir1.getCenterY(),cir2.getCenterX(),cir2.getCenterY());
				 text3.setText(String.format("%.2f", dd));
				 line.setStartX(line1.getStartX()); line.setStartY(line1.getStartY()); line.setEndX(line1.getEndX()); line.setEndY(line1.getEndY());
				 
			 }
			 else if(cir2.contains(x, y)&&e.getButton()==MouseButton.PRIMARY){
				 
				 cir2.setCenterX(e.getX());cir2.setCenterY(e.getY());
				 text2.setX(e.getX()); text2.setY(e.getY());
				 text3.setX(e.getX()+40); text3.setY(e.getY()+20);
				 line1=dibujarlinea(cir1.getCenterX(),cir1.getCenterY(),e.getX(),e.getY(),radio);
				 dd=distancia(cir1.getCenterX(),cir1.getCenterY(),cir2.getCenterX(),cir2.getCenterY());
				 text3.setText(String.format("%.2f", dd));
				 line.setEndX(line1.getEndX()); line.setEndY(line1.getEndY());line.setStartX(line1.getStartX());
				 line.setStartY(line1.getStartY());
			 }
			
		 });
		 a.show();a.setScene(scene);
		 
	}
	
	public Line dibujarlinea(double x1,double y1,double x2,double y2,int radio) {
		
		double d = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
	    int x11 = (int)(x1 - radio * (x1 - x2) / d);
	    int y11 = (int)(y1 - radio * (y1 - y2) / d);
	    int x21 = (int)(x2 + radio * (x1 - x2) / d);
	    int y21 = (int)(y2 + radio * (y1 - y2) / d);
	  
	    
		return new Line(x11,y11,x21,y21);
	}
	
	public double distancia(double x1,double y1,double x2,double y2) {
		return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
	}
	


}
