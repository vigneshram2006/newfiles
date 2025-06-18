package java__brocode;
import java.util.*;
public class searcharray {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		int[] numbers= {13,56,46,38,987,12};
		boolean isfound=false;
		String[] fruit= {"graps","banana","orange","apple","pineapple"};
		String target;
		System.out.print("what fruit you want to search for:");
	    target=scan.nextLine();
		
		
		
		
		
		for(String fruits:fruit)  {
			if(fruit.equals(target)) {
			System.out.print("element found at index: ");
			isfound=true;
			break;
			}
			
		}
		if(!isfound) {
			System.out.print("Element is not found in the array");
		}
		scan.close();
		
	}

}
