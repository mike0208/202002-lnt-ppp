package test.computer;

public class HardDisk implements Storage {

	int capacity;

	public int getCapacity() {
		return capacity;
	}

	@Override
	public String toString() {
		return "HardDisk [capacity=" + capacity + " gb ]";
	}

	public HardDisk(int capacity) {
		super();
		this.capacity = capacity;
	}
	
	
}
