package StringsIO;
import java.io.*;
import java.util.*;
public class ClasseFile {
	public static File file= new File("C:\\Users\\SONY\\Desktop\\ArchivosJava\\perrrro.txt");
	public static void main(String[] args) throws Exception {

	
		try {
			
			
			
			if(file.exists()) {
				throw new Exception("El archivo ya existe");
			}
			
		
			
			
			
			
		}
		
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		finally {
			PrintWriter output = new PrintWriter(file);
			System.out.println("El archivo se ha creado correctamente");
			
			output.print("Uriel Jos� Pino Moreno, titulado en: ");
			output.println("Ingenier�a el�ctrica busca hacerse una vida en la programaci�n");
			output.close();
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}
}
