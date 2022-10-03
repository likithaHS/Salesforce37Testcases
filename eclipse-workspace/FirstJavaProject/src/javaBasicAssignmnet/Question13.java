package javaBasicAssignmnet;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number:");
		int n = sc.nextInt();
		String monthname;
        switch(n){
        	case 1 : monthname = "January";
        	         break;
        	case 2 : monthname = "February";
        	         break;
        	case 3 : monthname = "March";
        	         break;
        	case 4 : monthname = "April";
	         break;
        	case 5 : monthname = "May";
	         break;
        	case 6 : monthname = "June";
	         break;
        	case 7 : monthname = "July";
	         break; 
        	case 8 : monthname = "August";
	         break;
        	case 9 : monthname = "September";
	         break;
        	case 10 : monthname = "October";
	         break;
        	case 11 : monthname = "November";
	         break;
        	case 12 : monthname = "December";
	         break;
	         default:
	        	 monthname ="invalid";
	        	 
	        	 
        }
        
        System.out.println("Month name for the given month number: "+n+ " is "+monthname);
        sc.close();
	}

	}


