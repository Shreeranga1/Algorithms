
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> fifo=new LinkedList<>(); 
		for(int i=0;i<5;i++)
			fifo.add(i);
		
		fifo.forEach(x->System.out.println(x));
	}

}
