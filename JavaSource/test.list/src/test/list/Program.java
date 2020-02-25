package test.list;

import java.util.Random;

import in.conceptarchitect.collection.DynamicArray;
import in.conceptarchitect.collection.IndexedList;
import in.conceptarchitect.collection.LinkedList;

public class Program {

	public static void main(String[]args) {
		// TODO Auto-generated constructor stub
		
		IndexedList<Integer> list=new LinkedList<>();
		
		fillList(list, 20);
		
		list.execute(new PrintTask<>());
		
		list.execute(new XmlWriterTask<>("c:/temp/numbers.xml","items","item"));
		
		
	}
	
	static void fillList(IndexedList<Integer> list, int count){
		
		Random r=new Random(1254);
		
		for(int i=0;i<count;i++){
			
			list.add(r.nextInt(100));
			System.out.println(list);			
			
		}
		
		
	}

}
