package colecciones;


import java.io.*;
import java.util.Comparator;

public class ComparatorPoints implements Comparator<Points>,Serializable {
	@Override
	public int compare(Points o1, Points o2) {
		
		
		
		int x1coor=o1.getX();
		int x2coor=o2.getX();
		int y1= o1.getY();
		int y2=o2.getY();
		
		
		if(x1coor<x2coor) {
			return -1;
		}
		
		else if(x1coor==x2coor) {
			
			if(y1<y2) {
				return -1;
			}
			else if(y1==y2) {
				return 0;
			}
			else
				return 1;
		}
		else
		return 1;
	}
	
}
