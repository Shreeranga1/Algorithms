import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> li=new LinkedList<>();
		li.push(1);
		li.push(2);
		li.push(3);
		li.push(4);
		li.push(5);
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
	//	li.forEach(x->System.out.println(x));

	}

}
