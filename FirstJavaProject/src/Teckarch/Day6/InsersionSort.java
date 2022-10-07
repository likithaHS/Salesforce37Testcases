package Teckarch.Day6;

public class InsersionSort {
	public static int[] sortArray(int[] inputArray) {
	    
    	for (int i=1;i<inputArray.length;i++) {
    		int currentValue=inputArray[i];
    		int j =i-1;
    		while (j >=0 && inputArray[j]>currentValue) {
    			inputArray[j+1] = inputArray[j];
    			j--;
    		}
    		inputArray[j+1] =currentValue;
    	}
    	return inputArray;
    }
	public static void main(String[] args) {
		int[] a = new int[] {4,5,1,2,3};
		System.out.println("input Array is:");
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		int n = a.length;
		int[] result = new int[n];
		result = sortArray(a);
		System.out.println("Sorted array is:");
		for (int i : result) {
			System.out.print(i+" ");
		}

	}

}
