package Teckarch.Day5;

public class Question2 {

	public static int maxium(int[] a, int n) {
		int max = 0;
		for (int i =0;i<n;i++) {
			if (max < a[i]) {
				max= a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int[] a = new int[] {3,5,1,2,7};
		System.out.print("input array is:");
		for (int i =0;i<n;i++)
			System.out.print(a[i]+" ");
		 System.out.println();
		 int max = maxium(a,n);
       System.out.println("Maxium value in the given array is:"+max);

}
}
