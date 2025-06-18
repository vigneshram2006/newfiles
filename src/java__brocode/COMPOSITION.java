package java__brocode;

public class COMPOSITION {

	public static void main(String[] args) {
		caR1 C = new caR1("BMW",2020,"V8"); 
		
		System.out.println(C.Model);
		System.out.println(C.year);
		System.out.println(C.Engine.type);
		
		
		C.Engine.start();
		C.start();
	}

}
