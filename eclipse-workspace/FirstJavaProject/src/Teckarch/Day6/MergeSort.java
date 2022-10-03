package Teckarch.Day6;

public class MergeSort {
	
	public static void mergeSort(int[] inputArray) {
		int inputLength = inputArray.length;
		if (inputLength < 2) {
			return;
		}
		int midIndex = inputLength/2;
		int[] leftArray = new int[midIndex];
		int[] rightArray = new int[inputLength-midIndex];
		for (int i =0;i<midIndex;i++) {
			leftArray[i] = inputArray[i];
		}
		for (int i =midIndex;i<inputLength;i++) {
			rightArray[i-midIndex] = inputArray[i];
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(inputArray,leftArray,rightArray);
	}
	private static void merge(int[] inputArray,int[] leftArray,int[] rightArray) {
		int leftLength = leftArray.length;
		int rightLength = rightArray.length;
		int i =0,j=0,k=0;
		while(i<leftLength && j<rightLength) {
			if (leftArray[i]<=rightArray[j]) {
				inputArray[k]=leftArray[i];
				i++;
			}else
			{ 
				inputArray[k]=rightArray[j];
				j++;
			}
			k++;	
		}
		while(i<leftLength) {
			inputArray[k]=leftArray[i];
			i++;
			k++;
		}
		while(j<rightLength) {
			inputArray[k]=rightArray[j];
			j++;
			k++;
		}
	}
	public static void printArray(int[] inputArray) {
		for (int i : inputArray) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		int[] a = new int[] {4,5,5,5,-1,0,5,1,2,3};
		System.out.println("Input Array is:");
		for (int i : a) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nAfter Sort:");
		mergeSort(a);
		printArray(a);
	}

}
