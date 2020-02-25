package in.conceptarchitect.collection;

public class StackUtils {

	
	public static Object peek(Stack stack){

		Object v=stack.pop();
		stack.push(v);
		return v;
	}


}
