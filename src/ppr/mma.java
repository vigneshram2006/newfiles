package ppr;

import java.util.*;
import java.io.*;

public class mma {
	
	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter a day of week:");
		String response=scan.nextLine().toUpperCase();
		enumss enm= enumss.valueOf(response);
	 
		try {
		switch (response) {
		case "MONDAY",
		     "TUESDAY",
		     "WEDNESDAY",
		     "THURSDAY",
		     "FRIDAY"->System.out.println("it is a weekday");
		case "SATURDAY","SUNDAY"->System.out.println("it is a weekend");
		}
		}
		catch(IllegalArgumentException e) {
			System.out.println("please enter a valid day:");
			
		}
		
		scan.close();
	
	}
}
