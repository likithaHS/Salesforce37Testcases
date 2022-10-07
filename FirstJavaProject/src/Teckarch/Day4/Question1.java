package Teckarch.Day4;

import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		
		//convert array to string
		System.out.println("convert array to string");
		char[] charArray = new char[] {'T','E','C','K'};
		System.out.println("Array to string:"+Arrays.toString(charArray)+"\n\n");
		
		//convert string to integer
		System.out.println("convert string to integer");
		System.out.print("String to integer conversion:");
		String str = "12345";
		System.out.println(Integer.parseInt(str)+"\n\n");
		
		//Find the char in a string at given location
		System.out.println("Find the char in a string at given location");
		String str1 ="hello java";
		System.out.println("The Charecter in the string at postion 4 in string "+str1+" is :"+str1.charAt(4)+"\n\n");
		
		//find the index of given character or substring(first character index)
		System.out.println("find the index of given character or substring first character index");
		System.out.println("1st occurance of char 'o' is present at postion " +str1.indexOf('o')+"\n\n");
	
		//check whether the given substring present in the given string or not
		System.out.println("check whether the given substring present in the given string or not");
		System.out.println("is str is present in str1 or not:"+str1.contains(str)+"\n\n");
		
		//9. check if two strings are the same ignoring their cases.
		System.out.println("compare two string ignoring cases");
		String str2 = "Hello";
		String str3 = "hello";
		System.out.println("str and str1 is same: "+str2.equalsIgnoreCase(str3)+"\n\n");
		
	}

}
