package Teckarch.Day9;

public class Question10 {
	public static void duplicate(String[] str) {
	
		for (int i =0;i<str.length;i++) {
			boolean unique =true;
			for (int j =0;j<str.length;j++) {
				if(i!=j && str[i] == str[j]) {
					unique=false;
					break;
				}
				
				
			}
			if (unique) {
				System.out.println(str[i]);
				}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"hello","hi","java","hello"};
		duplicate(str);

	}

}
