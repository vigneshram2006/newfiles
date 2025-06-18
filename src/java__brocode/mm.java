package java__brocode;

import java.util.*;
import javax.sound.sampled.*;
import java.io.*;

public class mm {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\vr728\\git\\repository2\\java__brocode\\src\\music.wav.wav";  // Adjust if necessary
        File file = new File(filepath);
        
        if (!file.exists()) {
            System.out.println("Error: File not found at " + filepath);
            return;
        }

        try (Scanner scan = new Scanner(System.in);
             AudioInputStream audio = AudioSystem.getAudioInputStream(file)) {
            
            Clip clip = AudioSystem.getClip();
            clip.open(audio);

            String response = "";
            while (!response.equals("Q")) {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");
                
                response = scan.nextLine().trim().toUpperCase();
                
                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice, try again.");
                }
            }

            System.out.println("No problem!");

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Error: Unsupported audio file format.");
        } catch (LineUnavailableException e) {
            System.out.println("Error: Audio line unavailable.");
        } catch (IOException e) {
            System.out.println("Error: Something went wrong while accessing the file.");
        } 
        finally{
        	System.out.println("bye!");
        }}
}
