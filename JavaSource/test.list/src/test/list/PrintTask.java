package test.list;

import in.conceptarchitect.collection.Task;

public class PrintTask<T> implements Task<T> {

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void process(T item) {
		// TODO Auto-generated method stub
		System.out.println(item);
	}

	@Override
	public Object finishAndReturn() {
		// TODO Auto-generated method stub
		return null;
	}

}
