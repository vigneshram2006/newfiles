package java__brocode;
import java.util.*;

public class average {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score=0;
		int subjects=0;
		int average=0;
		int total=0;
		
System.out.print("Enter # subjects you have:");
subjects=scan.nextInt();

System.out.println("Enter the marks you scored in each subject: ");

for(int i=1;i<=subjects;i++) {
	System.out.print("Enter #"+i+" subject mark:");
	score=scan.nextInt();
	total+=score;
	
	
	
}
average = total/subjects;
System.out.println("your average mark is: "+average);
	}

}
