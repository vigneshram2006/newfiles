package java__brocode;
import java.util.*;
class lion extends species{
	@Override 
	void speak(){
		System.out.println("the lion is roaring");
		
	}
	}
class duck extends species{
	@Override
	void speak() {//runtime polymorphism  or methodoverridding
		System.out.println("the duck goes *quack quack*");
	}
}
abstract class species{
	abstract void speak();
	
	

}
public class runtimedynamic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		species Species;
		System.out.print("would you like to a duck or a lion (1-duck , 2- lion) enter your choice: ");
		int choice = scan.nextInt();
		
		if(choice == 1) {
			Species=new duck();
			Species.speak();
			
		}
		else if(choice == 2 ) {
			Species=new lion();
			Species.speak();
			
		}
		else {
			System.out.println("invalid choice");
		}
	}

}
