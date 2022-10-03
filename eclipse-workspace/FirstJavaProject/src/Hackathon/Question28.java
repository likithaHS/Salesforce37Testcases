package Hackathon;

import java.util.Scanner;

public class Question28 {


		public static int Fact(int N) {
			if ( N == 0 || N == 1)
			return 1;
			else
				return N * Fact(N-1);
		}

		public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the value of N");
		   int N = sc.nextInt();
		   int result = Fact(N);
			System.out.println("The Factorial of "+N+ " is "+result);
			sc.close();
			

	}

}
