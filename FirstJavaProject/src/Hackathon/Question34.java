package Hackathon;

import java.util.Scanner;

public class Question34 {
	
	public static void airthmatic(int a,int b) {
		int sum =0;
		System.out.println("Multiplication");
		for (int i = 1;i<=b;i++) {
			sum=sum+a;
		}
		System.out.println("a*b="+sum);
		int div=0;
		int temp =0;
		System.out.println("division");
		
		for (int i =1; i<a && div <a ;i++ ) {
			div=div+b;
			//System.out.println(div);
			temp++;
			//System.out.println(temp);
			
		}
		System.out.println("a/b="+temp);
		int sub =0;
		int temp1 = -b;
		System.out.println("Subtraction");
		sub = a+temp1;
		System.out.println("a-b="+sub);
		
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("Eneter the value of A");
    int a = scan.nextInt();
    System.out.println("Eneter the value of B");
    int b = scan.nextInt();
    airthmatic(a,b);
	}

}
