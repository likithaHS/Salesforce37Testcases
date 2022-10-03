package Teckarch.Day2;

public class Factorial {
	
	public static int Fact(int N) {
		if ( N == 0 || N == 1)
		return 1;
		else
			return N * Fact(N-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		int result = Fact(N);
		System.out.println("The Factorial of "+N+ " is "+result);
		

	}

}
