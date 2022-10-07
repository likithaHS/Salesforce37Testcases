package javaBasicAssignmnet;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int age = 40;
    System.out.println("The age value is:"+age);
    if (age <=  2)
    	System.out.println("Age group is toddler");
    else if( age > 2 && age <= 10)
    	System.out.println("Age group is kid");
    else if  (age >10 && age <=18)
    System.out.println("Age group is children");
    else if (age >18 && age <=30)
    System.out.println("Age group is young adult");
    else if  (age >30 && age <=45)
    System.out.println("Age group is adult");
    else if (age >45 && age <=50)
    System.out.println("Age group is old adult");
    else if (age >50)
    System.out.println("Age group Senior citizen");
    	
    }
	}


