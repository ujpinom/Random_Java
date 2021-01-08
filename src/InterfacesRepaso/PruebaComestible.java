package InterfacesRepaso;

public class PruebaComestible {

	public static void main(String[] args) {
		
		pollo po= new pollo();
		
		tigre ti= new tigre();
		
		pera pe= new pera();
		banano ba= new banano();
		
		
		Diable comestible[]= new Diable[4];
		comestible[0]= po;
		comestible[1]= ti;
		comestible[2]= pe;
		comestible[3]= ba;
		
		
		for(int i=0;i<comestible.length;i++) {
			
			System.out.println(comestible[i].getClass()
					+comestible[i].secome());
		}
		
		
		
		
	}
	}
	
	abstract class animales implements Diable{
		
	}
	
	class pollo extends animales{
		
		public String secome() {
			return " Se puede comer frito. Es muy bueno";
		}
	}
	
	class tigre extends animales{
		
		public String secome() {
			
			return " Gas pero cualquier cosas es comestible";
		}
	}
	
	abstract class frutas implements Diable{
		
	}
	
	class pera extends frutas{
		
		
		public String secome() {
			return " POr su pollo. Haga jugo con ella";
		}
		
	}
	
	class banano extends frutas{
		public String secome() {
			
			return " Es muy bueno con jugo";
		}
	}
	
	
	


