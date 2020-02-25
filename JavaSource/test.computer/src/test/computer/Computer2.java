package test.computer;

public class Computer2  {

	HardDisk hdd;
	public Computer2(int capacity) {
		hdd=new HardDisk(capacity);
		// TODO Auto-generated constructor stub
	}

	void printStorageCapacity(){
		System.out.println("Storage  is  "+hdd);
	}

}
