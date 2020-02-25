package in.conceptarchitect.collection;

public interface IndexedList<T> {

	int length();

	void add(T item);

	T get(int position);

	void set(int position, T item);
	
	Object execute(Task<T> task);

}