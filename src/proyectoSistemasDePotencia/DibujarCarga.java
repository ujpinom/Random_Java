package proyectoSistemasDePotencia;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class DibujarCarga {

	static Line lineacarga;
	
	
	
	static List<Line> dibujarCargaBanco(Object objecto,String tipo){

		
			if(tipo.equals("C")) {
				Carga banco=((Carga)objecto);
				return dibujarCarga(banco);
			}
			
			else {
				Bancos banco=((Bancos)objecto);
				return dibujarBanco(banco);
			}
		
		
		
		
	}
	
	
	static List<Line> dibujarBanco(Bancos banco){
		
		List<Line> lineas= new ArrayList<>();
		
		if(banco.getOrientacion().equals(Bancos.LEFT)) {
			double x1=banco.getBarra().getCoordenadasBanco().getX();
			double y1=banco.getBarra().getCoordenadasBanco().getY();
			double x2=banco.getBarra().getCoordenadasBanco().getX()-50;
			double y2=banco.getBarra().getCoordenadasBanco().getY();

			
			lineacarga=new Line(x1,y1,
					x2,y2);
			
			double xMedio=(x1+x2)/2;
			double yMedio=(y1+y2)/2;
			banco.setPuntoMedio(new Point2D(xMedio,yMedio));
			
			Line line=new Line(lineacarga.getEndX(),lineacarga.getEndY()+10,lineacarga.getEndX(),lineacarga.getEndY()-10);
			line.setStrokeWidth(4);
			lineacarga.setStrokeWidth(4);
			lineas.add(line);lineas.add(lineacarga);
		
		}
		
		
		
		
		return lineas;
		
	}
	
	static List<Line> dibujarCarga(Carga banco){
		
		List<Line> lineas=new ArrayList<Line>();
		
		if(banco.getOrientacion().equals(Carga.RIGHT)) {
			double x1=banco.getBarra().getCoordenadasCarga().getX();
			double y1=banco.getBarra().getCoordenadasCarga().getY();
			double x2=banco.getBarra().getCoordenadasCarga().getX()+50;
			double y2=banco.getBarra().getCoordenadasCarga().getY();
			
			lineacarga=new Line(x1,y1,
					x2,y2);
			
			double xMedio=(x1+x2)/2;
			double yMedio=(y1+y2)/2;
			banco.setPuntoMedio(new Point2D(xMedio,yMedio));
			
			double pendiente=((((double) y1) - (double) y2))
				      / (((double) x1) - (((double) x2)));
			
			  double arctan = Math.atan(pendiente);

			    double set45 = 1.57 / 2;
			    
			    if (x1 < x2) {
			      set45 = -1.57 * 1.5;
			    }

			    int arrlen = 15;

			    Line line1=new Line(x2, y2, (x2 + (Math.cos(arctan + set45) * arrlen)),
			      ((y2)) + (Math.sin(arctan + set45) * arrlen));

			    Line line2=(new Line(x2, y2, (x2 + (Math.cos(arctan - set45) * arrlen)),
			      ((y2)) + (Math.sin(arctan - set45) * arrlen)));
			
			lineacarga.setStrokeWidth(4);
			
			lineas.add(lineacarga);lineas.add(line1);lineas.add(line2);
			
		}
		
		
		else if(banco.getOrientacion().equals(Carga.ABAJO)) {
			double x1=banco.getBarra().getCoordenadasCarga().getX();
			double y1=banco.getBarra().getCoordenadasCarga().getY();
			double x2=banco.getBarra().getCoordenadasCarga().getX();
			double y2=banco.getBarra().getCoordenadasCarga().getY()+50;
			
			lineacarga=new Line(x1,y1,
					x2,y2);
			
			double xMedio=(x1+x2)/2;
			double yMedio=(y1+y2)/2;
			banco.setPuntoMedio(new Point2D(xMedio,yMedio));
			
			double pendiente=((((double) y1) - (double) y2))
				      / (((double) x1) - (((double) x2)));
			
			  double arctan = Math.atan(pendiente);

			    double set45 = 1.57 / 2;
			    
			    if (x1 < x2) {
			      set45 = -1.57 * 1.5;
			    }

			    int arrlen = 15;

			    Line line1=new Line(x2, y2, (x2 + (Math.cos(arctan + set45) * arrlen)),
			      ((y2)) + (Math.sin(arctan + set45) * arrlen));

			    Line line2=(new Line(x2, y2, (x2 + (Math.cos(arctan - set45) * arrlen)),
			      ((y2)) + (Math.sin(arctan - set45) * arrlen)));
			
			lineacarga.setStrokeWidth(4);
			
			lineas.add(lineacarga);lineas.add(line1);lineas.add(line2);
			
			
		}
		
		else if(banco.getOrientacion().equals(Carga.ARRIBA)) {
			double x1=banco.getBarra().getCoordenadasCarga().getX();
			double y1=banco.getBarra().getCoordenadasCarga().getY();
			double x2=banco.getBarra().getCoordenadasCarga().getX();
			double y2=banco.getBarra().getCoordenadasCarga().getY()-50;
			
			lineacarga=new Line(x1,y1,
					x2,y2);
			
			double xMedio=(x1+x2)/2;
			double yMedio=(y1+y2)/2;
			banco.setPuntoMedio(new Point2D(xMedio,yMedio));
			
			double pendiente=((((double) y1) - (double) y2))
				      / (((double) x1) - (((double) x2)));
			
			  double arctan = Math.atan(pendiente);

			    double set45 = 1.57 / 2;
			    
			    if (x1 < x2) {
			      set45 = -1.57 * 1.5;
			    }

			    int arrlen = 15;

			    Line line1=new Line(x2, y2, (x2 + (Math.cos(arctan + set45) * arrlen)),
			      ((y2)) + (Math.sin(arctan + set45) * arrlen));

			    Line line2=(new Line(x2, y2, (x2 + (Math.cos(arctan - set45) * arrlen)),
			      ((y2)) + (Math.sin(arctan - set45) * arrlen)));
			
			lineacarga.setStrokeWidth(4);
			
			lineas.add(lineacarga);lineas.add(line1);lineas.add(line2);
			
			
			
		}
		
		else if(banco.getOrientacion().equals(Carga.LEFT)) {
			double x1=banco.getBarra().getCoordenadasCarga().getX();
			double y1=banco.getBarra().getCoordenadasCarga().getY();
			double x2=banco.getBarra().getCoordenadasCarga().getX()-50;
			double y2=banco.getBarra().getCoordenadasCarga().getY();
			
			lineacarga=new Line(x1,y1,
					x2,y2);
			
			double xMedio=(x1+x2)/2;
			double yMedio=(y1+y2)/2;
			banco.setPuntoMedio(new Point2D(xMedio,yMedio));
			
			double pendiente=((((double) y1) - (double) y2))
				      / (((double) x1) - (((double) x2)));
			
			  double arctan = Math.atan(pendiente);

			    double set45 = 1.57 / 2;
			    
			    if (x1 < x2) {
			      set45 = -1.57 * 1.5;
			    }

			    int arrlen = 15;

			    Line line1=new Line(x2, y2, (x2 + (Math.cos(arctan + set45) * arrlen)),
					      ((y2)) + (Math.sin(arctan + set45) * arrlen));

				Line line2=(new Line(x2, y2, (x2 + (Math.cos(arctan - set45) * arrlen)),
					      ((y2)) + (Math.sin(arctan - set45) * arrlen)));
			
			lineacarga.setStrokeWidth(4);
		
			
			lineas.add(lineacarga);lineas.add(line1);lineas.add(line2);
			
		}
		
		return lineas;
		
	}
	
	static Text nombreCargaBanco(Object objecto,String tipo) {
		
		if(tipo.equals("C"))
		{
			
			Carga banco=((Carga)objecto);
			
			
			Text nombreC = null;
			if(banco.getOrientacion().equals(Carga.RIGHT)) {
			nombreC= new Text(banco.getNombreCarga());
			nombreC.setFill(Color.BLACK);
			nombreC.setX(lineacarga.getEndX()+5);
			nombreC.setY(lineacarga.getEndY());
			
		
			}
			else if(banco.getOrientacion().equals(Carga.LEFT)) {
				nombreC= new Text(banco.getNombreCarga());
				nombreC.setFill(Color.BLACK);
				nombreC.setX(lineacarga.getEndX()-15);
				nombreC.setY(lineacarga.getEndY());
				
			}
			
			else if(banco.getOrientacion().equals(Carga.ABAJO)) {
				nombreC= new Text(banco.getNombreCarga());
				nombreC.setFill(Color.BLACK);
				nombreC.setX(lineacarga.getEndX());
				nombreC.setY(lineacarga.getEndY()+15);
			}
			
			else if(banco.getOrientacion().equals(Carga.ARRIBA)) {
				nombreC= new Text(banco.getNombreCarga());
				nombreC.setFill(Color.BLACK);
				nombreC.setX(lineacarga.getEndX()-2);
				nombreC.setY(lineacarga.getEndY()-8);
			}
			
			return nombreC;
			
			
		}
		else {
			
			Bancos banco=((Bancos)objecto);
			
			Text nombreC = null;
			if(banco.getOrientacion().equals(Carga.RIGHT)) {
			nombreC= new Text(banco.getNombreCarga());
			nombreC.setFill(Color.BLACK);
			nombreC.setX(lineacarga.getEndX()+5);
			nombreC.setY(lineacarga.getEndY());
			
		
			}
			else if(banco.getOrientacion().equals(Carga.LEFT)) {
				nombreC= new Text(banco.getNombreCarga());
				nombreC.setFill(Color.BLACK);
				nombreC.setX(lineacarga.getEndX()-30);
				nombreC.setY(lineacarga.getEndY());
				
			}
			
			else if(banco.getOrientacion().equals(Carga.ABAJO)) {
				nombreC= new Text(banco.getNombreCarga());
				nombreC.setFill(Color.BLACK);
				nombreC.setX(lineacarga.getEndX());
				nombreC.setY(lineacarga.getEndY()+15);
			}
			
			else if(banco.getOrientacion().equals(Carga.ARRIBA)) {
				nombreC= new Text(banco.getNombreCarga());
				nombreC.setFill(Color.BLACK);
				nombreC.setX(lineacarga.getEndX()-2);
				nombreC.setY(lineacarga.getEndY()-8);
			}
			
			return nombreC;
			
			
			
		}
		
	}
	

}
