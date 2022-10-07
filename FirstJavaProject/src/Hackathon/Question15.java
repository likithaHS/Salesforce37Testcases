package Hackathon;

import java.util.Scanner;

public class Question15 {
    public static void uniqueString(String str) {
    	String[] strArray = str.split(" ");
    	System.out.println("Unique words in the string are");
    	for (int i =0;i<strArray.length;i++) {
    		boolean unique =true;
    		for(int j =0;j<strArray.length;j++) {
    			if(i!=j && (strArray[j].equals(strArray[i]))) {
    				unique = false;
    				break;
    	      }
    			
    		}
    		if (unique) {
    			System.out.println(strArray[i]);
    		}
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String:");
		String str = sc.nextLine();
		uniqueString(str);
		sc.close();

	}

}
