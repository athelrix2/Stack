import java.util.LinkedList;

public class StackLL implements StackIntrfc {
	
	private LinkedList<Double> ll= new LinkedList<Double>();
	
	@Override
	public void push(double d) {
		// TODO Auto-generated method stub
		ll.addFirst(d);
	}

	@Override
	public double pop() {
		// TODO Auto-generated method stub
		double x=ll.getFirst();
		ll.removeFirst();
		return x;
	}

	@Override
	public double peek() {
		// TODO Auto-generated method stub
		return ll.getFirst();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return ll.size();
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		while(!ll.isEmpty()){
			ll.removeFirst();
		}
	}



}
