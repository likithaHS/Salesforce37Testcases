package Hackathon;

import java.util.Scanner;

public class Question2 {
	
	public static int factorial(int a) {
		int sum =1;
		if (a == 0 || a ==1)
			return 1;
		else {
			for (int i =1 ;i <=a;i++) {
				sum = sum*i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the value ");
	    int a = sc.nextInt();
	    System.out.println("The Factorial of "+a+ " is "+factorial(a));
	    sc.close();
	}

}
