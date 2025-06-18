package java__brocode;

public class truck {

	String color;
	String model;

	truck(String model,String color){
		this.color=color;
		this.model=model;
	}
	
     void drive() {
		System.out.println("you drive "+ this.color+" "+this.model);
	}
	
}
