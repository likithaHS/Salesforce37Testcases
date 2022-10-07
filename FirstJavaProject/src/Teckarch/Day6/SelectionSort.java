package Teckarch.Day6;

public class SelectionSort {
	public static int[] sortArray(int[] a) {
		int temp,min;
		int n = a.length;
		for (int i =0;i<n-1;i++) {
			min =i;
	    for (int j =i+1;j<n;j++) {
	    	if (a[j]<a[min]) {
	    		min = j;
	    	}
	    }
	    	temp = a[i];
	    	a[i] = a[min];
	    	a[min]= temp;
	    
			
		}
		return a;
		
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
