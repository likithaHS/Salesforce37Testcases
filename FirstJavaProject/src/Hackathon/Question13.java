package Hackathon;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String:");
		String str = sc.nextLine();
		StringBuilder str1 = new StringBuilder(str);
		 str1 = str1.reverse();
		 System.out.println("String after reverse\n"+str1);
		 sc.close();

	}

}
