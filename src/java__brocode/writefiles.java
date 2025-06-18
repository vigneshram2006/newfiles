package java__brocode;
import java.io.FileWriter;
import java.util.*;
import java.io.*;



public class writefiles {

	public static void main(String[] args) {
		String filepath="C:\\\\Users\\\\vr728\\\\OneDrive\\\\Desktop\\\\test.txt";
		String content="""
				
				i like the pizza
				i really love it
				could you buy a pizza for me 
				
 """;		
	
		try(FileWriter writer = new FileWriter(filepath)){
			writer.write(content);
			System.out.println("file has been written successfully!");
			
		}
		catch(FileNotFoundException e) {
			System.out.println("could  not locate the file ");
			
		}
		catch(IOException e) {
			System.out.println("could not write the file");
			
		}
		
		
		
	}

}
