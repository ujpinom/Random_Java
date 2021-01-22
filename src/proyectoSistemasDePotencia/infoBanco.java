package proyectoSistemasDePotencia;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
import javafx.stage.Stage;

public class infoBanco extends GridPane {

	private Text infolinea= new Text();
	private GridPane gd= new GridPane();
	private VBox vb= new VBox(5);
	private HBox hb= new HBox();
	private Label z1l= new Label("Potencia Activa [MW]");
	private Label z2l= new Label("Potencia Reactiva [MVars]");
	private TextField z1t= new TextField();
	private TextField z2t= new TextField();
	private Button btncerrar= new Button("Aceptar");
	private HBox hb1= new HBox();
	private Label orientacion= new Label("Orientaci�n");
	private String [] orientaciones= {Carga.LEFT,Carga.RIGHT,Carga.ARRIBA,Carga.ABAJO};
	private ObservableList<String> hor= FXCollections.observableArrayList(orientaciones);
	private ComboBox<String> cbo1 = new ComboBox<>();
	private Bancos banco;
	
	public infoBanco(Bancos banco) {
		this.banco=banco;
		
		this.setPadding(new Insets(10));
		this.setVgap(10);
		this.getRowConstraints().add(new RowConstraints(50) );
		hb.getChildren().add(infolinea);
		hb.setAlignment(Pos.CENTER);
		hb1.setAlignment(Pos.CENTER_RIGHT);
		hb1.getChildren().add(btncerrar);
		this.add(hb, 0, 0);
		this.add(hb1, 0, 2);
		cbo1.setMaxWidth(250);
		cbo1.getItems().addAll(orientaciones);
		vb.getChildren().addAll(z2l,z2t,orientacion,cbo1);
		this.add(vb,0 , 1);
		infolinea.setText("INFORMACI�N DEL BANCO "+ banco.getNombreCarga());
		infolinea.setStroke(Color.RED);
		
		z2t.setText(""+ banco.getPotenciaReactiva());
	
		
		cbo1.setOnAction(e->{
			
			setOrientacion(hor.indexOf(cbo1.getValue()));
			
		});
		
		
		
		btncerrar.setOnAction(e->{
		     Stage stage = (Stage) this.btncerrar.getScene().getWindow();
		     
		     boolean vz2t= verificarEntrada(z2t.getText());
		     
		     
		     if(vz2t) {
		    	 
		    	 JOptionPane.showMessageDialog(null, "Ingrese datos de tipo n�merico utilizando punto como separador decimal");
		     }
		     else {
		    	 
		    	 banco.setPotenciaReactiva(Double.parseDouble(z2t.getText()));
		    	
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
	


	
	public void setOrientacion(int index) {
		banco.setOrientacion(orientaciones[index]);
	}
	
}
