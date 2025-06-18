package java__brocode;

public class caR1 {

	String Model;
	int year;
	EnginE Engine;
	
	
	caR1(String model,int year,String type){
		
		this.Model=model;
		this.year=year;		
		this.Engine = new EnginE(type);
		
		
		
	}
	
	void start() {
		System.out.println(" the "+this.Model+" is running ");
	}

}
