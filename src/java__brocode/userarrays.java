package java__brocode;
import java.util.*;

public class userarrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	String[] foods;
	int size;
	
	System.out.print(" how many foods yo want?:");
	size=scan.nextInt();
	scan.nextLine();
	
	foods=new String[size];
	
	
	
	
	
	for(int i=0;i<foods.length;i++) {
		System.out.print("Enter a food:");
		foods[i]=scan.nextLine();
		
	}
		for(int j=0;j<foods.length;j++) {
			System.out.println(foods[j]);
		}
		
		scan.close();
	}

}
