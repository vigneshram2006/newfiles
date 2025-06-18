package java__brocode;

class fourwheeler{
	String model;
	String color;
	String brand;
	int year;
	
	fourwheeler(String brand,String model,int year,String color){
		this.model=model;
		this.color=color;
		this.brand=brand;
		this.year=year;
		
	}
	@Override
	public String toString() {
		return this.brand+" "+this.model+" "+this.year+" "+this.color;
		
	}
}
public class tostring {

	public static void main(String[] args) {
		fourwheeler f1= new fourwheeler("rollsroyce","ghost",2020,"white");
		fourwheeler f2= new fourwheeler("bmw","i4",2021,"black");
		System.out.println(f1);
		System.out.println(f2);
		
	}

}
