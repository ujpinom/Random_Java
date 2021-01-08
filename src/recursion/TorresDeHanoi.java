package recursion;
import java.util.*;
public class TorresDeHanoi {
 public static int contador=0;
	public static void main(String[] args) {
	
		
		Scanner entrada= new Scanner(System.in);
		 System.out.println("Por favor ingrese el numero de discos: ");
		 int discos= entrada.nextInt();
		 
		 Torres(discos,'A','B','C');
		 System.out.println(contador);

	}
	
	public static void Torres(int discos, char torreIni,char torreDest,char torreAux) {
		++contador;
		
		
		if(discos==1) {
			
			System.out.println("Mover el disco "+discos+" desde "+ torreIni+" hasta "+torreDest);
			
		}
		
		else {
			Torres(discos-1,torreIni,torreAux,torreDest);
			
			System.out.println("Mover el disco "+discos+" desde "+ torreIni+" hasta "+torreDest);
			
			
			Torres(discos-1,torreAux,torreIni,torreDest);
		}
	}

}
