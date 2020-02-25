package in.conceptarchitect.collection;

import java.io.PrintWriter;

public class LinkedList<T> implements IndexedList<T> {
	
	public static final int POSITION_END=-1;
	class Node{
		public T item;
		public Node previous;
		public Node next;		
		
	}
	
	Node first,last;
	int count=0;
	
	
	@Override
	public String toString() {
		if(first==null)
			return "LinkedList[]";
		
		StringBuilder str=new StringBuilder("LinkedList [");
		
		
		for(Node n=first;n!=null;n=n.next){
			if(n!=first)
				str.append(',');
			str.append(n.item.toString());
		}
			
		str.append(']');
		return str.toString();
		
	}
	
	
	public Object execute(Task<T> task){
		
		task.init();
		
		for(Node n=first;n!=null;n=n.next){
			task.process(n.item);
		}
		
		return task.finishAndReturn();
		
	}
	
	
	/*public void print(){
		for(Node n=first;n!=null;n=n.next){
			System.out.println(n.item);
		}
	}
	
	public int indexOf(T value){
		int count=0;
		
		for(Node n=first;n!=null;n=n.next){
			if(n.item.equals(value))
				return count;
			else
				count++;
		}
		return -1;
	}
	
	public void write(PrintWriter writer){
		
		for(Node n=first;n!=null;n=n.next){
			writer.println(n.item);
		}
		writer.flush();
	}
	
	
	public double averge(){
		double sum=0;
		
		for(Node n=first;n!=null;n=n.next){
			sum+=(double) n.item;
		}
		
		return sum/length();
	}*/
	
	
	/* (non-Javadoc)
	 * @see in.conceptarchitect.collection.IndexedList#length()
	 */
	@Override
	public int length(){
		int i=0;
		for(Node n=first;n!=null;n=n.next){
			i++;
		}
		return i;
		
	}
	
	
	public void insert(T item){
		insert(item,POSITION_END);
	}
	
	/* (non-Javadoc)
	 * @see in.conceptarchitect.collection.IndexedList#add(T)
	 */
	@Override
	public void add(T item){
		insert(item,POSITION_END);
	}
	
	public void insert(T item,int position){
		Node newNode=new Node();
		newNode.item=item;
		if(position<POSITION_END || position>count){
			throw new IndexOutOfBoundsException("invalid position "+position);
		}
		if(position==count)
			position=POSITION_END;
		
		
		
		if(position==POSITION_END ){
			newNode.next=null;
			newNode.previous=last;
			if(first==null)
				first=newNode;
			else
				last.next=newNode;
			
			last=newNode;
		
		
			
		}
		else if(position==0){
			newNode.previous=null;
			newNode.next=first;
			if(last==null)
				last=newNode;
			else
				first.previous=newNode;
				
			
			first=newNode;
		
		
				
		}
		else {
			Node anchor=locate(position-1);
			newNode.next=anchor.next;
			newNode.previous=anchor;
			
			if(anchor.next!=null)
				anchor.next.previous=newNode;
			else
				last=newNode;
			
			
			anchor.next=newNode;		
		}
		count++;
	}

	private Node locate(int position) {
		// TODO Auto-generated method stub
		if(position<POSITION_END || position>=count)
			throw new IndexOutOfBoundsException("Invalid Position"+position);
		
		Node anchor=first;
		for(int i=0;i<position;i++)
			anchor=anchor.next;
		
		return anchor;
	}
	
	public T remove(int position){
		Node delNode=locate(position);
		T item=delNode.item;
		
		if(delNode.previous==null) //this is the first node
			first=delNode.next;
		else
			delNode.previous.next=delNode.next;
		
		if(delNode.next==null) // this is the last node
			last=delNode.previous;
		else
			delNode.next.previous=delNode.previous;
		
		delNode=null; //delNode set to be gc
		count--;
		
		return item;
	}
	
	/* (non-Javadoc)
	 * @see in.conceptarchitect.collection.IndexedList#get(int)
	 */
	@Override
	public T get(int position){
		return locate(position).item;
	}
	
	/* (non-Javadoc)
	 * @see in.conceptarchitect.collection.IndexedList#set(int, T)
	 */
	@Override
	public void set(int position,T item){
		locate(position).item=item;
	}

	
	
	
	
}





