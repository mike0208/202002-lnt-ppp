package test.computer;

public class Computer1 extends HardDisk {

	public Computer1(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}

	void printStorageCapacity(){
		System.out.println("Storage capacity is  "+this.getCapacity());
	}

}
