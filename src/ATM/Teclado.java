package ATM;
import java.util.*;

public class Teclado {
	
 private Scanner entrada= new Scanner(System.in);
 
 public int ObtenerEntradaTeclado() {
	 int numentrada= entrada.nextInt();
	 
	 return numentrada;
 }
	
}
