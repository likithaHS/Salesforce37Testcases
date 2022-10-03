package Teckarch.Day6;

public class Question1 {
public static void findint(int[] a, int element ) {
	boolean notfound = true;
	for (int i =0;i<a.length;i++) {
		if (element == a[i]) {
			notfound = false;
			System.out.println(a[i]+ " is found in the array ");
			break;
		}
	}
	if (notfound) {
		System.out.println("Element not found in the input array");
	}
}
public static void findstring(String[] str, String find) {
	boolean notfound = true;
	//char[] ca = str.toCharArray();
	
	for (int i =0;i<str.length;i++) {
		if ( str[i] == find) {
			notfound = false;
			System.out.print(str[i]+ " is found in the string");
			break;
		}
	}
	if (notfound) {
		System.out.println("char not found in the input array");
	}
}
public static void main(String[] args) {
	int[] a = new int[] {1,2,3,4,6};
	int e = 2;
	String[] str =new String[]{"hello", "word", "java"};
	String c = "java";
	System.out.println("input array is :");
	for (int i:a) {
		System.out.print(i+" ");
	}
	System.out.println();
	findint(a, e);
	System.out.println("\n\n");
	System.out.println("input string array is :");
	for (String i:str) {
		System.out.print(i+" ");
	}
	System.out.println();
	findstring(str,c);
	

}
}
