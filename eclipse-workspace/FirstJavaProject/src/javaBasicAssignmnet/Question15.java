package javaBasicAssignmnet;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int element = 5;
       boolean flag = false;
       System.out.println("The element need to be searched in the array is "+element);
       int[] a = new int[] {1,2,3,4,5,6,7,8,9,10};
       System.out.println("The elements in the array : ");
       for (int i = 0; i<a.length; i++) {
    	   System.out.print(a[i]+ " ");
       }
       System.out.println();
       for (int i = 0; i<a.length; i++) {
    	   if (element == a[i])
    		   flag = true;		   	                              
       }
     
       if (flag)
    	   System.out.println("Element "+element+ " found in the array");
       else
    	   System.out.println("Element "+element+ " is not found  in the array");
	}

}
