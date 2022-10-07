package Hackathon;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		boolean a = sc.nextBoolean();
		boolean b = sc.nextBoolean();
		boolean c = sc.nextBoolean();
		
		if( (a && b) || (a && c) || (b && c)) {
			System.out.println("at least two out of three Booleans are true");
		}
		else
			System.out.println("two out of three Booleans are not true ");
	sc.close();	
	}


}
