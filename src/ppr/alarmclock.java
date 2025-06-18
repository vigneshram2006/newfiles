package ppr;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;


public class alarmclock {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	DateTimeFormatter formatter= DateTimeFormatter.ofPattern("HH:mm:ss");
	LocalTime alarmTime=null;
	String filepath="/ppr/music.wav";
	while(alarmTime==null) {
		
	
	try{ 
		
	 
	System.out.print("enter an alarm time (HH:MM:SS):");
	String inputTime=scan.nextLine();
	
	alarmTime=LocalTime.parse(inputTime, formatter);
	System.out.println("alarm time set for "+inputTime);
		
	} 
	catch(DateTimeParseException e) {
		System.out.println("invalid format please use HH:MM:SS");
	}
	}
	
	
	altimer alarm=new altimer(alarmTime,filepath,scan);
	Thread altimer=new Thread(alarm);
	altimer.start();
	
	
}
}
