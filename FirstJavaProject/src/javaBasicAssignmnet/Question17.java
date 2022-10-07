package javaBasicAssignmnet;
import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = threeSum(a,b,c);
		int ave = average3(a,b,c);
		System.out.println("The sum of three numbers is :"+sum);
		System.out.println("The Average of three numbers is :"+ave);
		sc.close();
	}
	public static int threeSum(int x , int y, int z) {
		int sum;
		sum = x+y+z;
		return sum;
		
	}
	public static int average3(int x , int y, int z) {
		int ave;
		ave = (x+y+z)/3;
		return ave;
		
	}

}
