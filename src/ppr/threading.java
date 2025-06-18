package ppr;
import java.util.*;

public class threading {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		myr Myr=  new myr();
		Thread thread = new Thread(Myr);
		thread.setDaemon(true);
		thread.start();
		
		
		System.out.println("you have 5 seconds to enter your name:");
		System.out.print("Enter your name:");
		String name = scan.nextLine();
		System.out.println("hello "+ name);
		
		scan.close();
	}

}
