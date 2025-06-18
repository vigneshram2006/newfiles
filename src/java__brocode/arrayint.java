

package java__brocode;
import java.util.*;

public class arrayint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> marks= new ArrayList<Integer>();
		
		System.out.print("enter the # subjects  you have:");
		int subjects = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter the marks you scored in each subject: ");
		for(int i =1;i<=subjects;i++) {
			
			System.out.print("Enter #"+i+" subject score:");
			int score=scan.nextInt();
			marks.add(score);
			
			
			 
		}
		
		
		System.out.println(marks);
	}

}
