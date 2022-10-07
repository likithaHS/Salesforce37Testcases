package Hackathon;

import java.util.Scanner;

public class Question27 {
	
	public static void sorting(int[] a ,int lowIndex,int highIndex) {
		if(lowIndex>=highIndex) {
			return;
		}
		int pivote = a[highIndex];
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		while (leftPointer<rightPointer) {
			while(a[leftPointer]<=pivote && leftPointer<rightPointer) {
				leftPointer++;
			}
			while(a[rightPointer]>=pivote && leftPointer<rightPointer){
				rightPointer--;
			}
			swap(a,leftPointer,rightPointer);
			
		}
		
		swap(a,leftPointer,highIndex);
		sorting(a,lowIndex,leftPointer-1);
		sorting(a,leftPointer+1,highIndex);
		
	}
	
	private static void swap (int[] a, int index1, int index2) {
		int temp =a[index1];
		a[index1] = a[index2];
		a[index2] =temp;
		
	}
	public static void printArray(int[] inputArray) {
		System.out.println("Sorted array using quick sort is:");
		for (int i : inputArray) {
			System.out.print(i+" ");
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
		sorting(a,0,a.length-1);
        printArray(a);
		sc.close();

	}

}
