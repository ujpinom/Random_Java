package proyectoSistemasDePotencia;
import java.awt.GridLayout;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InfoLineas extends GridPane {
	
	private Text infolinea= new Text();
	private GridPane gd= new GridPane();
	private VBox vb= new VBox(5);
	private HBox hb= new HBox();
	private Lineas linea;
	private Label z1l= new Label("Impedancia secuencia positiva [p,u]");
	private Label z2l= new Label("Impedancia secuencia negativa [p,u]");
	private Label z0l= new Label("Impedancia secuencia cero [p,u]");
	private TextField z1t= new TextField();
	private TextField z2t= new TextField();
	private TextField z0t= new TextField();
	private Button btncerrar= new Button("Aceptar");
	private HBox hb1= new HBox();
	private TextField resistencia=new TextField();
	private TextField mvartotales=new TextField();
	private TextField ymediaparalela=new TextField();
	private Label resi=new Label("Resistencia [p,u]");
	private Label mvar=new Label("Mvar totales de carga");
	private Label ymedia=new Label("Y/2 [p,u]");


	
	
	public InfoLineas() {
	
	}
	
	public InfoLineas(Lineas linea) {
		this.linea=linea;
		this.setPadding(new Insets(10));
		this.setVgap(10);
		this.getRowConstraints().add(new RowConstraints(50) );
		hb.getChildren().add(infolinea);
		hb.setAlignment(Pos.CENTER);
		hb1.setAlignment(Pos.CENTER_RIGHT);
		hb1.getChildren().add(btncerrar);
		this.add(hb, 0, 0);
		this.add(hb1, 0, 2);
		vb.getChildren().addAll(z1l,z1t,z2l,z2t,z0l,z0t,resi,resistencia,mvar,mvartotales,ymedia,ymediaparalela);
		this.add(vb,0 , 1);
		infolinea.setText("INFORMACION DE LA L�NEA "+linea.getNombreLinea());
		infolinea.setStroke(Color.RED);
		
		z1t.setText(""+linea.getimpedanciaLineaZ1());
		z2t.setText(""+ linea.getimpedanciaLineaZ2());
		z0t.setText(""+ linea.getimpedanciaLineaZ0());
		resistencia.setText(""+linea.getResitencia());
		mvartotales.setText(""+linea.getmVarDeCargaTotales());
		ymediaparalela.setText(""+linea.getYMediaParalela());
		
		
		
		btncerrar.setOnAction(e->{
			
			  
		     boolean vz1t= verificarEntrada(z1t.getText());
		     boolean vz2t= verificarEntrada(z2t.getText());
		     boolean vz0t= verificarEntrada(z0t.getText());
		     boolean r=verificarEntrada(resistencia.getText());
		     boolean mv=verificarEntrada(mvartotales.getText());
		     boolean y=verificarEntrada(ymediaparalela.getText());

		     Stage stage = (Stage) this.btncerrar.getScene().getWindow();
		     
		     if(z1t.getText().contains(",") ||z2t.getText().contains(",")||z0t.getText().contains(",")||vz1t||vz2t||vz0t||r||mv||y ) {
		    	 
		    	 JOptionPane.showMessageDialog(null, "Ingrese datos de tipo n�merico utilizando punto como separador decimal");
		    	
		     }
		     else {
		     linea.setimpedanciaLineaZ1(Double.parseDouble(z1t.getText()));
		     linea.setimpedanciaLineaZ2(Double.parseDouble(z2t.getText()));
		     linea.setimpedanciaLineaZ0(Double.parseDouble(z0t.getText()));
		     linea.setResitencia(Double.parseDouble(resistencia.getText()));
		     linea.setmVarDeCargaTotales(Double.parseDouble(mvartotales.getText()));
		     linea.setYMediaParalela(Double.parseDouble(ymediaparalela.getText()));
		     stage.close();

		    }
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

}
