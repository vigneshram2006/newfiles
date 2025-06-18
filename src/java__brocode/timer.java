package java__brocode;
import java.util.*;


public class timer {
	public static void main(String[] args) {
	
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			int count =10;
			
			@Override
			public void run() {
				System.out.println("Hello!!!");
				count--;
				
				if(count<=0){
					System.out.println("TASK COMPLETED!!");
					timer.cancel();
					}
				}
		};
		
		timer.schedule(task, 000,200);
		
	}

}
