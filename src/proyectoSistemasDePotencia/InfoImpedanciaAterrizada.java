package proyectoSistemasDePotencia;
import javax.swing.JOptionPane;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class InfoImpedanciaAterrizada extends GridPane {
	
	private Text infolinea= new Text();
	private TextField z1t= new TextField();
	private Button btncerrar= new Button("Aceptar");
	private double impedanciaAterrizada;
	
	
	
	public InfoImpedanciaAterrizada(Transformador trafo,String lado) {
		
		this.setPadding(new Insets(10));
		this.setVgap(10);
		this.getRowConstraints().add(new RowConstraints(50) );
		
		infolinea.setText("INGRESE EL VALOR DE LA IMPEDANCIA DE ATERRIZAMIENTO ( "+ trafo.getNombreLinea()+" )"+": ");
		infolinea.setStroke(Color.RED);
		
		this.add(infolinea, 0, 0);
		this.add(z1t, 0, 1);
		this.add(btncerrar, 0, 2);
		
		
		if(lado.equals("P")) {
			
			z1t.setText(""+trafo.getImpedanciaAterrizamientoPrimaria()/3);
		}
		else if(lado.equals("S")) {
			
			z1t.setText(""+trafo.getImpedanciaAterrizamientoSecundaria()/3);
		}
		
		btncerrar.setOnAction(e->{

		     Stage stage = (Stage) this.btncerrar.getScene().getWindow();
		     
		     boolean vz1t= verificarEntrada(z1t.getText());
	
		     if(z1t.getText().contains(",") ||vz1t ) {
		    	 
		    	 JOptionPane.showMessageDialog(null, "Ingrese datos de tipo n�merico utilizando punto como separador decimal");
		     }
		     else {
		     
		     impedanciaAterrizada=(Double.parseDouble(z1t.getText()));
		   
		    }
		     
		     
		     stage.close();
		});
		
	}
	
	public double getImpedanciaAterrizada() {
		
		return impedanciaAterrizada;
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
