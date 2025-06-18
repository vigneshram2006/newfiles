package java__brocode;
import java.util.*;


public class exceptionhandiling {

	public static void main(String[] args) {
		
		
		
		int number=0;
		
	
		try (Scanner scan = new Scanner(System.in)){
			System.out.print("Enter a number: ");
			 number = scan.nextInt();
			 System.out.println(number/0);
			
			
	}
		catch (ArithmeticException e) {
			
			System.out.println("something went wrong");
			
		}
		catch(Exception e) {
			System.out.println("something went wrong");
			
		}
		
		finally {
			System.out.println("finally always executes");
		}
		
	}

}
