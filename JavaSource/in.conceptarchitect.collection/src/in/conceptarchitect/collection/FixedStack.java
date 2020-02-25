package in.conceptarchitect.collection;

public class FixedStack extends AbstractStack {

	private Object [] elements;
	private int top;
	
	public FixedStack(int size){
		elements=new Object[size];
	}
	
	@Override
	public void push(Object o){
		if(isFull())
			throw new StackOverFlowException();
		elements[top++]=o;
	}
	
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return top==elements.length;
	}

	@Override
	public Object pop(){
		if(isEmpty()){
			throw new StackUnderFlowException();
		}
		
		return elements[--top];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(isEmpty()) return "FixedStack(empty)";
		
		String s="FixedStack";
		
		if(isFull()) s+="[\t";
		else s+="(\t";
		
		for(int i=top-1;i>=0;i--){
			s+= elements[i]+"\t";
		}
		
		
		if(isFull()) s+="]";
		else s+=")";
		
		
		return s;
	}
	
	
	
	
	
}
