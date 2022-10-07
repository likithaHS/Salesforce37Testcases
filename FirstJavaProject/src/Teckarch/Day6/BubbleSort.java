package Teckarch.Day6;

public class BubbleSort {
	public static int[] sortArray(int[] a) {
		int temp;
		int n = a.length;
		for (int i =0 ; i<n-1;i++) {
			for (int j =0;j<n-1-i;j++) {
				if (a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1]= temp;
				}
			}
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
