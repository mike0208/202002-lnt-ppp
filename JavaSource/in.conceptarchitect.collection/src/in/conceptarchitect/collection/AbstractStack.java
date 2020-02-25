package in.conceptarchitect.collection;

import java.util.ArrayList;

public abstract class AbstractStack implements Stack {

	public AbstractStack() {
		super();
	}

	/* (non-Javadoc)
	 * @see in.conceptarchitect.collection.Stack#isEmpty()
	 */
	@Override
	public abstract boolean isEmpty();

	/* (non-Javadoc)
	 * @see in.conceptarchitect.collection.Stack#pop()
	 */
	@Override
	public abstract Object pop();

	/* (non-Javadoc)
	 * @see in.conceptarchitect.collection.Stack#isFull()
	 */
	@Override
	public abstract boolean isFull();

	/* (non-Javadoc)
	 * @see in.conceptarchitect.collection.Stack#push(java.lang.Object)
	 */
	@Override
	public abstract void push(Object o);
	
	
	public Object peek(){

		Object v=pop();
		push(v);
		return v;
	}
	
	public void reverse(){
		ArrayList<Object> temp=new ArrayList<Object>();
		while(!isEmpty()){
			temp.add(pop());
		}
		
		for(Object o:temp){
			push(o);
		}
	}

}








