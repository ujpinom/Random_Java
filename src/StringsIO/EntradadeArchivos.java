package StringsIO;
import java.io.*;
import java.util.*;
public class EntradadeArchivos {
	
	public static void main(String[] args) throws Exception {
		
		File archivo= new File("C:\\Users\\SONY\\Desktop\\ArchivosJava\\perrrro.txt");
	
		Scanner input= new Scanner(archivo);
		
		while(input.hasNext()) {
			String informacion= input.nextLine();
			System.out.println(informacion);
		}
		
		input.close();
		
		
		PrintWriter output= new PrintWriter(archivo);
		
		output.append("sdsadsdas");
		
		output.close();
		
		
		
		
		
		
		
	}

}
