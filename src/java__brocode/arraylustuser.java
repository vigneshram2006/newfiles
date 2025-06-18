package java__brocode;
import java.util.*;


public class arraylustuser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> foods= new ArrayList<String>();
		
		System.out.print("enter the # of food you would like:");
	    int numoffood=scan.nextInt();
	    scan.nextLine();
	    
	    for(int i=1;i<=numoffood;i++) {
	    	System.out.print("enter the #"+i+" food:");
	    	String food= scan.nextLine();
	    	foods.add(food);
	    	
	    }
	    System.out.println(foods);
	    
	}

}
