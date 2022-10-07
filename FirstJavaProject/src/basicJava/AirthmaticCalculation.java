package basicJava;
import java.util.Scanner;

public class AirthmaticCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Eneter two numbers:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res1 = a+b;
		int res2 = a-b;
		int res3 = a*b;
		int res4 = a/b;
		int res5 = a%b;
		
		//Int c = a+b;
		
		System.out.println(a+ " + "+b+ " = "+res1);
		System.out.println(a+ " - "+b+ " = "+res2);
		System.out.println(a+ " * "+b+ " = "+res3);
		System.out.println(a+ " / "+b+ " = "+res4);
		System.out.println(a+ " % "+b+ " = "+res5);
		sc.close();
	}

}
