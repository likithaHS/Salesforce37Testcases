package Hackathon;

import java.util.Scanner;

public class Question26 {
	public static void merge(int[] a1, int[] a2) {
		int i = a1.length - 1;
		int j = a2.length - 1;
		int k = 5;
		while (j >= 0 && i >= 0 && k >= 0) {
			if (a1[k] > a2[j]) {
				a1[i] = a1[k];
				k--;
				i--;
			} else if (a1[k] < a2[j]) {
				a1[i] = a2[j];
				i--;
				j--;
			}

		}
		System.out.println("The merged array is");
		for (int ele : a1) {
			System.out.print(ele + " ");
		}
	}

	public static void main(String[] args) {
		int n = 10, m = 4;
		int[] a1 = new int[n];
		int[] a2 = new int[m];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st array");
		for (int i = 0; i < a1.length; i++) {
			a1[i] = sc.nextInt();
		}
		System.out.println("Enter 2st array");
		for (int i = 0; i < a2.length; i++) {
			a2[i] = sc.nextInt();
		}
		merge(a1, a2);
		sc.close();

	}

}
