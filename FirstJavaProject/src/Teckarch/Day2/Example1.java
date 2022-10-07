package Teckarch.Day2;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example of continue");
		for (int i =1 ; i <=5 ; i++ ) {
			if(i ==  4) {
				continue;
			}
			System.out.print(i);
			}
		System.out.println();
		System.out.println("Example of break");
		for (int i =1 ; i <=5 ; i++ ) {
			if(i ==  4) {
				break;
			}
			System.out.print(i);
			}

	}

}
