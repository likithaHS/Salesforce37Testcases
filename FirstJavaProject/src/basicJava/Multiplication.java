package basicJava;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a = sc.nextInt();
		
		System.out.println(a+ " muplication table is as below:");
		for (int i =1 ; i<=10;i++) {
			int res = a *i;
			System.out.println(a+ " * " +i+ " = " +res);
		}
     sc.close();
	}

}
