package java__brocode;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class local {

	public static void main(String[] args) {
		LocalDateTime  datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		Instant instant=Instant.now();
		System.out.println(instant);
		
		
		LocalDateTime datetime1=LocalDateTime.now();
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
		String newdatetime=datetime1.format(formatter);
		System.out.println(newdatetime);
		
		
		
	}
}
