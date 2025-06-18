package java__brocode;
import java.util.*;
import java.io.FileReader;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class hangmangame {
public static void main(String[] args) {
	
	String filepath="C:\\Users\\vr728\\OneDrive\\Desktop\\words.txt";
	ArrayList<String> words=new ArrayList<>();
	
	try (BufferedReader reader= new BufferedReader (new FileReader(filepath))){
		String line;
		while((line=reader.readLine()) != null) {

		words.add(line.trim());
	}
		}
		
	catch(FileNotFoundException e) {
		System.out.println("file not found!");
		
	}
	catch(IOException e) {
		System.out.println("something wemt wrong!");
		
	}
	Random rand = new Random();
	String word=words.get(rand.nextInt(words.size()));
	
	
	// java hangman game
	


	Scanner scan = new Scanner (System.in);
	
	ArrayList<Character> wordstate = new ArrayList<>(); 
	int wrongguess=0;
	
	for(int i=0;i<word.length();i++) {
		wordstate.add('_');
		
	}
	System.out.println("****************************");
	System.out.println("WELCOME TO JAVA HANGMAN GAME");
	System.out.println("****************************");
	
	while(wrongguess<7) {
		
		System.out.print(getHangmanArt(wrongguess));
		System.out.print("word: ");
		
		for(char c :  wordstate) {
			System.out.print(c+" ");
			
		}
		System.out.println();
		
		System.out.print("Guess a letter: ");
		char guess = scan.next().toLowerCase().charAt(0);
		
		if (word.indexOf(guess)>= 0) {
			System.out.println("correct guess!");
			
			for(int i=0;i<word.length();i++) {
				if(word.charAt(i)==guess) {
					wordstate.set(i, guess);
					
				}
				
			}
			if(!wordstate.contains('_')) {
			
				System.out.println(getHangmanArt(wrongguess));
				System.out.println("YOU WIN!");
				System.out.println("the word was:"+word);
				break;
				
			
			}
			
		}
		else {
			wrongguess++;
			System.out.println("wrong guess!");
		}
		
	}
	if(wrongguess>=7) {
		System.out.print(getHangmanArt(wrongguess));
		System.out.println("Game over!");
		System.out.println("the  word was "+ word);
	}
scan.close();

}
static String getHangmanArt (int wrongGuess) {
	return switch(wrongGuess) {
	    case 0-> """ 
			
			
			
			     """;
	    case 1-> """ 
	     		  o
			
			
			     """;
	    case 2-> """ 
	              o
	              |
	
	             """;
	    case 3-> """ 
                  o
                 /|   

                 """;
	    case 4-> """
	    		  o
	    		 /|\\
	    		
	    		 """;
	    case 5-> """
	    		  o
	    		 /|\\
	    		 /
	    		 """;
	    case 6-> """
	    		  o
	    		 /|\\ 
	    		 / \\
	    		 """;
	default -> " ";
	};
	
}
}
