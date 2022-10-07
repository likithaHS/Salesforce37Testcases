package Hackathon;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String:");
		String str = sc.nextLine();
		String[] strArray = str.split(" ");
		System.out.println("String after reverse");
		for (int i = strArray.length-1;i>=0;i--) {
		System.out.print(strArray[i]+" ");
		}
	
		 sc.close();

	}

	}


