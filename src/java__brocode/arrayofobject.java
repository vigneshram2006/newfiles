package java__brocode;

public class arrayofobject {

	public static void main(String[] args) {
	new truck(" scania","blue");
		new truck(" volvo"," white");
		 new truck(" TATA"," green");
		
		
		
		truck[] trucks= {new truck(" scania","blue"),
		                 new truck(" volvo"," white"),
		                 new truck(" TATA"," green"),
		                 new truck(" toyota ","white"),
		                                            };

		for(truck Truck: trucks) {
		Truck.color="black";
		} 
		
		for(truck Truck: trucks) {
			Truck.drive();
		}
  
     	}

}
