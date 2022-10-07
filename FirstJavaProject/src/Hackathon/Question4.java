package Hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
	public static void palindrome(int[] a) {
		int[] b = new int[a.length];
		int j = a.length;
		for(int i = 0; i <a.length ;i++) {
			
			b[j-1]=a[i];
			j--;
		}
		System.out.println("Array after reverse");
		for (int i: b) {
			System.out.print(i+" ");
		}
	    System.out.println();
		
		if (Arrays.equals(a,b)) {
			System.out.println("The Array is palindrome");
		}
		else
			System.out.println("Array is not a palindrome");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array:");
		for(int i = 0 ;i<n;i++) {
			a[i] = sc.nextInt();
			}
		palindrome(a);
     sc.close();

	}

}
