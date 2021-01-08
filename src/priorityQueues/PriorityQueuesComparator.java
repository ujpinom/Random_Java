package priorityQueues;

import java.io.Serializable;
import java.util.Comparator;

public class PriorityQueuesComparator  implements Comparator< Pacientes>,Serializable {

	@Override
	public int compare(Pacientes o1, Pacientes o2) {
		
		int prio1=o1.getPrioridad();
		int prio2=o2.getPrioridad();
		
		
		if(prio1>prio2) {
			return -1;
		}
		else if(prio1==prio2)
			return 0;
		else
			return 1;
	}
	

}
