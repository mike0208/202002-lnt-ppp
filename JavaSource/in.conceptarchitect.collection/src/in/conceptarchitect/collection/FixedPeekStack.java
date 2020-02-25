package in.conceptarchitect.collection;

public class FixedPeekStack extends FixedStack implements Peekable{

	public FixedPeekStack(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}
	
	
	public Object peek(){

		Object v=pop();
		push(v);
		return v;
	}

	
	
	/*public Object peek(){

		if(isEmpty())
			throw new StackUnderFlowException();
		
		return elements[top-1];
	}
*/
}
