package java__brocode;


public class methodoverloading {

	public static void main(String[] args) {
		String pizza=bakepizza("flat bread","mozzerella","pepporoni");
		System.out.println(pizza);
		
	}
	static String  bakepizza(String bread) {
		return bread+" pizza ";
		
	}
static String  bakepizza(String bread,String chesse ) {
	return chesse+" "+bread+" "+" pizza ";
}
static String bakepizza(String bread,String chesse,String toppings) {
	return toppings+ " "+chesse+" "+bread+" "+ " pizza ";
}

}
