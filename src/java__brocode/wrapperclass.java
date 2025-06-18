package java__brocode;

public class wrapperclass {

	public static void main(String[] args) {
		// autoboxing
		
		Integer i = 112;
		Character c = '#';
		Double d = 22.32;
		Boolean b= true;
		
		// unboxing
		
		int z=i;
		char x =c;
		double v=d;
		boolean n=b;
		
	
		// primitive data types to Strings
		
		String a= Integer.toString(221);
		String s= Boolean.toString(true);
		String k= Character.toString('*');
		String h = Double.toString(12.34);
		
		
		String[] ints= {a,s,k,h};
		String t = a+s+k+h;
		
		for(String abs:ints) {
			System.out.println(abs);
			
		}
		
		//parse() methods- Strings datas to primitive data types 
		
		int p = Integer.parseInt("123");
		char y = "PIZZA".charAt(2);
		double r = Double.parseDouble("12.345");
		boolean o= Boolean.parseBoolean("false");
		
	    System.out.println(p);
	    System.out.println(y);
	    System.out.println(r);
	    System.out.println(o);
	    
	    // to verify the statements;
	    
	    char pp ='s';
	   
	    

	    System.out.println(Character.isLetter(pp));
	    System.out.println(Character.isUpperCase(pp));
	    
	}

}
