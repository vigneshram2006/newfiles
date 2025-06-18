package java__brocode;
import java.io.FileReader;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class bufferedreader {
	public static void main(String[] args) {
		String filepath="C:\\Users\\vr728\\OneDrive\\Desktop\\survive.txt";		
		try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
			String line;
			while((line=reader.readLine()) !=null) {
				System.out.println(line);
				
			}
			
		} 
		catch(FileNotFoundException e){
			System.out.println("file not found!");
			
		}
		catch(IOException e) {
			System.out.println("somethig went wrong");
			
		}
		
	}

}
