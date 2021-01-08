package HandlingEvents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
public class PairOfPoints extends JApplet{
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	private ArrayList<Integer> xcoordenadas= new ArrayList<>();
	private ArrayList<Integer> ycoordenadas= new ArrayList<>();
	private ArrayList<Double> distancias= new ArrayList<>();

	public PairOfPoints() {
		
		JPanel p1= new JPanel();
		
		Circulo cir= new Circulo();
	
		Mouse mouse= new Mouse();
		
		cir.addMouseListener(mouse);
		
		add(cir);
		
	}
	
	
	
	class Circulo extends JPanel{
		
		private int radio=5;
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			for(int i=0;i<xcoordenadas.size();i++) {
				for(int j=0;j<ycoordenadas.size();j++) {
					
					if(i==j) {
						int xcenter= xcoordenadas.get(i);
						int ycenter= ycoordenadas.get(j);
						g.drawOval(xcenter-radio, ycenter-radio, 2*radio, 2*radio);
						
					}
					
				}
			}
			
			g.fillOval(x1-radio, y1-radio, 2*radio, 2*radio);
			g.fillOval(x2-radio, y2-radio, 2*radio, 2*radio);
			
		}
		
	}
	
	class Distancias{
		private double [][] info;
		
		
		public void setDistancias() {
			
			
			for(int i=0;i<xcoordenadas.size();i++) {
				for(int j=0;j<ycoordenadas.size();++j) {
					
					if(i!=j && j>i) {
					
					double distancia= calcularDistancia(xcoordenadas.get(i),ycoordenadas.get(i), xcoordenadas.get(j),ycoordenadas.get(j));
					
					distancias.add(distancia);
					
					if(distancias.size()>0) {
						setinfo(xcoordenadas.get(i),ycoordenadas.get(i), xcoordenadas.get(j),ycoordenadas.get(j),distancia);
					}
					
					if(distancias.size()>0) {
						Double [] filaj1= distancias.toArray(new Double[0]);
						
						Arrays.sort(filaj1);
						double min= filaj1[0];
						
						setMin(min);
						}
					}
					
				}
			}
			
			distancias.removeAll(distancias)
;			
		}
		
		public void setMin(double min) {
			
			for(int i=0;i<info.length;i++) {
				
					
					if(info[i][4]==min) {
						
						x1=(int)(info[i][0]);
						y1=(int)(info[i][1]);
						x2=(int)(info[i][2]);
						y2=(int)(info[i][3]);
						repaint();
						break;
					}
				
			}
		}
		
		public double calcularDistancia(int x1,int y1,int x2,int y2) {
			
			
			return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		}
		
		public void setinfo(int x1,int y1,int x2,int y2,double distancia) {
			
			info=new double[distancias.size()][5];
			
			for(int i=0;i<distancias.size();i++) {
				for(int j=0;j<5;j++) {
					if(j==0) {
						
						info[i][j]=x1;
					}
					if(j==1) {
						info[i][j]=y1;
						
					}
					if(j==2) {
						info[i][j]=x2;
					}
					if(j==3) {
						info[i][j]=y2;
					}
					if(j==4) {
						info[i][j]=distancia;
					}
				}
			}
			
		}
	}
	
	class Mouse implements MouseListener{
		
		Distancias dis= new Distancias();
		@Override
		public void mousePressed(MouseEvent m) {
		
			xcoordenadas.add(m.getX());
			ycoordenadas.add(m.getY());
			repaint();
		
			dis.setDistancias();
			
			
		}
		@Override
		public void mouseEntered(MouseEvent m) {
			
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
}
