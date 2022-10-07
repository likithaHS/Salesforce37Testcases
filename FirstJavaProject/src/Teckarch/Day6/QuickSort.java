package Teckarch.Day6;

public class QuickSort {
	
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
		for (int i : inputArray) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		int[] a = new int[] {4,5,5,5,-1,0,5,1,2,3};;
		System.out.println("Input Array is:");
		printArray(a);
		System.out.println("\nAfter Sort:");
		sorting(a,0,a.length-1);
		printArray(a);

	}

}
