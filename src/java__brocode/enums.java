package java__brocode;

public enum enums {
 SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
	
	private final int daynumber;
	enums(int daynumber ){
		this.daynumber = daynumber;
		
	}
	
	public int getdaynumber() {
		return this.daynumber;
	}
 }
