package Hackathon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person> {
	int height = -1;
	int weight = -1;

	Person(int ht, int wt) {
		this.height = ht;
		this.weight = wt;
	}

	@Override
	public int compareTo(Person that) {
		if (this.height == that.height) {
			if (this.weight == that.weight) {
				return 0;
			} else {
				return this.weight < that.weight ? -1 : 1;
			}
		}

		return this.height < that.height ? -1 : 1;
	}

	@Override
	public String toString() {
		return "height=" + this.height + " Weight=" + this.weight;
	}
}

public class Question33 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Person> ppl = new ArrayList<Person>();
		System.out.println("Eneter the height and weight to terminate enter -1 for height and weight");

		try {
			while (scan.hasNextLine()) {

				int height = scan.nextInt();
				int weight = scan.nextInt();
				if (height == -1 && weight == -1) {
					scan.close();
					break;
				}
				ppl.add(new Person(height, weight));
				System.out.println("Height is " + height + ". Weight is " + weight);
			}
		} finally {
			scan.close();
		}

//		Collections.sort(ppl, new Comparator<Person>() {
//			@Override 
//			public int compare(Person a, Person b) {
//				if (a.height == b.height) {
//					if (a.weight == b.weight) {
//						return 0;
//					} else {
//						return a.weight < b.weight? -1: 1;
//					}
//				}
//				
//				return a.height < b.height? -1:1;
//			}
//		});

		Collections.sort(ppl);
		System.out.println("The ppl after sorting based on hight and weight is\n");
		for (Person p : ppl) {
			System.out.println(p);
		}
	}
}