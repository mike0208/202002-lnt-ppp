package test.stack;

import in.conceptarchitect.collection.DyanmicPeekStack;
import in.conceptarchitect.collection.DynamicStack;
import in.conceptarchitect.collection.FixedPeekStack;
import in.conceptarchitect.collection.FixedStack;
import in.conceptarchitect.collection.Input;
import in.conceptarchitect.collection.PeekStack;
import in.conceptarchitect.collection.Stack;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//simpleTest();
		
		Stack stack=null;
		
		int type=Input.readInt("1. Fixed Stack 2. DynamicStack?");
		
		if(type==1){
			stack=new FixedStack(Input.readInt("size? "));
		}else{
			stack=new DynamicStack();
		}
		
		
		if(Input.readInt("need peek 1-yes 0-no?")==1){
			stack=new PeekStack(stack);
		}
		
		StackTester.testStack(stack, 8, 3);
		
		
	}

	private static void simpleTest() {
		FixedStack stack=new FixedStack(5);
		
		StackTester.testStack(stack, 8, 2);
		
		StackTester.testStack(new DynamicStack(), 8, 2);

		StackTester.testStack(new FixedPeekStack(6), 6, 0);
		
		StackTester.testStack(new DyanmicPeekStack(),6, 0);
	}

}
