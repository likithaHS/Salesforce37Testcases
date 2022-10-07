package Teckarch.Day2;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array");
		for (int i =0 ;i <a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("The array enter by User");
		for (int i =0 ;i <a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	    sc.close();
	}

}
