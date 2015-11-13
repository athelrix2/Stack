import java.util.LinkedList;

public class StackLL implements StackIntrfc {
	
	private LinkedList<Double> ll;
	
	public StackLL(){
		ll= new LinkedList<Double>();
	}
	
	@Override
	public void push(double d) {
		//place d on top of the stack
		ll.addFirst(d);
	}

	@Override
	public double pop() {
		//return top item in the stack and then remove from stack 
		double x=ll.getFirst();
		ll.removeFirst();
		return x;
	}

	@Override
	public double peek() {
		//return the top item in the stack and leave the stack intact 
		return ll.getFirst();
	}

	@Override
	public int size() {
		//returns the size (depth) of the stack
		return ll.size();
	}

	@Override
	public void clear() {
		//remove all items from the stack
		while(!ll.isEmpty()){
			ll.removeFirst();
		}
	}
}
