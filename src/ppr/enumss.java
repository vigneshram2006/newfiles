package ppr;

public enum enumss {
	
	SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
	
	private final int daynumber;
	enumss(int daynumber){
		this.daynumber=daynumber;
		
	}
	public  int getdaynumber() {
		return this.daynumber;
	}

}
