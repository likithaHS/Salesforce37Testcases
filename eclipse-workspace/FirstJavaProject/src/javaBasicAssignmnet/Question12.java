package javaBasicAssignmnet;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Eneter the array:");
		for (int i = 0 ; i< n ; i++) {
			a [i] = sc.nextInt();
			
		}
		
		System.out.println("The array entereted by the user is:");
		for (int i= 0; i<n; i++){
			System.out.print(a[i]+ ",");
			
		}
sc.close();
	}

}
