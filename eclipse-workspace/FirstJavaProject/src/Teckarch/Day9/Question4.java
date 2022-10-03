package Teckarch.Day9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question4 {

	public static void main(String[] args) {
	LinkedList <String> myList = new LinkedList<>();
	myList.add("abc");
	myList.add("efg");
	myList.add("hij");
	myList.add("klm");
	myList.add("nop");

	System.out.println("Elemets in linkedlist is\n"+myList);
	List<String> myArray = new ArrayList<>(myList);
	System.out.println("Elemets inarraylist is");
	for(String i : myArray) {
		System.out.println(i+" ");
	}

	}

}
