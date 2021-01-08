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
public class InfoTrafo extends GridPane {
	
	private Text infolinea= new Text();
	private GridPane gd= new GridPane();
	private VBox vb= new VBox(5);
	private HBox hb= new HBox();
	private Transformador trafo;
	private Label z1l= new Label("Impedancia secuencia positiva [p,u]");
	private Label z2l= new Label("Impedancia secuencia negativa [p,u]");
	private Label z0l= new Label("Impedancia secuencia cero [p,u]");
	private TextField z1t= new TextField();
	private TextField z2t= new TextField();
	private TextField z0t= new TextField();
	private Button btncerrar= new Button("Aceptar");
	private HBox hb1= new HBox();
	private Text cprimaria= new Text("Conexi�n lado primaria (-BX indica la barra de conexi�n)");
	private Text csecundaria= new Text("Conexi�n lado secundario (-BX indica la barra de conexi�n)");
	private String[] tipoconexiones;
	private ComboBox<String> cbo = new ComboBox<>();
	private ComboBox<String> cbo1 = new ComboBox<>();
	private double impedanciaAterrizamientoPrimaria;
	private double impedanciaAterrizamientoSecundaria;
	private ObservableList<String> items;
	private JOptionPane jop= new JOptionPane();
	private int indexConexionprimaria;
	
	public InfoTrafo(Transformador trafo) {
		super();
		String [] tipoConexiones= {"YN-"+trafo.getBarra1().getNombreBarra(),"YN-"+trafo.getBarra2().getNombreBarra(),"Y-"+trafo.getBarra1().getNombreBarra(),
				"Y-"+trafo.getBarra2().getNombreBarra(),"DELTA-"+trafo.getBarra1().getNombreBarra(),"DELTA-"+trafo.getBarra2().getNombreBarra()};
		items=FXCollections.observableArrayList(tipoConexiones);
		this.tipoconexiones=tipoConexiones;
		
		this.trafo = trafo;
		this.setPadding(new Insets(10));
		this.setVgap(10);
		this.getRowConstraints().add(new RowConstraints(50) );
		cbo.setMaxWidth(250);
		cbo1.setMaxWidth(250);
		cbo.getItems().addAll(items);	
		cbo1.getItems().addAll(items);
		hb.getChildren().add(infolinea);
		hb.setAlignment(Pos.CENTER);
		hb1.setAlignment(Pos.CENTER_RIGHT);
		hb1.getChildren().add(btncerrar);
		this.add(hb, 0, 0);
		this.add(hb1, 0, 2);
		vb.getChildren().addAll(z1l,z1t,z2l,z2t,z0l,z0t,cprimaria,cbo,csecundaria,cbo1);
		this.add(vb,0 , 1);
		infolinea.setText("INFORMACI�N DEL TRANSFORMADOR "+ trafo.getNombreLinea());
		infolinea.setStroke(Color.RED);
		cbo.setOnAction(e->{
			indexConexionprimaria=items.indexOf(cbo.getValue());
			
			
			setConexionPrimaria(items.indexOf(cbo.getValue()));
			
			if(cbo.getValue().equals("YN-"+trafo.getBarra1().getNombreBarra())||cbo.getValue().equals("YN-"+trafo.getBarra2().getNombreBarra())) {
				
				InfoImpedanciaAterrizada infoimpedancia= new InfoImpedanciaAterrizada(trafo,"P");
				Scene dad= new Scene(infoimpedancia);
				Stage sta= new Stage();
				sta.setScene(dad);
				sta.setTitle("INFORMACI�N IMPEDANCIA ATERRIZAMIENTO");
				sta.setResizable(false);
				sta.initModality(Modality.APPLICATION_MODAL);
				sta.showAndWait();
				impedanciaAterrizamientoPrimaria=infoimpedancia.getImpedanciaAterrizada();
			}
		});
		cbo1.setOnAction(e->{
			
			
			if(items.indexOf(cbo1.getValue())==indexConexionprimaria) {
				JOptionPane.showMessageDialog(null, "No puede seleccionar la misma barra dos veces. Escoja la otra barra");
				
			}
			else {
			setConexionSecundaria(items.indexOf(cbo1.getValue()));
			if(cbo1.getValue().equals("YN-"+trafo.getBarra1().getNombreBarra())||cbo1.getValue().equals("YN-"+trafo.getBarra2().getNombreBarra())) {
				
				
				InfoImpedanciaAterrizada infoimpedancia= new InfoImpedanciaAterrizada(trafo,"S");
				Scene dad= new Scene(infoimpedancia);
				Stage sta= new Stage();
				sta.setScene(dad);
				sta.setTitle("INFORMACI�N IMPEDANCIA ATERRIZAMIENTO");
				sta.setResizable(false);
				sta.initModality(Modality.APPLICATION_MODAL);
				sta.showAndWait();
				impedanciaAterrizamientoSecundaria=infoimpedancia.getImpedanciaAterrizada();
				
			
			}
			
			}
		});
		
		z1t.setText(""+trafo.getimpedanciaLineaZ1());
		z2t.setText(""+ trafo.getimpedanciaLineaZ2());
		z0t.setText(""+ trafo.getimpedanciaLineaZ0());
	
		btncerrar.setOnAction(e->{

		     Stage stage = (Stage) this.btncerrar.getScene().getWindow();
		     
		     boolean vz1t= verificarEntrada(z1t.getText());
		     boolean vz2t= verificarEntrada(z2t.getText());
		     boolean vz0t= verificarEntrada(z0t.getText());
		     
		     
		     if(z1t.getText().contains(",") ||z2t.getText().contains(",")||z0t.getText().contains(",")||vz1t||vz2t||vz0t ) {
		    	 
		    	 JOptionPane.showMessageDialog(null, "Ingrese datos de tipo n�merico utilizando punto como separador decimal");
		     }
		     else {
		     
		     trafo.setimpedanciaLineaZ1(Double.parseDouble(z1t.getText()));
		     trafo.setimpedanciaLineaZ2(Double.parseDouble(z2t.getText()));
		     trafo.setimpedanciaLineaZ0(Double.parseDouble(z0t.getText()));
		    }
		     
		     
		     stage.close();
		});
		
		

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
	
	public double getImpedanciaAterrizamientoPrimaria() {
		return impedanciaAterrizamientoPrimaria;
	}
	
	public double getImpedanciaAterrizamientoSecundaria() {
		return impedanciaAterrizamientoSecundaria;
	}
	
	public void setConexionPrimaria(int index) {
		trafo.setConexionPrimaria(tipoconexiones[index]);
		
	}
	
	public void setConexionSecundaria(int index) {
		trafo.setConexionSecundaria(tipoconexiones[index]);
	}
	

	
	

	

}
