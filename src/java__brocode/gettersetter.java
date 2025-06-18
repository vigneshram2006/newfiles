package java__brocode;


class twowheeler{
    private  	final String model;
 private  String color;
	private   int price;
	
	
	twowheeler(String model,String color,int price){

		this.model=model;
		this.price=price;
		this.color=color;
	}
	String getmodel() {
		return this.model;
	}
	String getcolor() {
		return this.color;
	}
	String  getprice() {
		return "$"+this.price;
	}
	void setcolor(String color) {
		this.color=color;
		
	}
	void setprice(int price) {
		
		if(price<0) {
			System.out.println("price can't be less than zero");
			
		}else {
			this.price=price;
		}
		
		
	}
	
	
}
public class gettersetter {

	public static void main(String[] args) {
		twowheeler t= new twowheeler("supra","green",1000);
		t.setcolor("violet");
		t.setprice(-90);
	
		System.out.println(t.getcolor()+" "+t.getmodel()+" "+t.getprice());
		
	}

}
