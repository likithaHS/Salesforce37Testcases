package Teckarch.Day5;

public class Question3 {
	public static int[] unique(int[] a, int n) {
		int[] uniq =new int[n];
		int index = 0;
		for(int i=0;i<n;i++) {
			boolean is_uniq = true;
			for(int j=0;j<n;j++) {
				if (i != j && a[i] == a[j]) {
					is_uniq = false;
					break;
				}
			}
			if (is_uniq) {
				uniq[index++] = a[i];
			}
		}
		return uniq;	
	}

	public static void main(String[] args) {
		
		int n =5;
		int[] a = new int[] {1,2,3,4,1};
		System.out.print("input array is:");
		for (int i =0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int[] uniq = new int[n];
		uniq = unique(a,n);
		System.out.println("unique element in the array is:" );
        for(int i:uniq ) {
        	System.out.print(i+ " ");
        }

	}

}
