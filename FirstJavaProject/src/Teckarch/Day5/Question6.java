package Teckarch.Day5;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ii lovee java";
		System.out.println("Input string is:"+str);
		int n = str.length();
		int[] count =new int[n];
		char[] strch = str.toCharArray();
		for(int i =0;i<n;i++) {
			count[i]=1;
		for(int j =i+1;j<n;j++) {
			if(strch[i] == strch[j]) {
				count[i]++;
				strch[j] ='X';
			}
		}
		}
		System.out.println("Charcter and count");
		for(int i =0; i<count.length;i++) {
			if (strch[i]!= ' ' && strch[i] !='X') {
				System.out.println(strch[i]+" "+count[i]);
				
			}

	}

}
}
