package config;

import java.util.Calendar;

public class TestDate {
	
	static int targetDay=0,
			   targetMonth=0,
			   targetyear=0;
	
	static int currentDay=0,
			   currentMonth=0,
			   currentYear=0;
	
	static int jumoMonthsBy=0;
	
	static boolean increment = true;
	            

	public static void main(String[] args) {
		
		
		String dateToSet = "16/08/2015";
		
		getCurrentDatemonthandYear();
		System.out.print(currentDay+"   "+currentMonth+"  "+currentYear);
		
		
	}
	 public static void getCurrentDatemonthandYear() {
		 
		 Calendar cal = Calendar.getInstance();
		 currentDay = cal.get(Calendar.DAY_OF_MONTH);
		 currentMonth = cal.get(Calendar.MONTH)+1;
		 currentYear = cal.get(Calendar.YEAR);
		 
	 }

}
