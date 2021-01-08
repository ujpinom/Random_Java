package StringsIO;
import java.util.*;
public class poer {

	
	public static void main(String[] x) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Por favor ingrese un string: ");
		String string1= entrada.nextLine();
		System.out.println();

		System.out.print("Por favor ingrese otro string: ");
		String string2= entrada.nextLine();
		
		
		if(esSubString(string1,string2)) {
			System.out.println("El string2 es un sub-string del string1");	
		}
		else
			System.out.println("El string2 no esta contenido en string1");
		
		
	}
	
	public static boolean esSubString(String s1,String s2) {
		int tem=s1.indexOf(s2);
		
		boolean bandera= false;
		
		if(tem>=0) {
			bandera=true;
		}
		
		return bandera;
	}
}
