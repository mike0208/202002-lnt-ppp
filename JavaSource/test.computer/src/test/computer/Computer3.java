package test.computer;

public class Computer3  {

	HardDisk hdd;
	
	//dependency injecting constructor
	public Computer3(HardDisk hdd) {
		this.hdd=hdd;
		// TODO Auto-generated constructor stub
	}
	
	

	public HardDisk getHdd() {
		return hdd;
	}


	//can inject a new HardDisk replacing the old one
	//setter based dependency injection
	public void setHdd(HardDisk hdd) {
		this.hdd = hdd;
	}



	void printStorageCapacity(){
		System.out.println("Storage  is  "+hdd);
	}

}
