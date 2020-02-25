package in.conceptarchitect.collection;

import java.util.Scanner;

public class Input {

	static Scanner scanner=new Scanner(System.in);
	public static String readString(String prompt){
		
		System.out.print(prompt);
		return scanner.nextLine();
	}
	
	public static int readInt(String prompt){
		System.out.print(prompt);
		int v= scanner.nextInt();
		
		return v;
		
	}
	
	public static double readDouble(String prompt){
		System.out.print(prompt);
		return scanner.nextDouble();
	}
}
