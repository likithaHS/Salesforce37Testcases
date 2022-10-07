package Hackathon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question5 {
	
	public static void unique(int[] a) {
		System.out.println("Unique elements in the array is");
		for (int i = 0; i<a.length;i++) {
			boolean unique =true;
			for (int j =0;j<a.length;j++)
			{
			   if(i !=j && a[j]== a[i]) {
				   unique = false;
				   break;  
			   }
			}
			if (unique) {
				System.out.println(+a[i]);
				
			}
		}
	}
	public static void dupcount(int[] a) {
		System.out.println("Duplicate count");
		System.out.println("number\tcount");
	HashMap <Integer,Integer> op = new HashMap<>();
	for (int  i:a) {
		if (op.containsKey(i)) {
			op.put(i,op.get(i)+1);
			
		}else
		{
			op.put(i, 1);
		}
		
	}
	for (Map.Entry entry :op.entrySet()) {
		System.out.println(entry.getKey()+"\t "+entry.getValue());
	}

}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array:");
		for(int i = 0 ;i<n;i++) {
			a[i] = sc.nextInt();
			}
		unique(a);
		dupcount(a);
		
		sc.close();

	}

}
