package javaBasicAssignmnet;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int decimal = 5 ;
      int n = decimal;
      System.out.println("The decimal value is :"+decimal);
      int [] binary = new int[100];
      int i=0;
      while (n >0) {
    	  binary[i] = n % 2;
    	  n = n/2;
    	  i++;
      }
      System.out.print("Binary value of "+decimal+ "is :");
      for (int j= i-1; j>=0; j--) {
    	  System.out.print(binary[j]);
    	  
      }
	}

}
