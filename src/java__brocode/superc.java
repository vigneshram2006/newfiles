package java__brocode;
class person {
	String first;
	String last;
	
	person(String first ,String last){
		this.first=first;
		this.last = last;
	}
	void showname() {

		System.out.println(this.first + " "+ this.last);
		
	}
	
}

class student extends person{

	double gpa;
	student(String first, String last,double gpa) {
		super(first, last);
		this.gpa=gpa;
		
	}
	void showname() {
		System.out.println(this.first+this.last);
	}
	void showgpa() {
		System.out.println(this.first+"'s gpa is "+this.gpa);
	}


}

class employee extends person{
	int salary;

	employee(String first, String last,int salary) {
		super(first, last);
		this.salary=salary;
		
		
	}

	void show_salary() {
		System.out.println(this.first+"'s"+" salary is "+this.salary);
	}
}
public class superc {
public static void main(String[] args) {
	
	person Person= new person(" jamie","smith ");
	Person.showname();
	

	
	student Student= new student("jack","sparrow",3.44);
    Student.showname();
    Student.showgpa();
    
    employee emp= new employee("thor","odinson",100000000);
    emp.show_salary();
}

}
