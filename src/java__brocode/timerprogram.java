package java__brocode;
import java.util.*;


public class timerprogram {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("enter the count:");
	Timer timer= new Timer();
	TimerTask task =  new TimerTask() {
		
		int count=scan.nextInt();
		@Override
		public void run() {
			
			
			System.out.println(count);
			count--;
			if(count<0) {
				System.out.println("HAPPY NEWYEAR!");
				timer.cancel();
			}
		
		}
	};
	
	timer.schedule(task, 0,1000);
	
	
	
}
}
