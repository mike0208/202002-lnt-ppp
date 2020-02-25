package in.conceptarchitect.collection;

public class DyanmicPeekStack extends DynamicStack implements Peekable{

	
	
	public Object peek(){

		Object v=pop();
		push(v);
		return v;
	}

	
	
}
