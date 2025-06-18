package java__brocode;
 


abstract class shape{
	abstract double area();
	
	void display() {
		System.out.println("this is a shape");
	}
	
}
class circle extends shape{
	
	double radious;
	circle(double radious){
		this.radious=radious;
		
	}
	@Override
	double area() {
		return Math.PI*radious*radious;
		
	}
}
class triangle extends shape{
	
	double base;
	double height;
	triangle(double base, double height){
		this.base=base;
		this.height=height;
		
		
	}
	@Override
	double area() {
		return 0.5*base*height;
	}
}
class rectangle extends shape{
	double length;
	double width;
	
	rectangle(double length,double width){
		this.length=length;
		this.width=width;
		
	}
	@Override
	double area() {
		return length*width;
	}
}
public class abstractc {

	public static void main(String[] args) {
		circle C = new circle(5);
		triangle t = new triangle(1.5,2.4);
		rectangle r = new rectangle(15.2,20.4);
		
		System.out.println(C.area());
		System.out.println(r.area());
		
		
		
		
		
	}

}
