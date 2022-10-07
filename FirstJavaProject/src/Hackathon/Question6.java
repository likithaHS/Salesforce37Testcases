package Hackathon;


	import java.util.Scanner;

	public class Question6 {
		
		public static int[] sort(int[] a)
		{
			int min,temp;
			
		   for (int i =0;i<a.length-1;i++) {
			    min =i;
			   for (int j =i+1;j<a.length;j++) {
				   if (a[j]<a[min])
				   {
					   min =j;
				   }
			   }
			   temp = a[i];
			   a[i] = a[min];
			   a[min]= temp;
			   
		   }
		   return a;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of the array");
			int n = sc.nextInt();
			int[] a = new int[n];
			System.out.println("Enter the array:");
			for(int i = 0 ;i<n;i++) {
				a[i] = sc.nextInt();
				}
			System.out.println("Array before Sorting:");
			for (int i: a) {
			System.out.print(i+" ");

		}
			System.out.println();
			System.out.println("Array after sorting:");
			int b[] = sort(a);
			for (int i: b) {
				System.out.print(i+" ");
			}
	       sc.close();
		}

	}



