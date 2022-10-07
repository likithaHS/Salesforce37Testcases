package javaBasicAssignmnet;

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double area = circleArea(5);
		double peremeter = circlePeremeter(5);
		System.out.println("Area of circle is:"+area);
		System.out.println("Peremeter of the circle is :"+peremeter);
		
	}
    public static double circleArea(int a) {
    	double area = (3.14*(a*a));
    	return area;
    }
    public static double circlePeremeter(int a) {
    	double peremeter = (2*3.14*a);
    	return peremeter;
    }
}
