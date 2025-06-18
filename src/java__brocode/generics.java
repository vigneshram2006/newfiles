package java__brocode;
import java.util.*;

class product<T , U>{
	T item;
	U count;
	
	
	public product(T item,U count) {
		this.item= item;
		this.count=count;
		
		
		
	}
	public T getitem () {
		return this.item;
		
	}
	public U getprice() {
	return this.count;
	
	}
}

class box<T>{
	T item;
	
	public void setitem(T item) {
		this.item= item;
		
		
	}
	
	public T getitem() {
		return this.item;
		
	}
}
public class generics {
public static void main(String[] args) {
	
	product<String,Double> p= new product<>("parotta",100.1);
	
	System.out.println(p.getitem()+" "+p.getprice());
	
	
	
}
}
