package ppr;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class altimer implements Runnable{
	private final LocalTime alarmTime ;
	private final String filepath;
	private final Scanner scan;
	
	
	altimer(LocalTime alarmTime,String filepath,Scanner scan){
		this.alarmTime=alarmTime;
		this.filepath=filepath;
		this.scan=scan;
	}

	@Override
	public void run() {
		
		
		while(LocalTime.now().isBefore(alarmTime)) {
			try {
				Thread.sleep(1000);
				LocalTime now=LocalTime.now();
				
				System.out.printf(" \r%02d:%02d:%02d",now.getHour(),now.getMinute(),now.getSecond());
				
			}catch(InterruptedException e) {
				System.out.println("thread was interrupted");
				
			}
		}
		System.out.println("\nalarm noice");
		playsound(filepath);
		
		
	}
	private void playsound(String filepath) {
		File audiofile =new File(filepath);
		try (AudioInputStream audiostream= AudioSystem.getAudioInputStream(audiofile)){
			
			Clip clip=AudioSystem.getClip();
			clip.open(audiostream);
			clip.start();
			
			
			System.out.print("press *enter* to stop the alarm:");
			scan.nextLine();
			clip.stop();
		} 
		catch (UnsupportedAudioFileException | IOException e) {
		 System.out.println("audio fie not supported");
		}
		catch(LineUnavailableException e) {
			System.out.println("error reading audio");
			
		}
	}
	

}
