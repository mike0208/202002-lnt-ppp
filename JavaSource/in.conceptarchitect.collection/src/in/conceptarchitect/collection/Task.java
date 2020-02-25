package in.conceptarchitect.collection;

public interface Task<T> {

	void init();

	void process(T item);

	Object finishAndReturn();

}
