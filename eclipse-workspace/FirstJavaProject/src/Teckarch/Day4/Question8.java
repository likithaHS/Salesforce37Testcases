package Teckarch.Day4;

import java.util.StringTokenizer;

public class Question8 {
	// TODO Auto-generated method stub
			public static int count(String str) {
				if (str == null || str.isEmpty()) 
					return 0;
				StringTokenizer token = new StringTokenizer(str);
				return token.countTokens();
			}

	public static void main(String[] args) {
		String str ="String is split to words";
		System.out.println("input string:"+str);
		System.out.println("word count in input string is " +count(str));

	}

}
