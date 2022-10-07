package Teckarch.Day2;

public class LeapYear {
	public static boolean Leap(int year) {
		boolean leap = false;
		if (year % 4 == 0) {
			if (year %100 == 0) {
				if(year % 400 == 0) 
				leap = true;
				else
					leap = false;
			}
			else
				leap = true;
		}
		return leap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year =2000;
		boolean l = Leap(year);
		System.out.println(year+ " is a leap year: "+l);

	}

}
