package java__brocode;
import java.util.*;

public class bankingprogram {
	static Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		double balance=0;
		boolean isrunning=true;
		int choice;
		
	
		
		while(isrunning) {	
			System.out.println("*********************");
			System.out.println(" BANKING PROGRAM ");
			System.out.println("*********************");
			System.out.println("1.SHOW BALANCE ");
			System.out.println("2.DEPOSIT");
			System.out.println("3.WITHDRAW");
			System.out.println("4.EXIT");
			System.out.println("*********************");
			
			System.out.print("ENTER YOUR CHOICE (1-4): ");
			choice = scan.nextInt();  
			
			
		switch(choice) {
		    case 1-> showbalance(balance);
            case 2-> balance +=deposit();
		    case 3-> balance -=withdraw(balance);
	        case 4-> isrunning = false;
	      	default -> System.out.println(" invaild choice");
		
	
		}
	
		}
		System.out.println("*********************");
		System.out.println(" Thank you! have a nice day!");
		System.out.println("*********************");
			} 
static void showbalance(double balance) {
		 System.out.println("*********************");
	     System.out.printf("₹%.2f",balance);
	     balance=scan.nextDouble();
	
	}
     static double deposit() {
    	 double amount;
    	 System.out.print("enter an amount to be deposited ");
    	 amount = scan.nextDouble();
    	 if(amount <0) {
    		 System.out.println("amount can't be negative");
    		 return 0;
    	 }
    	 else {
    		 return amount;
    	 }
  
    	
    }
   static double withdraw(double balance) {
	   double amount;
	   System.out.println("enter an amount to be withdrawn");
	   amount =scan.nextDouble();
	   
	   if(amount >balance) {
		   System.out.println("insufficient funds ");
		   return 0;
	   }
	   else if(amount < 0) {
		   System.out.println(" amount can't be negative");
		   return 0;
	   }else {
		   return amount;
	   }
	  
	   
   }

























}

