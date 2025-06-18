package java__brocode;


public class object {
	

	public static void main(String[] args) {
		
		Car car =new Car();
		
		System.out.println(car.isRunning);
		car.start();
		System.out.println(car.isRunning);
		car.drive();
		car.brake();
		car.stop();
		System.out.println(car.isRunning);
		
	}

}
