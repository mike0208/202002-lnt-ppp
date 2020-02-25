package test.computer;

public class SSD implements Storage {

	int capacity;

	public int getCapacity() {
		return capacity;
	}

	@Override
	public String toString() {
		return "SSD [capacity=" + capacity + " gb ]";
	}

	public SSD(int capacity) {
		super();
		this.capacity = capacity;
	}
	
	
}
