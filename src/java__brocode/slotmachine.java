package java__brocode;                //JAVA SLOT MACHINE
import java.util.*;



public class slotmachine {
	public static void main (String[]args){ 
	Scanner scan = new Scanner (System.in);
	
	int balance=100;
	int bet;
	int payout=0;
	String[] row = {};
	String playagain ;
	
	System.out.println("**********************");
	System.out.println("WELCOME TO JAVA SLOTS!");
	System.out.println("Symbols: 🍉 🍊 🍒 🔔 ⭐ ");
	System.out.println("**********************");
	
	while(balance>0) {
		System.out.println("current balance: ₹"+balance);
		System.out.print("place your bet amount:");
		bet = scan.nextInt();
		scan.nextLine();
		
		if(bet > balance) {
			System.out.println("INSUFFICIENT BET");
			continue;
			
		}
		else if(bet <= 0) {
			System.out.println("bet must be greater than 0");
			continue;
		}
		else {
			balance -= bet;
			
		}System.out.println("spinninggg......");
		
		row=spinrow();
	    printrow(row);
	    payout= getpayout(row,bet);
	   
	   
	   
	   if( payout>0) {
		   System.out.println(" You Won ₹"+payout);
		   balance+=payout;
	   }
	   else{
		   System.out.println("You Lost This Round");
		   }
	   
	   System.out.print("do u want to play again(Y/N): ");
		playagain=scan.nextLine().toUpperCase();
		
	   if(!playagain.equals("y")) {
		   break;
	   }
	   }
	
	
	System.out.println("GAME OVER ! Your final balance is:₹"+balance);
	
      }
	static String[] spinrow() {
		String[] symbols= {"🍉","🍊","🍒","🔔","⭐"};
		String[] row= new String[3];
		 Random rand = new Random();

		 for(int i=0;i<3;i++) {
			 row[i]=symbols[rand.nextInt(symbols.length)];
		 }
		

		return row;
	}

    static void printrow(String[] row) {
    	System.out.println("***********************");
	    System.out.println(" "+String.join(" | ",row));
	    System.out.println("***********************");
	}
    static int getpayout(String[] row,int bet) {
    	if(row[0].equals(row[1]) && row[1].equals(row[2])) {
    		return switch(row[0]) {
    		case "🍉"->bet*3;
    		case  "🍊"->bet*4;
    		case  "🍒"->bet*5;
    		case  "🔔"->bet*10;
    		case  "⭐"->bet*20;
    		default->0;
    		
    		};
    		
    	}
    	else if(row[0].equals(row[1])) {
    		return switch(row[0]) {
    		case "🍉"->bet*2;
    		case  "🍊"->bet*3;
    		case  "🍒"->bet*4;
    		case  "🔔"->bet*5;
    		case  "⭐"->bet*10;
    		default->0;
    		
    		};
    		
    	}else if(row[1].equals(row[2])) {
    		return switch(row[1]) {
    		case "🍉"->bet*2;
    		case  "🍊"->bet*3;
    		case  "🍒"->bet*4;
    		case  "🔔"->bet*5;
    		case  "⭐"->bet*10;
    		default->0;
    		
    		};
    		
    	}
    	return 0;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
