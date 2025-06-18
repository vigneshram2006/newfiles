package java__brocode;
import java.util.*;


public class hashmapz {
	public static void main(String[] args) {
		HashMap<String ,Double> map= new HashMap<>();
		
		map.put("mango", 2.11);
		map.put("banana", 1.99);
		map.put("apple", 4.99);
		map.put("grapes", 2.49);
		
		System.out.println(map.get("mango"));
		System.out.println(map.containsKey("apple"));
		System.out.println(map.remove("apple", 4.99));
		System.out.println(map.size());	
		System.out.println(map.containsValue(2.11));
		
		
		for(String key:map.keySet()) {
			System.out.println(key+": $"+map.get(key));
			
		}
	}  

}
