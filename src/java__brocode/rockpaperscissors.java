package java__brocode;   //rock paper scissor game

import java.util.*;

public class rockpaperscissors {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		Random rand = new Random();
		
		String[] choices= {"rock","paper","scissors"};
		String playerschoice;
		String computerschoice;
		String playagain="yes";
		do{System.out.print("enter your move(rock,paper,scissors): ");
		playerschoice=scan.nextLine().toLowerCase();
		
		if(!playerschoice.equals("rock")&&
				!playerschoice.equals("paper")&&
				!playerschoice.equals("scissors")) {
			System.out.println("invaild move");
			continue;
		}
		
		computerschoice=choices[rand.nextInt(3)];
		System.out.println("computers choice: "+ computerschoice);
		
		if(playerschoice.equals(computerschoice)) {
			System.out.println("its a tie!");
			
		}else if((playerschoice.equals("rock")&& computerschoice.equals("scissors")) ||
				(playerschoice.equals("paper")&&computerschoice.equals("rock")) ||
		(playerschoice.equals("scissors")&& computerschoice.equals("paper"))) {
			System.out.println("YOU WIN!");
			
		}else {
			System.out.println("YOU LOSE!");
			
		}
		
		
		System.out.print("you want to play again(yes/no): ");
		playagain=scan.nextLine();
			
		}while(playagain.equals("yes"));
		
		System.out.println(" THANKS FOR PLAYING!");
	
		
		
	scan.close();}

}
