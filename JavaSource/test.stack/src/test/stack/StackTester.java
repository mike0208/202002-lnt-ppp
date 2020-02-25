package test.stack;

import in.conceptarchitect.collection.AbstractStack;
import in.conceptarchitect.collection.Peekable;
import in.conceptarchitect.collection.Stack;
import in.conceptarchitect.collection.StackOverFlowException;
import in.conceptarchitect.collection.StackUnderFlowException;
import in.conceptarchitect.collection.StackUtils;

public class StackTester {

	Stack stack;
	Object [] testData={2,9,11,8,7,17,4,14,0,3,5,2,8};
	
	public void testPush(int pushCount){
		
		try{
		for(int i=0;i<pushCount;i++){
			System.out.print("pushing "+testData[i]+"...");
			stack.push(testData[i]);
			System.out.println("done");
		}
		}
		catch(StackOverFlowException s){
			System.out.println("stack overflow");
		}

	}
	
	public void testPop(int popCount){
		
		try{
		for(int i=0;i<popCount;i++){
			System.out.print("trying to pop... ");
			Object o=stack.pop();
			System.out.println("got "+o);
		}
		}
		catch(StackUnderFlowException s){
			System.out.println("stack under flow");
		}
	}
	
	
	public void flushStack2(){
		
		while(!stack.isEmpty()){
			System.out.println("flushing "+stack.pop());
			
			if(!stack.isEmpty()){
				
				System.out.println("\nnext item is "+StackUtils.peek(stack));
			}
			
		}
	}
	
	public void flushStack(){
		
		while(!stack.isEmpty()){
			System.out.println("flushing "+stack.pop());
			
			if(!stack.isEmpty() && 	stack instanceof Peekable){
				Peekable ps=(Peekable) stack;
				System.out.println("\nnext item is "+ps.peek());
			}
			
		}
	}

	public StackTester(Stack stack) {
		super();
		this.stack = stack;
	}
	
	
	public static void testStack(Stack stack, int pushCount,int popCount){
		
		System.out.println("Testing "+stack);
		
		StackTester tester=new StackTester(stack);
		
		tester.testPush(pushCount);
		tester.testPop(popCount);
		tester.flushStack();
		
		System.out.println("-----------\n\n\n");
		
		
	}
	
	
	
}
