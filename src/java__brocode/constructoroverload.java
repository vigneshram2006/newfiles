package java__brocode;

public class constructoroverload {
	public static void main (String[] args) {

	user user1= new user("spongebob");
	user user2=new user("patrick","pat001@yahoo.com");
	user user3= new user("sandy","san118@yahoo.com",10);
	user user4= new user();
	
	System.out.println(user1.username);
	System.out.println(user1.email);
	System.out.println(user1.age);
	
	System.out.println(user2.username);
	System.out.println(user2.email);
	System.out.println(user2.age);
	
	System.out.println(user3.username);
	System.out.println(user3.email);
	System.out.println(user3.age);

	System.out.println(user4.username);
	System.out.println(user4.email);
	System.out.println(user4.age);
	
	}

	
}
