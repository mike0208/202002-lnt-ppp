package in.conceptarchitect.collection;

public class DynamicStack extends AbstractStack{

	class Node{
		Object element;
		Node next;
	}
	
	Node top;
	
	
	public void push(Object o){
		
		Node n=new Node();
		n.element=o;
		n.next=top;
		
		top=n;
	}
	
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object pop(){
		if(isEmpty()){
			throw new StackUnderFlowException();
		}
		
		Object value=top.element;
		top=top.next;
		
		return value;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==null;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(isEmpty()) return "DynamicStack(empty)";
		
		String s="LinkedStack(";
		
		
		for(Node n=top;n!=null;n=n.next){
			s+= n.element+"\t";
		}
		
		
		s+=")";
		
		
		return s;
	}
	
	
	
	
	
}
