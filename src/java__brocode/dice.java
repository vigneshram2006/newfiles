package java__brocode;


import java.util.*;

public class dice {
	
	

	public static void main(String[] args) {
		 Scanner scan= new Scanner(System.in);
		 Random rand = new Random();
		 int numofdice;
		 int total=0;
		 
		 
		 System.out.print(" Enter the  no.of dice to roll: ");
		 numofdice=scan.nextInt();
		 
		 if( numofdice > 0) {
			 for(int i=0; i<numofdice;i++) {
				int roll= rand.nextInt(1,7);
				printdie(roll);
				System.out.println(" you rolled: "+roll);
				total+=roll;
				}System.out.println(" total: "+ total);
		 }
		 else {
			 System.out.println(" number of dice must be greater than zero");
		 }
		scan.close();
	}
	static void printdie(int roll) {

		String dice1="""  
				
	    -------
    |       |	
    |   ●   |
    |       |
     -------		
				""";
	    String dice2="""  
				
		     -------
      | ●     |	
			   |       |
      |     ● |	
       -------		
				""";
	String dice3="""  
			
			   -------
		   | ●     |	
		   |   ●   |
     |     ● |	
      -------		
			""";

String dice4="""  
			
			   -------
		   | ●   ● |	
		   |       |
     | ●   ● |	
      -------		
			""";

String dice5="""  
			
			   -------
		   | ●   ● |	
		   |   ●   |
     | ●   ● |	
      -------		
			""";

String dice6="""  
			
			   -------
		   | ●   ● |	
		   | ●   ● |
     | ●   ● |	
      -------		
			""";

switch(roll) {
case 1-> System.out.print(dice1);
case 2-> System.out.print(dice2);
case 3-> System.out.print(dice3);
case 4-> System.out.print(dice4);
case 5-> System.out.print(dice5);
case 6-> System.out.print(dice6);

default -> System.out.println("INVALID ROLL");
}
	}

}
