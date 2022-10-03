package javaBasicAssignmnet;

public class Question23 {
	
	public static boolean onlyDigit(String str, int n) {
		
		for (int i =0; i< n ;i++) {
			if (str.charAt(i)<'0' || str.charAt(i)>'9')
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "1234";
		int len1 = str1.length();
		boolean result1 = onlyDigit(str1,len1);
		System.out.println("String str1 "+str1+" Contain only digit? "+result1);
		String str2 = "Tekarch2022";
		int len2 = str2.length();
		boolean result2 = onlyDigit(str2,len2);
		System.out.println("String str2 "+str2+" Contain only digit? "+result2);
		

	}

}
