package priorityQueues;

public class Pacientes {
	
	private String nombre;
	private int prioridad;
	
	public Pacientes(String nombre,int prioridad) {
		this.nombre=nombre;
		this.prioridad=prioridad;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPrioridad() {
		return prioridad;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void serPrioridad(int prioridad) {
		this.prioridad=prioridad;

	}
	
	@Override
	public String toString() {
		return "El paciente "+getNombre()+" tiene una prioridad de : " +getPrioridad();
	}


//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return  this.prioridad - ((Pacientes)o).prioridad;
//	}

}
