package Hackathon;

import java.util.Scanner;

public class Question25 {

	public static int[] sortArray(int[] inputArray) {

		for (int i = 1; i < inputArray.length; i++) {
			int currentValue = inputArray[i];
			int j = i - 1;
			while (j >= 0 && inputArray[j] > currentValue) {
				inputArray[j + 1] = inputArray[j];
				j--;
			}
			inputArray[j + 1] = currentValue;
		}
		return inputArray;
	}

	public static void binarySearch(int[] result, int key) {
		int n = result.length;
		boolean found = false;
		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (key < result[mid]) {
				high = mid - 1;
			} else if (key > result[mid]) {
				low = mid + 1;
			} else if (key == result[mid]) {
				found = true;
				System.out.println("The key " + key + " is present at index " + mid);
				break;
			}
		}
		if (!found) {

			System.out.println("The key " + key + " is not found is the given array");
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
		// sc.nextLine();
		int[] b = sortArray(a);

		System.out.println("Sorted input array is");
		for (int i : b) {
			System.out.print(i + " ");
		}
		System.out.println("\n\nEnter the element to be searched in the array");
		int ele = sc.nextInt();
		binarySearch(b, ele);
		sc.close();

	}

}
