package recursion;
import java.io.*;
import java.util.*;
public class SizeOfFile {
	
	public static void main (String[] args) {
		
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Por favor ingrese el nombre del directorio: ");
		String directorio= entrada.nextLine();
		
		File input= new File(directorio);
		
		System.out.println("El tamaño del directorio "+directorio+ " es de "+ getSize(input));
	}
	
	
	public static long getSize(File file) {
		long size=0;
		
		if(file.isDirectory()) {
			
			File [] files= file.listFiles();
			
			for(int i=0;i<files.length;i++) {
				
				size+=getSize(files[i]);
			}
			
		}
		
		else
			size+=file.length();
		
		return size;
	}

}
