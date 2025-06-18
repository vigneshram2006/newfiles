
package java__brocode;

class leoperd{
	void speak() {
		System.out.println("the leoperd goes MEOW");
	}
}

public class main {

	
	public static void main(String[] args) {
		leoperd l1= new leoperd();
		leoperd l2 = new leoperd() {
			@Override
			void speak() {
				
				System.out.println("this leoperd goes MEOE MEOW");
			}
		};
		l1.speak();
		l2.speak();
		
	}
}
