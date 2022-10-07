package Teckarch.Day2;

import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the row size");
		int r = sc.nextInt();
		System.out.println("Enter the clm size");
		int c = sc.nextInt();
		int[][] a = new int[r][c];
		System.out.println("Enter the array");
		for (int i =0 ;i <r;i++) 
			for (int j=0;j<c;j++)
			a[i][j] = sc.nextInt();
		
		System.out.println("The array enter by User");
	for (int[] row : a) {
		for (int ele: row) {
	
			System.out.print(ele+ " " );
		}
		System.out.println();
	}
	
	    sc.close();

	}

}
