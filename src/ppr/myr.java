package ppr;

public class myr implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				
				System.out.println("thread was interrupted");
			}
			if(i==5) {
				System.out.println("time's up");
				System.exit(0);
			}
		}
		
	}
	
	

}
