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
			
			output.print("Uriel José Pino Moreno, titulado en: ");
			output.println("Ingeniería eléctrica busca hacerse una vida en la programación");
			output.close();
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}
}
