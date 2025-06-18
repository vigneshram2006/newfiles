package java__brocode;

class library{
	String name;
	int year;
	book[] books;
	
	library(String name,int year,book[]books){
		this.name=name;

		
		this.year=year;
		this.books=books;
		
		
	}
	void displayinfo() {
		System.out.println("the "+this.name+" is establised in "+this.year);
		System.out.println("Books available: ");
		for(book Books:books) {
		System.out.println(Books.display());
		
	}
	}
	
	
}
class book{
	String title;
	int pages;
	
	book(String title,int pages){
		this.pages=pages;
		this.title=title;
		
	}
	String display() {
		
		return this.title+" ("+this.pages+" pages)";
	}
}
public class aggragation {

	public static void main(String[] args) {
		book Book1 = new book("the authur",280);
		book Book2 = new book("the amazing",188);
		book Book3 =new book("titanic",300);
		
		book[] books= {Book1,Book2,Book3};
		
		library Library= new library("new library",1989,books);
		
		Library.displayinfo();
		
	}

}
