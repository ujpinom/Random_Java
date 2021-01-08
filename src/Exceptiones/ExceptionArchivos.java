package Exceptiones;
import java.util.*;
import java.io.*;
public class ExceptionArchivos {
	
	
	public static void main(String[] args) {
		
		
		Scanner entrada= new Scanner (System.in);
		
		System.out.print("ingrese el nombre del archivo: ");
		
		String nombreArchivo= entrada.nextLine();
		
	try {
		
		
		 Scanner input= new Scanner(new File(nombreArchivo));
		 
		 System.out.println("El archivo existe...");
		 
		
	}
	
	catch(Exception e) {
		
		System.out.println("El archivo no existe.");
	}
		
		
	}

}
