package proyectoSistemasDePotencia;
import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
public class InfoGeneradores extends GridPane {
	
	private Text infolinea= new Text();
	private GridPane gd= new GridPane();
	private VBox vb= new VBox(5);
	private HBox hb= new HBox();
	private Generadores generador;
	private Label z1l= new Label("Impedancia secuencia positiva [p,u]");
	private Label z2l= new Label("Impedancia secuencia negativa [p,u]");
	private Label z0l= new Label("Impedancia secuencia cero [p,u]");
	private Label tipoconexion= new Label("Tipo de conexión devanados internos");
	private TextField z1t= new TextField();
	private TextField z2t= new TextField();
	private TextField z0t= new TextField();
	private Button btncerrar= new Button("Aceptar");
	private HBox hb1= new HBox();
	private String[] tipoconexiones= {"Y-ATERRIZADO","Y"};
	private ObservableList<String> items= FXCollections.observableArrayList(tipoconexiones);
	private ComboBox<String> cbo = new ComboBox<>();
	private double impedanciaAterrizamiento;
	private Label orientacion= new Label("Orientación");
	private String [] orientaciones= {Generadores.LEFT,Generadores.RIGHT,Generadores.ARRIBA,Generadores.ABAJO};
	private ObservableList<String> hor= FXCollections.observableArrayList(orientaciones);
	private ComboBox<String> cbo1 = new ComboBox<>();
	
	
	public InfoGeneradores(Generadores generador) {
		
		this.generador=generador;
		this.setPadding(new Insets(10));
		this.setVgap(10);
		this.getRowConstraints().add(new RowConstraints(50) );
		hb.getChildren().add(infolinea);
		hb.setAlignment(Pos.CENTER);
		hb1.setAlignment(Pos.CENTER_RIGHT);
		hb1.getChildren().add(btncerrar);
		this.add(hb, 0, 0);
		this.add(hb1, 0, 2);
		cbo.setMaxWidth(250);
		cbo.getItems().addAll(tipoconexiones);
		cbo1.setMaxWidth(250);
		cbo1.getItems().addAll(orientaciones);
		vb.getChildren().addAll(z1l,z1t,z2l,z2t,z0l,z0t,tipoconexion,cbo,orientacion,cbo1);
		this.add(vb,0 , 1);
		infolinea.setText("INFORMACIÓN DEL GENERADOR "+ generador.getNombreGenerador());
		infolinea.setStroke(Color.RED);
		
		z1t.setText(""+generador.getImpedanciaZ1());
		z2t.setText(""+ generador.getImpedanciaZ2());
		z0t.setText(""+ generador.getImpedanciaZ0());
	
		cbo.setOnAction(e->{
			setConexionPrimaria(items.indexOf(cbo.getValue()));
			if(cbo.getValue().equals("Y-ATERRIZADO")) {
				
				InfoImpendanciAterrizadaG infoimpedancia = new InfoImpendanciAterrizadaG(generador);
				Scene dad= new Scene(infoimpedancia);
				Stage sta= new Stage();
				sta.setScene(dad);
				sta.setTitle("INFORMACIÓN IMPEDANCIA ATERRIZAMIENTO");
				sta.setResizable(false);
				sta.initModality(Modality.APPLICATION_MODAL);
				sta.showAndWait();
				impedanciaAterrizamiento=infoimpedancia.getImpedanciaAterrizada();
			}
		});
		
		cbo1.setOnAction(e->{
			
			setOrientacion(hor.indexOf(cbo1.getValue()));
			
		});
		
		
		
		btncerrar.setOnAction(e->{
		     Stage stage = (Stage) this.btncerrar.getScene().getWindow();
		     
		     boolean vz1t= verificarEntrada(z1t.getText());
		     boolean vz2t= verificarEntrada(z2t.getText());
		     boolean vz0t= verificarEntrada(z0t.getText());
		     
		     
		     if(z1t.getText().contains(",") ||z2t.getText().contains(",")||z0t.getText().contains(",")||vz1t||vz2t||vz0t ) {
		    	 
		    	 JOptionPane.showMessageDialog(null, "Ingrese datos de tipo númerico utilizando punto como separador decimal");
		     }
		     else {
		    	 
		    	 generador.setimpedanciaZ0(Double.parseDouble(z0t.getText()));
		    	 generador.setimpedanciaZ1(Double.parseDouble(z1t.getText()));
		    	 generador.setimpedanciaZ2(Double.parseDouble(z2t.getText()));
		    	
		    }
		    
		     stage.close();
		});
		
		
	}
	
	public boolean verificarEntrada(String entrada) {
		
		int contador=0;
		
		for(int i=0;i<entrada.length();i++) {
			
			char c= entrada.charAt(i);

			if(!Character.isDigit(c) && c!='.') {
				return true;
			}
			else if(c=='.') {
				++contador;
				continue;
			}
			
			if (contador>1) {
				return true;
			}
			
			contador=0;
		}
		
		return false;
		
	}
	
	public double getImpedanciaAterrizamiento() {
		return impedanciaAterrizamiento;
	}
	
	public void setConexionPrimaria(int index) {
		generador.setAterrizamiento(tipoconexiones[index]);
		
	}
	
	public void setOrientacion(int index) {
		generador.setOrientacion(orientaciones[index]);
	}
	
	
}
