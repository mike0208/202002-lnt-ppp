package test.computer;

public class Computer4  {

	Storage storage;
	
	//dependency injecting constructor
	public Computer4(Storage storage) {
		this.storage=storage;
		// TODO Auto-generated constructor stub
	}
	
	//default dependency
	public Computer4(){
		storage=new HardDisk(512);
	}
	
	

	public Storage getStorage() {
		return storage;
	}


	public void setStorage(Storage storage) {
		this.storage = storage;
	}


	void printStorageCapacity(){
		System.out.println("Storage  is  "+storage);
	}

}
