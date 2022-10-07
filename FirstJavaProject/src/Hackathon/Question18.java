package Hackathon;

import java.util.Scanner;

public class Question18 {

	public static void duplicate(String str) {
		char[] strchar = str.toCharArray();
		int n =strchar.length;
		int[] count =new int[n];
		System.out.println("Duplicate charcter in input string is");
		for (int i =0;i<n;i++) {
			count[i]=1;
			for (int j=i+1;j<n;j++) {
				if (i!= j && strchar[j] ==strchar[i]) {
					count[i]++;
					strchar[j]='X';
				}
			}
			
		}
		for (int i =0;i<count.length;i++) {
		if (strchar[i] !=' ' && strchar[i] !='X' && count[i]>=2) 
		{
			System.out.println(strchar[i]);
		}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String str = sc.nextLine();
		duplicate(str);
		sc.close();
		

	}

}
