package javaBasicAssignmnet;
import java.util.Scanner;


public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter th name:");
		String name = sc.nextLine();
		System.out.print("Enter the age:");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the gender:");
		String gender =sc.nextLine();
		System.out.println("\n\nThe deatils enter by User is as below");
		System.out.println("Name:"+name+"\n"+"Age:"+age+"\n"+"Gender:"+gender+"\n");
		
		sc.close();	

	}

}
