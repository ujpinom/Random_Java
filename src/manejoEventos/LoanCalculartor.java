package manejoEventos;
import HandlingEvents.prestamo;
import java.security.*;
import javafx.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class LoanCalculartor extends Application {
	Label interest= new Label("Interes Anual");
	TextField campo1= new TextField();
	Label years= new Label("Años");
	TextField campo2= new TextField();
	Label prestamo= new Label("Cantidad prestada");
	TextField campo3= new TextField();
	Label pago= new Label("Pago mensual");
	TextField campo4= new TextField();
	Label pagototal= new Label("Pago total");
	TextField campo5= new TextField();
	Button calcular= new Button("Calcular");
	
	public static void main(String[] args) {
		
		Application.launch(args);

	}

	@Override
	public void start(Stage a) throws Exception {
		
		GridPane pane= new GridPane();
		pane.setHgap(5);
		pane.setVgap(10);
		pane.setPadding(new Insets(10));
		pane.add(interest, 0, 0);
		pane.add(campo1, 1, 0);pane.add(years, 0, 1);pane.add(campo2, 1, 1);
		pane.add(prestamo, 0, 2);pane.add(campo3, 1, 2);pane.add(pago, 0, 3);
		pane.add(campo4, 1,3);pane.add(pagototal, 0, 4);pane.add(campo5, 1, 4);
		pane.add(calcular, 1, 5);
		pane.setHalignment(calcular, HPos.RIGHT);
		calcular.setOnAction(e->calculoprestamo());
		Scene scene= new Scene(pane);
		a.show();
		a.setScene(scene);
	
	}
	
	public void calculoprestamo() {
		
		double InteresAnual= Double.parseDouble(campo1.getText());
		int nAnios= Integer.parseInt(campo2.getText());
		double prestamo= Double.parseDouble(campo3.getText());
		prestamo pres= new prestamo(InteresAnual,prestamo,nAnios);
		campo4.setText("$"+String.format("%.2f", pres.getpagomensual()));
		campo5.setText("$"+String.format("%.2f", pres.getpagototal()));
		
	}

}
