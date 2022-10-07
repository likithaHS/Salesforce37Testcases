package Hackathon;

import java.util.Scanner;

public class Question12 {
	
	public static void StringPalindrome(String str) {
		StringBuilder str1 = new StringBuilder(str);
		if( str1.reverse().toString().equals(str) && str.length()>2) {
			System.out.println("The Input is Palindrome");
		}
		else
			System.out.println("The Input is not a Palindrome");
			
		//System.out.println(str1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		StringPalindrome(str);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		String str1 = String.valueOf(a);
		StringPalindrome(str1);
		sc.close();

	}

}
