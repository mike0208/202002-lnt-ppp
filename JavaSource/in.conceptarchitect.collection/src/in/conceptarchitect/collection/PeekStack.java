package in.conceptarchitect.collection;

public class PeekStack implements Stack, Peekable {

	Stack target;
	
	public PeekStack(Stack target) {
		// TODO Auto-generated constructor stub
		this.target=target;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		Object v=pop();
		push(v);
		return v;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return target.isEmpty();
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return target.pop();
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return target.isFull();
	}

	@Override
	public void push(Object o) {
		// TODO Auto-generated method stub
		target.push(o);
		
	}

}
