package java__brocode;
import java.util.*;
	
public class quizprogram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] questions= {"Q1. what was the first programming language?",
				             "Q2. who is known as father of all computers?",
				             "Q3. when was the facebook launchad?",
				             "Q4. what is brain of the computer?",
				             "Q5. who is the ceo of google?"};	
		String[][] options= {{"1. COBOL","2. C","3. C++","4. fortran"},
				             {"1. steve jobds","2. jeff bezoz","3. charles babbage ","4. andrew garfield "},
				             {"1. 2000","2. 2004","3. 2006","4. 2008"},
				             {"1. CPU","2. hard disk","3. RAM","4. GPU"},
		                     {"1. tony stark","2. timcook","3. sundar pichai","4. Elonmusk"}};
		
		int[] answers= {4,3,2,1,3};
		int score=0;
		int guess=0;
		
		System.out.println(" ******************************");
		System.out.println(" WELCOME TO THE JAVA QUIZ GAME!");
		System.out.println(" ******************************");
		
		for(int i=0;i<questions.length;i++) {
			System.out.println(questions[i]);
			
			for(String option:options[i]) {
				System.out.println(option);
			}
			System.out.println("Enter your guess: ");
			guess=scan.nextInt();
			
			if(guess==answers[i]) {
				System.out.println("********");
				System.out.println("CORRECT!");
				System.out.println("********");
				score++;
			}else {
				System.out.println("********");
				System.out.println(" WRONG! ");
				System.out.println("********");
			}

		
		}
		System.out.println("your final score is: "+score+" out of "+questions.length);
	scan.close();
	}

}
