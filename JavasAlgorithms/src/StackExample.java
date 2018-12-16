import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> lifo=new Stack<>();
		lifo.push(1);
		lifo.push(2);
		lifo.push(3);
		lifo.push(4);
		lifo.push(5);
		lifo.push(6);
		//print out the order
		
		while(!lifo.isEmpty())
		{
			System.out.println(lifo.pop());
		}
		

	}

}
