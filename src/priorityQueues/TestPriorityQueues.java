package priorityQueues;
import java.util.*;
public class TestPriorityQueues {

	public static void main(String[] args) {
		
		
		Pacientes pacientes6= new Pacientes("Julian1",6);
		Pacientes pacientes5= new Pacientes("zndres",7);
		Pacientes pacientes4= new Pacientes("Pacho",4);
		Pacientes pacientes3= new Pacientes("Perro",8);
		Pacientes pacientes2= new Pacientes("Julian",2);
		Pacientes pacientes1= new Pacientes("Julian2",10);
		
		PriorityQueue<Pacientes> listapacientes= new PriorityQueue<Pacientes>(11,new PriorityQueuesComparator());
		listapacientes.add(pacientes3);
		listapacientes.add(pacientes4);
		listapacientes.add(pacientes6);
		listapacientes.add(pacientes5);
		listapacientes.add(pacientes2);
		listapacientes.add(pacientes1);
		
		while(listapacientes.size()>0) {
			System.out.println(listapacientes.poll());
		}
		
		
	
		
	}

}
