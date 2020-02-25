package test.computer;

public class Program {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//harddisk is the core component.
		//if harddisk is damaged, the computer is unusable
		Computer1 c1= new Computer1(1024);
		System.out.println("\n\nc1");
		c1.printStorageCapacity();
		
		//computer contains HardDisk
		//GOOD: real world model.
		//BAD: No way to replace HardDisk component
		// If component id damaged the owner is also useless
		Computer2 c2=new Computer2(1024);
		System.out.println("\n\nc2");
		c2.printStorageCapacity();
		
		
		//computer contains replacable HardDisk
		//GOOD: real world model
		//GOOD: can replace component using dependency injection
		//BAD : can work only with HardDisk of different capacity
		Computer3 c3=new Computer3(new HardDisk(1024));
		System.out.println("\n\nc3");
		c3.printStorageCapacity();
		
		//Time to upgrade the HardDisk
		//lets take out the old one
		HardDisk old=c3.getHdd();
		
		//now place a new one
		c3.setHdd(new HardDisk(2048));
		
		c3.printStorageCapacity();
		
		
		
		
		//computer contains replacable storage
		//GOOD: real world model
		//		can replace storage using dependency injection
		//		can choose between different type of stroage not just harddisk
		System.out.println("\n\nc4");
		Computer4 c4=new Computer4(new HardDisk(1024));
		
		c4.printStorageCapacity();
		
		c4.setStorage(new SSD(256));
		c4.printStorageCapacity();
		
		
		
		
		
		Computer4 c5=new Computer4(); //you get some defaul storage which is replacable
		System.out.println("\n\nc5");
		c5.printStorageCapacity();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
