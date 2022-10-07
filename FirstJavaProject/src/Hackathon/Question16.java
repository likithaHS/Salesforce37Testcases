package Hackathon;

import java.util.Scanner;

public class Question16 {
	public static void remove(String str,String c) {
		int present =str.indexOf(c,0);
		//int r =' ';
		if (present == -1) {
			System.out.println("The Chareter is not present in the input string");
		}else
		{
			String str1= str.replaceAll(c, "");
			System.out.println("The String after removing the charcter\n"+str1);
		}
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String");
		String str = sc.nextLine();
		System.out.println("Enter the charter that need to be removed from the string");
		String c = sc.nextLine();
         remove(str,c);
		System.out.println();
		sc.close();
		

	}

}
