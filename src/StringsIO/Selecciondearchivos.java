package StringsIO;
import java.io.*;
import javax.swing.*;
import java.util.*;
public class Selecciondearchivos {

	public static void main(String[] args) throws Exception {


		JFileChooser escogerarchivo= new JFileChooser();
		
		if(escogerarchivo.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
			
			File file= escogerarchivo.getSelectedFile();
		
			Scanner input= new Scanner(file);
		int contador=0;
		while(input.hasNext()) {
			
			int numero= input.nextInt();
			
			contador+=numero;
		}
		
		System.out.println(contador);
		
		input.close();
		
		}
		
		else
			System.out.println("Ningun archivo fue selecccionado");

	}

}
