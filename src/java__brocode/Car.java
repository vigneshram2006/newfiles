package java__brocode;

public class Car {
	

			String model="GTR " ;
			String make="turbo charge";
		    int year=2022;
			String fuel="petrol";
			boolean isRunning=false;
			int price=50000000;
			
			void start() {
				isRunning =true;
				System.out.println("you start the "+model+"engine");
			}
			void stop() {
				isRunning=false;
				System.out.println("you stop the "+model+"engine");
			}
	 
			
			void drive() {
				System.out.println("you drive the "+model+"car");
			}
			void brake() {
				System.out.println("you brake the  "+model+"car");
			}
}
