package Teckarch.Day9;

import java.util.ArrayList;
import java.util.Collections;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myArray = new ArrayList<>();
		myArray.add(70);
		myArray.add(20);
		myArray.add(40);
		myArray.add(60);
		myArray.add(30);
		System.out.println("Before Sorting\n" +myArray);
		Collections.sort(myArray);
	    System.out.println("After Sorting\n"+myArray);
		

	}

}
