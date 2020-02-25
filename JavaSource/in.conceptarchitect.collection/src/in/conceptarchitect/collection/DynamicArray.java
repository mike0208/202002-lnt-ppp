package in.conceptarchitect.collection;

import java.lang.reflect.Array;
import java.util.Arrays;

import in.conceptarchitect.collection.LinkedList.Node;

public class DynamicArray<T> implements IndexedList<T> {

	Object [] array;
	
	int count;
	int growSize;
	
	public int getCapacity(){
		return array.length;
	}
	
	
	public DynamicArray(int growSize) {
		super();
		this.growSize = growSize;
		array=new Object[growSize];
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public void add(T item) {
		// TODO Auto-generated method stub
		ensureCapacity();
		array[count++]=item;
	}

	private void ensureCapacity() {
		// TODO Auto-generated method stub
		if(count==getCapacity()) //I am full
		{
			Object [] newArray= new Object[getCapacity()+growSize];
			for(int i=0;i<count;i++){
				newArray[i]=array[i];
			}
			
			array=newArray;
		}
	}


	@Override
	public T get(int position) {
		// TODO Auto-generated method stub
		validateIndex(position);
		return (T) array[position];
	}

	private void validateIndex(int position) {
		// TODO Auto-generated method stub
		if(position<0 || position>=count)
			throw new IndexOutOfBoundsException("Invalid index "+position);
	}


	@Override
	public void set(int position, T item) {
		// TODO Auto-generated method stub
		validateIndex(position);
		array[position]=item;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(count==0) return "DynamicArray(empty)";
		String s="DynamicArray";
		if(count==getCapacity())
			s+="[\t";
		else 
			s+="(\t";
			
		for(int i=0;i<count;i++){
			s+=array[i]+"\t";
		}
		
		if(count==getCapacity())
			s+="]";
		else 
			s+=")";
		
		return s;
	}
	
	
	
	public Object execute(Task<T> task){
		task.init();
		
		for(int i=0;i<count;i++){
			task.process((T)array[i]);
		}
		
		return task.finishAndReturn();
	}
	

}
