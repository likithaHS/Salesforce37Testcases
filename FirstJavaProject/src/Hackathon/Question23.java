package Hackathon;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		System.out.println("Enter the input:");
		Scanner input = new Scanner(System.in);
		if (input.hasNextInt())
			System.out.println("Enter input is an interger:"+input.nextInt());
		else if (input.hasNextBoolean())
			System.out.println("Enter input is an Boolean:"+input.nextBoolean());
		else if (input.hasNextLine())
			System.out.println("Enter input is an String:"+input.nextLine());
		input.close();

	}

}
