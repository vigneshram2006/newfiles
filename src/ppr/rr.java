package ppr;

public class rr {
	public static void main(String[] args) {
		
		Thread thread1= new Thread(new multithread(" what do you want "));
		Thread thread2= new Thread(new multithread(" nothing  "));
		
		System.out.println("game starts");
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("game over");
	
	}
	
	

}
