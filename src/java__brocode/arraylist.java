package java__brocode;
import java.util.*;

public class arraylist {

	public static void main(String[] args) { 
		
    ArrayList<String> fruits=new ArrayList<>();
   fruits.add("mango");
    fruits.add("papaya");
    fruits.add("apple");
    fruits.add("banana");
   fruits.set(2, "juicy melon");
   fruits.get(1);
    
   System.out.println(fruits.size());
    System.out.println(fruits);

    for(String Fruits:fruits) {
    	
    	System.out.println(Fruits);
    	
    }
	}

}
