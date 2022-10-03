package javaBasicAssignmnet;
import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements in the array:");
		for (int i =0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("The array enter by user is :");
		for (int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int sum =0;
		System.out.print("The sum of elemets in the array is :");
		for (int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
        System.out.println(sum);
        sc.close();
	}

}
