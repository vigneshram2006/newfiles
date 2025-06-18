package java__brocode;

class bmw implements vehicle{
	@Override
	public void go() {
		System.out.println("you drive the car");
	}
}
class boat implements vehicle{
	@Override
	public void go() {
		System.out.println("you sail the boat");
	}
	
} 
class scooter implements vehicle{
	@Override
	public void go() {
		System.out.println("you ride the scooter");
	}
	
}
interface vehicle{
	void go();
}
public class poly {

	public static void main(String[] args) {
		bmw b= new bmw();
		scooter  s = new scooter();
		boat a = new boat();
		
		vehicle[] vehicles= {b,s,a};
		
		for(vehicle product:vehicles) {
			product.go();
		}
		
	}

}
