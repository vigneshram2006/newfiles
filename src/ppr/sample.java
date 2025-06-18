package ppr;
import java.util.*;
public class sample {


	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		int totalmarks = 0;
		int totalsubjects=0;
	    System.out.print(" how many subjects you have:");
	    totalsubjects=scan.nextInt();
     	System.out.println("enter your marks for each subject:");
    	for (int i=1;i<=totalsubjects;i++) {
		System.out.print("enter subject "+i+ " marks:");
		totalmarks+=scan.nextInt();
		}
	    int average = totalmarks/totalsubjects;
	    System.out.print("your average mark is "+average);
	
	
	
	}

}
