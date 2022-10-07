package Hackathon;

import java.util.Scanner;

public class Question62 {
	public static void reverse(int[] a, int start, int end) {
		int i = start;
		int j = end;
		while (i < j) {
			int temp;
			temp = a[j];
			a[j] = a[i];
			a[i] = temp;

			i++;
			j--;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int k = 4;
		for (int i = 0; i < a.length; i += k) {
			// for (int i =0; (i+k-1) <a.length;i+=k) {
			reverse(a, i, Math.min(a.length - 1, i + k - 1));
			// reverse(a, i, i+k-1);
		}
		System.out.println("Array after reverse");
		for (int ele : a) {
			System.out.print(ele + " ");
		}
		sc.close();

	}

}
