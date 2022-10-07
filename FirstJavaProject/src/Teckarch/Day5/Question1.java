package Teckarch.Day5;

public class Question1 {

	public static int sum(int[] a,int n) {
		int sum = 0;
		for (int i =0;i<n;i++) {
			sum+=a[i];
		}
		return sum;
		
	}
	public static void main(String[] args) {
		int n = 5;
		int[] a = new int[] {1,2,3,4,5};
		System.out.println("Input array:");
		for(int i =0;i<n;i++)
		System.out.print(a[i]+" ");
		System.out.println();
		int sum = sum(a,n);
		System.out.println("The Sum of all the elements in the array is:"+sum);
		
		
	

	}
	}

