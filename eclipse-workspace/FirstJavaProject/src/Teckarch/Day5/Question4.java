package Teckarch.Day5;

public class Question4 {
	public static int[] evenNumber(int[] a, int n) {
		int[] even = new int[n];
		for (int i=0 ; i<n; i++) {
			if (a[i] % 2 == 0) {
				even[i] = a[i];
			}
			else
				continue;
		}
		return even;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int[] a = new int[] {1,2,3,4,1};
		System.out.print("input array is:");
		for (int i =0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int[] even = new int[n];
		even = evenNumber(a,n);
		System.out.println("Even elements in the array is:" );
        for(int i:even ) {
        	System.out.print(i+ " ");
        }
		

	}

}
