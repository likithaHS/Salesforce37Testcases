package Hackathon;

import java.util.Scanner;

public class Question17 {
	public static int integerCount(String str) {
		int count =0;
		for (int i =0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i)))
			count++;
		}

		return count;
	}
	public static int upperCaseCount(String str) {
		int count =0;
		for (int i =0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i)))
			count++;
		}
		return count;
	}
	public static int lowerCaseCount(String str) {
		int count =0;
		for (int i =0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i)))
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String str = sc.nextLine();
		System.out.println("The count of Integers in the given string is: "+integerCount(str));
		System.out.println("The count of uppercase in the given string is: "+upperCaseCount(str));
		System.out.println("The count of lowercase in the given string is: "+lowerCaseCount(str));
		sc.close();
		
		
	}

}
