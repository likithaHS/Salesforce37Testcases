package Hackathon;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the input");
	String str = sc.nextLine();
	System.out.println("Input in string:"+str);
	System.out.println("After integer conversion:"+Integer.parseInt(str));
	sc.close();

	}

}
