package java__brocode;

import java.util.*;


public class loop {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int rows;
	int columns;
	char symbol;
	
	System.out.print("Enter no.of rows:");
	rows=scan.nextInt();
	
	System.out.print("Enter no.of columns:");
	columns=scan.nextInt();
	
	System.out.print("Enter the symbol to use: ");
	symbol=scan.next().charAt(0);
	
	for(int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			System.out.print(symbol);
		}
		System.out.println();
	}
	
	
	scan.close();	
	}

}
