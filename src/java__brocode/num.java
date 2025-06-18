package java__brocode;
import java.util.*;


public class num {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
	//break
		for(int i=0;i<=10;i++) {
		if(i==5) {
			break;
		}
		System.out.print(i+" ");
		
		}
		System.out.println("");
		//continue
		for(int j=0;j<=10;j++) {
			if(j==7) {
				continue;
			}
			System.out.print(j+" ");
		}
	
}}