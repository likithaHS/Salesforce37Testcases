package Hackathon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question24 {

	public static ArrayList<ArrayList<Integer>> findConsective(int n) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for (int i = 1; i < n; i++) {
			int sum = i;
			ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.asList(i));
			for (int j = i + 1; j < n && sum <= n; j++) {
				temp.add(j);
				sum = sum + j;
				if (sum == n) {
					result.add(temp);
					break;
				}
			}
		}
		return result;
	}

	public static void printElements(ArrayList<ArrayList<Integer>> result) {
		System.out.println("To print consicutive sum number combination");
		for (ArrayList<Integer> list : result) {
			System.out.println("Combination");
			for (Integer ele : list) {
				System.out.print(ele + " ");
			}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> result = findConsective(n);
		printElements(result);
		sc.close();

	}

}
