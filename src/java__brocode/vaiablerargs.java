package java__brocode;

public class vaiablerargs {

	public static void main(String[] args) {
		
		
		
		System.out.println(average(24,45,12,58,89,57,56,765,61,86));
	}
	static double average(int...numbers) {
		double sum=0;
		for(double number:numbers) {
			sum+=number;
			// sum = sum + numbers
	
		}
		return sum/numbers.length;
	
	}
}
