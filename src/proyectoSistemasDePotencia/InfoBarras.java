package proyectoSistemasDePotencia;

import java.lang.ProcessHandle.Info;

import javax.swing.JOptionPane;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InfoBarras extends GridPane {
	
	
	private Text infolinea= new Text();
	private GridPane gd= new GridPane();
	private Label z1l= new Label("");
	private TextField z1t= new TextField();
	private Barras barra;
	private String nombreElemento;
	private Button btncerrar= new Button("Aceptar");
	private double voltajePrefalla;
	private Label orientacion= new Label("ORIENTACIÓN");
	private RadioButton hori= new RadioButton("Horizontal");
	private RadioButton verti= new RadioButton("Vertical");
	private HBox hb= new HBox();
	private ToggleGroup group = new ToggleGroup();
	private Label anguloTensionBarra= new Label();
	private TextField angulo=new TextField();
	
		public InfoBarras(Barras barra) {
			
			this.setAlignment(Pos.CENTER);
			this.barra=barra;
			infolinea.setText("VOLTAJE PRE-FALLA");
			setHalignment(infolinea, HPos.CENTER);
			setHalignment(orientacion, HPos.CENTER);
			setHalignment(btncerrar, HPos.RIGHT);
			infolinea.setStroke(Color.RED);
			hori.setToggleGroup(group);
			verti.setToggleGroup(group);
			z1l.setText("Tensión p,u de la barra "+barra.getNombreBarra()+" :");
			anguloTensionBarra.setText("Ángulo del voltaje en la barra "+barra.getNombreBarra()+" :");
			this.setPadding(new Insets(10));
			this.setVgap(10);
			hb.setAlignment(Pos.CENTER);
			hb.getChildren().addAll(hori,verti);
			this.getRowConstraints().add(new RowConstraints(50) );
			this.add(infolinea, 0, 0);
			this.add(z1l, 0, 1);
			this.add(z1t, 0, 2);
			this.add(anguloTensionBarra, 0, 3);
			this.add(angulo, 0, 4);
			this.add(orientacion, 0, 5);
			this.add(hb, 0, 6);
			this.add(btncerrar, 0, 7);
			
			z1t.setText(""+barra.getVoltajePrefalla());
			angulo.setText(""+ barra.getAnguloVoltajeBarra());
			
			Handler handler= new Handler();
			hori.setOnAction(handler);
			verti.setOnAction(handler);
			
			btncerrar.setOnAction(e->{

			     Stage stage = (Stage) this.btncerrar.getScene().getWindow();
			     
			     boolean vz1t= verificarEntrada(z1t.getText());
			     boolean vangulo=verificarEntrada(angulo.getText());
			     
			     
			     if(z1t.getText().contains(",") ||vz1t||vangulo ) {
			    	 
			    	 JOptionPane.showMessageDialog(null, "Ingrese datos de tipo númerico utilizando punto como separador decimal");
			     }
			     else {
			     
			     voltajePrefalla=(Double.parseDouble(z1t.getText()));
			     barra.setAnguloVoltajeBarra(Double.parseDouble(angulo.getText()));
			   
			    }
			     
			     stage.close();
			});
			
		}
		
		
		public double getvoltajePrefalla() {
			
			return voltajePrefalla;
		}
		
		public boolean verificarEntrada(String entrada) {
			
			int contador=0;
			
			for(int i=0;i<entrada.length();i++) {
				
				char c= entrada.charAt(i);

				if(!Character.isDigit(c)&& c!='.') {
					
					return true;
				}
				
				else if(c=='.') {
					
					++contador;
					continue;
				}
				
				if (contador>1) {
					
					return true;
				}
			}
			
			return false;
			
		}
		
		class Handler implements EventHandler{

			@Override
			public void handle(Event arg0) {
				
				
				if(hori.isSelected()) {
					
					barra.setOrientacion("H");
				}
				
				if(verti.isSelected()) {
					
					barra.setOrientacion("V");
				}
				
			}
			
		}
}


