package Teckarch.Day9;

import java.util.ArrayList;
import java.util.LinkedList;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("abc");
		al.add("bcd");
		al.add("xyz");
		al.add("bcd");
		System.out.println("Array list before removing dulicate is\n"+al);
		ArrayList<String> newal = new ArrayList<String>();
		for(String ele: al) {
			if(!newal.contains(ele)) {
				newal.add(ele);
			}
			
		}
		
		System.out.println("Array list after removing dulicate is\n"+newal);

	}

}
