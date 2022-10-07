package javaBasicAssignmnet;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 234;
		System.out.println("The interger is :"+n);
		int sum = 0;
		while(n>0) {
			int digit = n%10;
			sum = sum + digit;
			n = n/10;
			
		}
		System.out.println("sum of the digits of an integer:" +sum);

	}

}
